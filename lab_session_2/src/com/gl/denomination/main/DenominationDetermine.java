package com.gl.denomination.main;

import java.util.Scanner;

public class DenominationDetermine {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the size of currency denominations");
			int denoSize = sc.nextInt();
			int[] denoArray = new int[denoSize];
			System.out.println("enter the currency denominations value");
			while (denoSize-- != 0)
				denoArray[denoSize] = sc.nextInt();
			System.out.println("enter the amount you want to pay");
			int amount = sc.nextInt();

			System.out.println("Your payment approach in order to give min no of notes will be");
			calculateDenomination(denoArray, amount);
		}
	}

	public static void calculateDenomination(int[] denoArray, int target) {
		// method to sort the denomination array in descending order
		sort_descending(denoArray);

		for (int i = 0; i < denoArray.length; i++) {
			if (target / denoArray[i] > 0) {
				// printing the min. highest denomination need to pay to achieve the amount
				System.out.println(denoArray[i] + ":" + (target / denoArray[i]));
				// changing the amount to balance amount
				target = target % denoArray[i];
			}
		}
		if (target > 0) {
			System.out.println("exact amount cannot be given with the highest denomination");
		}

	}

	public static int[] sort_descending(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

}
