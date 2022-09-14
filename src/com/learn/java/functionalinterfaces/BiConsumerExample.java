package com.learn.java.functionalinterfaces;

import java.util.List;
import java.util.function.BiConsumer;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class BiConsumerExample {

	static BiConsumer<String,List<String>> biConsumer=(name,activities)->System.out.println(name+" "+activities);
	public static void nameandActivities() {
		List<Student> allStudents = StudentDataBase.getAllStudents();
		allStudents.forEach(student->biConsumer.accept(student.getName(), student.getActivities()));
	}

	
	
	public static void main(String[] args) {

		BiConsumer<String,String> biconsumer=(a,b)->System.out.println("a :"+a+"   b:"+b);
		biconsumer.accept("java 7", "java 8");
		BiConsumer<Integer,Integer> multiply=(a,b)->System.out.println(a*b);
		BiConsumer<Integer,Integer> divide=(a,b)->System.out.println(a/b);
		multiply.andThen(divide).accept(10, 5);
		nameandActivities();
	}

}
