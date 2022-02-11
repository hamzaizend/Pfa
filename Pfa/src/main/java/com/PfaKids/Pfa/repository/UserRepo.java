package com.PfaKids.Pfa.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PfaKids.Pfa.model.Contenu;
import com.PfaKids.Pfa.model.User;

public interface UserRepo extends JpaRepository<User, Long>{
	Optional<User> findUserById(Long id);
	void deleteUserById(Long id);

}
