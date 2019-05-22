package com.mac.rag;

class RodCutting
{
    /* Returns the best obtainable price for a rod of length
       n and price[] as prices of different pieces */
    static int cutRod(int price[], int n, int[] priceMemotization )
    {
        if (n <= 0)
            return 0;
        int max_val = Integer.MIN_VALUE;

        // Recursively cut the rod in different pieces and
        // compare different configurations
//        for (int i = 0; i<n; i++) {
//            System.out.println("N : " + (n - i - 1));
//            max_val = Math.max(max_val,
//                    price[i] + cutRod(price, n - i - 1));
////            System.out.println("N : " + (n - i - 1));
//        }


        for (int i = 0; i<n; i++) {
            System.out.println("N : " + (n - i - 1));
            if(priceMemotization[i] == 0){
                max_val = Math.max(max_val,
                        price[i] + cutRod(price, n - i - 1, priceMemotization));
                priceMemotization[i] = max_val;
            }else{
                max_val = Math.max(max_val,
                       priceMemotization[i]);
            }

//            System.out.println("N : " + (n - i - 1));
        }

        return max_val;
    }

    /* Driver program to test above functions */
    public static void main(String args[])
    {
        int arr[] = new int[] {1, 5, 8, 9, 10, 17, 17, 20};
        int size = arr.length;
        int[] priceMemotization = new int[4];
        System.out.println("Maximum Obtainable Value is "+
                cutRod(arr, 4, priceMemotization));

    }
}
