package com.api.models.request;

//Builder Desgin Pattern

public class signUpRequestBuilder {

	public String username;
	public String password;
	public String email;
	public String firstName;
	public String lastName;
	public String mobileNumber;

	public signUpRequestBuilder() {
		super();
	}

	public signUpRequestBuilder userName(String username) {
		this.username = username;
		return this;
	}

	public signUpRequestBuilder password(String password) {
		this.password = password;
		return this;
	}

	public signUpRequestBuilder email(String email) {
		this.email = email;
		return this;
	}

	public signUpRequestBuilder firstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public signUpRequestBuilder lastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public signUpRequestBuilder mobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
		return this;
	}

	public static signUpRequestBuilder builder() {
		return new signUpRequestBuilder();

	}
	   public signUpRequestBuilder build() {
	        return this;
	    }

}
