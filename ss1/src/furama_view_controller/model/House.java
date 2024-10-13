package furama_view_controller.model;

public class House {
private Integer idHouse;
private String nameHouse;
private Double area;
private Double rentalCost;
private Integer person;
private String roomStandards;
private Integer floors;


public House() {};
public House(String nameHouse
		,Double area,Double rentalCost,Integer person,String roomStandards,Integer floors) {
	this.nameHouse=nameHouse;
	this.area=area;
	this.rentalCost=rentalCost;
	this.person=person;
	this.roomStandards=roomStandards;
	this.floors=floors;
}
public House(Integer idHouse,String nameHouse
		,Double area,Double rentalCost,Integer person,String roomStandards,Integer floors) {
	this.idHouse=idHouse;
	this.nameHouse=nameHouse;
	this.area=area;
	this.rentalCost=rentalCost;
	this.person=person;
	this.roomStandards=roomStandards;
	this.floors=floors;
}
public Integer getIdHouse() {
	return idHouse;
}
public void setIdHouse(Integer idHouse) {
	this.idHouse = idHouse;
}
public String getNameHouse() {
	return nameHouse;
}
public void setNameHouse(String nameHouse) {
	this.nameHouse = nameHouse;
}
public Double getArea() {
	return area;
}
public void setArea(Double area) {
	this.area = area;
}
public Double getRentalCost() {
	return rentalCost;
}
public void setRentalCost(Double rentalCost) {
	this.rentalCost = rentalCost;
}
public Integer getPerson() {
	return person;
}
public void setPerson(Integer person) {
	this.person = person;
}
public String getRoomStandards() {
	return roomStandards;
}
public void setRoomStandards(String roomStandards) {
	this.roomStandards = roomStandards;
}
public Integer getFloors() {
	return floors;
}
public void setFloors(Integer floors) {
	this.floors = floors;
}
@Override
public String toString() {
	return "House [idHouse=" + idHouse + ", nameHouse=" + nameHouse + ", area=" + area + ", rentalCost=" + rentalCost
			+ ", person=" + person + ", roomStandards=" + roomStandards + ", floors=" + floors + "]";
}

}
