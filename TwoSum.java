package com.mac.rag;

import java.util.LinkedHashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String args[]){
        int[] solution  =  twoSum(new int[]{2,7,11,15}, 9);
        for(int i = 0 ; i < solution.length; i ++){
            System.out.println(solution[i]);
        }
    }
        public static int[] twoSum(int[] nums, int target) {
        Map<String, String> myLinkedHashMap = new LinkedHashMap<>();
            int[] indexes = new int[10];
            for(int i =0; i < nums.length ; i ++){
                for(int j = 0; j < nums.length; j++){
                    if(i != j){
                        if(!contains(indexes, i) && !contains(indexes, j)){

                            if((nums[i] + nums[j]) == target){
                                indexes[indexes.length] = i;
                                indexes[indexes.length] = j;
                            }
                        }
                    }
                }
            }
            return indexes;
        }

        public static boolean contains(int[] indexes, int value){
            for(int i =0; i < indexes.length; i ++){
                if(indexes[i] == value){
                    return true;
                }
            }
            return false;
        }

}
