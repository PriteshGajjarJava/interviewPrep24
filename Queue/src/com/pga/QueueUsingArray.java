package com.pga;

class Queue {
	int[] queue = new int[5];
	int startIndex = -1;
	int endIndex = -1;
	int cnt = 0;
	
	int peek() {
		return queue[startIndex];
	}
	void add(int n) {
		if (cnt == queue.length) {
			System.out.println("Queue is FULL");
			return;
		}
		if (startIndex == -1) {
			queue[0] = n;
			endIndex = 0;
			startIndex = 0;
		} else {
			if (endIndex == queue.length - 1) {
				endIndex = -1;
			}
			queue[endIndex + 1 ] = n;
			endIndex++;
		}
		cnt++;
	}
	int remove() {
		int noToBeRemoved = queue[startIndex];
		queue[startIndex] = 0;
		if (startIndex == queue.length -1) {
			startIndex = 0;
		}else {
			startIndex++;
		}
		cnt--;
		return noToBeRemoved;
	}
	void printQueue() {
		for (int i=startIndex; i<queue.length;i++) {
			if (queue[i] != 0) {
				System.out.print(queue[i] + "=>");
			}
		}
		if (queue[0] != 0) {
			for (int i=0; i<=endIndex;i++) {
				System.out.print(queue[i] + "=>");
			}
		}
		System.out.println();
	}
}

public class QueueUsingArray {
	public static void main(String[] args) {
		Queue queue1 = new Queue();
		queue1.add(1);queue1.add(2);queue1.add(3);queue1.add(4);
		queue1.remove();
		queue1.remove();
		queue1.add(7);
		queue1.add(8);
		queue1.remove();
		queue1.printQueue(); // 4 7 8
		queue1.add(14);
		queue1.add(15);
		queue1.add(16);
		queue1.printQueue();// 4 7 8 14 15
		System.out.println("StartIndex=" + queue1.startIndex);
		System.out.println("EndIndex=" + queue1.endIndex);

		queue1.remove();
		queue1.remove();
		queue1.remove();
		queue1.remove();
		queue1.add(11);
		queue1.add(8);
		queue1.printQueue();//15 11 8
	}
}























