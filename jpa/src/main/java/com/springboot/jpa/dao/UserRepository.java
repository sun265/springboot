package com.springboot.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.jpa.entity.Users;

public interface UserRepository extends JpaRepository<Users, Integer>{

}
