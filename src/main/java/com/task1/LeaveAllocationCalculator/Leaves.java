package com.task1.LeaveAllocationCalculator;

import java.util.List;

public class Leaves {
	 
	private Integer noOfLeaves;
	private CharSequence startDate;
	private Boolean isSaturdayHoliday;
	private Boolean isSundayHoliday;
	private List<String> companyHoliday;
	
	public Leaves(Integer noOfLeaves, CharSequence startDate, Boolean isSaturdayHoliday, Boolean isSundayHoliday,
			List<String> companyHoliday) {
		super();
		this.noOfLeaves = noOfLeaves;
		this.startDate = startDate;
		this.isSaturdayHoliday = isSaturdayHoliday;
		this.isSundayHoliday = isSundayHoliday;
		this.companyHoliday = companyHoliday;
	}

	public Leaves() {
		super();
	}

	public Integer getNoOfLeaves() {
		return noOfLeaves;
	}

	public void setNoOfLeaves(Integer noOfLeaves) {
		this.noOfLeaves = noOfLeaves;
	}

	public CharSequence getStartDate() {
		return startDate;
	}

	public void setStartDate(CharSequence startDate) {
		this.startDate = startDate;
	}

	public Boolean getIsSaturdayHoliday() {
		return isSaturdayHoliday;
	}

	public void setIsSaturdayHoliday(Boolean isSaturdayHoliday) {
		this.isSaturdayHoliday = isSaturdayHoliday;
	}

	public Boolean getIsSundayHoliday() {
		return isSundayHoliday;
	}

	public void setIsSundayHoliday(Boolean isSundayHoliday) {
		this.isSundayHoliday = isSundayHoliday;
	}

	public List<String> getCompanyHoliday() {
		return companyHoliday;
	}

	public void setCompanyHoliday(List<String> companyHoliday) {
		this.companyHoliday = companyHoliday;
	}

	@Override
	public String toString() {
		return "Leaves [noOfLeaves=" + noOfLeaves + ", startDate=" + startDate + ", isSaturdayHoliday="
				+ isSaturdayHoliday + ", isSundayHoliday=" + isSundayHoliday + ", companyHoliday=" + companyHoliday
				+ "]";
	}
	
}
