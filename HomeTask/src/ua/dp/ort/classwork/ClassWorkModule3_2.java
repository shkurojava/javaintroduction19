package ua.dp.ort.classwork;

import java.util.Scanner;

public class ClassWorkModule3_2 {
    public static final int ADD = 1; //+
    public static final int SUB = 2; //-
    public static final int MUL = 3; //*
    //public static final int DIV = 4; // /

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		String userInput;
//		System.out.println();
//		userInput = scanner.nextLine();
//		int myScore = Integer.parseInt(userInput);
//
//		if (myScore == 200) {
//			System.out.println("Perfect! You are so smart! Well done!");
//		} else if (myScore >= 180) {
//			System.out.println("It's an excellent result");
//		} else if (myScore >= 160) {
//			System.out.println("It's an nice result");
//		} else if (myScore >= 140) {
//			System.out.println("So so");
//		} else {
//
//			System.out.println("It's bad. You need to sdudy more");
//		}
		
		Scanner scanner = new Scanner(System.in);
		String userInput;
		
		System.out.println("Input first number");
		userInput = scanner.nextLine();
		double firstNumber = Double.parseDouble(userInput);
		
		System.out.println("Input second number");
		userInput = scanner.nextLine();
		double secondNumber = Double.parseDouble(userInput);
		
		System.out.println("input operation type:");
		System.out.println("For + input 1");
		System.out.println("For - input 2");
		System.out.println("For * input 3");
		System.out.println("For / input 4");
		userInput = scanner.nextLine();
		int operationType = Integer.parseInt(userInput) ;
		
		String messageForUser;
		double result;
		if (operationType == ADD) {
			result = firstNumber + secondNumber;
			messageForUser = "Result of operation (+) is ";
		} else if (operationType == SUB) {
			result = firstNumber - secondNumber;
			messageForUser = "Result of operation (-) is ";
		} else if (operationType == MUL) {
			result = firstNumber * secondNumber;
			messageForUser = "Result of operation (*) is ";
		} else {
			if (secondNumber == 0) {
				result = 0;
				messageForUser = "Error, you can not divide by zero ";

			} else {
				result = firstNumber / secondNumber;
				messageForUser = "Result of operation (/) is ";
			}
			}
		System.out.println(messageForUser + result);
		}
	}
