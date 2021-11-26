package com.suman.java;

public class EncodeAndDecodeStringBasedOnKey {

	public static String decode(String msg, String key){
		int start = 0;
		StringBuilder res = new StringBuilder();
		for(int i=0; i<key.length(); i++){
			int end = start + (key.charAt(i) - '0');
			if(end >= msg.length()){
				res.append(msg.substring(start).charAt(0));
			}
			else{
				res.append(msg.substring(start, end).charAt(0));
			}
			start = end;
		}
		
		if(start < msg.length()){
			res.append(msg.substring(start));
		}
		
		return res.toString();
	}
	
	public static String encode(String msg, String key){
		int i;
		StringBuilder res = new StringBuilder();
		for(i=0; i<key.length(); i++){
			int count = key.charAt(i) - '0';
			for(int j=0; j<count; j++){
				res.append(msg.charAt(i));
			}
		}
		
		if(i < msg.length()){
			res.append(msg.substring(i));
		}
		
		return res.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(decode("aaabccdddd", "3124"));
		System.out.println(encode("abcd", "3725"));
	}
}
