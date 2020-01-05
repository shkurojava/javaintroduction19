package ua.dp.ort.homework6;

import java.util.Scanner;

public class HomeWork6 {

	public static void main(String[] args) {
		final int Coffee = 5;
		final int Soda = 3;
		final int CocaCola = 10;
		final int PepsiCola = 10;

		Scanner scanner = new Scanner(System.in);
		String userInput;
		System.out.println("How much money do you have?");
		userInput = scanner.nextLine();
		int a = Integer.parseInt(userInput);

		if ((a >= Coffee) && (a >= Coffee) && (a >= CocaCola) && (a >= PepsiCola)) {

			if (a >= Coffee) {
				System.out.println("Cofe 5UAH. Press button 1");
			}
			if (a >= Soda) {
				System.out.println("Soda 3UAH. Press button 2");
			}
			if (a >= CocaCola) {
				System.out.println("Coca-Cola 10UAH. Press button 3");
			}
			if (a >= PepsiCola) {
				System.out.println("Pepsi-Cola 10UAH. Press button 4");

			} else {
				System.out.println("Sorry. You have little money");
			}

			System.out.println("Press button");
			userInput = scanner.nextLine();
			int button = Integer.parseInt(userInput);

			if (button == 1) {
				System.out.println("You choosed Coffee. It's prise 5UAH. You have left " + (a - Coffee) + " UAH");
			} else if (button == 2) {
				System.out.println("You choosed Soda. It's prise 3UAH. You have left " + (a - Soda) + " UAH");
			} else if (button == 3) {
				System.out.println("You choosed CocaCola. It's prise 10UAH. You have left " + (a - CocaCola) + " UAH");
			} else if (button == 4) {
				System.out
						.println("You choosed PepsiCola. It's prise 10UAH. You have left " + (a - PepsiCola) + " UAH");
			}

		} else {
			System.out.println("Sorry. You have little money");
		}
	}
}
