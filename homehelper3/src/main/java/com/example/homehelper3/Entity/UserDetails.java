
package com.example.homehelper3.Entity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="UserDetails")
public class UserDetails {
	@Id
	private String category;
	private int id;
	private String name;
	private int age;
	private long contact;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_id")
	private ServiceCategories servicecat;
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public UserDetails(int id, String name, int age, long contact, String category) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.contact = contact;
		this.category = category;
	}
	public UserDetails()
	{
		
	}
}

