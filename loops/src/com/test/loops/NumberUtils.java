package com.test.loops;

public class NumberUtils {

	public int getLastDigit(int number) {
		if (number < 0) {
			return -1;
		}

		return number % 10;
	}

	public int getNumberOfDigits(int number) {
		if (number == 0) {
			return 1;
		} else if (number < 0) {
			return -1;
		}

		int noOfDigits = 0;

		while (number > 0) {
			number = number / 10;
			noOfDigits++;
		}

		return noOfDigits;
	}

	public int getSumOfDigits(int number) {

		if (number < 0) {
			return -1;
		}

		if (number == 0) {
			return 0;
		}

		int sumOfDigits = 0;

		while (number > 0) {
			sumOfDigits += number % 10;
			number = number / 10;
		}

		return sumOfDigits;
	}

	public int reverseNumber(int number) {
		if (number == 0) {
			return 0;
		}

		if (number < 0) {
			return -1;
		}

		int reversedNumber = 0;

		while (number > 0) {
			int digit = number % 10;
			reversedNumber = reversedNumber * 10 + digit;
			number = number / 10;
		}

		return reversedNumber;

	}

}
