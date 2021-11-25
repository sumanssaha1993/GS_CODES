package com.suman.coderpad;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacterProblem {

	public static void main(String[] args) {
		String str = "geeksforgeeks";
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		for(int i=0; i<str.length(); i++){
			if(map.containsKey(str.charAt(i))){
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
			else{
				map.put(str.charAt(i), 1);
			}
		}
		
		for(Map.Entry<Character, Integer> ele : map.entrySet()){
			if(ele.getValue() == 1){
				System.out.println("First Non Repeating Character: " + ele.getKey());
				break;
			}
		}
	}
}
