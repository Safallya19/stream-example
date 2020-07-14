package com.demo.inter;

public class Main implements Test {

	public static void main(String[] args) {
		 Test t1 = new Main();
		 t1.disp2();
		 Main m1 = new Main();
		 m1.get();
		 TestDemo td = new Main();
		 td.disp();
		 m1.disp();
		 //m1.getChild();
          Test.test();
	}

	@Override
	public void get() {
		 System.out.println("inside the parent interface");
		
	}

	
	/*
	 * @Override public void getChild() {
	 * System.out.println("inside the child interface");
	 * 
	 * }
	 */
    
}
