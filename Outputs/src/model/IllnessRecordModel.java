package model;

import db_connection.MySQLConnector;
import java.sql.ResultSet;
import java.sql.Date;

public class IllnessRecordModel 
{        
        public static boolean  add(IllnessRecord record) {
        MySQLConnector.executeStatement("INSERT INTO illness_record " +
                         "VALUES (\"" +
                         record.getRecordID() + "\",\"" +
                         record.getPatientID() + ",\"" +
                         record.getPhysicianID() + "\",\"" +
                         record.getIllnessName() + "\",\"" +
                         record.getDateTaken() + "\",\"" +
                         record.getDateModified() + "\",\"" +
                         record.getComebackDate() + "\")");
        
        return true;
    }
    public static boolean set(IllnessRecord record) {        
        MySQLConnector.executeStatement("UPDATE illness_record SET patientID=\'" + record.getPatientID() +
                         "\', employeeID=\'" + record.getPhysicianID() +
                         "\', name=\'" + record.getIllnessName() +
                         "\', recordDate=\'" + record.getDateTaken() +
                         "\', modifyDate=\'" + record.getDateModified() +
                         "\', checkupDate=\'" + record.getComebackDate() + "\'" +
                         " WHERE caseNum = \'" + record.getRecordID() + "\'");
        
        return true;
    }

   
    public static boolean delete(String recordID) {   
        MySQLConnector.executeStatement("DELETE FROM illness_record WHERE caseNum = \"" + recordID + "\"");
        return true;
    }

    
    public static IllnessRecord get(String recordID) {
        ResultSet Records = MySQLConnector.executeQuery("SELECT * FROM illness_record WHERE caseNum = \"" + recordID + "\"");
        ResultSet followupRecords = MySQLConnector.executeQuery("SELECT * FROM followup_form WHERE caseNum = \"" + recordID + "\"");
        IllnessRecord retRecord;
        try{
            if(Records.next()){
                retRecord = new IllnessRecord(Records.getString("caseNum"),
                                 Records.getString("patientID"),
                                 Records.getString("employeeID"),
                                 Records.getString("name"),
                                 Records.getString("recordDate"),
                                 //Records.getDate("modifyDate"),
                                 Records.getString("checkupDate"));
                retRecord.setDateModified(Records.getString("modifyDate"));
                
            }
 
        }
        catch(Exception e){
            e.printStackTrace();
        }

        
        return null;
    }
    
    
}
