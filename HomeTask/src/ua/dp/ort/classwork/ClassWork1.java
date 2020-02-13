package ua.dp.ort.classwork;


import java.util.Scanner;

public class ClassWork1 {
	public static final int MILLIONER = 1_000_000;
	public static final int OLD_PERSON = 65;
	public static final int WEIGHT_PERSON = 100;

	public static void main(String[] args) {
//      String someValue1 = "1111";
//		System.out.println("int " + Integer.parseInt(someValue1));
//		String someValue2 = "123.11125";
//		System.out.println("double " + Double.parseDouble(someValue2));
//		String booleenFalse = "falsed";
//		System.out.println("False " + Boolean.parseBoolean(booleenFalse));
		
		Scanner scanner = new Scanner(System.in);
		String userInput;
		System.out.println("You name  ");
		userInput = scanner.nextLine();
//		System.out.println("You name is " + userInput);
		System.out.println("You are age ");
		userInput = scanner.nextLine();
		int age = Integer.parseInt(userInput);
//		System.out.println("You age is " + age);
		System.out.println("Input how much money do you have? ");
		userInput = scanner.nextLine();
		int userMoney = Integer.parseInt(userInput);
		
			

		String userInfo = "You age is " + age;
		
		if (userMoney >= MILLIONER) {
			userInfo = userInfo + " and you are rich!!!";
		} else {
			userInfo = userInfo + " and you are not rich, go to work!! right now, you need " + (MILLIONER - userMoney);
		}
		if (age >= OLD_PERSON) {
			userInfo = userInfo + " and you are old person";

		}
		System.out.println(userInfo);
		
	    		
		System.out.println("What is your weight? ");
		    userInput = scanner.nextLine();
		    int weight = Integer.parseInt(userInput);
		
		String userWeigt = "Your weight " + weight;
		
		if (weight >= WEIGHT_PERSON) {
			userWeigt = userWeigt + " go to the GYM!!!";
		} else {
			userWeigt = userWeigt + " You are in great shape";
		}
		
		
		
	}

}
