package com.learn.java.Defaults;

import java.util.List;

public interface Multiplier {
	int multiply(List<Integer> integerList);

	default int size(List<Integer> integerList) {
		System.out.println("Inside interface deafault method");
		return integerList.size();
	}

	static Boolean isEmpty(List<Integer> integerList) {
		System.out.println("Inside interface static method ");
		return integerList != null && integerList.size() >0;
	}
}
