package com.suman.coderpad;

public class MaximumProductSubArray {

	public static void main(String[] args) {
		int[] arr = new int[]{-2,3,5,-5,2,-7};
		int max = getMaximumProductSubArray(arr);
		System.out.println(max);
	}

	private static int getMaximumProductSubArray(int[] arr) {
		int n = arr.length;
		int maxEndHere = 1, minEndHere = 1;
		int MaxSoFar = 0;
		
		for(int i=0; i<n; i++){
			if (arr[i] > 0) {
				maxEndHere = maxEndHere * arr[i];
				minEndHere = Math.min(minEndHere * arr[i], 1);
			}
			else if (arr[i] == 0) {
				maxEndHere = 1;
				minEndHere = 1;
			}
			else {
				int temp = maxEndHere;
				maxEndHere = Math.max(minEndHere * arr[i], 1);
				minEndHere = temp * arr[i];
			}

			MaxSoFar = Math.max(maxEndHere, MaxSoFar);
		}
		return MaxSoFar;
	}
}
