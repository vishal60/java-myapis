package com.vishal.employeemeetingusingthreads.test;

import java.util.Scanner;

import com.vishal.employeemeetingusingthreads.EmployeeThread;

public class TestThread {

	private static final int MEETUP_STARTS_AFTER_THIS_TIME = 1001 + 1;

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter ravis's work time(sec):");
		final int RAVI_WORK_TIME = 1000 * scanner.nextInt();

		System.out.println("Enter kishore's work time(sec):");
		final int KISHORE_WORK_TIME = 1000 * scanner.nextInt();

		scanner.close();
		final int WAIT_TIME = Math.abs(KISHORE_WORK_TIME - RAVI_WORK_TIME);

		EmployeeThread emp1 = new EmployeeThread("ravi", RAVI_WORK_TIME);
		emp1.start();
		EmployeeThread emp2 = new EmployeeThread("kishore", KISHORE_WORK_TIME);
		emp2.start();

		if (RAVI_WORK_TIME < KISHORE_WORK_TIME)
			emp1.waitTime(WAIT_TIME + 1000);
		else if (RAVI_WORK_TIME > KISHORE_WORK_TIME)
			emp2.waitTime(WAIT_TIME + 1000);
		else
			emp1.waitTime(MEETUP_STARTS_AFTER_THIS_TIME);

	}
}