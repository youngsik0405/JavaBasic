package com.test.exercise;

/*
이 예제에서 여러분의 과제는 어떤 숫자가 ‘완전수’인지 검사하는 클래스 PerfectNumberChecker안의 메서드를 구현하는 것입니다.
완전수(perfect number)란 자신을 제외한 모든 양의 약수의 합이 자신과 같은 양의 정수를 가리킵니다.
예를 들어 숫자 6은 약수인 1, 2, 3의 합이 6과 같으므로 완전수입니다. 
그와 비슷하게 28도 약수들(1, 2, 4, 7, 14)의 합이 28이므로 완전수입니다.
public class PerfectNumberChecker {
    public boolean isPerfectNumber(int number) {
        // Write code here
    }
}

지침
isPerfectNumber(int number)메서드는 만약 number가 완전수이면 true를 리턴하고, 
그렇지 않으면 false를 리턴해야 합니다.
완전수는 언제나 양의 정수입니다. 
숫자가 0이나 음수이면 false를 리턴합니다.
여러분은 입력값 숫자가 항상 정수라고 가정할 수 있습니다.
*/

public class PerfectNumberChecker {
	public boolean isPerfectNumber(int number) {
		if (number <= 0) {
			return false;
		}
		int temp = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				temp += i;
			}
		}
		if (number == temp) {
			return true;
		}

		return false;
	}
}
