package com.pkonopacki1.collections;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        List initialData = List.of(10,20,50,40,30);

        ArrayDeque queue = new ArrayDeque<>(initialData);

        System.out.println("Queue with initial data: " + queue);
        queue.peek();
        System.out.println("Queue after peek: " + queue);
        queue.poll();
        System.out.println("Queue after peek: " + queue);
        
        queue.addFirst(100);
        System.out.println("Queue after addFirst: " + queue);
        queue.addLast(200);
        System.out.println("Queue after addLast: " + queue);
        queue.pollFirst();
        System.out.println("Queue after pollFirst: " + queue);
        queue.pollLast();
        System.out.println("Queue after pollLast: " + queue);

        
    }
    
}
