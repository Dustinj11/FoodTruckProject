package com.skilldistillery.foodtruck;

public class FoodTruck {

	private int numericId;
	private String foodTruckName;
	private double foodTruckRating;
	private String foodType;
	private double averageRating;
	private static int nextTruck;

	public FoodTruck() {

	}

	public FoodTruck(Double avgRating) {
		this.averageRating = avgRating;
	}

	public FoodTruck(String name, double rating, String type) {
		this.foodTruckName = name;
		this.numericId = nextTruck;
		this.foodTruckRating = rating;
		this.foodType = type;
		nextTruck++;
	}

	public int getNextTruck() {
		return nextTruck;
	}

	public void setNextTruck(int nextTruck) {
		FoodTruck.nextTruck = nextTruck;
	}

	public int getNumericId() {
		return numericId;
	}

	public void setNumericId(int numericId) {
		this.numericId = numericId;
	}

	public String getFoodTruckName() {
		return foodTruckName;
	}

	public void setFoodTruckName(String foodTruckName) {
		this.foodTruckName = foodTruckName;
	}

	public double getFoodTruckRating() {
		return foodTruckRating;
	}

	public void setFoodTruckRating(double foodTruckRating) {
		this.foodTruckRating = foodTruckRating;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public double getAveragerating() {
		return averageRating;
	}

	public void setAveragerating(double averagerating) {
		this.averageRating = averagerating;
	}

	public String toString() {
		String output = "Truck ID: " + numericId + "\nName: " + foodTruckName + "\nType: " + foodType + "\nRating: "
				+ foodTruckRating;
		return output;
	}

	public void displayTruckInfo() {
		String truckInfo = this.toString();
		System.out.println(truckInfo);

	}
}