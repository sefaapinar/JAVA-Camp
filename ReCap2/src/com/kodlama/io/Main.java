package com.kodlama.io;

public class Main {

	public static void main(String[] args) {
	
	Student student = new Student();
	student.setId(1);
	student.setFirstName("Sefa");
	student.setLastName("Pınar");
	student.setEmail("sefa@gmail.com");
	student.setPassword("21321");
	
	student.getStudentCourses();
	
	StudentManager studentManager = new StudentManager();
	studentManager.Add(student);
		
	Instructor instructor = new Instructor();
	instructor.setId(1);
	instructor.setFirstName("Engin");
	instructor.setLastName("Pınar");
	instructor.setEmail("engin@gmail.com");
	instructor.setPassword("3242343");
	instructor.setCourseId(1);
	instructor.setCourses("C# COURSE");
	
	InstructorManager instructorManager = new InstructorManager();
	instructorManager.Add(instructor);
	
	}

}
