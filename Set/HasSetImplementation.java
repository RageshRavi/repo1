package com.mac.rag.set;

import com.mac.rag.functional.NumberTest;

import java.util.*;
import java.util.stream.Collectors;

public class HashSetImplementation {
    public static void main(String[] args) {
        Set<Integer> intSet = new HashSet<Integer>();
        intSet.add(5);
        intSet.add(1);
        intSet.add(3);
        intSet.add(0);
        intSet.add(2);
        intSet.add(4);

        intSet.stream().filter(e->e>2).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("=====");
        intSet.stream().filter(new NumberTest()).map(e->e).forEach(System.out::println);
        System.out.println("=====");

        Spliterator<Integer> spliterator = intSet.spliterator();
        System.out.println(spliterator.estimateSize());
        spliterator.tryAdvance(System.out::println);
        spliterator.tryAdvance(System.out::println);
        Spliterator spliterator1 = spliterator.trySplit();
        spliterator1.forEachRemaining(System.out::println);

        Map<String, String> myMap = new Hashtable<>();
        myMap.put("name", "ragesh");
        myMap.put("age","33");

//        myMap.
    }
}
