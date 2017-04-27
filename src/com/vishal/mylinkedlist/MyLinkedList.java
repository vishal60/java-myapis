package com.vishal.mylinkedlist;

public class MyLinkedList<E> {

	private Node start;
	private Node end;
	private Node previousNode;
	private Node currentNode;

	public void insertAtEnd(E info) {
		Node newNode = new Node();
		newNode.setInfo(info);
		if (start == null && end == null)
			start = end = newNode;
		else {
			end.setNextNode(newNode);
			end = newNode;
		}
	}

	public void insertAtBeginning(E info) {
		Node newNode = new Node();
		newNode.setInfo(info);
		if (start == null && end == null)
			start = end = newNode;
		else {
			newNode.setNextNode(start);
			start = newNode;
		}
	}

	public Object getAt(int index) {
		previousNode = start;
		for (int i = 0; i < index; i++)
			previousNode = previousNode.getNextNode();
		return previousNode.getInfo();
	}

	public void insertAt(E info, int index) {
		previousNode = start;
		for (int i = 0; i < index - 1; i++)
			previousNode = previousNode.getNextNode();
		Node newNode = new Node();
		newNode.setInfo(info);
		newNode.setNextNode(previousNode.getNextNode());
		previousNode.setNextNode(newNode);

	}

	public boolean deleteFirstOccurrence(E info) {

		final boolean SUCCESS = true;
		final boolean FAILURE = false;
		try {
			currentNode = start.getNextNode();
			previousNode = start;
			if (start.getInfo().equals(info)) {
				start = start.getNextNode();
				return SUCCESS;
			}
			while (previousNode != null && currentNode != null) {
				if (currentNode.getInfo().equals(info)) {
					previousNode.setNextNode(currentNode.getNextNode());
					return SUCCESS;
				} else {
					currentNode = currentNode.getNextNode();
					previousNode = previousNode.getNextNode();
				}
			}
		} catch (Exception ignored) {}
		return FAILURE;
	}

	public int deleteAll(E info) {
		boolean flag = true;
		int nodesDeleted = 0;
		while (flag) {
			flag = deleteFirstOccurrence(info);
			if (flag == true)
				nodesDeleted++;
		}
		return nodesDeleted;
	}

	public Integer size() {
		currentNode = start;
		Integer size = 0;
		if (currentNode == null) {
			return null;
		}
		while (currentNode != null) {
			size++;
			currentNode = currentNode.getNextNode();
		}
		return size;
	}

	public void print() {
		if (start != null) {
			currentNode = start;
			System.out.print("[ ");
			while (currentNode != null) {
				System.out.print(currentNode.getInfo() + ", ");
				currentNode = currentNode.getNextNode();
			}
			System.out.println(end.getInfo() + " ]");
		} else {
			System.out.println("[]");
		}
	}

}
