package com.pga;

public class LinkedListAddition {
	static LinkedList addLinkedList(Node head1, Node head2) {
		LinkedList outputList = new LinkedList();
		
		Node t1 = head1;
		Node t2 = head2;
		
		while(t1 != null) {
			int sum = t1.data + t2.data;
			outputList.add(new Node(sum));
			t1 = t1.next;
			t2 = t2.next;
		}
		
		return outputList;
	}
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add(new Node(1));
		l1.add(new Node(5));
		l1.add(new Node(2));
		l1.add(new Node(4));

		LinkedList l2 = new LinkedList();
		l2.add(new Node(4));
		l2.add(new Node(8));
		l2.add(new Node(1));
		l2.add(new Node(2));

		// 5 13 3 6
		LinkedList l3 = addLinkedList(l1.getHead(), l2.getHead());
		l3.displayList();
	}
}








