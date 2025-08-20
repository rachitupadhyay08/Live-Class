package lec43;
import java.util.*;

public class Heap {
    private ArrayList<Integer> ll=new ArrayList<>();

    public void add(int item){
        ll.add(item);
        upheapify(ll.size()-1);
    }

    private void upheapify(int ci){
        int pi = (ci-1)/2;
        if(ll.get(pi)>ll.get(ci)){
            swap(pi,ci);
            upheapify(pi);
        }
    }

    private void swap(int pi,int ci){
        int pith=ll.get(pi);
        int cith=ll.get(ci);
        ll.set(pi,cith);
        ll.set(ci,pith);
    }

    public int remove(){
        swap(0,ll.size()-1);
        int val=ll.remove(ll.size()-1);
        downheapify(0);
        return val;
    }

    private void downheapify(int pi){
        int lci=2*pi+1;
        int rci=2*pi+2;
        int mini=pi;
        if(lci<ll.size() && ll.get(mini)>ll.get(lci)){
            mini=lci;
        }
        if(rci<ll.size() && ll.get(mini)>ll.get(rci)){
            mini=rci;
        }
        if(mini!=pi){
            swap(mini,pi);
            downheapify(mini);
        }
    }
    public int get(){
        return ll.get(0);
    }

    public int size(){
        return ll.size();
    }

    public void Display(){
        System.out.println(ll);
    }
}


// --> priority queue
// jiski priority sbse high hoga woh sbse pehle bhar niklega

// marks jiske jitne jyada utni priority jyada
// jitni rank kam utni priority jyada

// Heap
// It is a complete Binary Tree.
// if l-1 level is completely filled and the last one is complete in sequence from left to right.. means no node is skipped,
// then also it is a complete binary tree. 

// Min Heap -- if choti value has larger priority then min heap.
// Max Heap -- if larger value has larger priority then max heap.
// Priority of Parent >> Priority of Child 

// Upheapify--> if on adding data to the next node does not result in heap, we need to insert the element at its desired location.
