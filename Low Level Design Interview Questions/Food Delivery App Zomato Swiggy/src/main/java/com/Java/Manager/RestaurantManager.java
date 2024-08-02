package com.Java.Manager;

import Entity.Restaurant;

import java.util.List;
import java.util.Map;

public class RestaurantManager {

    private Map<String , Restaurant> idToRestaurantMap;


    public Restaurant getRestaurant(String restaurantId) {

        return idToRestaurantMap.get(restaurantId);
    }

    public void addRestaurant(Restaurant restaurant) {

    }
}
