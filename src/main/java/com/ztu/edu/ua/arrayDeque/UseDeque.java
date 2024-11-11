package com.ztu.edu.ua.arrayDeque;

import com.ztu.edu.ua.Product;

import java.util.ArrayDeque;
import java.util.Deque;

public class UseDeque {
        public static void main(String[] args) {
            Deque<Product> stack = new ArrayDeque<>();
            stack.push(new Product(10, "Smartphone"));
            stack.push(new Product(20, "Laptop"));
            stack.push(new Product(30, "TV"));
            stack.push(new Product(40, "iPhone"));
            System.out.println(stack);
            System.out.println(stack.peek());
            stack.offerLast(new Product(50, "Tablet"));
            stack.offerFirst(new Product(60, "Headphones"));
            System.out.println(stack.peekLast());
            System.out.println(stack);

            stack.pop();
            System.out.println(stack);

            stack.pollLast();
            System.out.println(stack);

            stack.poll();
            System.out.println(stack);

            System.out.println(" ---------- Stack ^  Queue ---------------");
            Deque<Product> queue = new ArrayDeque<>();
            queue.offer(new Product(100, "Camera"));
            queue.offer(new Product(200, "Printer"));
            queue.offer(new Product(300, "Smartwatch"));
            queue.offer(new Product(400, "Speaker"));
            System.out.println(queue);
            System.out.println(queue.peek()); // виведе перший елемент
            queue.offerLast(new Product(500, "Monitor"));
            queue.offerFirst(new Product(600, "Keyboard"));
            System.out.println(queue);
            System.out.println(queue.getFirst());

            queue.removeLast();
            System.out.println(queue);

            queue.pop();
            System.out.println(queue);

            queue.pollLast();
            System.out.println(queue);

            queue.poll();
            System.out.println(queue);
        }
    }
