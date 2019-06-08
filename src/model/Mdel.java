package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entities.Entity;

public class Mdel {
	
	private String name;
	private int price;
	private String description;
	private String email;
	private int rating;
	private int maxspeed;
	private long contact;
	
	public List<Entity> findAll(ResultSet rs)
	{
		List<Entity> result = new ArrayList<Entity>();
		try {
			while(rs.next())
			{
				name = rs.getString("name");
				price = rs.getInt("price");
				description = rs.getString("description");
				email = rs.getString("email");
				rating = rs.getInt("rating");
				maxspeed = rs.getInt("max_speed");
				contact = rs.getLong("contact");
				//System.out.println(name+price+description+email+rating+maxspeed+contact);
				result.add(new Entity(name,description,price,email,rating,maxspeed,contact));
			}
		} catch (SQLException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
		
		return result;
	}
	
	public List<Entity> findPR(ResultSet rs)
	{
		List<Entity> result = new ArrayList<Entity>();
		try {
			while(rs.next())
			{
				name = rs.getString("name");
				price = rs.getInt("price");
				
				//System.out.println(name+price+description+email+rating+maxspeed+contact);
				result.add(new Entity(name,price));
			}
		} catch (SQLException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
		
		return result;
	}
}
