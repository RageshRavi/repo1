package com.mac.rag;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class NonRepetiveElementInString {
    public static void main(String args[]){
        String s = "abcdefabcdeflmnl";
        Queue<String> characterQ = new PriorityQueue();
        List<String> characterList = new ArrayList<String>();
        for(int i = 0; i < s.length(); i ++){
            if(!characterList.contains(s.charAt(i))){
////                if(characterQ.){
//
//                }
            }
        }

    }
}
