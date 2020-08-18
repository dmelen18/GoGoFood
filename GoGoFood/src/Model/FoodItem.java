package Model;


public class FoodItem {
	int id; 
	String itemName;
	String comments;
	String link;
	double itemPrice;
	
	public FoodItem(String itemName, double itemPrice) {
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.comments = "";
	}
	
	public FoodItem(String itemName, String comments, double itemPrice) {
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.comments = comments;
	}
	
	public FoodItem(int id, String itemName, double price, String link) {
		this.id = id;
		this.itemName = itemName;
		this.itemPrice = price;
		this.link = link;	
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getLink() {
		return this.link;
	}
	
	public void setLink(String l) {
		this.link = l;
	}
}
