package com.learn.java.Optional;

import java.util.Optional;
import java.util.function.Supplier;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class OptionalExample {
	public static String geStudentName() {
		// Student student = StudentDataBase.studentSupplier.get();
		Student student = null;
		if (student != null) {
			return student.getName();
		}
		return null;
	}

	public static Optional<String> getStudentnameOptional() {
		// Optional<Student> optionalStudent =
		// Optional.ofNullable(StudentDataBase.studentSupplier.get());
		Optional<Student> optionalStudent = Optional.ofNullable(null);
		if (optionalStudent.isPresent()) {
			optionalStudent.get();
			return optionalStudent.map(Student::getName);
		}
		return Optional.empty();
	}

	public static void main(String[] args) {

		String name = geStudentName();
		if (name != null) {
			System.out.println(name.length());
		} else {
            System.out.println("not found");
		}

		Optional<String> studentnameOptional = getStudentnameOptional();
		if (studentnameOptional.isPresent()) {
			System.out.println(studentnameOptional.get().length());
		} else {
			System.out.println("Eroor");
		}
	}

}
