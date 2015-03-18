package model;

import java.sql.Date;

public class FollowUpRecord 
{
    private String caseNumber;
    private String patientID;
    private String physicianID;
    private String dateTaken;
    //private String medications;
    //private String lastWorkingImpression;
    //private String presentWorkingImpression;
    //private String therapeutics;
    //private String diagnostics;
    //private Date followupDate;
    
    public FollowUpRecord(String caseNumber, String patientID, String physicianID, String dateTaken/*, String medications, String lastWorkingImpression, String presentWorkingImpression, String therapeutics, String diagnostics, Date followupDate*/)
    {
        this.caseNumber = caseNumber;
        this.patientID = patientID;
        this.physicianID = physicianID;
        this.dateTaken = dateTaken;
        /*this.medications = medications;
        this.lastWorkingImpression = lastWorkingImpression;
        this.presentWorkingImpression = presentWorkingImpression;
        this.therapeutics = therapeutics;
        this.diagnostics = diagnostics;
        this.followupDate = followupDate;*/
    }
    
    public String getCaseNumber()
    {
        return caseNumber;
    }
    
    public String getPatientID()
    {
        return patientID;
    }
    
    public String getPhysicianID()
    {
        return physicianID;
    }
    
    public String getDateTaken()
    {
        return dateTaken;
    }
    
    /*public String getMedications()
    {
        return medications;
    }
    
    public String getLastWorkingImpression()
    {
        return lastWorkingImpression;
    }
    
    public String getPresentWorkingImpression()
    {
        return presentWorkingImpression;
    }
    
    public String getTherapeutics()
    {
        return therapeutics;
    }
    
    public String getDiagnostics()
    {
        return diagnostics;
    }
    
    public Date getFollowupDate()
    {
        return followupDate;
    }*/
    
    
    
            
}
