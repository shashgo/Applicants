package com.shashgo.candidate.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Info {
	private String name;
	
	@Id
	private String email;
	private String phone;
	private int experience;
	private String code;
	private int rating;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Info(String name, String email, String phone, int experience, String code, int rating) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.experience = experience;
		this.code = code;
		this.rating = rating;
	}
	public Info() {
		super();
	}
	@Override
	public String toString() {
		return "Info [name=" + name + ", email=" + email + ", phone=" + phone + ", experience=" + experience + ", code="
				+ code + ", rating=" + rating + "]";
	}
	
	
}
