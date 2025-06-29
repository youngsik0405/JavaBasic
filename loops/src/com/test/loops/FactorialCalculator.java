package com.test.loops;

public class FactorialCalculator {
	public int calculateFactorial(int number) {
		if (number < 0) {
			return -1;
		}

		int factorial = 1;

		for (int i = 2; i <= number; i++) {
			factorial *= i;
		}

		return factorial;

	}
}
