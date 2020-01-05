package ua.dp.ort.homework3;

public class HomeWork3 {

	public static void main(String[] args) {
	
		    	  byte age = 34;
		    	  byte weight = 79;
		    	  short heiht = 170;
		    	  System.out.println("My age: " + age + " years");
		    	  System.out.println("My weight: " + weight + " weighs");
		    	  System.out.println("My heiht: " + heiht + " centimeters");
		    	  System.out.println("----------------------------------------------------------------");
		    	  short onlineStore = 1;
		    	  short categories = 9;
		    	  int products = 5936;
		    	  System.out.println("I have an " + onlineStore + " online store");
		    	  System.out.println("There are " + categories + " categories of goods in it");
		    	  System.out.println("There are " + products + "products");
		    	  System.out.println("----------------------------------------------------------------");
		    	  long earthPopulation1990 = 528800000000l;
		    	  long earthPopulation2000 = 612200000000l;
		    	  long earthPopulation2019 = 770000000000l;
		    	  System.out.println("The population of the earth in 1990 amounted to " + earthPopulation1990 + " people");
		    	  System.out.println("The population of the earth in 2000 amounted to " + earthPopulation2000 + " people");
		    	  System.out.println("The population of the earth in 2019 amounted to " + earthPopulation2019 + " people");
		    	  System.out.println("----------------------------------------------------------------");
		    	  System.out.println("Let’s write a comma for easier reading by the population of the earth");
		    	  float earthPopulation1990f = 5.288f;
		    	  float earthPopulation2000f = 6.122f;
		    	  float earthPopulation2019f = 7.7f;
		    	  System.out.println("The population of the earth in 1990 amounted to " + earthPopulation1990f + " people");
		    	  System.out.println("The population of the earth in 2000 amounted to " + earthPopulation2000f + " people");
		    	  System.out.println("The population of the earth in 2019 amounted to " + earthPopulation2019f + " people");
		    	  System.out.println("----------------------------------------------------------------");
		          double Pi = 3.14159265359;
		          double acelerationOfGravity = 9.80665;
		          double electricConstant = 0.00000000000885;
		          System.out.println("There are constants for example:");
		          System.out.println("Mathematical constant Pi = " + Pi);
		          System.out.println("Acceleration of free fall on the Earth's surface g = " + acelerationOfGravity + " ì/s2");
		          System.out.println("Electric constant = " + electricConstant+ " F/ì");
		    	  System.out.println("================================================================");
		          System.out.println("Part 2");
		          System.out.println("----------");
		    	  
		          


		         
		
		         System.out.println("Working days in the month: 1111 0011110 0011111 0011111 0011111, where  is the working days");
		         System.out.println("Work week: 10011111");
		         System.out.println("Holidays: 1000 0000001 0000000 0000000 0000000");
		         System.out.println("================================================================");
		         System.out.println("Part 3");
		         System.out.println("----------");         
		        
		
		         System.out.println("Calculator for counting the number of fixtures needed for a room");
		         final int hallway = 100;
		         final int classroom = 300;
		         final int office = 450;
		         final int bedroom = 200;
		         final int sportHall = 400;
		         double lenghtRoom = 10;
		         double widthRoom = 12;
		         double heightRoom = 3.5;
		         int normLux;
		         int lamp;
		         normLux = bedroom;
		         lamp = 600;
		         double roomVolume = lenghtRoom * widthRoom * heightRoom;
		         double NumberOfLamp = (roomVolume * normLux) / lamp;
		         System.out.println("\n" + "Number of fixtures = " +  NumberOfLamp);
		         
		         
		    }
		    
		}

