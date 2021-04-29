package com.kodlama.io;

public class Instructor extends User {

	private int CourseId;
	private String Courses;
	
	public int getCourseId() {
		return CourseId;
	}
	public void setCourseId(int courseId) {
		CourseId = courseId;
	}
	public String getCourses() {
		return Courses;
	}
	public void setCourses(String courses) {
		Courses = courses;
	}
	
}
