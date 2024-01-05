package com.in28minutes.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(200);

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());

		ducati.start();
		honda.start();

		ducati.setSpeed(100);

		ducati.increaseSpeed(100);
		honda.increaseSpeed(100);

		ducati.decreaseSpeed(250);
		honda.decreaseSpeed(250);

		// int ducatiSpeed = ducati.getSpeed();
		// ducatiSpeed += 100;
		// ducati.setSpeed(ducatiSpeed);

		// int hondaSpeed = honda.getSpeed();
		// hondaSpeed += 100;
		// honda.setSpeed(hondaSpeed);

	}

}
