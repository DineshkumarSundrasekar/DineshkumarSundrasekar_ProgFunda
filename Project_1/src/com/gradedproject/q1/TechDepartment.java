package com.gradedproject.q1;

public class TechDepartment extends SuperDepartment{

	public TechDepartment(String departmentName, String getTodaysWork, String getWorkDeadline, String isTodayAHoliday) {
		super(departmentName, getTodaysWork, getWorkDeadline, isTodayAHoliday);
	}
	public String getTechStackInformation() {
		return "Core Java";
	}
}
