package model;

import java.sql.Date;

public class PatientRecord 
{
    private String patientID;
    private String recordDate;
    private String dateModified;
    private String fName;
    private String lName;
    private int age;
    private char sex;
    private String birthday;
    private String birthplace;
    private String status;
    private String referredBy;
    private String street;
    private String city;
    private String region;
    private String contactNum;
    private String email;
    
    public PatientRecord(String patientID, String dateModified, String recordDate, String fName, String lName, int age, char sex, String birthday, String birthplace, String status, String referredBy, String street, String city, String region, String contactNum, String email)
    {
        this.patientID = patientID;
        this.dateModified = dateModified;
        this.recordDate = recordDate;
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.sex = sex;
        this.birthday = birthday;
        this.birthplace = birthplace;
        this.status = status;
        this.referredBy = referredBy;
        this.street = street;
        this.city = city;
        this.region = region;
        this.contactNum = contactNum;
        this.email = email;
        
    }
    
    public String getPatientID()
    {
        return patientID;
    }
    
    public String getDateModified()
    {
        return dateModified;
    }
    
    public String getRecordDate()
    {
        return recordDate;
    }
    
    public String getFName()
    {
        return fName;
    }
    
    public String getLName()
    {
        return lName;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public char getSex()
    {
        return sex;
    }
    
    public String getBirthday()
    {
        return birthday;
    }
    
    public String getStatus()
    {
        return status;
    }
    
    public String getBirthPlace()
    {
        return birthplace;
    }
    
    public String getReferredBy()
    {
        return referredBy;
    }
    
    public String getStreet()
    {
        return street;
    }
    
    public String getCity()
    {
        return city;
    }
    
    public String getRegion()
    {
        return region;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public String getContactNum()
    {
        return contactNum;
    }
}
