package com.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountTheChar {

	public static void main(String[] args) {
		String st ="Safallya Dhar";
		Map<Character, Integer> hashMap = new HashMap<Character, Integer>();
		
		char[] ch = st.toCharArray();
		for(char c: ch) {
			if(hashMap.containsKey(c)) {
				hashMap.put(c, hashMap.get(c)+1);
			}else {
				hashMap.put(c, 1);
			}
		}
		for(Map.Entry<Character, Integer> en: hashMap.entrySet()) {
			if(en.getValue()>1) {
				System.out.println("duplicate char:"+en.getKey()+" "+ "get count:"+en.getValue());
			}
		}
	    Set<Character> list =  hashMap.keySet();
	    for(Character i : list) {
	    	if(hashMap.get(i)>1) {
	    		System.out.println("dup char:"+ i+" :"+hashMap.get(i));
	    	}
	    }
	    System.out.println("==============");
		hashMap.forEach((k,v)-> System.out.println("char:"+k +" "+"count:"+v));

	}

}
