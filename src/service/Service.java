package service;

import entity.OrderItem;
import entity.Product;

import java.util.ArrayList;
import java.util.HashMap;

public class Service {
    public static String findMaxProfit(ArrayList<Product> products, ArrayList<OrderItem> orderItems) {
        HashMap<Product, Integer> totalAmount = new HashMap<>();
        for (OrderItem item : orderItems) {
            for (Product product : products){
                if(item.getProductId() == product.getProductId()){
                    totalAmount.put(product, item.getQuantity() * product.getPrice());
                }
            }
        }
        return null;
    }
}
