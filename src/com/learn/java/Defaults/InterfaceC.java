package com.learn.java.Defaults;

public interface InterfaceC extends InterfaceB{
 default void methodC() {
	 System.out.println("Inside method C");
 }
 default void methodA() {
		System.out.println("Inside methodA"+InterfaceC.class);
	}
}
