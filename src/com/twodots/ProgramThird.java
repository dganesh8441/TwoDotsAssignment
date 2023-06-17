package com.twodots;

public class ProgramThird {

	public static void main(String[] args) {
		String str = "5";
		myCode(str);

	}

	public static void myCode(String str) {
		int rows = Integer.parseInt(str);

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

}
