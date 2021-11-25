package com.suman.coderpad;

public class ATOI {
	public static void main(String[] args) {
		String str = "-123568";
		
		boolean isNegative = str.charAt(0) == '-' ? true : false;
		
		int res = 0;
		int i = isNegative ? 1 : 0;
		for(; i<str.length(); i++){
			res = res * 10 + str.charAt(i) - '0';
		}
		
		res = isNegative ? res*-1 : res;
		System.out.println(res);
	}
}
