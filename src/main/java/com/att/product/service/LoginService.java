package com.att.product.service;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.att.product.dao.Login;

@Service
public class LoginService {



	HashMap<String, Login> allAdmins = new HashMap<String, Login>();

	Login a1 = new Login("ar614c","sivasridevi9");
	Login a2 = new Login("kd8548","dad@143");

	public LoginService()
	{
		allAdmins.put("ar614c", a1);
		allAdmins.put("kd8548", a2);

	}
	public Login getAdmin(String id)
	{
		return allAdmins.get(id);
	}

	public Login addAdmin(Login login) {
		allAdmins.put(login.getAttId(), login);
		return login;
	}


}
