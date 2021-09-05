
  package com.revature.training.repository;
  
  import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
  
  
  import com.revature.training.model.Doctor;

  
  @EnableJpaRepositories
  public interface DoctorRepository extends CrudRepository<Doctor, Integer> {
	  
	  public List<Doctor> findByDomain(String domain);
	  public List<Doctor> findByBranch(String branch);
	  public List<Doctor> findByDoctorName(String doctorName);
  
  }
 