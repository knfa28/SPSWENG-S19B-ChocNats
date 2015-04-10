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
        return true;
    }

   
    public static boolean delete(String userID) { 
        MySQLConnector.executeStatement("DELETE FROM employee WHERE employeeID = \"" + userID + "\"");
        return true;
    }

    
    public static Account get(String userID) {
        ResultSet Accounts = MySQLConnector.executeQuery("SELECT * FROM employee WHERE BINARY employeeID = \"" + userID + "\"");
        try{
            if(Accounts.next()){
                Account account = new Account(Accounts.getString(Account.userid_col),
                                 Accounts.getString(Account.password_col),
                                 Accounts.getString(Account.fName_col),
                                 Accounts.getString(Account.lName_col),
                                 Accounts.getString(Account.type_col),
                                 Accounts.getString(Account.mobNum_col),
                                 Accounts.getString(Account.email_col),
                                 Accounts.getString(Account.registerDate_col));
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
                records.add(new Account(Accounts.getString(Account.userid_col),
                                 Accounts.getString(Account.password_col),
                                 Accounts.getString(Account.fName_col),
                                 Accounts.getString(Account.lName_col),
                                 Accounts.getString(Account.type_col),
                                 Accounts.getString(Account.mobNum_col),
                                 Accounts.getString(Account.email_col),
                                 Accounts.getString(Account.registerDate_col)));
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
        else
            statement = "SELECT * FROM employee WHERE firstName = \"" + search + "\" OR lastName = \"" + search + "\"";
        
        try {
            ResultSet Accounts = MySQLConnector.executeQuery(statement);
            while(Accounts.next())
            {
                records.add(new Account(Accounts.getString(Account.userid_col),
                                 Accounts.getString(Account.password_col),
                                 Accounts.getString(Account.fName_col),
                                 Accounts.getString(Account.lName_col),
                                 Accounts.getString(Account.type_col),
                                 Accounts.getString(Account.mobNum_col),
                                 Accounts.getString(Account.email_col),
                                 Accounts.getString(Account.registerDate_col)));
            }
        }
         catch (SQLException ex) 
        {
            Logger.getLogger(PatientRecordModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return records;
    }
}
