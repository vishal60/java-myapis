package com.vishal.mylinkedlist;

public class MyLinkedList<E>{
    private Node<E> first;
    private Node<E> end;

    
    public MyLinkedList(){
	    this.first = null;
	    this.end = null;
    }
    
    /*
     * Insertion at the beginning
     */
    public void insert(E info){
	    Node<E> newNode = new Node<E>(info);
	    newNode.setNext(first);
	    first = newNode;
    }
    /*
     * Insertion at the end 
     * Implement this method
     */
   
    public void insertEnd(E info){
        Node<E> newNode = new Node<E>(info);
        if (end == null){
            first = newNode;
        	end = newNode;
        }else{
            end.setNext(newNode);
            end = newNode;
        }
    }
   
    /*
     * Extraction of the first node
     */
    public E extract(){
	    E data = null;
	    if (first != null){
	        data = first.getInfo();
	        first = first.getNext();
	    }
	    return data;
    }
    /*
     * Print all list
     */
    public void print(){
	    Node<E> current = first;
	    
	    while (current != null){
	        System.out.print(current.getInfo() + " ");
	        current = current.getNext();
	    }
	    System.out.println();
    }
}
