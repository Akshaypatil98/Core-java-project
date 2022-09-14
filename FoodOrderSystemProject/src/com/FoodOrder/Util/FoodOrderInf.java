package com.FoodOrder.Util;

import java.util.List;
import java.util.Set;

import com.FoodOrder.Bean.Dish;
import com.FoodOrder.Bean.Location;
import com.FoodOrder.Bean.Order;

public interface FoodOrderInf {
	public void populateData(String dishFile, String locationFile, List<Dish> dishes, Set<Location> locations);

	public void calculateLocationForDistane(List<Dish> dishes, Set<Location> locations);

	List<Order> calculateOrder(String orderFile, List<Dish> dishes, Set<Location> locations);

	
}
