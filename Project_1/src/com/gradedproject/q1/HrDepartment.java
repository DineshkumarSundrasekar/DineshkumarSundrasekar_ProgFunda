package com.gradedproject.q1;

public class HrDepartment extends SuperDepartment{

	public HrDepartment(String departmentName, String getTodaysWork, String getWorkDeadline, String isTodayAHoliday) {
		super(departmentName, getTodaysWork, getWorkDeadline, isTodayAHoliday);
	}

	public String doActivity() {
		return "team Lunch";
	}
}
