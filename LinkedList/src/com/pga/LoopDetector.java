package com.pga;

// Take two pointers (slow and fast)
// increment slow by 1
// increment fast by 2
// if slow == fast that means there is a LOOP
public class LoopDetector {
	static boolean checkLoop(Node head) {
		Node t1 = head;
		Node t2 = head;
		
		while(t2.next != null && t2.next.next != null) {
			t1 = t1.next;
			t2 = t2.next.next;
			if (t1 == t2) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add(new Node(1));
		Node head1 = l1.getHead();
		head1.next = new Node(4);
		head1.next.next = new Node(5);
		head1.next.next.next = new Node(10);
		head1.next.next.next.next = null;
		boolean isLoop = checkLoop(head1);
		if (!isLoop) {
			l1.displayList();
		} else {
			System.out.println("There is a LOOP in the linked list");
		}
	}
}





