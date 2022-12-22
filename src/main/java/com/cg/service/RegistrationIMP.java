package com.cg.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.Registration_Repo;
import com.cg.interfaces.Registration;

@Service
public class RegistrationIMP implements Registration {

	@Autowired
	Registration_Repo dao;
	
	
	@Override
	public void siginup(com.cg.entity.Registration reg) {
		/*
		 * com.cg.entity.Registration r=new com.cg.entity.Registration();
		 * List<com.cg.entity.Registration> r1=new
		 * ArrayList<com.cg.entity.Registration>(); r.setId(reg.getId());
		 * r.setFnme(reg.getFnme()); r.setLnme(reg.getLnme());
		 * r.setEmail(reg.getEmail()); r.setMno(reg.getMno()); r.setPass(reg.getPass());
		 * 
		 * r1.add(r);
		 */
		dao.save(reg);
		
		
	}

}
;;