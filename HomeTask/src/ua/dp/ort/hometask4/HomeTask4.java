package ua.dp.ort.hometask4;

public class HomeTask4 {

	public static void main(String[] args) {
		System.out.println("1) Простые арифмитические действия +, -, *, %");
		System.out.println("------------------------------------------------------------");
		System.out.println("Дано: а=5, b=10");
		int a = 5;
		int b = 10;
	    System.out.println("Сумма = " + (a + b));
		System.out.println("Разность = " + (a - b));
		System.out.println("Произведение = " + (a * b));
		System.out.println("Частное = " + (float)a/b);
		System.out.println("------------------------------------------------------------");
		int a1 = 5;
		System.out.println("2) Возведения числа 5 в степень 5 двумя способами");
		System.out.println("Арифметический способ: a*a*a*a*a=" + a1*a1*a1*a1*a1);
		System.out.println("Методом Math.pow = " + (int)Math.pow(a1, a1));
		System.out.println("------------------------------------------------------------");
		System.out.println("3) Есть функция y=2x+5. Сколько равно y, при:" + "\n" + "1) x = 2;" + "\n" + "2) x = 9.5");
        int x = 2;
        int y;
        System.out.println("при х=2: y=" + (y = (2 * x) + 5));
        double x1 = 9.5;
        System.out.println("при х=9.5: y=" + (y = (int)(2 * x1) + 5));
		System.out.println("------------------------------------------------------------");
		System.out.println("4) Даны стороны прямоугольника: x = 4.5 метра, y = 3.1 метра");
        double sideTriangleX = 9.5;
        double sideTriangleY = 3.1;
		System.out.println("Площадь прямоугольника = " + (sideTriangleX * sideTriangleY));
		System.out.println("Количество полных квадратных метров площади = " + Math.rint(sideTriangleX * sideTriangleY));
		System.out.println("------------------------------------------------------------");
		System.out.println("5) Есть 11 яблок, эти яблоки раздали 3м детям так чтобы всем досталось одинаковое количество целых яблок");
		int apple = 11;
		int children = 3;
		System.out.println("Каждому ребенку досталось " + Math.rint(apple / children));
		System.out.println("Яблок осталось " + (apple - ((apple / children) * children)));
		System.out.println("------------------------------------------------------------");
		System.out.println("6) Есть ограниченная дистанция, за которую нельзя выходить. Дистанция равна 1 метр и 43 сантиметра. Лягушка находиться посредине этой дистанции и начинает прыгать.");
		double distance = 1.43;
		double jumpFrog = 0.025;
		double startFrog = distance / 2;
		System.out.println("Полных прыжков до финиша = " + (Math.floor(startFrog / jumpFrog)));
		System.out.println("------------------------------------------------------------");
		System.out.println("7) Сумма чисел 1999999999 и 1999999999");
		int number1 = 1999999999;
		int number2 = 1999999999;
		long number2Long = number2;
		long sum = number1 + number2Long;
		System.out.println("1999999999 + 1999999999 = " + sum);
		System.out.println("------------------------------------------------------------");
		System.out.println("------------------------------------------------------------");
		System.out.println("8) Есть 6ти значное число, которое может быть любым от 100000 до 999999 разработать алгоритм, с использованием только арифметических операций,который бы позволял при любом указанном 6ти значном числе вычислять сумму всех его чисел.");
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
		System.out.println("Сумма = " + (firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber + sixthNumber));
		System.out.println("------------------------------------------------------------");
		System.out.println("У нас есть 8 бит, нумерация битов идет слева на право 1-7 бит это дни недели, бит установлен в 1 - день учитывается, в 0 - день не учитывается 8й  бит это тип дня, бит установлен в 1 - рабочий день, в 0 - выходной день");
		short workDays = 0b1111_1111;
		short dayOff = 0b0000_0000; 
		short task1 = 0b1111_1111;
		System.out.println("1. Выходные дни в 1111_1111 " + (dayOff & task1));
		System.out.println("2. Выходные дни в 1111_1111 " + (workDays & task1));
		short task2 = 0b1010_0101;
		System.out.println("3. 1010_0101 рабочие дни:");
		
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
				
    	System.out.println(" - Понедельник " + (task3 & monday));
    	System.out.println(" - Вторник " + (task3 & tuesday));
    	System.out.println(" - Среда " + (task3 & wednesday));
    	System.out.println(" - Четверг " + (task3 & thursday));
    	System.out.println(" - Пятница " + (task3 & friday));
    	System.out.println(" - Суббота " + (task3 & saturday));
    	System.out.println(" - Воскресенье " + (task3 & sunday));
        System.out.println("4. 0001_1001 выходные дни:");
    	short task4 = 0b0001_1001;
    	
    	System.out.println(" - Понедельник " + (~task4 & monday));
    	System.out.println(" - Вторник " + (~task4 & tuesday));
    	System.out.println(" - Среда " + (~task4 & wednesday));
    	System.out.println(" - Четверг " + (~task4 & thursday));
    	System.out.println(" - Пятница " + (~task4 & friday));
    	System.out.println(" - Суббота " + (~task4 & saturday));
    	System.out.println(" - Воскресенье " + (~task4 & sunday));

    	
		System.out.println("------------------------------------------------------------");
		System.out.println("Дано отдельное значение всех параметров цвета");
		System.out.println("R (красный цвет) = 115");
	    System.out.println("G (зеленый цвет) = 15");
	    System.out.println("B (синий цвет) = 200");
	    System.out.println("A (прозрачность) = 67");
	    int red = 115;
	    int green = 15;
	    int blue = 200;
	    int transparent = 67;
	    int nullTest = 0;
	    System.out.println(Integer.toBinaryString(red) + "_"+ Integer.toBinaryString(green) + "_"+ Integer.toBinaryString(blue) + "_"+ Integer.toBinaryString(transparent));
        
	    System.out.println("------------------------------------------------------------"); 
	 
	}

}
