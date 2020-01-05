package ua.dp.ort.homework7;

import java.util.Scanner;

public class HomeWork7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String userInput;
		
		while(true)
		{
		System.out.println("Enter storage capacity ");
		userInput = scanner.nextLine();
		double enteredData = Double.parseDouble(userInput);
		
		if (enteredData <= 0) {
			System.out.println("You input is not correct. Please, enter is correct");
		}
	}

}
