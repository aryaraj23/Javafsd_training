package com.example.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class ClinicController {
	
	@Autowired
	private PatientRepository prepo;
	
	@Autowired
	private MedicineRepository mrepo;

	@GetMapping("/patients")
	public List<Patient> getAllPatients() {
		return prepo.findAll();
	}

	@GetMapping("/medicines")
	public List<Medicine> getAllMedicines() {
		return mrepo.findAll();
	}
	
	@GetMapping("/patients/{pid}")
	public ResponseEntity<Patient> getPatientsById(@PathVariable(value = "pid") String pid)
			throws ResourceNotFoundException {
		Patient patient = prepo.findById(pid)
				.orElseThrow(() -> new ResourceNotFoundException("Patient not found for this id :: " + pid));
		return ResponseEntity.ok().body(patient);
	}
	
	@GetMapping("/medicines/{mid}")
	public ResponseEntity<Medicine> getMedicinesById(@PathVariable(value = "mid") String mid)
			throws ResourceNotFoundException {
		Medicine medicine = mrepo.findById(mid)
				.orElseThrow(() -> new ResourceNotFoundException("Medicine not found for this id :: " + mid));
		return ResponseEntity.ok().body(medicine);
	}

	@PostMapping("/patients")
	public Patient createPatients(@RequestBody Patient patient) {
		return prepo.save(patient);
	}
	
	@PostMapping("/medicines")
	public Medicine createMedicines(@RequestBody Medicine medicine) {
		return mrepo.save(medicine);
	}

	@PutMapping("/patients/{pid}")
	public ResponseEntity<Patient> updatePatient(@PathVariable(value = "pid") String pid,
			@RequestBody Patient pDetails) throws ResourceNotFoundException {
		Patient patient = prepo.findById(pid)
				.orElseThrow(() -> new ResourceNotFoundException("Patient not found for this id :: " + pid));

		patient.setPfname(pDetails.getPfname());
		patient.setPlname(pDetails.getPlname());
		patient.setAge(pDetails.getAge());
		patient.setGender(pDetails.getGender());
		patient.setAddress(pDetails.getAddress());
		patient.setPhoneno(pDetails.getPhoneno());
		final Patient updatedPatient = prepo.save(patient);
		return ResponseEntity.ok(updatedPatient);
	}


	@PutMapping("/medicines/{mid}")
	public ResponseEntity<Medicine> updateMedicine(@PathVariable(value = "mid") String mid,
			@RequestBody Medicine mDetails) throws ResourceNotFoundException {
		Medicine medicine = mrepo.findById(mid)
				.orElseThrow(() -> new ResourceNotFoundException("Medicine not found for this id :: " + mid));

		medicine.setMname(mDetails.getMname());
		medicine.setPrice(mDetails.getPrice());
		medicine.setQty(mDetails.getQty());
		final Medicine updatedMedicine = mrepo.save(medicine);
		return ResponseEntity.ok(updatedMedicine);
	}
	
	@DeleteMapping("/patients/{pid}")
	public Map<String, Boolean> deletePatient(@PathVariable(value = "pid") String pid)
			throws ResourceNotFoundException {
		Patient patient = prepo.findById(pid)
				.orElseThrow(() -> new ResourceNotFoundException("Patient not found for this id :: " + pid));

		prepo.delete(patient);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
	
	@DeleteMapping("/medicines/{mid}")
	public Map<String, Boolean> deleteMedicine(@PathVariable(value = "mid") String mid)
			throws ResourceNotFoundException {
		Medicine medicine = mrepo.findById(mid)
				.orElseThrow(() -> new ResourceNotFoundException("Medicine not found for this id :: " + mid));

		mrepo.delete(medicine);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
