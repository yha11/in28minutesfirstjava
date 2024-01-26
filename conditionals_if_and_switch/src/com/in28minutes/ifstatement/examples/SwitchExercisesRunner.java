package com.in28minutes.ifstatement.examples;

public class SwitchExercisesRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean isWeekDay(int dayNumber) {
		switch (dayNumber) {
		case 0:
			System.out.println("Sunday");
			return false;
		case 1:
			System.out.println("Monday");
			return true;
		case 2:
			System.out.println("Tuesday");
			return true;
		case 3:
			System.out.println("Wednesday");
			return true;
		case 4:
			System.out.println("Thursday");
			return true;
		case 5:
			System.out.println("Friday");
			return true;
		case 6:
			System.out.println("Saturday");
			return false;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
		return false;
	}

}
