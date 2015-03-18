package model;

import db_connection.File;
import db_connection.MySQLConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AccountsModel 
{
    public static boolean  add(Account account) {        
        MySQLConnector.executeStatement("INSERT INTO employee " +
                         "VALUES (\"" +
                         account.getUserID()+ "\",\"" +
                         account.getPassword() + "\",\"" +
                         account.getFName() + "\",\"" +
                         account.getLName() + "\",\"" +
                         account.getType() + "\",\"" +
                         account.getMobNum() + "\",\"" +
                         account.getEmail() + "\",\"" +
                         account.getRegisterDate() + "\")");
        
        //add specializations
        ArrayList<String> specializations = account.getSpecializations();
        for(int i = 0; i < specializations.size(); i++)
        {
            MySQLConnector.executeStatement("INSERT INTO specialization " +
                         "VALUES (\"" +
                         account.getUserID() + "\",\"" +
                         specializations.get(i) + "\")");
        }
        
        return true;
    }
    public static boolean set(Account account) {        
        MySQLConnector.executeStatement("UPDATE employee SET password=\'" + account.getPassword() +
                         "\', firstName=\'" + account.getFName() +
                         "\', lastName=\'" + account.getLName() +
                         "\', employeeType=\'" + account.getType() +
                         "\', mobileNum=\'" + account.getMobNum() +
                         "\', email=\'" + account.getEmail() +
                         "\', registerDate=\'" + account.getRegisterDate() + "\'" +
                         " WHERE employeeID = \'" + account.getUserID()+ "\'");
        //add more specializations in case it is not added yet
        ArrayList<String> specializations = account.getSpecializations();
        for(int i = 0; i < specializations.size(); i++)
        {
            System.out.println("Specialization:" + specializations.get(i));
            MySQLConnector.executeStatement("INSERT INTO specialization " +
                         "VALUES (\"" +
                         account.getUserID() + "\",\"" +
                         specializations.get(i) + "\")");
        }
        
        return true;
    }

   
    public static boolean delete(String userID) { 
        MySQLConnector.executeStatement("DELETE FROM specialization WHERE employeeID = \"" + userID + "\"");
        MySQLConnector.executeStatement("DELETE FROM employee WHERE employeeID = \"" + userID + "\"");
        return true;
    }

    
    public static Account get(String userID) {
        ResultSet Accounts = MySQLConnector.executeQuery("SELECT * FROM employee WHERE BINARY employeeID = \"" + userID + "\"");
        ResultSet specializations = MySQLConnector.executeQuery("SELECT * FROM specialization WHERE employeeID = \"" + userID + "\"");
        try{
            if(Accounts.next()){
                Account account = new Account(Accounts.getString("employeeID"),
                                 Accounts.getString("password"),
                                 Accounts.getString("firstName"),
                                 Accounts.getString("lastName"),
                                 Accounts.getString("employeeType"),
                                 Accounts.getString("mobileNum"),
                                 Accounts.getString("email"),
                                 Accounts.getString("registerDate"));
                while(specializations.next())
                {
                    account.addSpecialization(specializations.getString("specialty"));
                }
                return account;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return null;
    } 
    
    public static ArrayList<Account> getAccounts()
    {
        ArrayList<Account> records = new ArrayList<Account>();
        try {
            ResultSet Accounts = MySQLConnector.executeQuery("SELECT * FROM employee");
            while(Accounts.next())
            {
                records.add(new Account(Accounts.getString("employeeID"),
                                 Accounts.getString("password"),
                                 Accounts.getString("firstName"),
                                 Accounts.getString("lastName"),
                                 Accounts.getString("employeeType"),
                                 Accounts.getString("mobileNum"),
                                 Accounts.getString("email"),
                                 Accounts.getString("registerDate")));
            }
        }
         catch (SQLException ex) 
        {
            Logger.getLogger(PatientRecordModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return records;
    }
    
    public static ArrayList<Account> getAccount(String search, int key)
    {
        ArrayList<Account> records = new ArrayList<Account>();
        String statement;
        
        if(key == 0)
            statement = "SELECT * FROM employee WHERE employeeID = \"" + search + "\"";
        else if(key == 1)
            statement = "SELECT * FROM employee WHERE firstName = \"" + search + "\" OR lastName = \"" + search + "\"";
        else
            statement = "SELECT * FROM employee E, specialization S WHERE S.specialty = \"" + search + "\" AND E.employeeID = S.employeeID";
        
        try {
            ResultSet Accounts = MySQLConnector.executeQuery(statement);
            while(Accounts.next())
            {
                records.add(new Account(Accounts.getString("employeeID"),
                                 Accounts.getString("password"),
                                 Accounts.getString("firstName"),
                                 Accounts.getString("lastName"),
                                 Accounts.getString("employeeType"),
                                 Accounts.getString("mobileNum"),
                                 Accounts.getString("email"),
                                 Accounts.getString("registerDate")));
            }
        }
         catch (SQLException ex) 
        {
            Logger.getLogger(PatientRecordModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return records;
    }
}
