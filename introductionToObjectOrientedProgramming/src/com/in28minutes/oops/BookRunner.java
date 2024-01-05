package com.in28minutes.oops;

public class BookRunner {

	public static void main(String[] args) {
		Book artOfComputerProgramming = new Book(1000);
		Book effectiveJava = new Book(1000);
		Book cleanCode = new Book(1000);

		System.out.println(artOfComputerProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());

		artOfComputerProgramming.setNoOfCopies(10);
		effectiveJava.setNoOfCopies(20);
		cleanCode.setNoOfCopies(30);

		artOfComputerProgramming.increaseNoOfCopies(100);
		effectiveJava.deceaseNoOfCopies(10);
		cleanCode.deceaseNoOfCopies(100);


	}

}
