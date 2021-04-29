package com.kodlama.io;

public class InstructorManager extends User {

	public void Add(User user) {
		
		System.out.println("Instructor Trainer " + user.getFirstName()+" " + user.getLastName() + "Added." );
	}
}
