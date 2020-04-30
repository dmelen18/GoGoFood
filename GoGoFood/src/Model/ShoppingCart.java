package Model;

import java.util.ArrayList;

public class ShoppingCart {
	private Integer id;
	private String name;
	private String phoneNumber;
	private String location;
	private ArrayList<FoodItem> items;
	
	public ShoppingCart(Integer id, String name, String phoneNumber, String location) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.location = location;
		items = new ArrayList<FoodItem>();
	}
	
	public ShoppingCart(Integer id, String name, String phoneNumber, String location, ArrayList<FoodItem> items) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.location = location;
		this.items = items;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public ArrayList<FoodItem> getItems() {
		return items;
	}
	
	public void addItem(FoodItem i)
	{
		items.add(i);
	}
	public void setItems(ArrayList<FoodItem> items) {
		this.items = items;
	}
	public String printItems() {
		StringBuilder sb = new StringBuilder();
		double sum = 0;
		for(FoodItem f: this.items) {
			sum += f.getItemPrice();
			sb.append(f.itemName + ", \n");
		}
		sb.append("\nTotal Price: " + sum);
		return sb.toString();
	}

	
	
	
	
	
}
