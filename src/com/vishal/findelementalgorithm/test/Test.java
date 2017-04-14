package com.vishal.findelementalgorithm.test;

import java.util.Scanner;

import com.vishal.findelementalgorithm.FindElement;

public class Test {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a paragraph to find out the unique characters present in it: ");
		String string = scanner.nextLine();
		System.out.println(FindElement.nonrepeatingElements(string));
		scanner.close();
				
		System.out.println(FindElement.nonrepeatingElementsAt("india",3));
		
	}
}
