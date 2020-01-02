package ua.dp.ort.homework5;

import java.util.Scanner;

public class HomeWork5Task3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String userInput;
		System.out.println("Enter long");
		userInput = scanner.nextLine();
		
		int long1 = Integer.parseInt(userInput);
		System.out.println("Enter width");
		userInput = scanner.nextLine();
		int width = Integer.parseInt(userInput);
		
		if (long1 == width) {
			System.out.println("It's a square");
		} else {
			System.out.println("It's a rectangle");
		}
	}

}
