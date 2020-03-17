package com.tyss.capgemini.repository;

import java.util.ArrayList;
import java.util.HashMap;

import com.capgemini.assetmaagementsystem.bean.UserAdmin;

public class UserRepository {
	
		public static ArrayList<HashMap<String, Object>> userRepository = new ArrayList<HashMap<String, Object>>();

		public static void UserTable() {

			HashMap<String, Object> user3 = new HashMap<String, Object>();
			UserAdmin userAdmin3 = new UserAdmin(3, "Divya Shree", "divyaShrere@gmail.com", "divyaShree", "divya@123",
					"Manager");
			user3.put("userid", userAdmin3.getId());
			user3.put("name", userAdmin3.getName());
			user3.put("email", userAdmin3.getEmail());
			user3.put("uname", userAdmin3.getUsername());
			user3.put("password", userAdmin3.getPassword());
			user3.put("Role", userAdmin3.getRole());
			userRepository.add(user3);

			HashMap<String, Object> user4 = new HashMap<String, Object>();
			UserAdmin userAdmin4 = new UserAdmin(4, "sandhya", "sandhya@gmail.com", "sandhya", "sandhya@123", "Manager");
			user4.put("userid", userAdmin4.getId());
			user4.put("name", userAdmin4.getName());
			user4.put("email", userAdmin4.getEmail());
			user4.put("uname", userAdmin4.getUsername());
			user4.put("password", userAdmin4.getPassword());
			user4.put("Role", userAdmin4.getRole());
			userRepository.add(user4);

			HashMap<String, Object> user5 = new HashMap<String, Object>();
			UserAdmin userAdmin5 = new UserAdmin(5, "Abi", "Abi@gmail.com", "abi", "Abi@123", "Manager");
			user5.put("userid", userAdmin5.getId());
			user5.put("name", userAdmin5.getName());
			user5.put("email", userAdmin5.getEmail());
			user5.put("uname", userAdmin5.getUsername());
			user5.put("password", userAdmin5.getPassword());
			user5.put("Role", userAdmin5.getRole());
			userRepository.add(user5);

		}

	}

}
