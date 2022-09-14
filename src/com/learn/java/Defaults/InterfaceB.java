package com.learn.java.Defaults;

public interface InterfaceB extends InterfaceA{

	default void mehtodB() {
		System.out.println("Inside method B");
	}
	
	default void methodA() {
		System.out.println("Inside methodA"+InterfaceB.class);
	}
}
