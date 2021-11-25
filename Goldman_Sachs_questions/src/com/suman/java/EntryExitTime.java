package com.suman.java;

import java.util.Arrays;

public class EntryExitTime {

	public static void main(String[] args) {
		int[] entry = {1, 2, 10, 5, 5};
		int[] exit = {4, 5, 12, 9, 12};
		findMaxGuests(entry, exit, entry.length);
	}

	private static void findMaxGuests(int[] entry, int[] exit, int length) {
		Arrays.sort(entry);
		Arrays.sort(exit);
		int max_person = 1; int count = 1; int time = entry[0];
		int i = 1; int j = 0;
		while(i < length && j < length){
			if(entry[i] <= exit[j]){
				count++;
				
				if(count > max_person ){
					max_person = count;
					time = entry[i];
				}
				i++;
			}else{
				count--;
				j++;
			}
			
		}
		
		System.out.println("Maximum Number of Guests = "+ max_person + " at time " + time); 
	}
}
