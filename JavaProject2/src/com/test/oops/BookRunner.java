package com.test.oops;

public class BookRunner {

	public static void main(String[] args) {
		Book artOfComputerProgramming = new Book(100);
		Book effectiveJava = new Book(50);
		Book cleanCode = new Book(40);

		artOfComputerProgramming.setNoOfCopies(100);
		effectiveJava.setNoOfCopies(80);
		cleanCode.setNoOfCopies(50);
	}

}
