package com.vishal.db.test;

import com.vishal.db.AvailableDBs;
import com.vishal.db.Connectors;

public class test {

	public static void main(String[] args) {

		// show databases
		AvailableDBs.showDBs();

		// select db from the list
		Connectors conn = AvailableDBs.selectDB();

		// print the driver and connQuery
		System.out.println("\nDB selected: " + conn);
		System.out.println("\nDriver Selected: " + conn.getDriver());
		System.out.println("\nConnection Query is: " + conn.getConnQuery());
	}

}
