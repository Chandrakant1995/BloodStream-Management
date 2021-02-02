package com.bloodstream.demo.bloodBank.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

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

import com.bloodstream.demo.bloodBank.dao.SeekerDAO;
import com.bloodstream.demo.bloodBank.model.Seeker;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/")
public class SeekerController {

	@Autowired
	SeekerDAO seekerDAO;

	/* to save a blood bank */
	@PostMapping("/seeker")
	public Seeker createDonor(@Valid @RequestBody Seeker seeker) {

		return seekerDAO.save(seeker);
	}

	/* get all blood banks */
	@GetMapping("/seeker")
	public List<Seeker> getAllSeekers() {
		System.out.println("getAll");
		return seekerDAO.findAll();
	}

	/* Delete a product */
	@DeleteMapping("/seeker/{id}")
	public ResponseEntity<Seeker> deleteSeeker(@PathVariable(value = "id") Long sId) {

		Optional<Seeker> seeker = seekerDAO.findOne(sId);
		if (seeker == null) {
			return ResponseEntity.notFound().build();
		}
		seekerDAO.delete(seeker.get());

		return ResponseEntity.ok().build();

	}

	@PostMapping("/seeker/login")
	public boolean login(@Valid @RequestBody String username, String password) {

		return seekerDAO.login(username, password);

	}

	@PutMapping("/seeker/")
	public ResponseEntity<Seeker> updateSeeker(@Valid @RequestBody Seeker seeker) {

		Optional<Seeker> seekerOld = seekerDAO.findOne(seeker.getSeeker_id());
		if (seekerOld == null) {
			return ResponseEntity.notFound().build();
		}
		seeker.setSeeker_id(seekerOld.get().getSeeker_id());

		seekerDAO.save(seeker);
		return ResponseEntity.ok().build();

	}
}
