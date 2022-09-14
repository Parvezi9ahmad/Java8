package com.learn.java.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class StreamReduceExample {

	public static int performMultiplication(List<Integer> integersList) {
		Integer reduce = integersList.stream().reduce(1,(a,b)->a*b);
		return reduce;
	}
	public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList){
           Optional<Integer> reduce = integerList.stream()
          .reduce((a,b)->a*b);
           return reduce;
	}
	public static Optional<Student> getHighiestGpaStudent(){
          Optional<Student> reduce = StudentDataBase.getAllStudents().stream()
          .reduce((s1,s2)->s1.getGpa()>s2.getGpa() ? s1:s2);
		return reduce;
	}
	
	public static Optional<Student> getFemalWithActivities(){
         Optional<Student> reduce = StudentDataBase.getAllStudents().stream()
         .reduce((s1,s2)->s1.getGender().equals("female")? s1:s2)
         ;
		return reduce;
	}
	public static void main(String[] args) {

		List<Integer> integers=Arrays.asList(1,3,5,7);
		List<Integer> integerArray=new ArrayList<>();
		System.out.println(performMultiplication(integers));
		Optional<Integer>  result= performMultiplicationWithoutIdentity(integers);
		System.out.println(result.isPresent());
		System.out.println(result.get());
		
		Optional<Integer> result1 = performMultiplicationWithoutIdentity(integerArray);
		System.out.println(result1.isPresent());

		if(result1.isPresent()) {
			System.out.println(result1.get());
		}
		else {
			System.out.println("Exception is raised at this point");
		}
		
		Optional<Student> highiestGpaStudent = getHighiestGpaStudent();
		if(highiestGpaStudent.isPresent()) {
			System.out.println(highiestGpaStudent.get());
		}
		else{
			System.out.println("Invalid student");
		}
		
		Optional<Student> femalWithActivities = getFemalWithActivities();
		System.out.println(femalWithActivities.get());
	}

}
