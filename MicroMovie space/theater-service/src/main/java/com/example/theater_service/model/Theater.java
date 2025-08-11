package com.example.theater_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Theater {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String location;
    private int numberOfScreens;
    private String facilities;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getNumberOfScreens() {
		return numberOfScreens;
	}
	public void setNumberOfScreens(int numberOfScreens) {
		this.numberOfScreens = numberOfScreens;
	}
	public String getFacilities() {
		return facilities;
	}
	public void setFacilities(String facilities) {
		this.facilities = facilities;
	}
	public Theater(Long id, String name, String location, int numberOfScreens, String facilities) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.numberOfScreens = numberOfScreens;
		this.facilities = facilities;
	}
	public Theater() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Theater [id=" + id + ", name=" + name + ", location=" + location + ", numberOfScreens="
				+ numberOfScreens + ", facilities=" + facilities + "]";
	}  
}
