package com.tyss.capgemini.repository;

import java.util.ArrayList;
import java.util.HashMap;

public class AdminRepository {
	
	public static ArrayList<HashMap<String, Object>> AdminRepository = new ArrayList<HashMap<String, Object>>();

	public static void AdminTable() {

		HashMap<String, Object> user1 = new HashMap<String, Object>();
		UserAdmin userAdmin1 = new UserAdmin(1, "Abishek", "Abishek@gmail.com", "abishek", "abishek@123", "Admin");
		user1.put("userid", userAdmin1.getId());
		user1.put("name", userAdmin1.getName());
		user1.put("email", userAdmin1.getEmail());
		user1.put("uname", userAdmin1.getUsername());
		user1.put("password", userAdmin1.getPassword());
		user1.put("Role", userAdmin1.getRole());
		AdminRepository.add(user1);

		HashMap<String, Object> user2 = new HashMap<String, Object>();
		UserAdmin userAdmin2 = new UserAdmin(2, "mano", "mano@gmail.com", "mano", "mano@123", "Admin");
		user2.put("userid", userAdmin2.getId());
		user2.put("name", userAdmin2.getName());
		user2.put("email", userAdmin2.getEmail());
		user2.put("uname", userAdmin2.getUsername());
		user2.put("password", userAdmin2.getPassword());
		user2.put("Role", userAdmin2.getRole());
		AdminRepository.add(user2);

	}
	}


