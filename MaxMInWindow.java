package com.mac.rag;

public class MaxMInWindow {
    public static void main(String arg[]){
        int arr[] = {40,21,500,40,20};
//        int[] a = int [10];
        System.out.println("Min is : "+find_Max(arr, 0, 3, 0));
    }
    static int findMin(int[] arr, int left, int right, int min){
        if(left == right) {
            return Math.min(min,arr[left]);

        }else {
            min = Math.min(arr[left],findMin(arr, left + 1, right, min));

        }
        return min;
    }

    static int find_Max(int [] arr, int left, int window, int max){
        max = Math.max(max, findMin(arr, left, left+window, 1000));
        //max = Math.max(max, findMin(arr, left+1,left));
        return max;
    }
}

