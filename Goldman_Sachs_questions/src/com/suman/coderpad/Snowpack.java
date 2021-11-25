package com.suman.coderpad;

public class Snowpack {

	public static void main(String[] args) {
		int[] arr = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		
		int left = 0, right = arr.length - 1;
		int left_max = 0, right_max = 0, result = 0;
		
		while(left <= right){
			if(arr[left] < arr[right]){
				if(arr[left] > left_max){
					left_max = arr[left];
				}
				else{
					result += left_max - arr[left];
				}
				left++;
			}
			else{
				if(arr[right] > right_max){
					right_max = arr[right];
				}
				else{
					result += right_max - arr[right];
				}
				right--;
			}
		}
		
		System.out.println(result);
	}
	
	
}
