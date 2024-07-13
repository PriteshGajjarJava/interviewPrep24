package com.pga;

class Node {
	int data;
	Node next;
	
	Node(int data) {
		this.data = data;
		this.next = null;
	}
}
class LinkedList {
	Node head = null;

	Node getHead() {
		return head;
	}
	
	// Traversing linked list
	public void displayList() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	public void add(Node n) {
		if (head == null) {
			head = n;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = n;
		}
	}
	boolean search(int d) {
		Node temp = head;
		while(temp!=null) {
			if (temp.data == d) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	// 1 -> 4 -> 2 -> 8 -> 10
	void delete(int d) {
		if(this.search(d) == true) {
			if (head.data == d) {
				head = head.next;
			} else {
				Node temp = head;
				while (temp.next.data != d) {
					temp = temp.next;
				}
				temp.next = temp.next.next;
			}
		}else {
			System.out.println("Invalid element");
		}
	}
}

public class SinglyLinkedListDemo {
	public static void main(String[] args ) {
		LinkedList l1 = new LinkedList();
		for (int i=1;i<=10;i++) {
			l1.add(new Node(i));
		}
		l1.displayList();
		
		for (int i=1;i<=10;i++) {
			if (i%2!=0) {
				l1.delete(i);
			}
		}
		l1.displayList();

	}
}










