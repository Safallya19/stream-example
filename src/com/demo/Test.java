package com.demo;

public class Test {
	 public static void main(String args[]) {
	    trace(Thread.currentThread().getStackTrace()); // output :main
	    new Test().doit();
	    trace(Thread.currentThread().getStackTrace()); // output :main
	 }
	 public void doit() {
	    trace(Thread.currentThread().getStackTrace()); // output :doit
	    doitagain();
	  }
	 public void doitagain() {
	    trace(Thread.currentThread().getStackTrace()); // output : doitagain
	  }

	 public static void trace(StackTraceElement e[]) {
	   boolean doNext = false;
	   for (StackTraceElement s : e) {
	       if (doNext) {
	          System.out.println(s.getMethodName());
	          return;
	       }
	       doNext = s.getMethodName().equals("getStackTrace");
	   }
	 }
	}