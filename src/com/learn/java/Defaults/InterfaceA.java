package com.learn.java.Defaults;

public interface InterfaceA {
      default void methodA() {
    	  System.out.println("Inside Method A"+InterfaceA.class);
      }
}
