package model;


import db_connection.MySQLConnector;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PatientRecordModel 
{
    public static boolean  add(PatientRecord record) {        
        MySQLConnector.executeStatement("INSERT INTO patient_record " +
                         "VALUES (\"" +
                         record.getPatientID() + "\",\"" +
                         record.getDateModified() + "\",\"" +
                         record.getRecordDate() + "\",\"" +
                         record.getFName() + "\",\"" +
                         record.getLName() + "\"," +
                         record.getAge() + ",\'" +
                         record.getSex() + "\',\"" +
                         record.getBirthday() + "\",\"" +
                         record.getBirthPlace() + "\",\"" +
                         record.getStatus() + "\",\"" +
                         record.getReferredBy() + "\",\"" +
                         record.getStreet() + "\",\"" +
                         record.getCity() + "\",\"" +
                         record.getRegion() + "\",\"" +
                         record.getContactNum() + "\",\"" +
                         record.getEmail() + "\")");
        
        return true;
    }
    public static boolean set(PatientRecord record) {        
        MySQLConnector.executeStatement("UPDATE patient_record SET recordDate=\'" + record.getRecordDate() +
                         "\', modifyDate=\'" + record.getDateModified() +
                         "\', firstName=\'" + record.getFName() +
                         "\', lastName=\'" + record.getLName() +
                         "\', age=" + record.getAge() +
                         ", sex=\'" + record.getSex() +
                         "\', birthDate=\'" + record.getBirthday() +
                         "\', birthPlace=\'" + record.getBirthPlace() +
                         "\', civilStatus=\'" + record.getStatus() +
                         "\', referredBy=\'" + record.getReferredBy() +
                         "\', street=\'" + record.getStreet() +
                         "\', city=\'" + record.getCity() +
                         "\', region=\'" + record.getRegion() +
                         "\', contactNum=\'" + record.getContactNum() +
                         "\', email=\'" + record.getEmail() + "\'" +
                         " WHERE patientID = \"" + record.getPatientID() + "\"");
        
        return true;
    }

   
    public static boolean delete(String patientID) {   
        MySQLConnector.executeStatement("DELETE FROM patient_record WHERE patientID = \"" + patientID + "\"");
        return true;
    }
    
    public static ArrayList<PatientRecord> getAll(String physicianID)
    {
        
        ArrayList<PatientRecord> records = new ArrayList<PatientRecord>();
        try {
            ResultSet Records = MySQLConnector.executeQuery("SELECT * FROM patient_record P, illness_record I WHERE P.patientID = I.patientID AND I.employeeID = \"" + physicianID + "\"");
            while(Records.next())
            {
                records.add(new PatientRecord(Records.getString("patientID"),
                                 Records.getString("modifyDate"),
                                 Records.getString("recordDate"),
                                 Records.getString("firstName"),
                                 Records.getString("lastName"),
                                 Records.getInt("age"),
                                 Records.getString("sex").charAt(0),
                                 Records.getString("birthDate"),
                                 Records.getString("birthPlace"),
                                 Records.getString("civilStatus"),
                                 Records.getString("referredBy"),
                                 Records.getString("street"),
                                 Records.getString("city"),
                                 Records.getString("region"),
                                 Records.getString("contactNum"),
                                 Records.getString("email")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PatientRecordModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return records;
    }

    
    public static PatientRecord get(String patientID) {
        ResultSet Records = MySQLConnector.executeQuery("SELECT * FROM patient_record WHERE patientID = \"" + patientID + "\"");
        
        try{
            if(Records.next()){
                return new PatientRecord(Records.getString("patientID"),
                                 Records.getString("modifyDate"),
                                 Records.getString("recordDate"),
                                 Records.getString("firstName"),
                                 Records.getString("lastName"),
                                 Records.getInt("age"),
                                 Records.getString("sex").charAt(0),
                                 Records.getString("birthDate"),
                                 Records.getString("birthPlace"),
                                 Records.getString("civilStatus"),
                                 Records.getString("referredBy"),
                                 Records.getString("street"),
                                 Records.getString("city"),
                                 Records.getString("region"),
                                 Records.getString("contactNum"),
                                 Records.getString("email"));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return null;
    }
    
    public static ArrayList<PatientRecord> getPatient(String physicianID, String search, int key)
    {
        ArrayList<PatientRecord> records = new ArrayList<PatientRecord>();
        String statement;
        
        if(key == 0)
            statement = "SELECT * FROM patient_record P, illness_record I WHERE P.patientID = \"" + search + "\" AND P.patientID = I.patientID AND I.employeeID = \"" + physicianID + "\"";
        else if(key == 1)
            statement = "SELECT * FROM patient_record P, illness_record I WHERE P.firstName = \"" + search + "\" OR P.lastName = \"" + search + "\" AND P.patientID = I.patientID AND I.employeeID = \"" + physicianID + "\"";
        else
            statement = "SELECT * FROM patient_record P, illness_record I WHERE I.caseNum = \"" + search + "\" AND P.patientID = I.patientID AND I.employeeID = \"" + physicianID + "\"";
  
        
        try {
            ResultSet Records = MySQLConnector.executeQuery(statement);
            while(Records.next())
            {
                records.add(new PatientRecord(Records.getString("patientID"),
                                 Records.getString("modifyDate"),
                                 Records.getString("recordDate"),
                                 Records.getString("firstName"),
                                 Records.getString("lastName"),
                                 Records.getInt("age"),
                                 Records.getString("sex").charAt(0),
                                 Records.getString("birthDate"),
                                 Records.getString("birthPlace"),
                                 Records.getString("civilStatus"),
                                 Records.getString("referredBy"),
                                 Records.getString("street"),
                                 Records.getString("city"),
                                 Records.getString("region"),
                                 Records.getString("contactNum"),
                                 Records.getString("email")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PatientRecordModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return records;
    }
}
