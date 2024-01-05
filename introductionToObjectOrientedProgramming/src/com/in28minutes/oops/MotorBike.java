package com.in28minutes.oops;

public class MotorBike {
	// state(상태)
	private int speed; // member variable

	MotorBike(int speed) {
		this.speed = speed;
	}

	// behaviour
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
		}
	}

	public void increaseSpeed(int howMuch) {
		// this.speed = this.speed + howMuch;
		setSpeed(this.speed + howMuch);
	}

	public void decreaseSpeed(int howMuch) {
		// this.speed = this.speed - howMuch;
		setSpeed(this.speed - howMuch);
	}

	void start() {
		System.out.println("Bike Started");
	}

}
