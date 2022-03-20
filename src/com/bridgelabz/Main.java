package com.bridgelabz;

public class Main {
	
	// Add Operation
	//Add First
	
	public static void main(String[] args) {
		LL list =new LL();
		list.addFirst(30);
		list.addFirst(56);
		list.printList();
		System.out.println(list.getSize());
	}
}
