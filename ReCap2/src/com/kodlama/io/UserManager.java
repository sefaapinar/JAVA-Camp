package com.kodlama.io;

public class UserManager {

	public void Add(User user) {
		System.out.println(user.getFirstName() + " Added...");
	}
	public void Delete(User user) {
		System.out.println(user.getFirstName() + "Deleted...");
	}
}
