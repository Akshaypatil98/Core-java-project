package com.FoodOrder.Bean;

import java.util.Set;

public class Dish {
	private int dishId;
	private String dishName;
	private int cost;
	private double timeToCook;
	private Set<Location> lSet;

	public Dish() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dish(int dishId, String dishName, int cost, double timeToCook, Set<Location> lSet) {
		super();
		this.dishId = dishId;
		this.dishName = dishName;
		this.cost = cost;
		this.timeToCook = timeToCook;
		this.lSet = lSet;
	}

	public int getDishId() {
		return dishId;
	}

	public void setDishId(int dishId) {
		this.dishId = dishId;
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public double getTimeToCook() {
		return timeToCook;
	}

	public void setTimeToCook(double timeToCook) {
		this.timeToCook = timeToCook;
	}

	public Set<Location> getlSet() {
		return lSet;
	}

	public void setlSet(Set<Location> lSet) {
		this.lSet = lSet;
	}

	@Override
	public String toString() {
		return "Dish [dishId=" + dishId + ", dishName=" + dishName + ", cost=" + cost + ", timeToCook=" + timeToCook
				+ ", lSet=" + lSet + "]";
	}
}
