package ua.dp.ort.homework5;

import java.util.Scanner;

public class HomeWork5Task2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String userInput;
		System.out.println("Input number 1");
		userInput = scanner.nextLine();
		int a = Integer.parseInt(userInput);
		
		System.out.println("Input number 2");
		userInput = scanner.nextLine();
		int b = Integer.parseInt(userInput);
		
		if (a == b) {
			System.out.println("numbers are equal");
		} else if (a != b) {
			
			if (a > b) {
				System.out.println("numbers are not equal and a > b");
			} else {
				System.out.println("numbers are not equal and a < b");
			}
		}
	}

}
