package com.scm.contact_manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scm.contact_manager.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
