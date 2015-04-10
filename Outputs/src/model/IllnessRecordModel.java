package model;

import db_connection.MySQLConnector;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.jar.Attributes;

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
        ArrayList<Attribute> attributes = record.getAttributes();
        for(int i = 0; i < attributes.size(); i++)
        {
            MySQLConnector.executeStatement("INSERT INTO attribute_values " +
                         "VALUES (\"" +
                         record.getRecordID() + "\",\"" +
                         record.getPatientID() + ",\"" +
                         record.getPhysicianID() + "\",\"" +
                         record.getIllnessName() + "\",\"" +
                         record.getDateTaken() + "\",\"" +
                         record.getDateModified() + "\",\"" +
                         record.getComebackDate() + "\")");
        }
        
        
        return true;
    }
    public static boolean set(IllnessRecord record) {        
        MySQLConnector.executeStatement("UPDATE illness_record SET patientID=\'" + record.getPatientID() +
                         "\', employeeID=\'" + record.getPhysicianID() +
                         "\', name=\'" + record.getIllnessName() +
                         "\', recordDate=\'" + record.getDateTaken() +
                         "\', modifyDate=\'" + record.getDateModified() +
                         "\', checkupDate=\'" + record.getComebackDate() + "\'" +
                         " WHERE recordID = \'" + record.getRecordID() + "\'");
        
        //delete all previous attributes
        MySQLConnector.executeStatement("DELETE FROM attribute_values WHERE recordID = \"" + record.getRecordID() + "\"");
        
        //add the attributes again
        ArrayList<Attribute> attributes = record.getAttributes();
        for(int i = 0; i < attributes.size(); i++)
        {
            MySQLConnector.executeStatement("INSERT INTO attribute_values " +
                         "VALUES (\"" +
                         record.getRecordID() + "\",\"" +
                         record.getPatientID() + ",\"" +
                         record.getPhysicianID() + "\",\"" +
                         record.getIllnessName() + "\",\"" +
                         record.getDateTaken() + "\",\"" +
                         record.getDateModified() + "\",\"" +
                         record.getComebackDate() + "\")");
        }
        
        return true;
    }

   
    public static boolean delete(String recordID) {   
        MySQLConnector.executeStatement("DELETE FROM attribute_values WHERE recordID = \"" + recordID + "\"");
        MySQLConnector.executeStatement("DELETE FROM illness_record WHERE recordID = \"" + recordID + "\"");
        return true;
    }

    
    public static IllnessRecord get(String recordID) {
        ResultSet Records = MySQLConnector.executeQuery("SELECT * FROM illness_record WHERE recordID = \"" + recordID + "\"");
        ResultSet attributes = MySQLConnector.executeQuery("SELECT * FROM attribute_values WHERE recordID = \"" + recordID + "\"");
        IllnessRecord retRecord = null;
        try{
            if(Records.next()){
                retRecord = new IllnessRecord(Records.getString(IllnessRecord.recordID_col),
                                 Records.getString(IllnessRecord.patientID_col),
                                 Records.getString(IllnessRecord.physicianID_col),
                                 Records.getString(IllnessRecord.illnessName_col),
                                 Records.getString(IllnessRecord.dateTaken_col),
                                 //Records.getDate("modifyDate"),
                                 Records.getString(IllnessRecord.comebackDate_col));
                retRecord.setDateModified(Records.getString("modifyDate"));
                
            }
            while(attributes.next())
            {
                retRecord.addAttribute(new Attribute(attributes.getString(Attribute.name_col),
                                 attributes.getInt(Attribute.pageNum_col),
                                 attributes.getString(Attribute.value_col)));
            }
 
        }
        catch(Exception e){
            e.printStackTrace();
        }

        
        return retRecord;
    }
    
    
}
