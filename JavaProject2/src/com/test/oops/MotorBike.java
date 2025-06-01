package com.test.oops;

public class MotorBike {
	// 상태
	private int speed; // member variable(멤버변수)

	MotorBike() {
		this(5);
	}

	MotorBike(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
//		System.out.println(speed); // 100
//		System.out.println(this.speed); // 0
if (speed > 0) {
	this.speed = speed;
//			 System.out.println(speed); // 100
//			 System.out.println(this.speed); // 100
}
	}

	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}

	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}

	void start() {
		System.out.println("Bike Started");
	}
}
