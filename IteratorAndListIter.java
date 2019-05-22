package com.mac.rag;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorAndListIter {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Mango");
        list.add("Banana");
        list.add("Grapes");
        list.add("Berry");
        list.add("Pineapple");
        list.add("Apple");

        Iterator iter = list.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        ListIterator listIter = list.listIterator();
        while(listIter.hasNext()){
            System.out.println(listIter.previousIndex());
            System.out.println(listIter.next());
            System.out.println(listIter.nextIndex());
        }

        while(listIter.hasPrevious()){
            System.out.println(listIter.previous());
        }

        System.out.println("====");
        while(listIter.hasPrevious()){
            System.out.println(listIter.previous());
        }

//        listIter.next();
        listIter.set("Pomegranates");

        while(listIter.hasNext()){
            System.out.println(listIter.next());
        }
    }
}
