package com.vishal.db;

import java.util.Scanner;

public class AvailableDBs {

	public static void showDBs() {
				
		System.out.println("List of DBs available: \n");
		
		// print the connectors list in the console
		for (Connectors c : Connectors.values()) {
			System.out.println(c.ordinal() + 1 + ". " + c);
		}
	}

	public static Connectors selectDB() {

		int index = 0;
		Connectors[] c = Connectors.values();
		Scanner scanner = new Scanner(System.in);

		System.out.println("\nChoose the index Value for the appropriate DB");

		try {

			index = scanner.nextInt() - 1;

			if (index > c.length - 1)
				throw new InvalidArgumentException();

		} catch (InvalidArgumentException e) {

			System.out.println("\nEntered an invalid argument..exiting now..");
			System.exit(0);

		} finally {

			scanner.close();
		}

		return c[index];

	}

}
