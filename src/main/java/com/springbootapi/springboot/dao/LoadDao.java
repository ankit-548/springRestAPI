package com.springbootapi.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootapi.springboot.entities.Load;

public interface LoadDao extends JpaRepository<Load, Long>{
    
}
