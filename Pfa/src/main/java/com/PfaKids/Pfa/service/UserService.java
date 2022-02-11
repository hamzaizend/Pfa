package com.PfaKids.Pfa.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PfaKids.Pfa.exception.UserNotFoundException;
import com.PfaKids.Pfa.model.User;
import com.PfaKids.Pfa.repository.UserRepo;

@Service
@Transactional
public class UserService {
	
	 private  UserRepo userRepo ;
	 
	 @Autowired
	 public UserService(UserRepo userRepo) {
		 this.userRepo = userRepo ;
	 }
	 
	 public User addUser(User user) {
		
		 
		 return userRepo.save(user);
	 }
	 
	 
	 public List<User> findAllUsers(){
		 
		 return userRepo.findAll();
	 }
	 
	 
	 public User updateUser(User user) {
		 return userRepo.save(user);
	 }
	 
	 
	 public void deleteUser(Long id) {
		 userRepo.deleteUserById(id);
	 }
	 
	 public User findUserById(Long id) {
		 return  userRepo.findUserById(id).orElseThrow(()
				 -> new UserNotFoundException("User not found"));
	 }
	 
	 
	 

}