package com.att.product.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.att.product.service.LoginService;
@RestController
public class LoginController {
	public static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private LoginService adminService;

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/login/{id}/{password}")
	public  String loginAdmin(@PathVariable String id, @PathVariable String password)
	{
		if (adminService.getAdmin(id) == null) {
			logger.error(id+" user does not exist");
			return HttpStatus.NOT_FOUND.toString();
		}else if(!password.equals(adminService.getAdmin(id).getPassword()))
		{
			logger.error("Wrong password");
			return HttpStatus.UNAUTHORIZED.toString();
		}
		return HttpStatus.OK.toString();

	}

}
