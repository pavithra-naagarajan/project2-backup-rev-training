package com.revature.training.service;

import java.util.List;

import com.revature.training.model.Patient;

public interface PatientService {
	
	public boolean addPatient(Patient patient);
	public boolean deletePatient(long patientId);
	public boolean updatePatient(Patient patient);
	public Patient getPatientById(long patientId);
	
	public List<Patient> getAllPatients();
	public boolean isPatientExists(long patientId);
	
	
	//login
	
	public boolean patientLogin(long patientId,String password);


}
