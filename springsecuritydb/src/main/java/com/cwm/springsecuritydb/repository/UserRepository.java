package com.cwm.springsecuritydb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cwm.springsecuritydb.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}