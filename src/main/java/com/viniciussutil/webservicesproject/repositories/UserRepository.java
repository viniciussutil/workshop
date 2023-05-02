package com.viniciussutil.webservicesproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciussutil.webservicesproject.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {	
	
}