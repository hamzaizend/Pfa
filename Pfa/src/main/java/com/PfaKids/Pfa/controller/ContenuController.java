package com.PfaKids.Pfa.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.PfaKids.Pfa.model.Contenu;
import com.PfaKids.Pfa.model.User;
import com.PfaKids.Pfa.service.ContenuService;
import com.PfaKids.Pfa.service.UserService;









@RestController

@Transactional
public class ContenuController {
	
	private ContenuService contenuService ;
	private UserService userService ;
	
	@Autowired
	public ContenuController(ContenuService contenuService, UserService userService) {
		this.contenuService = contenuService ;
		this.userService = userService ;
	}
	
	
	@GetMapping("/")
	    public String welcome() {
	        return "Welcome to the webservice.";
	    }
	
	@GetMapping("/all")
	public ResponseEntity<List<Contenu>> getAllContenus(){
		List<Contenu> contenu = contenuService.findAllContenus();
		return new ResponseEntity<>(contenu, HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Contenu> getContenuById(@PathVariable("id") Long id){
		Contenu contenu = contenuService.findContenuById(id);
		return new ResponseEntity<>(contenu, HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Contenu> addContenu(@RequestBody Contenu contenu){
		Contenu newContenu = contenuService.addContenu(contenu);
		return new ResponseEntity<>(newContenu,HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Contenu> updateContenu(@RequestBody Contenu contenu){
		Contenu newContenu = contenuService.updateContenu(contenu);
		return new ResponseEntity<>(newContenu,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Contenu> deleteContenu(@PathVariable("id") Long id){
		contenuService.deleteContenu(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
	
	
	
	@GetMapping("/users/all")
	public ResponseEntity<List<User>> getAllUsers(){
		List<User> user = userService.findAllUsers();
		return new ResponseEntity<>(user, HttpStatus.OK);
	}
	
	@GetMapping("/user/find/{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") Long id){
		User user = userService.findUserById(id);
		return new ResponseEntity<>(user, HttpStatus.OK);
	}
	
	@PostMapping("/user/add")
	public ResponseEntity<User> addUser(@RequestBody User user){
		User newUser = userService.addUser(user);
		return new ResponseEntity<>(newUser,HttpStatus.CREATED);
	}
	
	@PutMapping("/user/update")
	public ResponseEntity<User> updateUser(@RequestBody User user){
		User newUser = userService.updateUser(user);
		return new ResponseEntity<>(newUser,HttpStatus.OK);
	}
	
	@DeleteMapping("/user/delete/{id}")
	public ResponseEntity<User> deleteUser(@PathVariable("id") Long id){
		userService.deleteUser(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	

}
