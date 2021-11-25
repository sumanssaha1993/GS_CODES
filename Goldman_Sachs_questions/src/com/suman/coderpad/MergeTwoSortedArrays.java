package com.suman.coderpad;

public class MergeTwoSortedArrays {
	
	public static void main(String[] args) {
		int[] arr1 = new int[]{1,3,5,7,9,12,13,14};
		int n1 = arr1.length;
		int[] arr2 = new int[]{2,4,6,8,10,11};
		int n2 = arr2.length;
		
		int[] arr3 = new int[n1+n2];
		
		int i = 0 , j = 0, k = 0;
		
		while(i < n1 && j < n2){
			if(arr1[i] < arr2[j]){
				arr3[k++] = arr1[i++];
			}
			else{
				arr3[k++] = arr2[j++];
			}
		}
		
		while(i < n1){
			arr3[k++] = arr1[i++];
		}
		
		while(j < n2){
			arr3[k++] = arr2[j++];
		}
		
		for(int ele : arr3){
			System.out.println(ele);
		}
	}

}
