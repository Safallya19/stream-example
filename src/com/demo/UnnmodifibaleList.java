package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UnnmodifibaleList {

	public static void main(String[] args) {
		 List<String> list = new ArrayList<>(Arrays.asList("one", "two", "four"));
		 //map
		 Map<String, String> mapTest = new HashMap<String,String>();
		 mapTest.put("1", "safallya");
		 mapTest.put("2", "sambit");
		 mapTest.put("3", "amrit");
		 Map<String, String> mapTest1 = Collections.unmodifiableMap(mapTest);
		 mapTest1.put("3", "sapan");
		 mapTest1.forEach(((k,v)-> System.out.println(k+" "+v)));
		 System.out.println("==================");
		 List<String> un = Collections.unmodifiableList(list);
		 un.add("five");
		 un.forEach(System.out::println);

	}

}
