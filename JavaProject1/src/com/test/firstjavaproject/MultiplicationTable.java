package com.test.firstjavaproject;

public class MultiplicationTable {
	// 5 * 1 = 5
	// 5 * 10 = 50
	void print() {
		print(5);
	}
	
	void print(int table) {
		print(table, 1, 10);
	}
	
	void print(int table, int from, int to) {
		for(int i = from; i <= to; i++) {
			System.out.printf("%d * %d = %d\n", table, i, table * i);
		}		
	}
}
