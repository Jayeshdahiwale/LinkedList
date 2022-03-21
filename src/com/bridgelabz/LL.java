package com.bridgelabz;

public class LL {
	Node head;
	
	static int size;

//	LL() {
//		this.size = 0;
//	}

	public void addFirst(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}

		newNode.next = head;
		head = newNode;
	}

	public void addLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}

		Node currNode = head;
		while (currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;
	}

	public void deleteFirst() {
		if (head == null) {
			return;
		}
		head = head.next;
		size--;
	}

	public void deleteLast() {
		if (head == null) {
			return;
		}
		size--;
		if (head.next == null) {
			head = null;
			return;
		}
		Node currNode = head;
		while (currNode.next.next != null) {
			currNode = currNode.next;
		}
		currNode.next = null;
	}
	public void insertBetween(int element1,int element2, int data) {
		if(head == null || head.next == null) {
			//System.out.println("List contain only one element. So data can't be inserted between one number.");
			return;
		}
		
		Node currNode = head;
		while(currNode.data != element1 || currNode.next.data != element2) {
			if(currNode.next.next == null) {
				break;
			}
			currNode = currNode.next;
		}
		if(currNode.data == element1 && currNode.next.data == element2) {
			Node newNode =new Node(data);
			Node temp = currNode.next;
			currNode.next = newNode;
			newNode.next =temp;
		}
		
		
	}
	public int getSize() {
		System.out.println();
		return size;
	}
	public void printList() {
		if (head == null) {
			System.out.println("List is empty.");
			return;
		}
		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.data + "  ");
			currNode = currNode.next;
		}
		//System.out.println("Null");
	}
}
