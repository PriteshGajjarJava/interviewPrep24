package com.test;

public class Print10to1 {
	public static void main(String[] args) {
		print(10);
	}
	
	static void print(int n) {
		if (n==0) { return; }
		System.out.println(n);
		print(--n);
	}
}
