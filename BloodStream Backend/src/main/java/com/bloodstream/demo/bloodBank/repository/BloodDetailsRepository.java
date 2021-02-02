package com.bloodstream.demo.bloodBank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bloodstream.demo.bloodBank.model.BloodDetails;

public interface BloodDetailsRepository extends JpaRepository<BloodDetails, Long>{

	@Query(value = "SELECT * FROM blood_details WHERE location = :location", nativeQuery = true)
	List<BloodDetails> getBloodBankByLocation(String location);
}