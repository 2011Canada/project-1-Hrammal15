package com.revature.repositories;

import com.revature.exceptions.InternalErrorException;
import com.revature.exceptions.UserNotFoundException;
import com.revature.models.Reimbursement;
import com.revature.models.User;

public interface IReimbursementDAO {
	
	public Reimbursement addReimburesementRequest(Reimbursement reimbursement) throws UserNotFoundException, InternalErrorException;
	public Reimbursement rejectReimburesementRequest(Reimbursement reimbursement) throws UserNotFoundException, InternalErrorException;
	public Reimbursement approveReimburesementRequest(Reimbursement reimbursement) throws UserNotFoundException, InternalErrorException;
}
