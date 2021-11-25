package com.suman.coderpad;

public class LengthEncoding {
	public static void printRLE(String str) {
		int n = str.length();
		int count = 1;
		int i;
		StringBuilder sb = new StringBuilder();
		for (i = 1; i < n; i++) {

			if (str.charAt(i) == str.charAt(i - 1)) {
				count++;
			} 
			else {
				sb.append(str.charAt(i - 1));
				sb.append(count);
				count = 1;
			}
		}
		sb.append(str.charAt(i - 1));
		sb.append(count);
		
		System.out.println(sb.toString());
	}

	public static void main(String[] args) {
		String str = "awwwwaaadexxxxxxywwwk";
		printRLE(str);
	}
}
