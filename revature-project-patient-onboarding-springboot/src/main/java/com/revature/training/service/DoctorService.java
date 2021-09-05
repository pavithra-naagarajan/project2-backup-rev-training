package com.revature.training.service;

import java.util.List;


import com.revature.training.model.Doctor;


public interface DoctorService {
	public boolean addDoctor(Doctor doctor);
	public boolean deleteDoctor(int doctorId);
	public boolean updateDoctor(Doctor doctor);
	public Doctor getDoctorById(int doctorId); //view profile
	
	public List<Doctor> getAllDoctors(); //admin view list
	public boolean isDoctorExists(int doctorId);
	
	
	public List<Doctor> getDoctorByDomain(String domain);
	public List<Doctor> getDoctorByName(String doctorName);
	public List<Doctor> getDoctorByBranch(String branch);
}


