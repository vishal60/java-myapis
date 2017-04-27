package com.vishal.mylinkedlist;

public class Node {
	
	private Object info;
	private Node nextNode;
	
	public Node(){
		info = null;
		nextNode = null;
	}

	public void setInfo(Object info) {
		this.info = info;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}

	public Object getInfo() {
		return info;
	}

	public Node getNextNode() {
		return nextNode;
	}
	
}
