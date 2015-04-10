package model;

import java.util.ArrayList;
import java.sql.Date;
import java.util.HashMap;

public class IllnessRecord 
{
    //column names
    public static String recordID_col = "recordID";
    public static String patientID_col = "patientID";
    public static String physicianID_col = "employeeID";
    public static String illnessName_col = "name";
    public static String dateTaken_col = "recordDate";
    public static String comebackDate_col = "checkupDate";   
    
    
    private String recordID;
    private String patientID;
    private String physicianID;
    private String illnessName;
    private String dateTaken;
    private String comebackDate;
    private String dateModified;
    private ArrayList<Attribute> attributes;
    
    public IllnessRecord(String recordID, String patientID, String physicianID, String illnessName,String dateTaken, String comebackDate)
    {
        this.recordID = recordID;
        this.patientID = patientID;
        this.physicianID = physicianID;
        this.illnessName = illnessName;
        //this.diagnostics = diagnostics;
        //this.therapeutics = therapeutics;
        this.dateTaken = dateTaken;
        this.comebackDate = comebackDate;
        this.dateModified = dateTaken;
        attributes = new ArrayList<Attribute>();
    }
    
    public void addAttribute(Attribute newAttribute)
    {
        attributes.add(newAttribute);
    }
    
    public ArrayList<Attribute> getAttributesByPage(int pageNum)
    {
        ArrayList<Attribute> result = new ArrayList<Attribute>();
        for(int i = 0; i < attributes.size(); i ++)
        {
            if(attributes.get(i).getPageNum() == pageNum)
            {
                result.add(attributes.get(i));
            }
        }
        return result;
    }
    
    public ArrayList<Attribute> getAttributes()
    {
        return attributes;
    }
    
    public String getDateModified()
    {
        return dateModified;
    }
    
    public void setDateModified(String newDate)
    {
        dateModified = newDate;
    }

    public String getRecordID() {
        return recordID;
    }

    public void setRecordID(String recordID) {
        this.recordID = recordID;
    }
    
    
    public String getPhysicianID()
    {
        return physicianID;
    }
    
    public String getPatientID()
    {
        return patientID;
    }
    
    public String getIllnessName()
    {
        return illnessName;
    }
    
    public String getDateTaken()
    {
        return dateTaken;
    }
    
    public String getComebackDate()
    {
        return comebackDate;
    }

    
    
}
