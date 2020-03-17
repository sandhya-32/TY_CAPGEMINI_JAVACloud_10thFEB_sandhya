package com.tyss.capgemini.DAO;

import java.util.HashMap;
import java.util.Map;


import com.tyss.capgemini.respository.AdminRepository;
import com.tyss.capgeminirespository.AssetRepostitory;



public class AdminiDAOImpl implements AdminDao {
	
	public AdminDAOImpl() {
		AssetRepository.assetTable();
		
	}
	
	public boolean getAllUsers() {
		
		for (Object assets : AssetRepository.assetList) {
			System.out.println(assets);
		} 
		return false;
	}

	

	public boolean delete(Integer id) {
		
		AssetRepository.assetTable();
		if((AssetRepository.assetList).isEmpty()!=true)
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
	public boolean checkAdmin(String adminname,String password) {
		int adminn1=0;
		int adminn2=0;
		for (int i = 0; i < AdminRepository.AdminRepository.size(); i++) {
			if ((adminname.equals(AdminRepository.AdminRepository.get(i).get("uname").toString()))
					&& (password.equals(AdminRepository.AdminRepository.get(i).get("password")))) {
				adminn1++;
			} else {
				adminn2++;
			}

		}
		if (adminn1 == 1 && adminn2 < 2) {
			return true;
		}else {
			return false;
		}
		
	}


	@Override
	public boolean checkUser(String adminname, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertUsers(int id, String title, String category, int quantity, double price, double total_price,
			String details) {
		HashMap<String, Object> assetn = new HashMap<String, Object>();
		assetn.put("id",id);
		assetn.put("Title", title);
		assetn.put("category", category);
		assetn.put("Quantity", quantity);
		assetn.put("Price", price);
		assetn.put("Total_Price",total_price);
		assetn.put("Details", details);
		AssetRepository.assetList.add(assetn);
		System.out.println("Inserted Successfully");
		return false;
		
	}


}


