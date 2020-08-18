/* 
Put name on where you contributed.

Design:
Code:
Test:
Review:

*/
package Model;

import java.util.Date;

public class UserAEntry {


    Integer id;
    String name;
  //  Integer phoneNumber;
    String location;
    String details;
    

    public UserAEntry( Integer id, String name, String location, String details)
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