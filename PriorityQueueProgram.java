package com.mac.rag;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueProgram {
    public static void main(String args[]){
        Queue<String> pq = new PriorityQueue<>();
        pq.offer("kRaa");
        pq.offer("oaav");
        pq.offer("fkag");
        pq.offer("aRaf");
        pq.offer("pRaq");
        pq.offer("cRaz");
        pq.offer("hRal");
        pq.offer("bRap");

        while(!pq.isEmpty()){
            System.out.println("PQ :" + pq.poll());
        }

        System.out.println("==========================");

        Queue<String> pq1 = new PriorityQueue<>(new CustomComparator());
        pq1.offer("kRaa");
        pq1.offer("oaav");
        pq1.offer("fkag");
        pq1.offer("aRaf");
        pq1.offer("pRaq");
        pq1.offer("cRaz");
        pq1.offer("hRal");
        pq1.offer("bRap");

        while(!pq1.isEmpty()){
            System.out.println("PQ :" + pq1.poll());
        }

    }
}

class CustomComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
       if (o2.charAt(3) < o1.charAt(3))
           return 1;
       else if (o2.charAt(3) > o1.charAt(3))
        return -1;

        return 0;
    }
}
