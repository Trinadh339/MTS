package com.addmapping.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ServiceAm {

	@Autowired
	private RepositoryAm repo;
	public void createAccount(EntityDao s)
	{
		repo.save(s);
	}
	public List<EntityDao> getAllAccounts() {
		return (List<EntityDao>) repo.findAll();
	}
}
