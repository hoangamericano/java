package furama_view_controller.model;

public class Villa {
	private Integer idVilla;
	private String nameVilla;
	private Double area;
	private Double rentalCost;
	private Integer person;
	private String roomStandards;
	private Double areaSwimmingPool;
	private Integer floors;
	public Villa() {};
	public Villa(String nameVilla,Double area,
			Double rentalCost,Integer person,String roomStandards,
			Double areaSwimmingPool,Integer floor) {
		this.nameVilla=nameVilla;
		this.rentalCost=rentalCost;
		this.person=person;
		this.roomStandards=roomStandards;
		this.areaSwimmingPool=areaSwimmingPool;
		this.floors=floors;
		
	}
	public Villa(Integer idVilla,String nameVilla,Double area,
			Double rentalCost,Integer person,String roomStandards,
			Double areaSwimmingPool,Integer floor) {
		this.idVilla=idVilla;
		this.nameVilla=nameVilla;
		this.rentalCost=rentalCost;
		this.person=person;
		this.roomStandards=roomStandards;
		this.areaSwimmingPool=areaSwimmingPool;
		this.floors=floors;
	}
	public Integer getIdVilla() {
		return idVilla;
	}
	public void setIdVilla(Integer idVilla) {
		this.idVilla = idVilla;
	}
	public String getNameVilla() {
		return nameVilla;
	}
	public void setNameVilla(String nameVilla) {
		this.nameVilla = nameVilla;
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
	public Double getAreaSwimmingPool() {
		return areaSwimmingPool;
	}
	public void setAreaSwimmingPool(Double areaSwimmingPool) {
		this.areaSwimmingPool = areaSwimmingPool;
	}
	public Integer getFloors() {
		return floors;
	}
	public void setFloors(Integer floors) {
		this.floors = floors;
	}
	@Override
	public String toString() {
		return "Villa [idVilla=" + idVilla + ", nameVilla=" + nameVilla + ", area=" + area + ", rentalCost="
				+ rentalCost + ", person=" + person + ", roomStandards=" + roomStandards + ", areaSwimmingPool="
				+ areaSwimmingPool + ", floors=" + floors + "]";
	}
	
}
