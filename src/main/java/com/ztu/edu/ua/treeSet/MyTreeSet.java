package com.ztu.edu.ua.treeSet;

import com.ztu.edu.ua.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class MyTreeSet {

    public static void main(String[] args) {
        HashMap<String, Product> hashMap = new HashMap<>();

        Product prod1 = new Product(1200, "smartwatch");
        Product prod2 = new Product(300, "keyboard");
        Product prod3 = new Product(8000, "projector");
        Product prod4 = new Product(450, "headphones");
        Product prod5 = new Product(1800, "webcam");

        hashMap.put("smartwatch", prod1);
        hashMap.put("keyboard", prod2);
        hashMap.put("projector", prod3);
        hashMap.put("headphones", prod4);
        hashMap.put("webcam", prod5);
        System.out.println("HashMap: " + hashMap);

        System.out.println("Using the .get(smartwatch) method: " + hashMap.get("smartwatch"));

        System.out.println("Does it contain a projector? " + hashMap.containsKey("projector"));
        System.out.println("Does it contain a product with price 8000? " + hashMap.containsValue(prod3));

        System.out.println("Size of HashMap: " + hashMap.size());

        hashMap.putIfAbsent("mouse", new Product(500, "mouse"));
        System.out.println("\nHashMap after putIfAbsent (\"mouse\", new Product(500, \"mouse\")):");
        System.out.println(hashMap);

        System.out.println("\nKeys: " + hashMap.keySet());
        System.out.println("Values set (values): " + hashMap.values());

        hashMap.remove("headphones");
        System.out.println("\nHashMap after removing the element with key \"headphones\":");
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
            if (entry.getKey().equals("keyboard")) {
                entry.setValue(new Product(350, "mechanical keyboard"));
                System.out.println("Updated value for \"keyboard\": " + entry.getValue());
            }
        }
    }
}

