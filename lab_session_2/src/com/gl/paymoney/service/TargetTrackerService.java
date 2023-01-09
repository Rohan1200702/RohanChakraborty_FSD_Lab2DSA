/**
 * @author Rohan Chakraborty
 * 
 */
package com.gl.paymoney.service;

import java.util.Scanner;

public class TargetTrackerService {
	public static void searchTransaction(int transArr[], int target) {
		int i = 0, sum = 0;
		boolean check = false;
		for (i = 0; i < transArr.length; i++) {
			sum += transArr[i];
			if (sum > target) {
				check = true;
				break;
			}
		}
		if (check)
			System.out.println("Target achieved after " + (i + 1) + " Trnsaction");
		else
			System.out.println("Given target is not achieved");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int noOfTransaction = sc.nextInt();
		int[] transArr = new int[noOfTransaction];
		System.out.println("Enter the values of array");
		for (int i = 0; i < noOfTransaction; i++)
			transArr[i] = sc.nextInt();
		System.out.println("enter the total no of targets that needs to be achieved");
		int times = sc.nextInt();
		while (times-- != 0) {
			System.out.println("Enter the value of target");
			int target = sc.nextInt();
			searchTransaction(transArr, target);
		}
	}
}
