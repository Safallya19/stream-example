package com.demo.inter;


public interface Test extends TestDemo {

	public void get();
	default public void disp() {
	
		System.out.println("inside child default");
	}
	static public void test() {
		System.out.println("inside the static method");
	}
}

