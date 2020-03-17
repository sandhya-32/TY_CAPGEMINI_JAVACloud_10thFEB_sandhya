package com.tyss.capgemini.services;

import com.capgemini.assetmaagementsystem.DAO.UserDAO;
import com.capgemini.assetmaagementsystem.DAO.UserDAOImpl;
import com.capgemini.assetmaagementsystem.factory.UserFactory;

public class UserServicesImpl {
	
	private UserDAO dao= UserFactory.getUserDAO();

	public boolean getAllUsers() {
		UserDAOImpl userDAO = new UserDAOImpl();
		return dao.getAllUsers();
	}
	public UserServicesImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	public boolean insertUsers(String title1,String category,int quantity,int price) {
		UserDAOImpl userDAO = new UserDAOImpl();
		return dao.insertUsers(title1, category, quantity, price);
	}
	public boolean delete(Integer id) {
		UserDAOImpl userDAO = new UserDAOImpl();
		return dao.delete(id);
	}
	public boolean delete(String category) {
		// TODO Auto-generated method stub
		return false;
	}

}
