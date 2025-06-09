package leetcodechallenges;

// Java program to demonstrate the
// working of PriorityQueue
import java.util.*;

class Geeks {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer("apple");
        pq.offer("banana");
        pq.offer("cherry");

        while (!pq.isEmpty()) {
            System.out.println(pq.poll()); // Output: cherry, banana, apple
        }
    }
}