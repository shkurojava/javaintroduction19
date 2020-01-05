package ua.dp.ort.classwork;

import java.util.Scanner;

public class ClassWorh04_02 {

	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);

		double sideA = 0.0;
		double sideB = 0.0;
		String userInput;

		while(true)
		{
			System.out.println("Input value for side A :");
			userInput = scanner.nextLine();
			double unchekedSideAValue = Double.parseDouble(userInput);

			if (unchekedSideAValue <= 0) {
				System.out.println("You input is not correct");
				continue;
			} else {
				sideA = unchekedSideAValue;
						break;
				}
		}
			
			while(true)
			{
				System.out.println("Input value for side B :");
				userInput = scanner.nextLine();
				double unchekedSideBValue = Double.parseDouble(userInput);

				if (unchekedSideBValue <= 0) {
					System.out.println("You input is not correct");
					continue;
				} else {
					sideB = unchekedSideBValue;
							break;
					}

		}
			double sideC;
			while(true)
			{
				System.out.println("Input value for side C :");
				userInput = scanner.nextLine();
				double unchekedSideCValue = Double.parseDouble(userInput);

				if (unchekedSideCValue <= 0) {
					System.out.println("You input is not correct");
					continue;
				} else {
					sideC = unchekedSideCValue;
							break;
					}

		}
			System.out.println("The area of rectangle is " + (sideA * sideB * sideC));
	}
}
