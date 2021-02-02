package com.bloodstream.demo.bloodBank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bloodstream.demo.bloodBank.model.Seeker;

@Repository
public interface SeekerRepository extends JpaRepository<Seeker, Long> {
//
//	@Query(" from Seeker s WHERE s.email = :email and s.password= :password")
//	public boolean seekerLogin(String email, String password);

//	@Query("from Seeker s WHERE s.email = :email and s.password= :password" /* , nativeQuery = true */)
//	public boolean seekerLogin(String email, String password);
	
	@Query("FROM Seeker WHERE email = :email and password= :password")
	Seeker seekerLogin(String email,String password);
}
