package com.mac.rag;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class HasMapIteration{
    public static void main(String args[]){
        Map<Integer, String> myhashMap = new HashMap<Integer, String>();
        myhashMap.put(1, "Ragesh");
        myhashMap.put(2, "Geetha");
        myhashMap.put(3, "Ravi");
        myhashMap.put(4, "Tobey");
        myhashMap.put(5, "Lekshmi");

        long startTime = System.nanoTime();
        for(Integer key : myhashMap.keySet()){
            System.out.println("KEY : "+key+"VALUE : "+myhashMap.get(key));
        }
        long endTime = System.nanoTime();
        System.out.println("Executed in : "+ (endTime-startTime));

        startTime = System.nanoTime();
        for(Map.Entry mapEntry : myhashMap.entrySet()){
            System.out.println("KEY : "+mapEntry.getKey()+"VALUE : "+mapEntry.getValue());
        }
        endTime = System.nanoTime();
        System.out.println("Executed in : "+ (endTime-startTime));
    }
}
