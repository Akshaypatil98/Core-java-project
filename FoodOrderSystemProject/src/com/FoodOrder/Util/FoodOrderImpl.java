package com.FoodOrder.Util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.FoodOrder.Bean.Dish;
import com.FoodOrder.Bean.Location;
import com.FoodOrder.Bean.Order;

public class FoodOrderImpl implements FoodOrderInf {

	@Override
	public void populateData(String dishFile, String locationFile, List<Dish> dishes, Set<Location> locations) {
		// TODO Auto-generated method stub
		Scanner scan = null;

		try {
			scan = new Scanner(new File(dishFile));
			while (scan.hasNext()) {
				String line = scan.nextLine();
				String[] splits = line.split(",");
				Dish d = new Dish();
				d.setDishId(Integer.parseInt(splits[0]));
				d.setDishName(splits[1]);
				d.setCost(Integer.parseInt(splits[2]));
				d.setTimeToCook(Double.parseDouble(splits[3]));
				dishes.add(d);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			scan = new Scanner(new File(locationFile));
			while (scan.hasNext()) {
				String line = scan.nextLine();
				String[] splits = line.split(",");
				Location l = new Location();
				l.setLocationCode(Integer.parseInt(splits[0]));
				l.setLocationDistance(Integer.parseInt(splits[1]));
				l.setLocationTime(Double.parseDouble(splits[2]));
				locations.add(l);

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void calculateLocationForDistane(List<Dish> dishes, Set<Location> locations) {
		for (Dish d : dishes) {
			for (Location l : locations) {
				if (d.getlSet() == null) {
					d.setlSet(new HashSet<Location>());
				}
				if (d.getTimeToCook() + l.getLocationTime() <= 30) {
					d.getlSet().add(l);
				}
			}
		}
	}

	@Override
	public List<Order> calculateOrder(String orderFile, List<Dish> dishes, Set<Location> locations) {
		List<Order> oList = new ArrayList<Order>();
		List<Order> AcceptOrder = new ArrayList<Order>();
		List<Order> DiclinedOrder = new ArrayList<Order>();
		try {
			Scanner sc = new Scanner(new File(orderFile));
			while (sc.hasNext()) {
				String line = sc.nextLine();
				String[] splits = line.split(",");
				Order o = new Order();
				o.setDishId(Integer.parseInt(splits[0]));
				o.setLocationCode(Integer.parseInt(splits[1]));
				oList.add(o);
				for (Dish d : dishes) {
					if (d.getDishId() == o.getDishId()) {
						for (Location l : locations) {
							if (l.getLocationCode() == o.getLocationCode()) {
								double cost = d.getCost() + l.getLocationDistance() * 1;
								o.setTotalCost(cost);
								if (d.getTimeToCook() + l.getLocationTime() < 30) {
									AcceptOrder.add(o);
								} else {
									DiclinedOrder.add(o);

								}
							}

						}
					}
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\n*************************** Accepted Order ***********************************\n");
		for (Order order : AcceptOrder) {
			System.out.println(order);
		}

		System.out.println("\n*************************** Diclined Order ***********************************\n");
		for (Order order : DiclinedOrder) {
			System.out.println(order);
		}
		return oList;

	}

	


}
