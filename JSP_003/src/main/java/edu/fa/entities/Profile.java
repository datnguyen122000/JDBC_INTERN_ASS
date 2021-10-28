package edu.fa.entities;

public class Profile {
	private int accountId;
	private String firstName;
	private String lastName;
	private String phone;
	private String description;
	
	public Profile() {
	}

	public Profile(int accountId, String firstName, String lastName, String phone, String description) {
		this.accountId = accountId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.description = description;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Profile [accountId=" + accountId + ", firstName=" + firstName + ", lastName=" + lastName + ", phone="
				+ phone + ", description=" + description + "]";
	}
	
	
	
}
