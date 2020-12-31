package com.revature.services;

import com.revature.exceptions.InternalErrorException;
import com.revature.exceptions.UserNotFoundException;
import com.revature.models.User;
import com.revature.repositories.IUserDAO;
import com.revature.repositories.UserDAO;

public class UserServiceImplementation implements IUserService {
	
	IUserDAO userDAO = new UserDAO();	
	




	public User verifyLogin(String username, String password) throws UserNotFoundException, InternalErrorException {
		User u = userDAO.findUserByUsernameAndPassword(username, password);
		return u;
	}



}
