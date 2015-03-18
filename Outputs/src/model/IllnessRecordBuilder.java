package model;

import java.util.ArrayList;
import java.sql.Date;

public class IllnessRecordBuilder 
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
    private PhysicalExam pExam;
    private ArrayList<FollowUpRecord> followup;
    private IllnessRecord illnessRecord;
    
    public IllnessRecordBuilder(String caseNumber, String patientID, String physicianID, String illnessName, String type, /*String diagnostics, String therapeutics,*/ String dateTaken, String comebackDate)
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
        this.illnessRecord = new IllnessRecord(caseNumber, patientID, physicianID, illnessName, type, /*String diagnostics, String therapeutics,*/ dateTaken, comebackDate);
    }
    
    public void addPhysicalExam(PhysicalExam pExam)
    {
        illnessRecord.addPart(pExam, "PhysicalExam");        
    }
    
    public IllnessRecord build()
    {
        return illnessRecord;
    }
}
