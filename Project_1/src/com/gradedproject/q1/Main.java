package com.gradedproject.q1;
public class Main {
	public static void main(String[] args) {
		new SuperDepartment("Super Department", "No Work as of now"
				, "Nil", "Today is not a holiday");
		HrDepartment hr = new HrDepartment("Welcome to Hr Department", "Fill today’s timesheet and mark your attendance", "Complete by EOD", "Today is not a Holiday");
		AdminDepartment ad = new AdminDepartment("Welcome Admin Department", "Complete your documents Submission", "Complete by EOD", "Today is not a Holiday");
		TechDepartment td = new TechDepartment("Welcome to Tech Department", "Complete coding of Module 1", "Complete by EOD", "Today is not a Holiday");
		System.out.println(ad.departmentName);
		System.out.println(ad.getTodaysWork);
		System.out.println(ad.getWorkDeadline);
		System.out.println(ad.isTodayAHoliday);
		System.out.println();
		System.out.println(hr.departmentName);
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork);
		System.out.println(hr.getWorkDeadline);
		System.out.println(hr.isTodayAHoliday);
		System.out.println();
		System.out.println(td.departmentName);
		System.out.println(td.getTodaysWork);
		System.out.println(td.getWorkDeadline);
		System.out.println(td.getTechStackInformation());
		System.out.println(td.isTodayAHoliday);
	}
}
