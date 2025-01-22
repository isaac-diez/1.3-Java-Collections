package org.level2exer2.Main;

import org.level2exer2.Model.Restaurant;
import org.level2exer2.Model.RestaurantList;
import org.level2exer2.Model.Sorter;

public class Main {
    public static void main(String[] args) {

        Restaurant rest1 = new Restaurant("La Bella Italia", 89);
        Restaurant rest2 = new Restaurant("Sushi Paradise", 92);
        Restaurant rest3 = new Restaurant("Burger Haven", 94);
        Restaurant rest4 = new Restaurant("Steakhouse Deluxe", 88);
        Restaurant rest5 = new Restaurant("Vegan Bliss", 85);

        RestaurantList listOfRestaurants = new RestaurantList();

        listOfRestaurants.addRestaurant(rest1);
        listOfRestaurants.addRestaurant(rest2);
        listOfRestaurants.addRestaurant(rest3);
        listOfRestaurants.addRestaurant(rest4);
        listOfRestaurants.addRestaurant(rest5);



        Restaurant rest6 = new Restaurant("La Bella Italia", 89);
        listOfRestaurants.addRestaurant(rest6);

        System.out.println("Restaurants unsorted:");
        System.out.println(listOfRestaurants);

        Sorter restaurantSorter = new Sorter(listOfRestaurants.getRestaurantListHashSet());

        System.out.println();
        restaurantSorter.sortByKey();
        System.out.println();
        restaurantSorter.sortByValue();
    }
}