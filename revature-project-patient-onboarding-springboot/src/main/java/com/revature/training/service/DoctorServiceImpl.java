package com.revature.training.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.training.model.Doctor;

import com.revature.training.repository.DoctorRepository;

@Service
public class DoctorServiceImpl implements DoctorService{

	@Autowired
	DoctorRepository doctorRepository;
	@Override
	public boolean addDoctor(Doctor doctor) {
		doctorRepository.save(doctor);
		return true;	
	}

	@Override
	public boolean deleteDoctor(int doctorId) {
		doctorRepository.deleteById(doctorId);
		return true;
	}

	@Override
	public boolean updateDoctor(Doctor doctor) {
		doctorRepository.save(doctor);
		return true;
	}

	@Override
	public Doctor getDoctorById(int doctorId) {
		Optional<Doctor> doctorData = doctorRepository.findById(doctorId);
		Doctor doctor = doctorData.get();
		return doctor;
	}

	@Override
	public List<Doctor> getAllDoctors() {
		List<Doctor> doctorList = (List<Doctor>) doctorRepository.findAll();
		return doctorList;
	}

	@Override
	public boolean isDoctorExists(int doctorId) {
		Optional<Doctor> doctorData = doctorRepository.findById(doctorId);
		return doctorData.isPresent();
	}

	@Override
	public List<Doctor> getDoctorByDomain(String domain) {
		List<Doctor> doctorList = (List<Doctor>) doctorRepository.findByDomain(domain);
		return doctorList;
	}

	@Override
	public List<Doctor> getDoctorByName(String doctorName) {
		List<Doctor> doctorList = (List<Doctor>) doctorRepository.findByDoctorName(doctorName);
		return doctorList;
	}

	@Override
	public List<Doctor> getDoctorByBranch(String branch) {
		List<Doctor> doctorList = (List<Doctor>) doctorRepository.findByBranch(branch);
		return doctorList;
	}

}
