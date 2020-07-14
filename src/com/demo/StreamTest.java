package com.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		 // sum of all even number
		List<Integer> list1 =Arrays.asList(2,2,4,4,3,5,6,8);
		System.out.println("distinct values ");
		list1.stream().distinct().forEach(System.out::println);
		System.out.println("even number sum");
		Integer sum1 = list1.stream().filter(i-> i%2==0).reduce(0, (j,k)-> j+k);
		System.out.println("sum of number:"+sum1);
		System.out.println("================");
		Integer sum2 = list1.stream().filter(i-> i%2==0).reduce(0, Integer::sum);
		System.out.println("sum2:"+sum2);
		System.out.println("================");
		// string concatation 
		List<String> list2 = Arrays.asList("a","b","c","d");
		String st = list2.stream().reduce("",String::concat).toUpperCase();
		 
        System.out.println("String after concat:"+ st);
        System.out.println("================");
        String st1 =list2.stream().reduce("", (i,j)-> i+j).toUpperCase();
        System.out.println(" string after concat 2 :"+ st1);
        System.out.println("================");
        
        System.out.println("=======USERS======");
        
        List<Users> users = Arrays.asList(new Users("John", 30), new Users("Julie", 35),new Users("amitt", 45),new Users("Jae", 35), new Users("Akshay", 35));
     
       System.out.println("======== age of all users ========");
       List<Integer> listAge = users.stream().map(Users::getAge).filter(age-> age < 45).collect(Collectors.toList());
       System.out.println("====age less than 50====");
       listAge.forEach(System.out::println);
        
       List<Users> name = users.stream().filter(na->na.name.toUpperCase().startsWith("A")).collect(Collectors.toList());
       System.out.println("======name part=========");
       name.forEach(n-> System.out.println(n.name));
       
      
       Integer max =users.stream().max(Comparator.comparingInt(Users::getAge)).get().age;		   
       System.out.println("Max using compartor for age:"+max);
       String max1 =users.stream().max(Comparator.comparing(Users::getName)).get().name;
       System.out.println("Max using compartor for name:"+max1);
       users.sort(Comparator.comparing(Users::getAge).thenComparing(Users::getAge));
       System.out.println("=====sorting based on age===");
        for(int i=0;i<users.size();i++) {
        	System.out.println(users.get(i).getName()+" "+users.get(i).getAge());
        }
       List<Integer> listTest4= Arrays.asList(3,5,67,8,89,45,23);
       System.out.println("====reverese order===");
       List<Integer> reverseSortedLetters = listTest4.stream()
    		      .sorted(Comparator.reverseOrder())
    		      .collect(Collectors.toList());
       reverseSortedLetters.forEach(System.out::println);
       
       System.out.println("==========Max from list=========");
       List<Integer> intList = Arrays.asList(3,5,67,8,89,45,23);
       
       System.out.println("=== sorting the list ===");
       Collections.sort(listTest4,(s1,s2)-> s1.compareTo(s2));
       listTest4.forEach(System.out::println);
       
        
       
		Integer maxIn =  intList.stream().reduce(0,Integer::max); 
       System.out.println("Max using reduce:"+maxIn); 
       System.out.println("========distinct age=====");
       users.stream().map( i-> i.getAge()).distinct().forEach(System.out::println);
       
       System.out.println("==============");
       System.out.println("Even number in ramge from 1 to 6");
       IntStream.range(1, 7).filter(i-> i%2 ==0).forEach(System.out::println);
       
       System.out.println("==============");
       //map functionality
        System.out.println("===stream funnctionality on map()===");
         List<String> listStr1 = Arrays.asList("1","2","3","3","1");
         System.out.println("====distinct values in list=====");
        listStr1.stream().distinct().forEach(System.out::println);;
        
        System.out.println("========value of function===");
         List<Integer> listInt = listStr1.stream().map(Integer::valueOf).collect(Collectors.toList());
         listInt.forEach(System.out::println);
         
         System.out.println("=========sorting integer============");
         List<Integer> listIn = Arrays.asList(4,2,7,5,19,16,18,11,2);
         listIn.sort(Comparator.naturalOrder());
         listIn.forEach(System.out::println);
         int pos=Collections.binarySearch(listIn,4);
         System.out.println("position:"+pos);
         System.out.println("============map============");
         Map<String,Integer> map = new TreeMap<String,Integer>();
         map.put("Amit", 12);
         map.put("Safal", 15);
         map.put("Aman", 12);
         map.put("Mayur", 32);
         map.put("Joe", 82);  
         System.out.println("====map entry=========");
         for(Map.Entry<String, Integer> entry: map.entrySet()) {
        	 System.out.println("name:"+ entry.getKey()+" "+ "id:"+ entry.getValue());
         }
         System.out.println("==== key set========");
         for(String str: map.keySet()) {
        	 System.out.println("name:"+ str);
         }
         for(Integer i : map.values()) {
        	 System.out.println("id:"+i);
         }
         System.out.println("====foreach =========");
         map.forEach((k,v)-> System.out.println("name :"+k+" "+" values:"+v));
         
         System.out.println("=====using iterator========");
       Iterator<String> it = map.keySet().iterator();
       while(it.hasNext()) {
    	   String st12 = it.next();
    	   System.out.println("name:"+ st12+" "+ "values:"+map.get(st12));
       }
        
        
	}

}

