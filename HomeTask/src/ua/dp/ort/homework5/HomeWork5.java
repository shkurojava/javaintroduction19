package ua.dp.ort.homework5;

import java.util.Scanner;

public class HomeWork5 {

	public static void main(String[] args) {
		System.out.println("We calculate the area of the rectangle");
		Scanner scanner = new Scanner(System.in);
		
		String userInput;
		System.out.println("Enter the width of the rectangle: ");
		userInput = scanner.nextLine();
		int width = Integer.parseInt(userInput);
		System.out.println("Enter the length of the rectangle: ");
		userInput = scanner.nextLine();
		int length = Integer.parseInt(userInput);
		int square = width * length;
		System.out.println("Rectangle area = " + square);
				



	}

}
