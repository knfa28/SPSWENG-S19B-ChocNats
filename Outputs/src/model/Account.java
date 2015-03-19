package model;

import java.util.ArrayList;

public class Account 
{
    private String userID;
    private String password;
    private String fName;
    private String lName;
    private String type;
    private String mobNum;
    private String email;
    private String registerDate;
    private ArrayList<String> specializations;
    
    public Account( String userID, String password, String fName, String lName, String type, String mobNum, String email, String registerDate)
    {
        this.userID = userID;
        this.password = password;
        this.fName = fName;
        this.lName = lName;
        this.type = type;
        this.mobNum = mobNum;
        this.email = email;
        this.registerDate = registerDate;
        
        this.specializations = new ArrayList<String>();
    }
    
    public String getUserID()
    {
        return userID;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public String getFName()
    {
        return fName;
    }
    
    public String getLName()
    {
        return lName;
    }
    
    public String getType()
    {
        return type;
    }
    
    public void addSpecialization(String specialization)
    {
        specializations.add(specialization);
    }
    
    public ArrayList<String> getSpecializations()
    {
        return specializations;
    }
    
    public String getMobNum()
    {
        return mobNum;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public String getRegisterDate()
    {
        return registerDate;
    }
}
