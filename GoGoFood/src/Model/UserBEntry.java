/* 
Put name on where you contributed.

Design:Team
Code:David
Review:Samantha
Test:

*/

package Model;

public class UserBEntry {

    Integer id;
    String name;
  //  Integer phoneNumber;
    String location;
    String details;
    

    public UserBEntry( Integer id, String name, String location, String details)
    {
        this.id = id;
        this.name = name;
   //     this.phoneNumber = phoneNumber;
        this.location = location;
        this.details = details;
     
    }

    public Integer getId()
    {
        return id;
    }

    public void setId( Integer id )
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }
//    public Integer getPhoneNumber()
//    {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber( Integer phoneNumber )
//    {
//        this.phoneNumber = phoneNumber;
//    }

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

}