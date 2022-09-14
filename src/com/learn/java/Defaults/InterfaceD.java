package com.learn.java.Defaults;

public interface InterfaceD {
	default void methodA() {
		System.out.println("Inside methodA"+InterfaceD.class);
	}
}
