package com.addmapping.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/Addmapping")
public class ControllerAm {
	@Autowired
	private ServiceAm serviceam;
	@GetMapping("/Addmapping")
	public List<EntityDao> getAllAccounts() {
		return (List<EntityDao>) serviceam.getAllAccounts();
	}
	@PostMapping("/addmapping")
	public void createAccount(@RequestBody EntityDao accounts) {
		serviceam.createAccount(accounts);
	}
	

}
