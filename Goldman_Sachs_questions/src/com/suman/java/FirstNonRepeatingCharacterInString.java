package com.suman.java;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacterInString {

	public char getFirstNonRepeatingCharInStr(String str){
		Map<Character, Integer> hm = new HashMap<Character, Integer>();
		char c = 0;
		for(int i=0; i<str.length(); i++){
			if(hm.containsKey(str.charAt(i))){
				hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
			}else{
				hm.put(str.charAt(i), 1);
			}
		}
		
		for(int i=0; i<str.length()-1; i++){
			if(hm.get(str.charAt(i)) == 1){
				c = str.charAt(i);
				break;
			}
		}
		return c;
	}
	
	public static void main(String[] args) {
		FirstNonRepeatingCharacterInString test = new FirstNonRepeatingCharacterInString();
		System.out.println(test.getFirstNonRepeatingCharInStr("geeksforgeeks"));
	}
}
