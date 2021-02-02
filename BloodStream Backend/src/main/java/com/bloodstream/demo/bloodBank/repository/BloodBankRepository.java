package com.bloodstream.demo.bloodBank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.bloodstream.demo.bloodBank.model.BloodBank;

public interface BloodBankRepository extends JpaRepository<BloodBank, Long> {

	@Query(value = "SELECT * FROM blood_bank WHERE email = :email and password= :password", nativeQuery = true)
	BloodBank bloodBankLogin(String email, String password);

	@Query(value = "SELECT * FROM blood_bank WHERE location = :location", nativeQuery = true)
	List<BloodBank> getBloodBankByLocation(String location);

	@Modifying
	@Transactional
	@Query(value = "DELETE  FROM blood_bank WHERE email = :email", nativeQuery = true)
	int deleteByEmail(String email);

	@Query(value = "SELECT *  FROM blood_bank WHERE email = :email", nativeQuery = true)
	BloodBank findOneByEmail(String email);
	

}
