package furama_view_controller.repository;

import java.util.ArrayList;
import java.util.List;

import furama_view_controller.model.House;

public class HouseRepository {
	public static List<House> houseList= new ArrayList<>();
	
 static {
	 houseList.add(new House (1,"Nhà 01",200.0,1000.0,4,"Tiêu chuẩn",3) );
	 houseList.add(new House (2,"Nhà 02",200.0,1000.0,4,"Tiêu chuẩn",3) );
	 houseList.add(new House (3,"Nhà 03",200.0,1000.0,4,"Tiêu chuẩn",3) );
 };
public static void main(String[] args) {
//	List<House> houseList=new ArrayList();
	System.out.println("1");
	System.out.println(houseList.size());
	for(int i=0;i<=houseList.size();i++) {
		House house=new House();
		
		System.out.println(houseList.toString());
	
	};
}
}
