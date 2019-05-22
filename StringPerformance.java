package com.mac.rag;

import java.util.ArrayList;
import java.util.List;

public class StringPerformance {
    public static void main(String args[]){
        String s1 = "ragesh";
        String s3 = "ragesh";
        String s2 = new String("ragesh");
        String s4 = new String("ragesh");
        //s4.intern();
        System.out.println("s1 == s2 "+ (s1==s2));
        System.out.println("s1 == s3 "+ (s1==s3));
        System.out.println("s1 == s4 "+ (s1==s4));
        System.out.println("s2 == s4 "+ (s2==s4));
        System.out.println("s1.equals(s2)) " + s1.equals(s2));
        System.out.println("s1.equals(s3)) " + s1.equals(s3));
        List<Character> subString = new ArrayList<>();
        subString.add(s1.charAt(0));
    }
}
