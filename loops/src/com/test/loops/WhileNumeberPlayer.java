package com.test.loops;

public class WhileNumeberPlayer {

	private int limit;

	public WhileNumeberPlayer(int limit) {
		this.limit = limit;
	}

	// for limit = 30, output would be 1 4 9 16 25
	public void printSquaresUptoLimit() {
		int i = 1;
		while (i * i < limit) {
			System.out.print(i * i + " ");
			i++;
		}
		System.out.println();
	}

	// for limit = 30, output would be 1 8 17
	public void printCubesUptoLimit() {
		int i = 1;
		while (i * i * i <= limit) {
			System.out.print(i * i * i + " ");
			i++;
		}
		System.out.println();
	}

}
