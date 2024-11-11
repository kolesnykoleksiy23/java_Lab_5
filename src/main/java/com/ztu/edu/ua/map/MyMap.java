package com.ztu.edu.ua.map;

import com.ztu.edu.ua.Product;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
    public static void main(String[] args) {
        HashMap<String, Product> hashMap = new HashMap<>();

        Product p1 = new Product(1000, "phone");
        Product p2 = new Product(100, "laptop");
        Product p3 = new Product(10000, "tv");
        Product p4 = new Product(500, "tablet");
        Product p5 = new Product(2000, "monitor");

        hashMap.put("phone", p1);
        hashMap.put("laptop", p2);
        hashMap.put("tv", p3);
        hashMap.put("tablet", p4);
        hashMap.put("monitor", p5);
        System.out.println("HashMap: " + hashMap);

        System.out.println("Using the .get(phone) method: " + hashMap.get("phone"));

        System.out.println("Does it contain a tv? " + hashMap.containsKey("tv"));
        System.out.println("Does it contain a product with price 10000? " + hashMap.containsValue(p3));

        System.out.println("Size of HashMap: " + hashMap.size());

        hashMap.putIfAbsent("headphones", new Product(1200, "headphones"));
        System.out.println("\nHashMap after putIfAbsent (\"headphones\", new Product(1200, \"headphones\")):");
        System.out.println(hashMap);

        System.out.println("\nKeys: " + hashMap.keySet());
        System.out.println("Values set (values): " + hashMap.values());

        hashMap.remove("tablet");
        System.out.println("\nHashMap after removing the element with key \"tablet\":");
        System.out.println(hashMap);

        HashMap<String, Product> additionalMap = new HashMap<>();
        additionalMap.put("printer", new Product(300, "printer"));
        additionalMap.put("scanner", new Product(150, "scanner"));
        hashMap.putAll(additionalMap);
        System.out.println("\nHashMap after putAll(additionalMap):");
        System.out.println(hashMap);

        additionalMap.clear();
        System.out.println("\nHashMap after clear:");
        System.out.println(additionalMap);

        System.out.println("\nWorking with entrySet:");
        for (Map.Entry<String, Product> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            if (entry.getKey().equals("laptop")) {
                entry.setValue(new Product(800, "gaming laptop"));
                System.out.println("Updated value for \"laptop\": " + entry.getValue());
            }
        }
    }
}
