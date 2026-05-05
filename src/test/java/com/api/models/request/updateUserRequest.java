package com.api.models.request;

public class updateUserRequest {
	private String firstName;
	private String lastName;
	private String email;
	private String mobileNumber;
	private String id;
	private String username;

	public updateUserRequest() {
		super();
	}

	@Override
	public String toString() {
		return "updateUserRequest [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", mobileNumber=" + mobileNumber + ", id=" + id + ", username=" + username + "]";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getusername() {
		return username;
	}

	public void setusername(String username) {
		this.username = username;
	}

	public updateUserRequest(String firstName, String lastName, String email, String mobileNumber, String id,
			String username) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.id = id;
		this.username = username;
	}

	public static class Builder {
		private String firstName;
		private String lastName;
		private String email;
		private String mobileNumber;
		private String id;
		private String username;
		
		public Builder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public Builder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public Builder email(String email) {
			this.email = email;
			return this;
		}

		public Builder username(String username) {
			this.username = username;
			return this;
		}

		public Builder id(String id) {
			this.id = id;
			return this;
		}
		public Builder mobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
			return this;
		}
		
		public updateUserRequest build() {
			updateUserRequest updateUserRequest = new updateUserRequest(firstName, lastName, email, mobileNumber,id,username);
			return updateUserRequest;
		}
	}
}