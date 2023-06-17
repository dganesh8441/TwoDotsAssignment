package com.twodots;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ProgramFirst {

	public static void main(String[] args) {
		// Arguments will be read by STDIN
		Scanner s = new Scanner(System.in);
		String inputLine = s.nextLine();

		char result = findFirstNonRepeatingChar(inputLine);
		System.out.println(result);
	}

	private static char findFirstNonRepeatingChar(String inputLine) {
		Map<Character, Integer> charCount = new LinkedHashMap<>();

		for (char c : inputLine.toCharArray()) {
			charCount.put(c, charCount.getOrDefault(c, 0) + 1);
		}

		for (char c : inputLine.toCharArray()) {
			if (charCount.get(c) == 1) {
				return c;
			}
		}

		return ' '; // Default return value if no non-repeating character is found

	}

}
