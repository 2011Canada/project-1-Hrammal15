package com.revature.services;

import java.util.List;

import com.revature.exceptions.InternalErrorException;
import com.revature.exceptions.UserNotFoundException;
import com.revature.models.Reimbursement;
import com.revature.models.Types;
import com.revature.repositories.IManagerDAO;
import com.revature.repositories.IReimbursementDAO;
import com.revature.repositories.ManagerDAO;
import com.revature.repositories.ReimbursementDAO;

public class ManagerServiceImplementation implements IManagerServices {
	
	IReimbursementDAO reimbursementDAO = new ReimbursementDAO();
	IManagerDAO managerDAO = new ManagerDAO();

	@Override
	public void acceptReimbursementRequest(Reimbursement reimbursement) throws UserNotFoundException, InternalErrorException {
		reimbursementDAO.approveReimburesementRequest(reimbursement);
		
	}

	@Override
	public void rejectReimbursementRequest(Reimbursement reimbursement) throws UserNotFoundException, InternalErrorException {
		reimbursementDAO.rejectReimburesementRequest(reimbursement);
		
	}
	
	public List<Reimbursement> viewFilteredList(Types type) throws InternalErrorException {
		return managerDAO.filterList(type);
	}
	
	public List<Reimbursement> viewAll() throws InternalErrorException {
		return managerDAO.viewAll();
	}
	
	

}
