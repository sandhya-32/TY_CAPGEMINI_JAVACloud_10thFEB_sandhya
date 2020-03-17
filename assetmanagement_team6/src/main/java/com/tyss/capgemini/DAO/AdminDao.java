package com.tyss.capgemini.DAO;

public class AdminDao {
	
	public interface AdminDAO {
		public  boolean getAllUsers();
		public boolean insertUsers(int id,String title,String category,int quantity,double price,double total_price,String details);
		public boolean delete(Integer id);
		public boolean checkAdmin(String adminname,String password);
		public boolean checkUser(String adminname,String password);
	}

}
