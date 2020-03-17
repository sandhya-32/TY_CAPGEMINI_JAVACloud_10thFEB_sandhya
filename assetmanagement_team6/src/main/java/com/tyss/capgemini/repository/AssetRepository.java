package com.tyss.capgemini.repository;

public class AssetRepository {
	
	public static HashSet<HashMap<String, Object>> assetList = new HashSet<HashMap<String, Object>>();

	public static void assetTable() {

		HashMap<String, Object> asset1 = new HashMap<String, Object>();
		Assets assets1 = new Assets(1,"Bike","Enfield",9,18900,1,"Good");
		asset1.put("Id",assets1.getId());
		asset1.put("Title", assets1.getTitle());
		asset1.put("category", assets1.getCategory());
		asset1.put("Quantity", assets1.getQuantity());
		asset1.put("Price", assets1.getPrice());
		asset1.put("Total_Price",assets1.getPrice() * assets1.getQuantity());
		asset1.put("Additional_Details",assets1.getAdditional_details());
		assetList.add(asset1);

		HashMap<String, Object> asset2 = new HashMap<String, Object>();
		Assets assets2 = new Assets(2,"Car","BMW",1,350000,1,"Normal");
		asset2.put("Id",assets2.getId());
		asset2.put("Title", assets2.getTitle());
		asset2.put("category", assets2.getCategory());
		asset2.put("Quantity", assets2.getQuantity());
		asset2.put("Price", assets2.getPrice());
		asset2.put("Total_Price",assets2.getPrice() * assets2.getQuantity());
		asset2.put("Additional_Details",assets2.getAdditional_details());
		assetList.add(asset2);

		HashMap<String, Object> asset3 = new HashMap<String, Object>();
		Assets assets3 = new Assets(3,"Bus","bigone",3,330000,1,"Bad");
		asset3.put("Id",assets3.getId());
		asset3.put("Title",assets3.getTitle() );
		asset3.put("category", assets3.getCategory());
		asset3.put("Quantity", assets3.getQuantity());
		asset3.put("Price", assets3.getPrice());
		asset3.put("Total_Price",assets3.getPrice() * assets3.getQuantity());
		asset3.put("Additional_Details",assets3.getAdditional_details());
		assetList.add(asset3);

		HashMap<String, Object> asset4 = new HashMap<String, Object>();
		Assets assets4 = new Assets(4,"Lorry","Enfield",2,32000,1,"Good");
		asset4.put("Id",assets4.getId());
		asset4.put("Title", assets4.getTitle());
		asset4.put("category", assets4.getCategory());
		asset4.put("Quantity", assets4.getQuantity());
		asset4.put("Price", assets4.getPrice());
		asset4.put("Total_Price",assets4.getPrice() * assets4.getQuantity());
		asset4.put("Additional_Details",assets4.getAdditional_details());
		assetList.add(asset4);

		HashMap<String, Object> asset5 = new HashMap<String, Object>();
		Assets assets5 = new Assets(5,"Flight","Kingfisher",6,100000,1,"BAD");
		asset5.put("Id",assets5.getId());
		asset5.put("Title",assets5.getTitle() );
		asset5.put("category", assets5.getCategory());
		asset5.put("Quantity", assets5.getQuantity());
		asset5.put("Price", assets5.getPrice());
		asset5.put("Total_Price",assets5.getPrice() * assets5.getQuantity());
		asset5.put("Additional_Details",assets5.getAdditional_details());
		assetList.add(asset5);

	}


}

}
