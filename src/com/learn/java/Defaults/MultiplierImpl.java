package com.learn.java.Defaults;

import java.util.List;

public class MultiplierImpl implements Multiplier {

	@Override
	public int multiply(List<Integer> integerList) {
		return integerList.stream().reduce(1, (x, y) -> x * y);
	}

	public int size(List<Integer> integerList) {
		System.out.println("Inside implementation class");
		return integerList.size();
	}
	
	public Boolean isEmpty(List<Integer> integerList) {
		System.out.println("Inside implementation class static method");
		return integerList!=null && integerList.size()>0;
	}
}
