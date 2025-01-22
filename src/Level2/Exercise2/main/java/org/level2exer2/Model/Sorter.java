package org.level2exer2.Model;

import java.util.*;

public class Sorter {

    private HashSet<Restaurant> restaurantList;

    public Sorter(HashSet<Restaurant> restaurantList) {

        this.restaurantList = restaurantList;

    }

    public void sortByKey(){

        List<Restaurant> sortedList = new ArrayList<>(restaurantList);

        Collections.sort(sortedList, new Comparator<Restaurant>() {
            @Override
            public int compare(Restaurant restaurant1, Restaurant restaurant2) {
                return restaurant2.getName().compareTo(restaurant1.getName());
            }
        });

        System.out.println("Restaurant list sorted based on Name (Key)");
        for (Restaurant restaurant : sortedList) {
            System.out.println("Restaurant name = " + restaurant.getName() + ", score = " + restaurant.getScore());
        }

    }

    public void sortByValue(){

        List<Restaurant> sortedList = new ArrayList<>(restaurantList);

        Collections.sort(sortedList, new Comparator<Restaurant>() {
            @Override
            public int compare(Restaurant restaurant1, Restaurant restaurant2) {
                return Integer.compare(restaurant2.getScore(),restaurant1.getScore());
            }
        });

        System.out.println("Restaurant list sorted based on Score (Value)");
        for (Restaurant restaurant : sortedList) {
            System.out.println("Restaurant name = " + restaurant.getName() + ", score = " + restaurant.getScore());
        }

    }

}


