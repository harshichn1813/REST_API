package com.example.homehelper3.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Helper_details")
public class HelperDetails {
	@Id
	private String category;
	private int id;
	private String name;
	private int age;
	private long contact;
	private float experience;
	private String qualifications;
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public float getExperience() {
		return experience;
	}
	public void setExperience(float experience) {
		this.experience = experience;
	}
	public String getQualifications() {
		return qualifications;
	}
	public void setQualifications(String qualifications) {
		this.qualifications = qualifications;
	}
	public HelperDetails(int id, String name, int age, long contact, float experience, String qualifications, String category) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.contact = contact;
		this.experience = experience;
		this.qualifications = qualifications;
		this.category = category;
	}
	public HelperDetails()
	{
		
	}
}

