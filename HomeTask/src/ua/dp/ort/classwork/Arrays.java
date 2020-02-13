package ua.dp.ort.classwork;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		int[] userNumbers = new int [10];
		
		for (int counter = 0; counter < 10; counter++) {
			System.out.println("Please input " + (counter +1) + "numbers");
			
			String userInput = scanner.nextLine();
			int userNumber = Integer.parseInt(userInput);
			
			userNumbers[counter] = userNumber;
			}
		scanner.close();
		int min = userNumbers[0];
		for (int counter = 1; counter < userNumbers.length; counter++) {
			
			if (min > userNumbers[counter]) {
				min = userNumbers[counter];
			}
			
		}
		System.out.println(min);
	}

}
