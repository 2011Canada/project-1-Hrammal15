package com.revature.services;

import com.revature.exceptions.InternalErrorException;
import com.revature.exceptions.UserNotFoundException;
import com.revature.models.Reimbursement;

public interface IManagerServices {
	
	public void acceptReimbursementRequest(Reimbursement reimbursement) throws UserNotFoundException, InternalErrorException;
	public void rejectReimbursementRequest(Reimbursement reimbursement)throws UserNotFoundException, InternalErrorException;

}
