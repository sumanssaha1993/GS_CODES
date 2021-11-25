package com.suman.coderpad;

import java.util.Arrays;

public class MedianSortedArray {

	public static void main(String[] args) {
        int[]num = {60, 70, 82, 1216, 57, 82, 34, 560, 91, 86};
        int median;
        int len = num.length;
        
        Arrays.sort(num); // sorts the array
        
        //check if the length is odd
        if(len%2 != 0)
            median = num[len/2];
        else // length is even
            median = (num[(len - 1) / 2] + num[len / 2])/2;
        System.out.println(median);
    }
}
