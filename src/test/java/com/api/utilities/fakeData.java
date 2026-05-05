package com.api.utilities;

import com.github.javafaker.Faker;

public class fakeData {

	public String username;
	public String password;
	public String email;
	public String firstName;
	public String lastName;
	public String mobileNumber;

	public fakeData() {
		super();
	}

	public void fakedata() {

		Faker fake = new Faker();
		this.firstName = fake.name().firstName();
		this.lastName = fake.name().lastName();
		this.username = fake.name().username();
		this.password = fake.internet().password();
		this.mobileNumber = String.valueOf(9000000000L + new java.util.Random().nextInt(1000000000));
		this.email = fake.internet().emailAddress();

	}

}
