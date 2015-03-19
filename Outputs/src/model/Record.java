package model;

public class Record {
    private String caseNum;
    private String physicianID;
    private String patientID;
    private String type;
    private String[] recordDate;
    private String[] modifyDate;
    private String[] checkupDate;
    
    public Record(String caseNum, String physicianID, String patientID, String type){
        this.caseNum = caseNum;
        this.physicianID = physicianID;
        this.patientID = patientID;
        this.type = type;
    }
    
    public void setRecordDate(String recordDate){
        this.recordDate = recordDate.split("-");
    }
    
    public void setmodifyDate(String modifyDate){
        this.modifyDate = modifyDate.split("-");
    }
    
    public void setCheckupDate(String checkupDate){
        this.checkupDate = checkupDate.split("-");
    }
    
    public String getCaseNum(){
        return caseNum;
    }
    
    public String getPhysicianID(){
        return physicianID;
    }
    
    public String getPatientID(){
        return patientID;
    }
    
    public String getIllness(){
        return type;
    }
}
