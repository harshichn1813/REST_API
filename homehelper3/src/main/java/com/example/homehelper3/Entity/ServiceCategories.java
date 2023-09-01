package com.example.homehelper3.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="service_categories")
public class ServiceCategories {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String category;
	private int price;
	private int timepackage;
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTimepackage() {
		return timepackage;
	}
	public void setTimepackage(int timepackage) {
		this.timepackage = timepackage;
	}
	public ServiceCategories(String category, int price, int timepackage) {
		super();
		this.category = category;
		this.price = price;
		this.timepackage = timepackage;
	}
	public ServiceCategories()
	{
		
	}
	
}
