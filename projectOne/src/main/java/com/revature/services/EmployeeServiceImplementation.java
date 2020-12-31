package com.revature.services;

import java.sql.SQLException;

import com.revature.exceptions.InternalErrorException;
import com.revature.exceptions.UserNotFoundException;
import com.revature.models.Reimbursement;
import com.revature.repositories.ReimbursementDAO;

public class EmployeeServiceImplementation implements IEmployeeServices {
	
	ReimbursementDAO reimbursementDAO = new ReimbursementDAO();
	
	public Reimbursement addReimbursementRequest(Reimbursement reimbursement) throws SQLException, UserNotFoundException, InternalErrorException {
		return reimbursementDAO.addReimburesementRequest(reimbursement);
		
	}

	
}
