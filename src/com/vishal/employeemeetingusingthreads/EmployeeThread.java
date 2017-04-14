package com.vishal.employeemeetingusingthreads;

import java.lang.Thread;

public class EmployeeThread implements Runnable {

	private Thread t;
	private String threadName;
	private int workTime;
	private int waitTime;

	public EmployeeThread(String name, int wt) {
		threadName = name;
		workTime = wt;
	}

	public void run() {
		try {
			System.out.println(threadName + " is working");
			Thread.sleep(workTime);
			System.out.println(threadName + " is done working");
			if (waitTime > 1001) {
				t.join(waitTime);
				System.out.println("\nMeetup!!");
			}
		} catch (Exception e) {}
	}

	public void start() {
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}

	public void waitTime(int waitTime) {
		this.waitTime = waitTime;
	}
}
