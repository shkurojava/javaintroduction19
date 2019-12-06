package ua.dp.ort.hometask3;

public class HomeTask3 {

	public static void main(String[] args) {
		// 1) Для каждого примитивного типа данных (byte short int long float double):
		// - придумать 3 значения которых можно в данном типе
		// - дать переменной осмысленное имя (согласно java convention)
		// - вывести значение переменной в консоль
		
		    	  byte age = 34;
		    	  byte weight = 79;
		    	  short heiht = 170;
		    	  System.out.println("Мой возраст: " + age + " лет");
		    	  System.out.println("Мой вес: " + weight + " килограмм");
		    	  System.out.println("Мой рост: " + heiht + " сантиметров");
		    	  System.out.println("----------------------------------------------------------------");
		    	  short onlineStore = 1;
		    	  short categories = 9;
		    	  int products = 5936;
		    	  System.out.println("У меня есть " + onlineStore + " интернет-магазин");
		    	  System.out.println("В нем пока " + categories + " категорий товаров");
		    	  System.out.println("В нем " + products + "товаров");
		    	  System.out.println("----------------------------------------------------------------");
		    	  long earthPopulation1990 = 528800000000l;
		    	  long earthPopulation2000 = 612200000000l;
		    	  long earthPopulation2019 = 770000000000l;
		    	  System.out.println("Население земли на 1990 составило " + earthPopulation1990 + " людей");
		    	  System.out.println("Население земли на 2000 составило " + earthPopulation2000 + " людей");
		    	  System.out.println("Население земли на 2019 составило " + earthPopulation2019 + " людей");
		    	  System.out.println("----------------------------------------------------------------");
		    	  System.out.println("Пропишем для более удобного чтения населеним земли через запятую");
		    	  float earthPopulation1990f = 5.288f;
		    	  float earthPopulation2000f = 6.122f;
		    	  float earthPopulation2019f = 7.7f;
		    	  System.out.println("Население земли на 1990 составило " + earthPopulation1990f + " людей");
		    	  System.out.println("Население земли на 2000 составило " + earthPopulation2000f + " людей");
		    	  System.out.println("Население земли на 2019 составило " + earthPopulation2019f + " людей");
		    	  System.out.println("----------------------------------------------------------------");
		          double Pi = 3.14159265359;
		          double acelerationOfGravity = 9.80665;
		          double electricConstant = 0.00000000000885;
		          System.out.println("Есть константы на пример:");
		          System.out.println("Математическая постоянная Пи=" + Pi);
		          System.out.println("Ускорение свободного падения на поверхность Земли g = " + acelerationOfGravity + " м/с2");
		          System.out.println("Электрическая постоянная = " + electricConstant+ " Ф/м");
		    	  System.out.println("================================================================");
		          System.out.println("Часть 2");
		          System.out.println("----------");
		    	  
		      


		         
		// для типа char создать 3 переменных, присвоить им код символа и вывести их в консоль

		//-------------------------------------------------------------------------------------
		// 2) Придумать легенду, и привести 3 примера испольования с описанием.
		// количество бит можно использовать любое
		        
		
		         System.out.println("Рабочие дни в месяце: 1111 0011110 0011111 0011111 0011111, где 1 это рабочий день");
		         System.out.println("Рабочая неделя: 10011111");
		         System.out.println("Праздничные дни: 1000 0000001 0000000 0000000 0000000");
		         System.out.println("================================================================");
		         System.out.println("Часть 3");
		         System.out.println("----------");         
		        
		// 3) Допустим вы пишите программу калькулятор, аналогичный как в ОС Windows.
		// Обявите 5 констант, выведите их значения в консоль.
		         System.out.println("Калькулятор для подсчета количества светильников необходимых для помещения");
		         // требуется доработка
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
		         System.out.println("\n" + "Количество светильников = " +  NumberOfLamp);
		         
		         
		    }
		    
		}

