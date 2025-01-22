package org.level2exer1.Model;

import java.util.HashSet;

public class RestaurantList {

    private HashSet<Restaurant> restaurantList;

    public RestaurantList() {
        this.restaurantList = new HashSet<>();
    }

    public void addRestaurant(Restaurant restaurant) {

        boolean restaurantDuplicate = false;

        for (Restaurant restaurantToCompare : restaurantList) {
            if ((restaurantToCompare.getName().equals(restaurant.getName())) && (restaurantToCompare.getScore() == restaurant.getScore())) {
                restaurantDuplicate = true;
            }
        }

        if (restaurantDuplicate) {
            System.out.println("Restaurant " + restaurant.getName() + " with score " + restaurant.getScore() + " already on the HashSet. Duplicates not allowed!");
        } else {
            restaurantList.add(restaurant);
        }

    }

    @Override
    public String toString() {
        return "RestaurantList{" +
                "restaurantList=" + restaurantList +
                '}';
    }
}
