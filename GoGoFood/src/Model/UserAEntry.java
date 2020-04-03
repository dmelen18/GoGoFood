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
    Integer phoneNumber;
    
 

    public UserAEntry( Integer id, String name, Integer phoneNumber )
    {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
     
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
    
    public Integer getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber( Integer phoneNumber )
    {
        this.phoneNumber = phoneNumber;
    }


}