package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		FoodTruck[] foodTruckArray = new FoodTruck[5];
		
		
		System.out.println("Please input up to 5 ratings of the food trucks? ");
//		String userInput = input.nextLine();
		
//		while ( true ) 
		// for loop? 
		

		for (int i = 0; i < foodTruckArray.length; i++) {
			
			System.out.println("Please enter the name of the food truck: ");
			String truckName = input.nextLine();
			if (truckName.equalsIgnoreCase("quit")) {
				break;

			} else {

				System.out.println("Enter the food type: ");
				String type = input.nextLine();

				System.out.println("Enter your rating on a scale of 1-5.");
				double rating = input.nextDouble();
				input.nextLine();
				// use the array inside the for loop in order to get Truck ID  
				foodTruckArray[i] = new FoodTruck(truckName, rating, type);
				
			}
		}
		
		boolean menuLoop = true;
		//start with a while loop, input the menu selection into a switch to give options. 
		while (menuLoop) {
			System.out.println("Select a number 1 - 4");
			System.out.println("1. List all Food Trucks");
			System.out.println("2. Average rating of Food Trucks");
			System.out.println("3. Display the top food truck");
			System.out.println("4. Quit");

			int menuSelect = input.nextInt();

			if (menuSelect > 0 || menuSelect < 5) {

				switch (menuSelect) {

				case 1:
					System.out.println("Here is a list of the food trucks");

					for (int i = 0; i < foodTruckArray.length; i++) {
						if (foodTruckArray[i] == null) {
							break;
						}
						System.out.println(foodTruckArray[i].toString());
						System.out.println();
					}
					break;

				case 2:
					System.out.println("The average rating of food trucks is: ");
					double sum = 0;
					int count = 0;
					for (int i = 0; i < foodTruckArray.length; i++) {
						if (foodTruckArray[i] == null) {
							break;
						}
						sum += foodTruckArray[i].getFoodTruckRating();
						count++;
					}
					double average = sum / count;
					System.out.println(average);

					break;

				case 3:
					System.out.println("The top food truck is: ");

					double highestRating = foodTruckArray[0].getFoodTruckRating();
					int counter = 0;
					for (int i = 0; i < foodTruckArray.length; i++) {
						if (foodTruckArray[i] == null) {
							break;
						}

						if (foodTruckArray[i].getFoodTruckRating() > highestRating) {
							highestRating = foodTruckArray[i].getFoodTruckRating();
							counter = i;

						}

					}
					System.out.println(foodTruckArray[counter].toString());

					break;

				case 4:
					System.out.println("Thank you for using the Food Truck App");
					menuLoop = false;
					return;

				default:
					System.out.println("This is an invalid option please enter a correct one; 1-4");
					break;
				}

			}

		}

		input.close();
	}

		
		
		 }
		

