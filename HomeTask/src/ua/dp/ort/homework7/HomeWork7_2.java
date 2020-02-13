package ua.dp.ort.homework7;

import java.util.Scanner;

public class HomeWork7_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double stationCapacity;
		double orderStation;
		double refuelingDose;
		double order;
		double balance;
		double pumpServings;

		String userInput;

		while (true) {
			System.out.println("Enter storage capacity ");
			userInput = scanner.nextLine();
			double enteredData = Double.parseDouble(userInput);

			if (enteredData <= 0) {
				System.out.println("You input is not correct. Please, enter is correct");
			} else {
				stationCapacity = enteredData;
				break;
			}
		}

		while (true) {
			System.out.println("Enter order station ");
			userInput = scanner.nextLine();
			double enteredData = Double.parseDouble(userInput);

			if (enteredData < 0) {
				System.out.println("You input is not correct. Please, enter is correct");
			}
			if (enteredData > stationCapacity) {
				System.out.println("You input is not correct. Please, enter is correct");
			} else {
				orderStation = enteredData;
				break;
			}
		}

		while (true) {
			System.out.println("refueling dose = ");
			userInput = scanner.nextLine();
			double enteredData = Double.parseDouble(userInput);

			if (enteredData <= 0) {
				System.out.println("You input is not correct. Please, enter is correct");
			} else {
				refuelingDose = enteredData;
				break;
			}
		}

		while (true) {
			System.out.println("Order = ");
			userInput = scanner.nextLine();
			double enteredData = Double.parseDouble(userInput);

			if (enteredData <= 0) {
				System.out.println("You input is not correct. Please, enter is correct");
			} else {
				order = enteredData;
				break;
			}
		}

		if (order > orderStation) {
			System.out.println("Order exceeds balance in storage");
		} else {
			System.out.println("Balanse in storage = " + (orderStation - order));
			System.out.println("Number of pump doses = " + (order / refuelingDose));
		}

	}

}
