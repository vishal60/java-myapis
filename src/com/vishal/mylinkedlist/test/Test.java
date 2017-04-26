package com.vishal.mylinkedlist.test;

import com.vishal.mylinkedlist.MyLinkedList;
 
public class Test{

    public static void main(String args[]){
	    // Create a linked list using MyLinkedList<Integer>
	    MyLinkedList<Integer> list1 = new MyLinkedList<Integer>();
	   
	    //Insert the first 10 ints at the beginning
	    for (int i=0; i< 10; i++){
	        list1.insert(i);
	    }
	    //Print the whole list
	    list1.print();
	    
	    // Create another linked list using MyLinkedList<Integer>
	    MyLinkedList<Integer> list2 = new MyLinkedList<Integer>();

	    // Insert 10 ints at the end
	    for (int i=0; i< 10; i++){
	        list2.insertEnd(i);
	    }
	    //Print the whole second list
        list2.print();

    }
}
