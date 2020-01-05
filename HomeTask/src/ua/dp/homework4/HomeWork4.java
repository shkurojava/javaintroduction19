package ua.dp.homework4;

public class HomeWork4 {

	public static void main(String[] args) {
		System.out.println("1) Simple arithmetic +, -, *, %");
		System.out.println("------------------------------------------------------------");
		System.out.println("Given: à=5, b=10");
		int a = 5;
		int b = 10;
	    System.out.println("Sum = " + (a + b));
		System.out.println("Difference = " + (a - b));
		System.out.println("Composition = " + (a * b));
		System.out.println("Particular  = " + (float)a/b);
		System.out.println("------------------------------------------------------------");
		int a1 = 5;
		System.out.println("2) Raising the number 5 to a power of 5 in two ways");
		System.out.println("Simple arithmetic: a*a*a*a*a=" + a1*a1*a1*a1*a1);
		System.out.println("Simple Math.pow = " + (int)Math.pow(a1, a1));
		System.out.println("------------------------------------------------------------");
		System.out.println("3) There is a function y=2x+5. How much y, when:" + "\n" + "1) x = 2;" + "\n" + "2) x = 9.5");
        int x = 2;
        int y;
        System.out.println("when õ=2: y=" + (y = (2 * x) + 5));
        double x1 = 9.5;
        System.out.println("when õ=9.5: y=" + (y = (int)(2 * x1) + 5));
		System.out.println("------------------------------------------------------------");
		System.out.println("4) The sides of the rectangle are given: x = 4.5 m, y = 3.1 m");
        double sideTriangleX = 9.5;
        double sideTriangleY = 3.1;
		System.out.println("Rectangle area = " + (sideTriangleX * sideTriangleY));
		System.out.println("The number of full square meters of area  = " + Math.rint(sideTriangleX * sideTriangleY));
		System.out.println("------------------------------------------------------------");
		System.out.println("5) There are 11 apples, these apples were distributed to 3m children so that everyone would get the same amount of whole apples");
		int apple = 11;
		int children = 3;
		System.out.println("Every child got " + Math.rint(apple / children));
		System.out.println("Apple left " + (apple - ((apple / children) * children)));
		System.out.println("------------------------------------------------------------");
		System.out.println("6) There is a limited distance you cannot go beyond. The distance is 1 meter and 43 centimeters. The frog is in the middle of this distance and starts to jump.");
		double distance = 1.43;
		double jumpFrog = 0.025;
		double startFrog = distance / 2;
		System.out.println("Full jumps to the finish = " + (Math.floor(startFrog / jumpFrog)));
		System.out.println("------------------------------------------------------------");
		System.out.println("7) Sum 1999999999 è 1999999999");
		int number1 = 1999999999;
		int number2 = 1999999999;
		long number2Long = number2;
		long sum = number1 + number2Long;
		System.out.println("1999999999 + 1999999999 = " + sum);
		System.out.println("------------------------------------------------------------");
		System.out.println("------------------------------------------------------------");
		System.out.println("8) There is a 6-digit number, which can be any one from 100000 to 999999 to develop an algorithm using only arithmetic operations, which would allow for any given 6-digit number to calculate the sum of all its numbers.");
		int sixDigitNumber;
		sixDigitNumber = 123456;
		int firstNumber = sixDigitNumber/100000;
		Math.rint(firstNumber);
		int secondNumber = ((sixDigitNumber - (firstNumber*100000))/10000);
		Math.rint(secondNumber);
		int thirdNumber = ((sixDigitNumber - (secondNumber*10000 + firstNumber*100000))/1000);
		Math.rint(thirdNumber);
		int fourthNumber = ((sixDigitNumber - (secondNumber*10000 + firstNumber*100000 + thirdNumber*1000))/100);
		Math.rint(fourthNumber);
		int fifthNumber = ((sixDigitNumber - (secondNumber*10000 + firstNumber*100000 + thirdNumber*1000 + fourthNumber*100))/10);
		Math.rint(fifthNumber);
		int sixthNumber = (sixDigitNumber - (secondNumber*10000 + firstNumber*100000 + thirdNumber*1000 + fourthNumber*100 + fifthNumber*10));
		Math.rint(fifthNumber);
		System.out.println("Sum = " + (firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber + sixthNumber));
		System.out.println("------------------------------------------------------------");
		System.out.println("We have 8 bits, the numbering of bits goes from left to right, 1-7 bits are the days of the week, the bit is set to 1 - the day is taken into account, 0 - the day is not taken into account. The 8th bit is the type of day, the bit is set to 1 - the working day, at 0 - day off");
		short workDays = 0b1111_1111;
		short dayOff = 0b0000_0000; 
		short task1 = 0b1111_1111;
		System.out.println("1. Weekends in 1111_1111 " + (dayOff & task1));
		System.out.println("2. Weekends in 1111_1111 " + (workDays & task1));
		short task2 = 0b1010_0101;
		System.out.println("3. 1010_0101 work days:");
		
		short monday = 0b1000_0000;
		short tuesday = 0b0100_0000;
		short wednesday = 0b0010_0000;
		short thursday = 0b0001_0000;
		short friday = 0b0000_1000;
		short saturday = 0b0000_0100;
		short sunday = 0b0000_0010;
		// 0b0001_1001
		// 0b1000_0001
		short task3 = 0b0001_1001;
				
    	System.out.println(" - Monday " + (task3 & monday));
    	System.out.println(" - Tuesday " + (task3 & tuesday));
    	System.out.println(" - Wednesday " + (task3 & wednesday));
    	System.out.println(" - Thursday " + (task3 & thursday));
    	System.out.println(" - Friday " + (task3 & friday));
    	System.out.println(" - Suturday " + (task3 & saturday));
    	System.out.println(" - Sunday " + (task3 & sunday));
        System.out.println("4. 0001_1001 weekends:");
    	short task4 = 0b0001_1001;
    	
    	System.out.println(" - Monday " + (~task4 & monday));
    	System.out.println(" - Tuesday " + (~task4 & tuesday));
    	System.out.println(" - Wednesday " + (~task4 & wednesday));
    	System.out.println(" - Thursday " + (~task4 & thursday));
    	System.out.println(" - Friday " + (~task4 & friday));
    	System.out.println(" - Suturday " + (~task4 & saturday));
    	System.out.println(" - Sunday " + (~task4 & sunday));

    	
		System.out.println("------------------------------------------------------------");
		System.out.println("Separate value of all color parameters is given.");
		System.out.println("R (red color) = 115");
	    System.out.println("G (green color) = 15");
	    System.out.println("B (blue color) = 200");
	    System.out.println("A (transparent) = 67");
	    int red = 115;
	    int green = 15;
	    int blue = 200;
	    int transparent = 67;
	    int nullTest = 0;
	    System.out.println(Integer.toBinaryString(red) + "_"+ Integer.toBinaryString(green) + "_"+ Integer.toBinaryString(blue) + "_"+ Integer.toBinaryString(transparent));
        
	    System.out.println("------------------------------------------------------------");   
	    System.out.println(red >> green);
	}

}

