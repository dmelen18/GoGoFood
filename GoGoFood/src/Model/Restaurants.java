package Model;


public class Restaurants {
	int id; 
	String restName; //restaurant name
	String link;

	
	public Restaurants(String restName) {
		this.restName = restName;
	}
	
	public Restaurants(int id, String restName, String link) {
		this.id = id;
		this.restName = restName;
		this.link = link;	
	}

	public String getRestName() {
		return restName;
	}

	public void setRestName(String restName) {
		this.restName = restName;
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
