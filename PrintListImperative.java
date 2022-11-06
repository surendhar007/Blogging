package com.learning.lesson1;

import java.util.List;

public class PrintListImperative {

	public static boolean isOdd(int num) {
		return num % 2 == 1;
	}

	public static int squareIt(int num) {
		return num * num;
	}

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		for (Integer num : numbers) {
			if (isOdd(num)) {
				System.out.println(squareIt(num));
			}
		}
	}

}
