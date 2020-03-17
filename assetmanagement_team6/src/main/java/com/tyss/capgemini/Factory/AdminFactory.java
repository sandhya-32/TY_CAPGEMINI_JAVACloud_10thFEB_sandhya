package com.tyss.capgemini.Factory;
import com.tyss.capgemini.DAO.AdminDAO;
import com.tyss.capgemini.DAO.AdminDAOImpl;
import com.tyss.capgemini.DAO.UserDAO;
import com.tyss.capgemini.DAO.UserDAOImpl;
import com.tyss.capgemini.service.AdminServices;
import com.tyss.capgemini.service.AdminServicesImpl;
import com.tyss.capgemini.service.UserServices;
import com.tyss.capgemini.service.UserServicesImpl;
public class AdminFactory {
	
	public static AdminDAO getAdminDAO() {
		 return new AdminDAOImpl();
		 
	 } 
	 public static AdminServices getAdminService() {
		 return new AdminServicesImpl();
	 }

}
