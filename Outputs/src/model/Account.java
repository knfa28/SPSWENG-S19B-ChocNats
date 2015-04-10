package model;

import java.util.ArrayList;

public class Account 
{
    //column names
    public static String userid_col = "employeeID";
    public static String password_col = "password";
    public static String fName_col = "firstName";
    public static String lName_col = "lastName";
    public static String type_col = "employeeType";
    public static String mobNum_col = "mobileNum";
    public static String email_col = "email";
    public static String registerDate_col = "registerDate";   
    
    private String userID;
    private String password;
    private String fName;
    private String lName;
    private String type;
    private String mobNum;
    private String email;
    private String registerDate;
    
    public Account(String  userID, String password, String fName, String lName, String type, String mobNum, String email, String registerDate)
    {
        this.userID = userID;
        this.password = password;
        this.fName = fName;
        this.lName = lName;
        this.type = type;
        this.mobNum = mobNum;
        this.email = email;
        this.registerDate = registerDate;
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
