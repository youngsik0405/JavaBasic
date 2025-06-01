package com.test.oops;

public class MotorBikeRunner {
	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(200);

		MotorBike sometngElse = new MotorBike();

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		System.out.println(sometngElse.getSpeed());

		ducati.start();
		honda.start();

		// ducati.setSpeed(100);

		ducati.increaseSpeed(100);

		honda.increaseSpeed(100);

		ducati.decreaseSpeed(250);

		honda.decreaseSpeed(250);

//		int ducatiSpeed = ducati.getSpeed();// get speed
//		ducatiSpeed = ducatiSpeed + 100;// 100 증가
//		ducati.setSpeed(ducatiSpeed);// set it to ducati
//
//		int hondaSpeed = honda.getSpeed(); // get speed
//		hondaSpeed = hondaSpeed + 100; // 100 증가
//		honda.setSpeed(hondaSpeed);


	}

}
