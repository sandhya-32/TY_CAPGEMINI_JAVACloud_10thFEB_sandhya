package com.tyss.capgemini.controller;

import com.tyss.capgemini.DAO.UserDaoImpl;
import com.tyss.capgemini.Factory.AdminFactory;
import com.tyss.capgemini.repository.AdminRepository;
import com.tyss.capgemini.services.AdminServices;
import com.tyss.capgemini.services.UserServices;
import com.tyss.capgemini.services.UserServicesImpl;

public class MainController {
	
	public MainController() {

		super();
		AdminRepository.AdminTable();

	}

	public static void main(String[] args) {
		int count = 0;
		int usern1 = 0;
		int usern2 = 0;
		int adminn1 = 0;
		int adminn2 = 0;
		UserDaoImpl userDAOImpl = new UserDaoImpl();
		UserServices userServices = new UserServicesImpl();
		AdminServices adminServices= AdminFactory.getAdminService();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Login");
		System.out.println("1.Admin");
		System.out.println("2.User");

		while (true) {
			System.out.println("Enter Choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:

				AdminRepository.AdminTable();
				System.out.println("Enter the Adminname");
				String adminname = sc.next();
				System.out.println("Enter the Password");
				String password = sc.next();
				boolean isAdmin=adminServices.checkAdmin(adminname, password);

//				for (int i = 0; i < AdminRepository.AdminRepository.size(); i++) {
//					if ((adminname.equals(AdminRepository.AdminRepository.get(i).get("uname").toString()))
//							&& (password.equals(AdminRepository.AdminRepository.get(i).get("password")))) {
//						adminn1++;
//					} else {
//						adminn2++;
//					}
//
//				}
				System.out.println(isAdmin);
				if (isAdmin) {
					System.out.println("Proceed");
					System.out.println("1.View 2.Insert 3.Delete");

					while (true) {
						System.out.println("Enter again");
						int ch = sc.nextInt();

						switch (ch) {
						case 1:
							adminServices.getAllUsers();
							break;
						case 2:System.out.println("Title");
						      String title = sc.next();
						      System.out.println("Category");
						      String category = sc.next();
						      System.out.println("Quanity");
						      int quantity = sc.nextInt();
						      System.out.println("Price");
						      double price = sc.nextInt();
						      System.out.println("Additional_details");
						      String details = sc.next();
						      System.out.println("assetId");
						      int id = sc.nextInt();
						      double total_price=quantity*price;
						      adminServices.insertUsers(id,title,category,quantity,price,total_price,details);
							break;
						case 3:
							adminServices.delete(1);
							break;
						case 4:
							System.exit(0);
						}
					}

				} else {
					System.out.println("Not Proceed");
				}
				break;

			case 2:
				UserRepository.UserTable();
				System.out.println("Enter the Username");
				String username = sc.next();
				System.out.println("Enter the Password");
				String Password = sc.next();
				for (int i = 0; i < UserRepository.userRepository.size(); i++) {
					if ((username.equals(UserRepository.userRepository.get(i).get("uname").toString()))
							&& (Password.equals(UserRepository.userRepository.get(i).get("password")))) {
						System.out.println("Success");
						usern1++;
					} else {
						System.out.println("Failure");
						usern2++;
					}

				}
				break;
			case 3:
				System.exit(0);
			}
		}

	}

}
