package com.learn.java.Optional;

import java.util.Optional;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class OptionalOrElseExample {

	// OrElse
	public static String optionalOrElse() {
		// Optional<Student> ofNullable =
		// Optional.ofNullable(StudentDataBase.studentSupplier.get());
		Optional<Student> ofNullable = Optional.ofNullable(null);
		String name = ofNullable.map(Student::getName).orElse("Default");
		return name;
	}

	// orElseGet
	public static String optionalOrElseGet() {
		Optional<Student> ofNullable = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		String orElseGet = ofNullable.map(Student::getName).orElseGet(() -> "Default");
		return orElseGet;
	}

	// orElseThrow
	public static String optionalOrElseThrow() {
		Optional<Student> ofNullable = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		String orElseThrow = ofNullable.map(Student::getName).orElseThrow(() -> new RuntimeException("No Data Available"));
		return orElseThrow;
	}

	public static void main(String[] args) {
		System.out.println("orElse :" + optionalOrElse());
		System.out.println("orElseGet :" + optionalOrElseGet());
		System.out.println("orElseThrow :"+optionalOrElseThrow());
	}

}
