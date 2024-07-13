package com.pga;

public class MiddleOfLinkedList {
	static int findMiddle(Node head) {
		Node t1 = head; // Slow pointer (it jumps by 1)
		Node t2 = head; // Fast pointer (it jumps by 2)
		
		while (t2.next != null && t2.next.next != null) {
			t1 = t1.next;
			t2 = t2.next.next;
		}
		return t1.data;
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(new Node(1)); list.add(new Node(2));
		list.add(new Node(3)); list.add(new Node(4));list.add(new Node(5));
		
		int element = findMiddle(list.getHead());
		System.out.println("middle element is: " + element);
	}
}
