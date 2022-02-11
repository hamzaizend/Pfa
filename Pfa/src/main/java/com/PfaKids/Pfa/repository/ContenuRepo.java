package com.PfaKids.Pfa.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PfaKids.Pfa.model.Contenu;



public interface ContenuRepo extends JpaRepository<Contenu, Long>{
	Optional<Contenu> findContenuById(Long id);
	void deleteContenuById(Long id);

}
