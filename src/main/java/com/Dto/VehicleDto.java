  package com.Dto;

public class VehicleDto {

	private int id;
	private String make;
	private String type;
	private String model;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type; 
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "VehicleDto [id=" + id + ", make=" + make + ", type=" + type + ", model=" + model + "]";
	}

}
