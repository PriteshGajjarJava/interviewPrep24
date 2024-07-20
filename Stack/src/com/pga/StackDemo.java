package com.pga;

import java.util.Stack;
public class StackDemo {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(8);
		stack.push(18);
		stack.push(9);
		stack.push(11);
		stack.push(3);
		System.out.println(stack);
		stack.pop(); stack.pop();
		System.out.println(stack);

	}
}
