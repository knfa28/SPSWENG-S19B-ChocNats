package model;

import db_connection.MySQLConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RecordModel {
    
    public static ArrayList<Record> getRecords(String patientID, String physicianID){
        ArrayList<Record> recordList = new ArrayList<Record>();
        
        try {
            ResultSet Records = MySQLConnector.executeQuery("SELECT * FROM illness_record where patientID = \"" + patientID + "\"AND employeeID = \"" + physicianID + "\"");
            while(Records.next())
            {
                Record temp = new Record(Records.getString("caseNum"),
                                         Records.getString("employeeID"),
                                         Records.getString("patientID"),
                                         Records.getString("type"));
                
                temp.setRecordDate(Records.getString("recordDate"));
                temp.setRecordDate(Records.getString("modifyDate"));
                temp.setRecordDate(Records.getString("checkupDate"));
                
                recordList.add(temp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PatientRecordModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return recordList;
    }
    
    public static ArrayList<Record> getRecord(String patientID, String physicianID, String search, int key){
        ArrayList<Record> recordList = new ArrayList<Record>();
        String statement;
        
        if(key == 0)
            statement = "SELECT * FROM illness_record WHERE caseNum = \"" + search + "\" AND patientID = \"" + patientID + "\" AND employeeID = \"" + physicianID + "\"";
        else 
            statement = "SELECT * FROM illness_record WHERE type = \"" + search + "\" AND patientID = \"" + patientID + "\"AND employeeID = \"" + physicianID + "\"";
        
        try {
            ResultSet Records = MySQLConnector.executeQuery(statement);
            while(Records.next())
            {
                Record temp = new Record(Records.getString("caseNum"),
                                         Records.getString("employeeID"),
                                         Records.getString("patientID"),
                                         Records.getString("type"));
                
                temp.setRecordDate(Records.getString("recordDate"));
                temp.setRecordDate(Records.getString("modifyDate"));
                temp.setRecordDate(Records.getString("checkupDate"));
                
                recordList.add(temp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PatientRecordModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return recordList;
    }
}
