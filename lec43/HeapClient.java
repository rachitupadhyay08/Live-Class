package lec43;
import java.util.*;

public class HeapClient {
    public static void main(String[] args) {
        Heap hp = new Heap();
        hp.add(5);
        hp.add(7);
        hp.add(9);
        hp.add(4);
        hp.add(2);
        hp.add(3);
        hp.add(1);
        hp.Display();

        PriorityQueue<Integer> pq = new PriorityQueue<>(); // min heap
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder()); // max heap
        pq1.add(5);
        pq1.add(7);
        pq.add(9);
        pq.add(4);
        pq.add(3);
        System.out.println(pq);
        System.out.println(pq1);
    }
}
