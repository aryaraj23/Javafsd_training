package com.example.demo;

import java.util.List;

public class MedicineSuper {
	
	List<Medicine> medicine;
	

	public MedicineSuper() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Medicine> getMedicine() {
		return medicine;
	}

	public void setMedicine(List<Medicine> medicine) {
		this.medicine = medicine;
	}

	@Override
	public String toString() {
		return "MedicineSuper [medicine=" + medicine + "]";
	}
	
	

}
