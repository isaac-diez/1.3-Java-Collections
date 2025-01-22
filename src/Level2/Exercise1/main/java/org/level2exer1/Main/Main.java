package org.level2exer1.Main;

import org.level2exer1.Model.Restaurant;
import org.level2exer1.Model.RestaurantList;

public class Main {
    public static void main(String[] args) {

        Restaurant rest1 = new Restaurant("La Bella Italia", 85);
        Restaurant rest2 = new Restaurant("Sushi Paradise", 92);
        Restaurant rest3 = new Restaurant("Burger Haven", 78);
        Restaurant rest4 = new Restaurant("Steakhouse Deluxe", 88);
        Restaurant rest5 = new Restaurant("Vegan Bliss", 95);

        RestaurantList listOfRestaurants = new RestaurantList();

        listOfRestaurants.addRestaurant(rest1);
        listOfRestaurants.addRestaurant(rest2);
        listOfRestaurants.addRestaurant(rest3);
        listOfRestaurants.addRestaurant(rest4);
        listOfRestaurants.addRestaurant(rest5);



        Restaurant rest6 = new Restaurant("La Bella Italia", 85);
        listOfRestaurants.addRestaurant(rest6);

        System.out.println(listOfRestaurants);
    }
}