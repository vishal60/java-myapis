package com.vishal.mylinkedlist.test;

import com.vishal.mylinkedlist.MyLinkedList;

public class Test {

	public static void main(String[] args) {

		MyLinkedList<Integer> list1 = new MyLinkedList<Integer>();

		for (int i = 0; i < 10; i++) {
			list1.insertAtBeginning(i);
			list1.insertAtBeginning(i);
		}

		list1.insertAt(100, 5);

		boolean success;
		System.out.println("Testing: Delete first occurrence of a value of below list");
		list1.print();

		for (int i = 1; i <= 3; i++) {
			System.out.print("Deleting 9: ");
			success = list1.deleteFirstOccurrence(9);
			if (success) {
				System.out.println("First occurence deleted");
			} else {
				System.out.println("Element with that info not found");
			}
			list1.print();
		}
		System.out.println();
		
		//-----------------------------------------------------------------------------------------//
		
		list1 = new MyLinkedList<Integer>();
		int nodesDeleted;

		// Insert 20 ints repeated twice
		for (int i = 0; i < 10; i++) {
			list1.insertAtEnd(i);
			list1.insertAtEnd(i);
		}
		
		list1.insertAt(111, 8);
		
		//Deleting of all the occurrences of a value
		System.out.println("Test: Deleting of all the occurrences of a value");
		list1.print();

		System.out.print("Deleting 0: ");
		nodesDeleted = list1.deleteAll(0);
		System.out.println(nodesDeleted + " deleted nodes");
		list1.print();
		
		System.out.print("Deleting 111: ");
		nodesDeleted = list1.deleteAll(111);
		System.out.println(nodesDeleted + " deleted nodes");
		list1.print();


		System.out.println("Size of the list1 is " + list1.size());

	}

}
