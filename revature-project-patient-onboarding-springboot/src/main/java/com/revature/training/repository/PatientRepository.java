package com.revature.training.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;


import com.revature.training.model.Patient;


@EnableJpaRepositories
public interface PatientRepository extends CrudRepository<Patient, Long> {
	
	

	public Optional<Patient> findByPatientIdAndPassword(long patientId,String password);

}
