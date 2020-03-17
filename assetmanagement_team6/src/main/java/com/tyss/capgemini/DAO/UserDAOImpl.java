package com.tyss.capgemini.DAO;

import com.tyss.capgemini.DAO.*;
import com.tyss.capgemini.Factory.UserFactory;
import com.tyss.capgemini.repository.AssetRepository;
public class UserDAOImpl implements UserDAO{
	
	public  boolean checkUser(String adminname,String password){
//		for (int i = 0; i < AdminRepository.AdminRepository.size(); i++) {
//			if ((adminname.equals(AdminRepository.AdminRepository.get(i).get("uname").toString()))
//					&& (password.equals(AdminRepository.AdminRepository.get(i).get("password")))) {
//				System.out.println("Success");
//			} else {
//				System.out.println("Failure");
//			}
//		}
//		return false;
//		
//	}
	public UserDAOImpl() {
		AssetRepository.assetTable();
		
	}
	
	public boolean getAllUsers() {
		
		for (Object assets : AssetRepostitory.assetList) {
			System.out.println(assets);
		} 
		return false;
	}

	public boolean insertUsers(String title1, String category, int quantity, int price) {
		HashMap<String, Object> assetn = new HashMap<String, Object>();
		assetn.put("Title", title1);
		assetn.put("category", category);
		assetn.put("Quantity", quantity);
		assetn.put("Price", price);
		AssetRepostitory.assetList.add(assetn);
		System.out.println("Inserted Successfully");
		return false;

	}

	public boolean delete(Integer id) {
		
		AssetRepostitory.assetTable();
		if((AssetRepostitory.assetList).isEmpty()!=true)
		{
			for(int i=0;i<AssetRepostitory.assetList.size()-1;i++)			{
//				if(AssetRepostitory.assetList.get(i))
				if(id.equals(( ((HashMap<String, Object>) ((Map<String, Object>) AssetRepostitory.assetList).get(i)).get("id")))) {
//					int index = i;
					AssetRepostitory.assetList.remove("id");
					System.out.println("Deleted Successfully");
				}
			}
			System.out.println("Deleted");
		}else
		{
			System.out.println("Not deleted");
		}
//		
		return false;

	}

	@Override
	public boolean checkAdmin(String adminname, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkUser(String adminname, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertUsers(int id, String title, String category, int quantity, double price, double total_price,
			String details) {
		// TODO Auto-generated method stub
		return false;
	}

}

}
