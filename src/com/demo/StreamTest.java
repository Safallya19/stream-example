package com.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		 // sum of all even number
		List<Integer> list1 =Arrays.asList(2,4,3,5,6,8);
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
        
        List<Users> users = Arrays.asList(new Users("John", 30), new Users("Julie", 35),new Users("amitt", 45),new Users("Jae", 35));
       Users max =users.stream().max(Comparator.comparingInt(Users::getAge)).get();
       System.out.println("==========Max from list=========");
       List<Integer> intList = Arrays.asList(3,5,67,8,89,45,23);
       Integer maxIn = intList.stream().reduce(0,Integer::max);
       System.out.println("Max using reduce:"+maxIn);
       System.out.println("Max using compartor:"+max.getAge());
       System.out.println("========distinct age=====");
       users.stream().map( i-> i.getAge()).distinct().forEach(System.out::println);
       
       System.out.println("==============");
       System.out.println("Even number in ramge from 1 to 6");
       IntStream.range(1, 7).filter(i-> i%2 ==0).forEach(System.out::println);
       
       System.out.println("==============");
       //map functionality
        System.out.println("===stream funnctionality on map()===");
         List<String> listStr1 = Arrays.asList("1","2","3");
         List<Integer> listInt = listStr1.stream().map(Integer::valueOf).collect(Collectors.toList());
         listInt.forEach(System.out::println);
         
         System.out.println("=========vowels stream============");
        
         
       
        
        
	}

}

