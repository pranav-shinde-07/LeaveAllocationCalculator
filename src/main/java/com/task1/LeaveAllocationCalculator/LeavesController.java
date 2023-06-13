package com.task1.LeaveAllocationCalculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeavesController {
	
	@Autowired
	private LeavesDao dao;
	
	@PostMapping("/add-leave-details")
	public Object calculateLeaveAllocation(@RequestBody Leaves leaves) {
		return dao.calculateLeaveAllocation(leaves);
	}

}
