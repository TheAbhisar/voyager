package com.weAssist.json;

import java.io.Serializable;


public class UserDetailsEntity implements Serializable {
	
	private int userId;

	
	private String first_name;

	
	private String last_name;

	
	private String gender;

	
	private String date_of_birth;

	
	private String disability;

	
	private String volunteer;

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirst_name() {
		return this.first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return this.last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDate_of_birth() {
		return this.date_of_birth;
	}

	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getDisability() {
		return this.disability;
	}

	public void setDisability(String disability) {
		this.disability = disability;
	}

	public String getVolunteer() {
		return this.volunteer;
	}

	public void setVolunteer(String volunteer) {
		this.volunteer = volunteer;
	}

}