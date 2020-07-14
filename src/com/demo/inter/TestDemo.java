package com.demo.inter;

@FunctionalInterface
public interface TestDemo {
int a=10;
public void get();
default public void disp() {
	System.out.println("in the default 1");
}

default public void disp2() {
	System.out.println("in the default 2 ");
}
static public void diplay() {
	System.out.println("from static 1 ");
}

static public void diplayOne() {
	System.out.println("from static 2");
}
}
