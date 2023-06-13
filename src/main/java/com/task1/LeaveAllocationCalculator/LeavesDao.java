package com.task1.LeaveAllocationCalculator;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class LeavesDao {

	public List<String> calculateLeaveAllocation(Leaves leaves) {

		List<String> companyHoliday = new ArrayList<>();

		LocalDate startDate = LocalDate.parse(leaves.getStartDate(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

		Integer noOfLeaves = leaves.getNoOfLeaves();
//        if (noOfLeaves == null) {
//            noOfLeaves = 5; 
//        }
		LocalDate currentDate = startDate;

		while (noOfLeaves > 0) {
			if (!isLeaveRestricted(currentDate, leaves.getCompanyHoliday(), leaves.getIsSaturdayHoliday(),
					leaves.getIsSundayHoliday())) {
				companyHoliday.add(currentDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
				noOfLeaves--;
			}
			currentDate = currentDate.plusDays(1);
		}
		return companyHoliday;
	}

	public boolean isLeaveRestricted(LocalDate date, List<String> companyHoliday, Boolean isSaturdayHoliday,
			Boolean isSundayHoliday) {
		if (companyHoliday.contains(date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")))) {
			return true;
		}

		if (isSaturdayHoliday && date.getDayOfWeek() == DayOfWeek.SATURDAY) {
			return true;
		}

		if (isSundayHoliday && date.getDayOfWeek() == DayOfWeek.SUNDAY) {
			return true;
		}
		
		return false;
	}

}
