package com.learn.java.Defaults;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {

	public static void main(String[] args) {
         Multiplier multiplier=new MultiplierImpl();
         List<Integer> integerList = Arrays.asList(1,3,5);
         System.out.println("Result is :"+multiplier.multiply(integerList));
         System.out.println("Default method size :"+multiplier.size(integerList));
         System.out.println("static method :"+Multiplier.isEmpty(integerList));
	}

}
