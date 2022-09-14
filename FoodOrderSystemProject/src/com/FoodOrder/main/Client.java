package com.FoodOrder.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.FoodOrder.Bean.Dish;
import com.FoodOrder.Bean.Location;
import com.FoodOrder.Bean.Order;
import com.FoodOrder.Util.FoodOrderImpl;
import com.FoodOrder.Util.FoodOrderInf;

public class Client {
	public static void main(String[] args) {
		List<Dish> dList = new ArrayList<Dish>();
		Set<Location> lSet = new HashSet<Location>();
		FoodOrderInf fos = new FoodOrderImpl();
		fos.populateData("Dish.txt", "Location.txt", dList, lSet);
		System.out.println("***************************Food Order System***********************************\n");
		System.out.println("\n*************************** Dish List ***********************************\n");
		for (Dish d : dList) {
			System.out.println(d);
		}
		System.out.println("\n*************************** Location List ***********************************\n");
		for (Location location : lSet) {
			System.out.println(location);
		}
		System.out.println(
				"\n*************************** CalculateLocationForDistance ***********************************\n");
		fos.calculateLocationForDistane(dList, lSet);
		for (Dish ds : dList) {
			System.out.println(ds);
		}
		System.out.println(
				"\n*************************** Calculate Location For Distance ***********************************\n");

		List<Order> order = fos.calculateOrder("Order.txt", dList, lSet);

		
	}

}
