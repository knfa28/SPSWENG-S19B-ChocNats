package model;

import java.util.ArrayList;
import java.sql.Date;
import java.util.HashMap;

public class IllnessRecord 
{
    private String caseNumber;
    private String patientID;
    private String physicianID;
    private String illnessName;
    private String type;
    private String diagnostics;
    private String therapeutics;
    private String dateTaken;
    private String comebackDate;
    private String dateModified;
    private ArrayList<FollowUpRecord> followup;
    private HashMap Parts;
    
    public IllnessRecord(String caseNumber, String patientID, String physicianID, String illnessName, String type, /*String diagnostics, String therapeutics,*/ String dateTaken, String comebackDate)
    {
        this.caseNumber = caseNumber;
        this.patientID = patientID;
        this.physicianID = physicianID;
        this.illnessName = illnessName;
        this.type = type;
        //this.diagnostics = diagnostics;
        //this.therapeutics = therapeutics;
        this.dateTaken = dateTaken;
        this.comebackDate = comebackDate;
        this.dateModified = dateTaken;
        followup = new ArrayList<FollowUpRecord>();
        Parts = new HashMap();
    }
    
    public void addPart(Part part, String instanceOf)
    {
            Parts.put(instanceOf, part);
    }
    
    public PhysicalExam getPhysicalExam()
    {
        String instance = "PhysicalExam";
        return (PhysicalExam)Parts.get(instance);
    }
    
    public String getDateModified()
    {
        return dateModified;
    }
    
    public void setDateModified(String newDate)
    {
        dateModified = newDate;
    }
    
    public String getCaseNumber()
    {
        return caseNumber;
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
    
    public String getType()
    {
        return type;
    }
    
    public String getDiagnostics()
    {
        return diagnostics;
    }
    
    public String getTherapeutics()
    {
        return therapeutics;
    }
    
    public String getDateTaken()
    {
        return dateTaken;
    }
    
    public String getComebackDate()
    {
        return comebackDate;
    }
    
    public void addFollowUpRecord(FollowUpRecord record)
    {
        followup.add(record);
    }
    
    public ArrayList<FollowUpRecord> getFollowUpRecords()
    {
        return followup;
    }
    
    
}
