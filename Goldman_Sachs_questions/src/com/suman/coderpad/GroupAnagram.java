package com.suman.coderpad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
	public static void main(String[] args) {
		List<String> input = Arrays.asList(new String[]{"eat","tea","tan","ate","nat","bat"});
		
		Map<String, List<String>> collector = new HashMap<String, List<String>>();
		
		for(String s : input){
			String original = s;
			char[] partArr = s.toCharArray();
			Arrays.sort(partArr);
			String modified = new String(partArr);
			
			if(collector.containsKey(modified)){
				collector.get(modified).add(original);
			}
			else{
				List<String> temp = new ArrayList<String>();
				temp.add(original);
				collector.put(modified, temp);
			}
		}
		
		for(List<String> list : collector.values()){
			System.out.println(list.toString());
		}
	}
}
