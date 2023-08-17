package com.cg.CardDemoApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.CardDemoApplication.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

}