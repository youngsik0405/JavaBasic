package com.test.exercise;

/*
메서드 isLeapYear(int year)가 있는 클래스 LeapYearChecker가 제공되어 있습니다. 
여러분의 과제는 메서드 구현을 완료하여 주어진 해가 윤년인지 판정하는 것입니다.
규칙이 약간 까다롭습니다. 자세히 읽어 보시기 바랍니다.
어떤 연도가 다음과 같은 경우, 그 연도는 그레고리안력에서 윤년입니다.
4로 나누어 떨어짐(그리고)
100으로 나누어 떨어지지 않음(400으로 나누어 떨어지는 경우는 예외)
4로 나누어 떨어지지 않음 – 윤년이 아님(2041)
4로 나누어 떨어지고, 100으로 나누어 떨어지지 않음 – 윤년(2048)
4로 나누어 떨어지고 100으로 나누어 떨어지는 경우 – 추가적인 검사가 필요함
4로 나누어 떨어지고 100으로 나누어 떨어지며 400으로 나누어 떨어짐 – 윤년(2000, 2400)
4로 나누어 떨어지고 100으로 나누어 떨어지며, 400으로 나누어 떨어지지 않음 – 윤년이 아님(2100, 2200, 2300)


지침
isLeapYear 메서드를 구현하여 연도가 윤년이면 true를, 그렇지 않으면 false를 리턴합니다.
연도가 1보다 작은 엣지 케이스도 고려해야 합니다. 
그러한 경우에 메서드는 false를 리턴해야 합니다.

public class LeapYearChecker {
    public boolean isLeapYear(int year) {
       // Implement your code here
    }
}
여러분의 코드가 엣지 케이스를 포함하여 테스트 케이스를 모두 통과하는지 확인하고 위의 지침을 따라 주시기 바랍니다.
*/

public class LeapYearChecker {
	public boolean isLeapYear(int year) {
		if (year <= 0) {
			return false;
		}
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		}

		return false;
	}

}
