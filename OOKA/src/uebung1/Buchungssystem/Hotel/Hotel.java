package uebung1.Buchungssystem.Hotel;

public class Hotel {
	private Integer id;
	private String name;
	private String city;
	private Integer stars;
	private String contact;
	
	public Hotel(Integer id, String name, String city, Integer stars, String contact) {
		setId(id);
		setName(name);
		setCity(city);
		setStars(stars);
		setContact(contact);
	}
	
	public Hotel() {
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getStars() {
		return stars;
	}
	public void setStars(Integer stars) {
		this.stars = stars;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	
	@Override
	public String toString() {
		return "Hotel: " + name + "\n Ort: " + city; 
	}
}
