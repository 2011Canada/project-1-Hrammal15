package com.revature.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.exceptions.InternalErrorException;
import com.revature.exceptions.UserNotFoundException;
import com.revature.models.User;
import com.revature.util.ConnectionFactory;

public class UserDAO implements IUserDAO{
	
	private ConnectionFactory cf = ConnectionFactory.getConnectionFactory();

	
	public User findUserByUsernameAndPassword(String username, String password) throws UserNotFoundException, InternalErrorException{
		
		
		Connection conn = cf.getConnection();
		try {
			String sql = "select * from projectOne.ers_users where \"ers_username\" = ? and \"ers_password\" = ?;";
			PreparedStatement getUser = conn.prepareStatement(sql);
			getUser.setString(1, username);
			getUser.setString(2, password);

			
			ResultSet res = getUser.executeQuery();
			if(res.next()) {
				User u = new User();
				u.setUsers_id(res.getInt("ers_users_id"));
				u.setUsername(res.getString("ers_username"));
				u.setPassword(res.getString("ers_password"));
				u.setFirst_name(res.getString("user_first_name"));
				u.setLast_name(res.getString("user_last_name"));
				u.setEmail(res.getString("user_email"));
				u.setUser_role(res.getString("user_role"));
	
				
				getUser.executeQuery();


				return u;
			
			}else {
				throw new UserNotFoundException();
			}
	
}catch(SQLException e) {
	e.printStackTrace();
	throw new InternalErrorException();
	
}finally {
	cf.releaseConnection(conn);
}		
	}	
	
}
