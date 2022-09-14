package com.FoodOrder.Bean;

public class Order {
	private int dishId;
	private int locationCode;
	private double totalCost;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(int dishId, int locationCode, double totalCost) {
		super();
		this.dishId = dishId;
		this.locationCode = locationCode;
		this.totalCost = totalCost;
	}

	public int getDishId() {
		return dishId;
	}

	public void setDishId(int dishId) {
		this.dishId = dishId;
	}

	public int getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(int locationCode) {
		this.locationCode = locationCode;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	@Override
	public String toString() {
		return "Order [dishId=" + dishId + ", locationCode=" + locationCode + ", totalCost=" + totalCost + "]";
	}

}
