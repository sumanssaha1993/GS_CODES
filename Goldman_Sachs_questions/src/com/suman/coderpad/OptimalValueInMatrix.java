package com.suman.coderpad;

import java.util.HashSet;
import java.util.Set;

public class OptimalValueInMatrix {

	public static void main(String[] args) {
		int[][] arr = new int[][]{{1, 3, 4}, {5, 2, 9}, {8, 7, 6}};
		
		int n = arr.length;
		int m = arr[0].length;
		
		int[] maxRow = new int[n];
		int[] minRow = new int[n];
		int[] maxCol = new int[m];
		int[] minCol = new int[m];
		int elementCount = 0;
		Set<Integer> uniqueElements = new HashSet<>();
		
		for(int i=0; i<n; i++){
			int rowMaxx = Integer.MIN_VALUE;
			int rowMinn = Integer.MAX_VALUE;
			for(int j=0; j<m; j++){
				elementCount++;
				uniqueElements.add(arr[i][j]);
				if(arr[i][j] > rowMaxx){
					rowMaxx = arr[i][j];
				}
				if(arr[i][j] < rowMinn){
					rowMinn = arr[i][j];
				}
			}
			maxRow[i] = rowMaxx;
			minRow[i] = rowMinn;
		}
		
		for(int j=0; j<m; j++){
			int colMaxx = Integer.MIN_VALUE;
			int colMinn = Integer.MAX_VALUE;
			for(int i=0; i<n; i++){
				if(arr[i][j] > colMaxx){
					colMaxx = arr[i][j];
				}
				if(arr[i][j] < colMinn){
					colMinn = arr[i][j];
				}
			}
			maxCol[j] = colMaxx;
			minCol[j] = colMinn;
		}
		
		int count = 0;
		if(elementCount != uniqueElements.size()){
			count = -1;
		}
		else{
			for(int i=0; i<n; i++){
				for(int j=0; j<m; j++){
					if(arr[i][j] == maxRow[i] || arr[i][j] == minRow[i] || arr[i][j] == maxCol[j] || arr[i][j] == minCol[j]){
						count++;
					}
				}
			}
		}
		
		System.out.println(count);
	}
}
