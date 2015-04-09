package model;

import java.util.ArrayList;
import java.sql.Date;

public class IllnessRecordBuilder 
{
    private String caseNumber;
    private String patientID;
    private String physicianID;
    private String illnessName;
    private String dateTaken;
    private String comebackDate;
    private String dateModified;
    private IllnessRecord illnessRecord;
    private ArrayList<Attribute> attributes;
    
    public IllnessRecordBuilder(String caseNumber, String patientID, String physicianID, String illnessName, String dateTaken, String comebackDate)
    {
        this.caseNumber = caseNumber;
        this.patientID = patientID;
        this.physicianID = physicianID;
        this.illnessName = illnessName;
        this.dateTaken = dateTaken;
        this.comebackDate = comebackDate;
        this.dateModified = dateTaken;
        attributes = new ArrayList<Attribute>();
        this.illnessRecord = new IllnessRecord(caseNumber, patientID, physicianID, illnessName, dateTaken, comebackDate);
    }
    
    public void createPage1(/*Page 1 parameters*/)
    {
        //Create attributes for page 1
        
        //add attributes to the illness record
    }
    
    public IllnessRecord build()
    {
        return illnessRecord;
    }
}
