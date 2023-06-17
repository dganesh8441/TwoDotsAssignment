package com.twodots;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProgramSecond {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String inputLine = s.nextLine();

		boolean result = containsAllAlphabetCharacters(inputLine);
		System.out.println(result);
	}

	private static boolean containsAllAlphabetCharacters(String inputLine) {
		String lowerCaseInput = inputLine.toLowerCase();
		Set<Character> alphabetSet = new HashSet<>();

		for (char c = 'a'; c <= 'z'; c++) {
			alphabetSet.add(c);
		}

		for (char c : lowerCaseInput.toCharArray()) {
			alphabetSet.remove(c);
			if (alphabetSet.isEmpty()) {
				return true;
			}
		}

		return false;
	}

}
