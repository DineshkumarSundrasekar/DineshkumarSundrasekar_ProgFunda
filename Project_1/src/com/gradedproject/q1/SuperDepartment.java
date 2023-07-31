package com.gradedproject.q1;

public class SuperDepartment {
	String departmentName;
	String getTodaysWork;
	String getWorkDeadline;
	String isTodayAHoliday;
	public SuperDepartment(String departmentName, String getTodaysWork, String getWorkDeadline,
			String isTodayAHoliday) {
		super();
		this.departmentName = departmentName;
		this.getTodaysWork = getTodaysWork;
		this.getWorkDeadline = getWorkDeadline;
		this.isTodayAHoliday = isTodayAHoliday;
	}
	String departmentName(){
		return departmentName;
	}
	String getTodaysWork() {
		return getTodaysWork;
	}
	String getWorkDeadline() {
		return getWorkDeadline;
	}
	String isTodayAHoliday() {
		return isTodayAHoliday;
	}
}
