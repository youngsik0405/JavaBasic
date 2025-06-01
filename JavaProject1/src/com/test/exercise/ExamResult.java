package com.test.exercise;

/*
미완성 상태인 ExamResult라는 Java 클래스가 제공되어 있습니다. 
이 클래스에는 여러분이 완성해야 할 isPass(int marks)라는 메서드가 있습니다.
isPass(int marks) 메서드는 시험에서 학생이 받은 점수를 나타내는 정수 값을 받아서 그 학생이 시험에 합격했는지 불합격했는지 결정합니다.
이 경우에 학생이 50점 넘게 득점한 경우에는 시험에 합격한 것으로 간주합니다. 
만일 학생의 점수가 50점 이하인 경우, 불합격으로 간주됩니다.


지침
isPass(int marks)메서드가 학생의 합격 여부를 나타내는 불리언 값을 리턴하도록 완성하십시오. 
이 메서드는 점수가 50점을 넘으면 true를 리턴하고(학생이 합격했음을 의미) 그렇지 않으면 false를 리턴해야 합니다(학생이 불합격했음을 의미).
학생이 정확히 50점을 받은 엣지 케이스를 반드시 고려하세요.
*/

public class ExamResult {
	public boolean isPass(int marks) {
		if (marks > 50) {
			return true;
		}

		return false;
	}

}
