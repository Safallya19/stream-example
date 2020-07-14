package com.demo;

public class ConBrk {

	public static void main(String[] args) {
		first:
		 for(int i=0; i<10;i++) {
			
			 if(i>=2 && i<=7) {
				 continue first; 
			 }
			 System.out.println(i);
		 }
	
	System.out.println("===========");
	      second:
	    	  for(int i=0;i<10;i++) {
	    		  if(i==7){
	    			  break second;
	    		  }
	    		  System.out.println(i);
	    	  }

	}

}
