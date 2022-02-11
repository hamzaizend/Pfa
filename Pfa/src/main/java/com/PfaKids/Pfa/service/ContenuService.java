package com.PfaKids.Pfa.service;

import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PfaKids.Pfa.model.Contenu;
import com.PfaKids.Pfa.repository.*;
import com.PfaKids.Pfa.exception.*;

@Service
@Transactional
public class ContenuService {
	
	 private  ContenuRepo ContenuRepo ;
	 
	 @Autowired
	 public ContenuService(ContenuRepo ContenuRepo) {
		 this.ContenuRepo = ContenuRepo ;
	 }
	 
	 public Contenu addContenu(Contenu Contenu) {
		
		 
		 return ContenuRepo.save(Contenu);
	 }
	 
	 
	 public List<Contenu> findAllContenus(){
		 
		 return ContenuRepo.findAll();
	 }
	 
	 
	 public Contenu updateContenu(Contenu Contenu) {
		 return ContenuRepo.save(Contenu);
	 }
	 
	 
	 public void deleteContenu(Long id) {
		 ContenuRepo.deleteContenuById(id);
	 }
	 
	 public Contenu findContenuById(Long id) {
		 return  ContenuRepo.findContenuById(id).orElseThrow(()
				 -> new ContenuNotFoundException("Contenu not found"));
	 }
	 
	 
	 

}