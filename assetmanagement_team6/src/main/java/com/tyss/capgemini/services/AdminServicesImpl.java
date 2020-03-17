package com.tyss.capgemini.services;
import com.tyss.capgemini.DAO.AdminDAO;

import com.tyss.capgemini.Factory.AdminFactory;


public class AdminServicesImpl {
	
	private AdminDAO admindao= AdminFactory.getAdminDAO();

	public boolean getAllUsers() {
		
		return admindao.getAllUsers();
	}
	
	public boolean delete(Integer id) {
	
		return admindao.delete(id);
	}
	public boolean checkAdmin(String adminname,String password)
	{
		return admindao.checkAdmin(adminname,password);
	}

	@Override
	public boolean checkUser() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean AdminUser(String adminname, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertUsers(int id, String title, String category, int quantity, double price, double total_price,
			String details) {
		return admindao.insertUsers(id,title,category,quantity,price,total_price,details);
		
	}

}
