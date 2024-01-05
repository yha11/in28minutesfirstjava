package com.in28minutes.oops;

public class BookRunner {

	public static void main(String[] args) {
		Book artOfComputerProgramming = new Book();
		Book effectiveJava = new Book();
		Book cleanCode = new Book();

		artOfComputerProgramming.setNoOfCopies(10);
		effectiveJava.setNoOfCopies(20);
		cleanCode.setNoOfCopies(30);

		artOfComputerProgramming.increaseNoOfCopies(100);
		effectiveJava.deceaseNoOfCopies(10);
		cleanCode.deceaseNoOfCopies(100);

		System.out.println(artOfComputerProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());
	}

}
