package ua.dp.ort.certification;

import java.util.Scanner;

public class Certification {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter a character to display ");
		char character = scanner.next().charAt(0);
		
		System.out.println("Enter the horizontal amount ");
		int horizontal = scanner.nextInt();
		
		System.out.println("Enter the vertical amount ");
		int vertical = scanner.nextInt();
		
		
		char[][] matrix = new char[horizontal][vertical];
 
        for (int i = 0; i < horizontal; i++) {
            for (int j = 0; j < vertical; j++) {
                matrix[i][j] = character;
            }
        }
 
        for (int i = 0; i < horizontal; i++) {
            for (int j = 0; j < vertical; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}