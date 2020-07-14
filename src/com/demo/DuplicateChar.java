package com.demo;

public class DuplicateChar {

	public static void main(String[] args) {
		System.out.println("======");
		  String str = "Safallya";
		  char[] ch = str.toCharArray();
		 
		  
		  char[] ch1 = new char[str.length()]; 
		  int i=0;
		  int j=0;
		  int k=0;
		 int  count=0;
		    while(i<str.length() ) {
		    	count=0;
		    	while(  j<ch.length && k<str.length()) {
		    	
		    	if(str.charAt(i)==ch[j]) {
		    	 count++;	
		    	}
		    	if(count>1) {
		    		 ch1[k]=ch[i];
		    		 
		    	}
		    	k++;
		    	j++;
		    	}
		    	i++;
		    }
		  
		    for(int m=0;m<ch1.length;m++) {
		    	System.out.println(ch1[m]);
		    }
	 }

}
