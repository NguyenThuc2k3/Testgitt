package _queue;

import java.util.*;

public class MyQueue {
    public static void main(String[] args) {
        Queue<String> myQueue = new LinkedList<>();
        myQueue.add("a");
        myQueue.offer("b");
        System.out.println(myQueue.peek());
        System.out.println(myQueue.element());
//        System.out.println(myQueue.poll());
//        System.out.println(myQueue.remove());
//        System.out.println(myQueue.isEmpty());
        System.out.println(myQueue.contains("b"));
        System.out.println(myQueue.size());
        for(String element : myQueue){
            System.out.println(element + "\t");
        }

    }
}
