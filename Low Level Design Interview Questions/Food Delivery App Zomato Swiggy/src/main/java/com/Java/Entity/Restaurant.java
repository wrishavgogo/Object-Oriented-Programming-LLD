package com.Java.Entity;

import java.util.Map;

public class Restaurant {

    String id;
    Location location;
    Map<FoodItem , Double> foodItemToPriceMap;
    Map<FoodItem,Integer > foodItemToQuantityMap;


}
