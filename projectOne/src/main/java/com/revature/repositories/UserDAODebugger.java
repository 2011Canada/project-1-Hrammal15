package com.revature.repositories;

import com.revature.exceptions.InternalErrorException;
import com.revature.exceptions.UserNotFoundException;

public class UserDAODebugger {
	
		public static void main(String[] args) throws UserNotFoundException, InternalErrorException {
			
				IUserDAO ud = new UserDAO();
			System.out.println(ud.findUserByUsernameAndPassword("employee2","password"));
			
			
			
		
		}


}
