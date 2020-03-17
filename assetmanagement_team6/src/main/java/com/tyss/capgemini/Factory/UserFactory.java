package com.tyss.capgemini.Factory;
import com.tyss.capgemini.DAO.UserDAO;
import com.tyss.capgemini.DAO.UserDAOImpl;
import com.tyss.capgemini.service.UserServices;
import com.tyss.capgemini.service.UserServicesImpl;
public class UserFactory {
	
	public static UserDAO getUserDAO() {
		 return new UserDAOImpl();
		 
	 } 
	 public static UserServices getUserService() {
		 return new UserServicesImpl();
	 }

}
