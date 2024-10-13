package furama_view_controller.model;

public class Room {
	private Integer idRoom;
	private String nameRoom;
	private Double area;
	private Double rentalCost;
	private Integer person;
	private String accompanyService;
	public Room() {};
	public Room(String nameRoom,Double area,Double rentalCost,
			Integer person, String accompanyService ) {
		this.nameRoom=nameRoom;
		this.area=area;
		this.rentalCost=rentalCost;
		this.person=person;
		this.accompanyService=accompanyService;
	}
	public Room(Integer idRoom,String nameRoom,Double area,Double rentalCost,
			Integer person, String accompanyService ) {
		this.idRoom=idRoom;
		this.nameRoom=nameRoom;
		this.area=area;
		this.rentalCost=rentalCost;
		this.person=person;
		this.accompanyService=accompanyService;
	}
	public Integer getIdRoom() {
		return idRoom;
	}
	public void setIdRoom(Integer idRoom) {
		this.idRoom = idRoom;
	}
	public String getNameRoom() {
		return nameRoom;
	}
	public void setNameRoom(String nameRoom) {
		this.nameRoom = nameRoom;
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
	public String getAccompanyService() {
		return accompanyService;
	}
	public void setAccompanyService(String accompanyService) {
		this.accompanyService = accompanyService;
	}
	@Override
	public String toString() {
		return "Room [idRoom=" + idRoom + ", nameRoom=" + nameRoom + ", area=" + area + ", rentalCost=" + rentalCost
				+ ", person=" + person + ", accompanyService=" + accompanyService + "]";
	}
	
}
