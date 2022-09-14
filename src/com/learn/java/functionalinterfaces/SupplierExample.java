package com.learn.java.functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class SupplierExample {

	public static void main(String[] args) {

		Supplier<String> supplier=()->{
			return "Hello Supplier";
		};
		System.out.println("Supplier example :"+supplier.get());
		
		Supplier<Student> studentSupplier=()->{
			return new Student("Adam",3,3.6,"male",Arrays.asList("swimming","Basketball","vollyball"));
		};
		System.out.println("Student Supplier:"+studentSupplier.get());
		
		Supplier<List<Student>> listStudentSupplier=()->{
			return StudentDataBase.getAllStudents();
		};
		System.out.println("List Of Student :"+listStudentSupplier.get());
		
	}

}
