package com.kodlama.io;

public class StudentManager extends User {

	public void Add(User user) {
		System.out.println("Öðrenci kursa KAYDEDÝLDÝ!" + user.getEmail());
	}
}
