package com.ztu.edu.ua.arrayList;

import com.ztu.edu.ua.Product;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product(10,"Smartphone");
        Product p2 = new Product(20,"laptop");
        Product p3 = new Product(30,"tv");
        Product p4 = new Product(40,"iphone");
        Product p5 = new Product(50,"laptop");

        ArrayList<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);

        System.out.println("Створений масив: ");
        products.stream()
                .forEach(System.out::println);

        LinkedList<Product> list = new LinkedList();
        list.add(p1);
        list.add(p2);

        products.addAll(list);
        System.out.println("\n addAll: \n");
        products.forEach(System.out::println);


        System.out.println("\nGet method: " + products.get(2));
        System.out.println(products.indexOf(p2));

        Product p7 = p3;
        products.add(p7);
        System.out.println(products.lastIndexOf(p3));

        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            System.out.println(product);
        }


        products.remove(0);

        System.out.println("\nList itrator: ");
        ListIterator<Product> listIterator = products.listIterator(products.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        products.set(1, new Product(60, "Tablet"));
        System.out.println("\nПісля set: ");
        products.forEach(System.out::println);

        // Використання sort
        System.out.println("\nПісля сортування за іменем: ");
        products.sort(Comparator.comparing(Product::getProductName));
        products.forEach(System.out::println);

        // Використання subList
        System.out.println("\nsubList (1-3): ");
        ArrayList<Product> subList = new ArrayList<>(products.subList(1, 4));
        subList.forEach(System.out::println);

        // Використання clear
        products.clear();
        System.out.println("\nПісля clear, масив порожній: " + products.isEmpty());

        // Використання contains
        products.add(p1);
        products.add(p2);
        System.out.println("\nМасив містить p1? " + products.contains(p1));

        // isEmpty
        System.out.println("Масив порожній? " + products.isEmpty());

        // Використання retainAll
        LinkedList<Product> retainList = new LinkedList<>();
        retainList.add(p1);
        retainList.add(p2);
        products.retainAll(retainList);
        System.out.println("\nПісля retainAll:");
        products.forEach(System.out::println);

        // Використання size
        System.out.println("\nРозмір масиву: " + products.size());

        // Використання toArray
        System.out.println("\nПеретворення на масив:");
        Product[] productArray = products.toArray(new Product[0]);
        for (Product product : productArray) {
            System.out.println(product);
        }



    }
}
