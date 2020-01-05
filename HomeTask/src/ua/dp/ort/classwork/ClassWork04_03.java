package ua.dp.ort.classwork;

import java.util.Scanner;

public class ClassWork04_03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double storageCapacity = 0.0; 
		double ml = 0.0;
		String userInput;
		
		while (true) {
		      System.out.println("Enter storage capacity: ");
		      userInput = scanner.nextLine();
		      double inputStorageCapacity = Double.parseDouble(userInput);
		      
		      if (inputStorageCapacity <= 0) {
		    	  System.out.println("You input is not correct");
		    	  continue;
		      } else {
		    	  storageCapacity = inputStorageCapacity;
		    	  break;
		      }
		}
		
		      				
		
		
		
		
		
		


	}

}
