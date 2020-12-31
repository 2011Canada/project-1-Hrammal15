package com.revature.services;

import com.revature.exceptions.InternalErrorException;
import com.revature.exceptions.UserNotFoundException;
import com.revature.models.Reimbursement;
import com.revature.repositories.IReimbursementDAO;
import com.revature.repositories.ReimbursementDAO;

public class ManagerServiceImplementation implements IManagerServices {
	
	IReimbursementDAO reimbursementDAO = new ReimbursementDAO();

	@Override
	public void acceptReimbursementRequest(Reimbursement reimbursement) throws UserNotFoundException, InternalErrorException {
		reimbursementDAO.approveReimburesementRequest(reimbursement);
		
	}

	@Override
	public void rejectReimbursementRequest(Reimbursement reimbursement) throws UserNotFoundException, InternalErrorException {
		reimbursementDAO.rejectReimburesementRequest(reimbursement);
		
	}
	
	

}
