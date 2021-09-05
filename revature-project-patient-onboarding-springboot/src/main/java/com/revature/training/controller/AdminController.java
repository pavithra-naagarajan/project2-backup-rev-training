package com.revature.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

import com.revature.training.model.Doctor;
import com.revature.training.model.Patient;
import com.revature.training.service.DoctorService;
import com.revature.training.service.PatientService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class AdminController {
	@Autowired
	DoctorService doctorService;

	@Autowired
	PatientService patientService;

	// get all doctors
	@GetMapping("doctor")
	public ResponseEntity<List<Doctor>> getAllDoctors() {
		ResponseEntity<List<Doctor>> responseEntity = null;
		List<Doctor> doctorList = doctorService.getAllDoctors();
		if (doctorList.size() == 0) {
			responseEntity = new ResponseEntity<List<Doctor>>(doctorList, HttpStatus.NO_CONTENT);
		} else
			responseEntity = new ResponseEntity<List<Doctor>>(doctorList, HttpStatus.OK);
		return responseEntity;
	}

	// get doctor by id
	@GetMapping("doctorById/{doctorId}")
	public ResponseEntity<Doctor> getDoctorById(@PathVariable("doctorId") int doctorId) {
		ResponseEntity<Doctor> responseEntity = null;
		Doctor doctor = new Doctor();
		if (doctorService.isDoctorExists(doctorId)) {
			doctor = doctorService.getDoctorById(doctorId);
			responseEntity = new ResponseEntity<Doctor>(doctor, HttpStatus.OK);
		} else
			responseEntity = new ResponseEntity<Doctor>(doctor, HttpStatus.NO_CONTENT);

		return responseEntity;

	}

	// insert a doctor
	@PostMapping("doctor")
	public ResponseEntity<String> addDoctor(@RequestBody Doctor doctor) {
		ResponseEntity<String> responseEntity = null;
		int doctorId = doctor.getDoctorId();
		String message = null;
		if (doctorService.isDoctorExists(doctorId)) {
			message = "Doctor with doctorId " + doctorId + " already exists";
			responseEntity = new ResponseEntity<String>(message, HttpStatus.CONFLICT);
		} else {
			doctorService.addDoctor(doctor);
			message = "Doctor with doctorId " + doctorId + " saved successfully";
			responseEntity = new ResponseEntity<String>(message, HttpStatus.OK);
		}

		System.out.println(doctor);
		return responseEntity;

	}

	// update a product--doctor module
	@PutMapping("doctor")
	public ResponseEntity<String> updateDoctor(@RequestBody Doctor doctor) {
		ResponseEntity<String> responseEntity = null;
		int doctorId = doctor.getDoctorId();
		String message = null;
		if (doctorService.isDoctorExists(doctorId)) {
			doctorService.updateDoctor(doctor);
			message = "Doctor with doctorId " + doctorId + " Updated Successfully";
			responseEntity = new ResponseEntity<String>(message, HttpStatus.OK);
		} else {

			message = "Doctor with doctorId " + doctorId + " not exist";
			responseEntity = new ResponseEntity<String>(message, HttpStatus.NO_CONTENT);
		}

		return responseEntity;
	}

	@DeleteMapping("doctor/{doctorId}")
	public ResponseEntity<String> deleteDoctor(@PathVariable("doctorId") int doctorId) {
		ResponseEntity<String> responseEntity = null;

		String message = null;
		if (doctorService.isDoctorExists(doctorId)) {
			doctorService.deleteDoctor(doctorId);
			message = "Doctor with doctorId " + doctorId + " deleted Successfully";
			responseEntity = new ResponseEntity<String>(message, HttpStatus.OK);
		} else {

			message = "Doctor with doctorId " + doctorId + " not exist";
			responseEntity = new ResponseEntity<String>(message, HttpStatus.NO_CONTENT);
		}

		return responseEntity;
	}
	//get patient by id
		@GetMapping("patientById/{patientId}")
		public ResponseEntity<Patient> getPatientById(@PathVariable("patientId") int patientId) {
			ResponseEntity<Patient> responseEntity=null;
			Patient patient =new Patient();
			if(patientService.isPatientExists(patientId)) {
				patient=patientService.getPatientById(patientId);
				responseEntity=new ResponseEntity<Patient> (patient,HttpStatus.OK);
			}
			else
				responseEntity=new ResponseEntity<Patient> (patient,HttpStatus.NO_CONTENT);
			
			return responseEntity;

		}
		// get all patients

				@GetMapping("patient")
				public ResponseEntity<List<Patient>> getAllPatients() {
					ResponseEntity<List<Patient>> responseEntity = null;
					List<Patient> patientList = patientService.getAllPatients();
					if (patientList.size() == 0) {
						responseEntity = new ResponseEntity<List<Patient>>(patientList, HttpStatus.NO_CONTENT);
					} else
						responseEntity = new ResponseEntity<List<Patient>>(patientList, HttpStatus.OK);
					return responseEntity;
				}
	
}
