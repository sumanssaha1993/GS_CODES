package com.suman.coderpad;

public class PowerOfTen {

	public static void main(String[] args) {
		int input = 1000;
		
		while(input > 9 && input%10 == 0){
			input /= 10;
		}
		
		String s = input == 1 ? "yes" : "No";
		
		System.out.println(s);
	}
}
