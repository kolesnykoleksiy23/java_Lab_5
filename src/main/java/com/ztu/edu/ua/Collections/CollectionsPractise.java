package com.ztu.edu.ua.Collections;

import com.ztu.edu.ua.Product;

import java.util.*;

public class CollectionsPractise {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>(Arrays.asList(
                new Product(1200, "Smartwatch"),
                new Product(300, "Keyboard"),
                new Product(8000, "Projector"),
                new Product(450, "Headphones"),
                new Product(1800, "Webcam")
        ));

        System.out.println("Initial list:\n" + productList);

        Collections.sort(productList);
        System.out.println("\nSorted list by price: \n" + productList);

        int index = Collections.binarySearch(productList, new Product(1500, "Laptop"));
        System.out.println("\nIndex of element with price 1500 (Laptop): " + index);

        Collections.reverse(productList);
        System.out.println("\nReversed list:\n" + productList);

        Collections.shuffle(productList);
        System.out.println("\nShuffled list:\n" + productList);

        Product maxPriceProduct = Collections.max(productList);
        Product minPriceProduct = Collections.min(productList);
        System.out.println("\nProduct with the highest price: " + maxPriceProduct);
        System.out.println("Product with the lowest price: " + minPriceProduct);

        List<Product> copiedList = new ArrayList<>(productList.size());
        for (int i = 0; i < productList.size(); i++) {
            copiedList.add(new Product(0, "Temp"));
        }
        Collections.copy(copiedList, productList);
        System.out.println("\nCopied list:\n" + copiedList);

        Collections.rotate(productList, 2);
        System.out.println("\nList after rotating by 2 positions:\n" + productList);

        Collection<Product> checkedCollection = Collections.checkedCollection(productList, Product.class);
        System.out.println("\nChecked collection:\n" + checkedCollection);

        Collections.fill(productList, new Product(0, "Empty Product"));
        System.out.println("\nList after filling with empty products:\n" + productList);

        int frequency = Collections.frequency(productList, new Product(0, "Empty Product"));
        System.out.println("Frequency of the empty product in the list: " + frequency);
    }

}
