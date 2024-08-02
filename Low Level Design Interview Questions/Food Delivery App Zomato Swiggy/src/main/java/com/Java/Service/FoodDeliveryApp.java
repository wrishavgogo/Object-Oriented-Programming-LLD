package com.Java.Service;


import Entity.FoodItem;
import Entity.Restaurant;
import Manager.DeliveryPartnerManager;
import Manager.OrderManager;
import Manager.RestaurantManager;

import java.util.HashMap;
import java.util.Map;

public class FoodDeliveryApp {

    private RestaurantManager restaurantManager;
    private DeliveryPartnerManager deliveryPartnerManager;
    private OrderManager orderManager;

    /**
     * This Api returns the restaurant with the search food item
     * with the price and all details w.r.t the restaurant
     * */
    public Map<Restaurant , FoodItem> viewItem(String foodItem ) {

        Map<Restaurant , FoodItem> mp = new HashMap<>();

       return mp;
    }

}
