package entities;

public class Entity {
	
	private String name;
	private String description;
	private String email;
	private int rating;
	private int price;
	private int maxspeed;
	private long contact;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMaxspeed() {
		return maxspeed;
	}
	public void setMaxspeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

	
	
	public Entity(String name, String description,int price ,String email, int rating, int maxspeed, long contact) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
		this.email = email;
		this.rating = rating;
		this.maxspeed = maxspeed;
		this.contact = contact;
	}
	
	public Entity(String name,int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public Entity() {
		super();
	}
	
	
	
	

}
