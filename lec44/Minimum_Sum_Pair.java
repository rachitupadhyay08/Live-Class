package lec44;
import java.util.*;

public class Minimum_Sum_Pair {
    public static void main(String[] args) {
        int[] arr={2,3,4,3,2};
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int i=0; i<arr.length; i++){
            pq.add(arr[i]);
        }
        int sum=0;
        while(pq.size()>1){
            int a=pq.poll();
            int b=pq.poll();
            sum += (a+b);
            pq.add(a+b);
        }
        System.out.println(sum);
    }
}
