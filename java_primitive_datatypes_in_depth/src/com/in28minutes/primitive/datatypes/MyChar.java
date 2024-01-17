package com.in28minutes.primitive.datatypes;

public class MyChar {
	private char ch;

	public MyChar(char ch) {
		this.ch = ch;
	}

	public boolean isVowel() {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			return true;
		}

		return false;
	}

	public boolean isConsonant() {
		// Alphabet and it is not VOWEL
		if (isAlphabet() && !isVowel()) {
			return true;
		}

		return false;

	}

	public boolean isDigit() {
		if (ch >= 48 && ch <= 57) { // between '0' and '9'
			return true;
		}

		return false;
	}

	public boolean isAlphabet() {
		if ((ch >= 97 && ch <= 122) || (ch >= 65 && ch <= 90)) { // 'a' to 'z' or 'A' to 'Z'
			return true;
		}

		return false;
	}

	public static void printLowerCaseAlphabets() {
//		for (int i = 97; i <= 122; i++) {
//			System.out.print((char) i);
//		}

		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(ch);
		}

		System.out.println();
	}

	public static void printUpperCaseAlphabets() {
		for (int i = 65; i <= 90; i++) {
			System.out.print((char) i);
		}

		System.out.println();
	}

}
