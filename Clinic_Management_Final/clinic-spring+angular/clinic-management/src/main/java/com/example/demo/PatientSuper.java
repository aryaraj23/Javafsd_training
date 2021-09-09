package com.example.demo;

import java.util.List;

public class PatientSuper {
	
	List<Patient> patient;

	public PatientSuper(List<Patient> details) {
		// TODO Auto-generated constructor stub
	}

	public List<Patient> getPatient() {
		return patient;
	}

	public void setPatient(List<Patient> patient) {
		this.patient = patient;
	}

	@Override
	public String toString() {
		return "PatientSuper [patient=" + patient + "]";
	}
	
	

}
