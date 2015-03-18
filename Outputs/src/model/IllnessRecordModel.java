package model;

import db_connection.MySQLConnector;
import java.sql.ResultSet;
import java.sql.Date;

public class IllnessRecordModel 
{        
        public static boolean  add(IllnessRecord record) {
        MySQLConnector.executeStatement("INSERT INTO illness_record " +
                         "VALUES (\"" +
                         record.getCaseNumber() + "\",\"" +
                         record.getPatientID() + ",\"" +
                         record.getPhysicianID() + "\",\"" +
                         record.getIllnessName() + "\",\"" +
                         record.getType() + "\",\"" +
                         //record.getDiagnostics() + "\",\"" +
                         //record.getTherapeutics() + "\",\"" +
                         record.getDateTaken() + "\",\"" +
                         record.getDateModified() + "\",\"" +
                         record.getComebackDate() + "\")");
        
        return true;
    }
    public static boolean set(IllnessRecord record) {        
        MySQLConnector.executeStatement("UPDATE illness_record SET patientID=\'" + record.getPatientID() +
                         "\', employeeID=\'" + record.getPhysicianID() +
                         "\', name=\'" + record.getIllnessName() +
                         "\', type=\'" + record.getType() +
                         //"\', diagnostics=\'" + record.getDiagnostics() +
                         //"\', therapeutics=\'" + record.getTherapeutics() +
                         "\', recordDate=\'" + record.getDateTaken() +
                         "\', modifyDate=\'" + record.getDateModified() +
                         "\', checkupDate=\'" + record.getComebackDate() + "\'" +
                         " WHERE caseNum = \'" + record.getCaseNumber() + "\'");
        
        return true;
    }

   
    public static boolean delete(String caseNumber) {   
        MySQLConnector.executeStatement("DELETE FROM illness_record WHERE caseNum = \"" + caseNumber + "\"");
        return true;
    }

    
    public static IllnessRecord get(String caseNumber) {
        ResultSet Records = MySQLConnector.executeQuery("SELECT * FROM illness_record WHERE caseNum = \"" + caseNumber + "\"");
        ResultSet followupRecords = MySQLConnector.executeQuery("SELECT * FROM followup_form WHERE caseNum = \"" + caseNumber + "\"");
        IllnessRecord retRecord;
        try{
            if(Records.next()){
                retRecord = new IllnessRecord(Records.getString("caseNum"),
                                 Records.getString("patientID"),
                                 Records.getString("employeeID"),
                                 Records.getString("name"),
                                 Records.getString("type"),
                                 //Records.getString("diagnostics"),
                                 //Records.getString("therapeutics"),
                                 Records.getString("recordDate"),
                                 //Records.getDate("modifyDate"),
                                 Records.getString("checkupDate"));
                retRecord.setDateModified(Records.getString("modifyDate"));
                while(followupRecords.next())
                {
                    retRecord.addFollowUpRecord(new FollowUpRecord(followupRecords.getString("caseNum")
                                                                  ,followupRecords.getString("patientID")
                                                                  ,followupRecords.getString("employeeID")
                                                                  ,followupRecords.getString("requestDate")));
                }
            }
 
        }
        catch(Exception e){
            e.printStackTrace();
        }

        
        return null;
    }
    
    public static void addFollowUpRecord(String caseNumber, FollowUpRecord record)
    {
        MySQLConnector.executeStatement("INSERT INTO followup_form " +
                         "VALUES (" +
                         record.getCaseNumber() + ",\"" +
                         record.getPatientID() + ",\"" +
                         record.getPhysicianID() + "\",\"" +
                         /*record.getDateTaken() + "\",\"" +
                         record.getMedications() + "\",\"" +
                         record.getLastWorkingImpression() + "\",\"" +
                         record.getPresentWorkingImpression() + "\",\"" +
                         record.getDiagnostics() + "\",\"" +
                         record.getTherapeutics() + "\",\"" +*/
                         record.getDateTaken() + "\")");
    }
}
