package com.login;

public class LoginService {

	public boolean isUserValid(String user, String password) {
		if (user.equals("Sandip") && password.equals("dummy"))
			return true;

		return false;
	}

}