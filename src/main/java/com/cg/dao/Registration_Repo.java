package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entity.Registration;

@Repository
public interface Registration_Repo extends JpaRepository<Registration, Integer> {

}
