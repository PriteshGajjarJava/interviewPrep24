package com.test;

public class Power {
	public static void main(String[] args) {
		// n=2 m=4 2 ^ 4 = 16
		System.out.println(pow(2,4));
	}
	
	static int pow(int n, int m) {
		if (m==0) return 1;
		return n * pow(n,m-1);
	}
}
