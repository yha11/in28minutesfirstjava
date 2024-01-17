package com.in28minutes.primitive.datatypes;

public class MyCharRunner {

	public static void main(String[] args) {
		MyChar myChar = new MyChar('A');

		System.out.println(myChar.isVowel()); // 'a', 'e', 'i', 'o', 'u' 알파벳 모음인가?
		System.out.println(myChar.isDigit()); // 숫자인가?
		System.out.println(myChar.isAlphabet()); // 알파벳인가?
		System.out.println(myChar.isConsonant()); // 알파벳 자음인가?

		MyChar.printLowerCaseAlphabets();
		MyChar.printUpperCaseAlphabets();

	}

}
