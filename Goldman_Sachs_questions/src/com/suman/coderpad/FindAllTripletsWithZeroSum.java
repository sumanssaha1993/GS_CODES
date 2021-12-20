package com.suman.coderpad;

import java.util.Arrays;

public class FindAllTripletsWithZeroSum {

	public static void main(String[] args) {
		int[] arr = new int[]{7,3,-6,-2,-5,2,4,-3};
		getAllTripletsWithZeroSum(arr);
	}

	private static void getAllTripletsWithZeroSum(int[] arr) {
		int n = arr.length;
		Arrays.sort(arr);
		
		for(int i=0 ; i<n-1; i++){
			int l = i+1;
			int r = n-1;
			int x = arr[i];
			while(l < r){
				int sum = arr[l] + arr[r] + x;
				if(sum == 0){
					System.out.println("Triplets found: " + x + "," + arr[l] + "," + arr[r]);
					l++;
					r--;
				}
				else if(sum < 0){
					l++;
				}
				else{
					r--;
				}
			}
		}
	}
}
