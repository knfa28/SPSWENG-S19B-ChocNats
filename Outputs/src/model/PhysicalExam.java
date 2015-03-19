package model;

import java.sql.Date;
import java.util.HashMap;

public class PhysicalExam implements Part
{
    private String patientID;
    private String caseNumber;
    private Date recordDate;
    private float height;
    private float weight;
    private float temperature;
    private String bloodPressure;
    /*private float heartRate;
    private float respiratoryRate;
    private float headCirc;
    private float chestCirc;*/
    private HashMap findings;
    
    public PhysicalExam(String patientID, String caseNumber, Date recordDate, float height, float weight, float temperature, String bloodPressure)
    {
        this.patientID = patientID;
        this.caseNumber = caseNumber;
        this.recordDate = recordDate;
        this.height = height;
        this.weight = weight;
        this.temperature = temperature;
        this.bloodPressure = bloodPressure;
        findings = new HashMap();
    }
    
    public void addFinding(String bodyPart, String finding)
    {
        findings.put(bodyPart, finding);
    }
    
    public String getFinding(String bodyPart)
    {
        return findings.get(bodyPart) + "";
    }
    
    public String getPatientID()
    {
        return patientID;
    }
    
    public String getCaseNumber()
    {
        return caseNumber;
    }
    
    public Date getRecordDate()
    {
        return recordDate;
    }
    
    public float getHeight()
    {
        return height;
    }
    
    public float getWeight()
    {
        return weight;
    }
    public float getTemperature()
    {
        return temperature;
    }
    
    public String getBloodPressure()
    {
        return bloodPressure;
    }
}
