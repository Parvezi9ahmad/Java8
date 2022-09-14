package com.learn.java.Defaults;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodsExample {

	public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Adam","Jenny","Alex","Dan","Mike","Eric");
        
        //prior to java8
	    Collections.sort(stringList);
	    System.out.println(stringList);
	    
	    //java8
	    stringList.sort(Comparator.naturalOrder());
	    System.out.println("Sorting in Ascending order :"+stringList);
	    
	    stringList.sort(Comparator.reverseOrder());
	    System.out.println("Reverse Order :"+stringList);
	}
}
