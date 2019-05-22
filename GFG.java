package com.mac.rag;

import java.util.Scanner;

public class GFG {
    public static void main(String[] args) {
        //code
        Scanner sc = new Scanner(System.in);
        int t = 0;
        for (int i = 0; i < t; i++) {
            int seg = 5;
            int[] arr = new int[3];
            int x = 1;
            int y = 1;
            int z = sc.nextInt();
            int[] dp = new int[seg + 1];
            int one, two, three;

            for (int j = 1; j < seg + 1; j++) {
                one = 0;
                two = 0;
                three = 0;
                if ((j - x > 0 && dp[j - x] > 0) || j - x == 0)
                    one = 1 + dp[j - x];
                if ((j - y > 0 && dp[j - y] > 0) || j - y == 0)
                    two = 1 + dp[j - y];
                if ((j - z > 0 && dp[j - z] > 0) || j - z == 0)
                    three = 1 + dp[j - z];
                dp[j] = Math.max(Math.max(one, two), three);
            }
            //  for(int j=0;j<seg+1;j++)
            //      System.out.print(dp[j]+" ");
            // System.out.println();
            System.out.println(dp[seg]);
        }
    }
}
