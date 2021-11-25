package com.suman.coderpad;

public class SecondSmallestSnippet {

	public static void main(String[] args) {
		int[] arr = new int[]{2,5,3,8,4,11,6};
		
		int first = Integer.MAX_VALUE;
		int second = first;
		
		for(int i=0; i<arr.length; i++){
			if(arr[i] < first){
				second = first;
				first = arr[i];
			}
			else if(arr[i] < second && arr[i] != first){
				second = arr[i];
			}
		}
		
		System.out.println(second);
	}
}
