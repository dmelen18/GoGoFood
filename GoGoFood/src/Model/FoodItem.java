package Model;


public class FoodItem {
	String itemName;
	String comments;
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
}
