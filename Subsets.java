package com.mac.rag;

public class Subsets {
    public static void main(String args[]){
        int arr[] = {1,2,3,4};
        System.out.println(subset(arr,0,""));
    }
    static String subset(int[] arr, int  i, String s){
        if(i < arr.length) {

            s.concat(String.valueOf(arr[i]));
            s.concat(subset(arr, i + 1, s));
        }else{
            System.out.println(s);
        }
        return s;
    }
}
