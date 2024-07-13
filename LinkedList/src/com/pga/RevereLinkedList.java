package com.pga;

public class RevereLinkedList {
	static LinkedList reverse(Node head) {
		LinkedList l2 = new LinkedList();
		
		Node temp = head;
		while(temp != null) {
			if (l2.head == null) {
				l2.head = new Node(temp.data);
			} else {
				Node newNode = new Node(temp.data);
				newNode.next = l2.head;
				l2.head = newNode;
			}
			temp = temp.next;
		}
		
		return l2;
	}
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add(new Node(1));l1.add(new Node(2));
		l1.add(new Node(3));l1.add(new Node(4));l1.add(new Node(5));
		System.out.println("ORIGINAL");
		l1.displayList();
		LinkedList l2 = reverse(l1.head);
		System.out.println("Reversed Linked List");
		l2.displayList();
	}
}
