package com.learn.java.Streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class StreamMapReduceExample {

	public static int noOfNoteBook() {
       Integer reduce = StudentDataBase.getAllStudents().stream()
    		   .filter((Student->Student.getGradeLevel()>=3))
    		   .filter((Student->Student.getGender().equals("female")))
       .map(Student::getNoteBooks)
      // .reduce(0,(a,b)->a+b);
       .reduce(0, Integer::sum);
		return reduce;
	}
	public static void main(String[] args) {
		int noOfNoteBook = noOfNoteBook();
		System.out.println(noOfNoteBook);
		
	}

}
