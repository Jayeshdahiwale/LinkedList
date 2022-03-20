package com.bridgelabz;

public class Main {
	
	// Add Operation
	//Add First
	
	public static void main(String[] args) {
		LL list =new LL();
		list.addLast(56);
		list.addLast(70);
		list.insertBetween(56, 70, 30);//Inserting 30 between 56 & 70
		list.deleteLast();
		list.printList();
		System.out.println(list.getSize());
	}
}
