package com.test.exercise;

/*
이 문제에서 여러분은 측정치를 피트와 인치로 나타내는 Java Dimension클래스 구현물을 완성해야 합니다.
다음은 Dimension클래스의 기본 골격입니다.

public class Dimension {
    private int feet;
    private int inches;
    
    public Dimension(int inches) {
        // TODO: Convert the total inches into feet and inches. One foot is 12 inches.
        // Store the feet and inches in their respective instance variables.
    }
    
    public int getFeet() {
        // TODO: Return the value of feet.
        return -1;
    }
    
    public int getInches() {
        // TODO: Return the value of inches.
        return -1;
    }    
}

과제
여러분의 과제는 Dimension(int inches)생성자와 Dimension클래스 안의 getFeet()및 getInches() 메서드를 구현하는 것입니다.
Dimension(int inches) - 이 생성자는 inches(정수)라는 매개변수 하나를 받고, 주어진 인치를 피트와 인치로 변환해야 합니다. 
입력된 인치가 0보다 작으면 피트와 인치를 -1로 설정해서 유효하지 않은 입력임을 나타내야 합니다. 
1피트는 12인치와 같습니다.
getFeet() - 이 메서드는 생성자로부터 계산한 피트를 리턴해야 합니다.
getInches() - 이 메서드는 나머지 인치 수(12 미만)를 생성자로부터 리턴해야 합니다.
예시
다음은 Dimension클래스를 구현했을 때 클래스가 어떻게 작동해야 하는지를 보여주는 예입니다.

Dimension dim = new Dimension(25);
System.out.println(dim.getFeet());    // Output: 2
System.out.println(dim.getInches());  // Output: 1
위의 예에서 25인치는 2피트 1인치와 같습니다.

Dimension dim = new Dimension(-1);
System.out.println(dim.getFeet());    // Output: -1
System.out.println(dim.getInches());  // Output: -1
위의 예에서 -1인치는 유효하지 않은 입력값이므로 getFeet()와 getInches() 모두 -1을 리턴합니다.
*/

public class Dimension {

	private int feet;
	private int inches;

	public Dimension(int inches) {
		if (inches < 0) {
			this.feet = -1;
			this.inches = -1;
		} else {
			this.feet = inches / 12;
			this.inches = inches % 12;
		}
	}

	public int getFeet() {
		return feet;
	}

	public int getInches() {
		return inches;
	}

}
