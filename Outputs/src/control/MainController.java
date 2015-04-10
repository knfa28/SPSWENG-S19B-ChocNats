package control;

import model.Account;
import model.AccountsModel;
import model.IllnessRecord;
import model.IllnessRecordBuilder;
import model.IllnessRecordModel;
import model.PatientRecord;
import model.PatientRecordModel;
import model.Record;
import model.RecordModel;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;

import view.*;

public class MainController 
{
    private Account currentAccount;
    private PatientRecord currentPatient;
    private IllnessRecordBuilder IRBuilder;
    private PhysicianView phView;
    private PRView patientView;
    private static MainController firstInstance;
    
    private MainController()
    {
        currentAccount = null;
        IRBuilder = null;
        new LoginView(this);
        phView = new PhysicianView(this);
        AccountsModel.delete("Admin");
        AccountsModel.delete("Doctor");
        AccountsModel.add(new Account("The_Admin","1234", "The", "Admin", "Administrator", "09906745529", "the.admin@yahoo.com", Calendar.getInstance().get(Calendar.YEAR) + "-" + (Calendar.getInstance().get(Calendar.MONTH) + 1 ) + "-" + Calendar.getInstance().get(Calendar.DAY_OF_MONTH)));
        AccountsModel.add(new Account("The_Doctor","1234", "The", "Doctor", "Physician", "09906745529", "the.admin@yahoo.com", Calendar.getInstance().get(Calendar.YEAR) + "-" + (Calendar.getInstance().get(Calendar.MONTH) + 1 ) + "-" + Calendar.getInstance().get(Calendar.DAY_OF_MONTH)));
        
    }
    
    public static MainController getInstance(){
        if(firstInstance == null){
            firstInstance = new MainController();
        }
        
        return firstInstance;
    }
    
    public String getCurrAcctType()
    {
    	System.out.println(currentAccount.getType() + "1");
    	if(currentAccount != null)
            return currentAccount.getType();
        else return null;
    }
    
    public boolean login(String userID, String password)
    {
        Account temp = AccountsModel.get(userID);
        if(temp != null && temp.getPassword().compareTo(password) == 0)
        {    
           currentAccount = temp;
           updatePatients();
           updateAccounts();
        }
        else
        {
            return false;
        }
        
        if(currentAccount != null) 
        {
            updateAccounts();
            phView.updateAccount(currentAccount);
            phView.SetVisible(true);
        }
        return true;
    }
    
    public void setCurrPatient(String patientID){
        this.currentPatient = PatientRecordModel.get(patientID);
    }
    
    public void searchPatient(String search, int key)
    {   
        String physicianID = currentAccount.getUserID();
        
        if(PatientRecordModel.getPatient(physicianID, search, key).isEmpty()){
            JOptionPane.showMessageDialog(null, "Patient does not exist!", "Message", JOptionPane.ERROR_MESSAGE);
            phView.updatePatients(PatientRecordModel.getAll(physicianID));
        }
        else phView.updatePatients(PatientRecordModel.getPatient(physicianID, search, key));
    }
    
    public void searchAccount(String search, int key)
    {
        if(AccountsModel.getAccount(search, key).isEmpty()){
            if(key == 2)
                JOptionPane.showMessageDialog(null, "Specialty does not exist!", "Message", JOptionPane.ERROR_MESSAGE);
            else
                JOptionPane.showMessageDialog(null, "Employee does not exist!", "Message", JOptionPane.ERROR_MESSAGE);
            phView.updatePhysicians(AccountsModel.getAccounts());
        }
        else
            phView.updatePhysicians(AccountsModel.getAccount(search, key));
    }
    
    public void searchRecord(String search, int key)
    {
        String patientID = currentPatient.getPatientID();
        String physicianID = currentAccount.getUserID();
        
        if(AccountsModel.getAccount(search, key).isEmpty()){
            JOptionPane.showMessageDialog(null, "Record does not exist!", "Message", JOptionPane.ERROR_MESSAGE);
            patientView.updateRecords(RecordModel.getRecords(patientID, physicianID));
        }
        else
            patientView.updateRecords(RecordModel.getRecord(patientID, physicianID, search, key));
    }
    
    public void registerAccount()
    {
        new EditAcctView(this, false);
    }
    
    public boolean addAccount(String userID, String password, String fName, String lName, String type, String mobileNum, String email, String registerDate)
    {
        if(currentAccount.getType().equals("Administrator"))
        {
            AccountsModel.add(new Account(userID, password, fName, lName, type,mobileNum, email, registerDate));
            updateAccounts();
            return true;
        }
        else return false;
    }
    
    public boolean modifyAccount(String userID, String password, String fName, String lName, String type, String mobileNum, String email, String registerDate)
    {
        Account temp = new Account(userID, password, fName, lName, type,mobileNum, email, registerDate);
        if(AccountsModel.set(temp))
        {
            if(currentAccount.getUserID().equals(userID))
            {
                currentAccount = temp;
                phView.updateAccount(currentAccount);
            }
            return true;
        }
        else
            return false;
    }
    
    public void viewAccount(String userID)
    {
        Account account = AccountsModel.get(userID);
        new AcctView(this, account);
    }
    
    public void editAccount()
    {
       EditAcctView view = new EditAcctView(this, true);
       view.setAccountToModify(currentAccount);
    }

    
    public void updateAccounts()
    {
        ArrayList<Account> accounts = AccountsModel.getAccounts();
        for(int i = 0; i < accounts.size(); i++)
        {
            if(currentAccount != null && accounts.get(i).getUserID().equals(currentAccount.getUserID()))
            {
                accounts.remove(i);
            }
        }
        phView.updatePhysicians(accounts);
    }
    
    public void updatePatients()
    {
        String physicianID = currentAccount.getUserID();
        
        phView.updatePatients(PatientRecordModel.getAll(physicianID));
    }
    
    public void updateRecords()
    {
        String patientID = currentPatient.getPatientID();
        String physicianID = currentAccount.getUserID();
        
        patientView.updateRecords(RecordModel.getRecords(patientID, physicianID));
    }
    
    public boolean addPatientRecord(String patientID, String dateModified, String recordDate, String fName, String lName, int age, char sex, String birthday, String birthplace, String status, String referredBy, String street, String city, String region, String contactNum, String email)
    {
        System.out.println("Adding Patient");
        if(currentAccount.getType().equals("Secretary") || currentAccount.getType().equals("Physician"))
        {
            PatientRecordModel.add(new PatientRecord(patientID, dateModified, recordDate, fName, lName, age, sex, birthday, birthplace, status, referredBy, street, city, region, contactNum, email));
            System.out.println("PatientAdded");
            phView.addPatient(PatientRecordModel.get(patientID));
            System.out.println("Patient Viewable");
            return true;
        }
        else return false;
    }
    
    public PatientRecord getPatientRecord(String patientID)
    {
        if(currentAccount.getType().equals("Physician") || currentAccount.getType().equals("Secretary"))
            return PatientRecordModel.get(patientID);
        else
            return null;
    }
    
    public void editPatientRecord(String patientID)
    {
        EditPRView view = new EditPRView(this, true);
        view.setRecordToModify(PatientRecordModel.get(patientID));
    }
    
    public boolean modifyPatientRecord(String patientID, String dateModified, String recordDate, String fName, String lName, int age, char sex, String birthday, String birthplace, String status, String referredBy, String street, String city, String region, String contactNum, String email)
    {
        PatientRecord modifiedRecord = new PatientRecord(patientID, dateModified, recordDate, fName, lName, age, sex, birthday, birthplace, status, referredBy, street, city, region, contactNum, email);

            if(PatientRecordModel.set(modifiedRecord))
            {
                if(patientView != null)
                    patientView.updatePatientInfo(modifiedRecord);
                return true;
            }
            else return false;
    }
    
    public boolean deletePatientRecord(String patientID)
    {
        if( currentAccount.getType().equals("Secretary"))
        {
            if(PatientRecordModel.delete(patientID))
            {
                return true;
            }
            else return false;
        }
        else
            return false;
    }
    
    public void viewPatientRecord(String patientID)
    {
        setCurrPatient(patientID);
        patientView = new PRView(currentPatient, this);
        updateRecords();    
    }
    
    public void createIllnessRecord(String caseNumber, String patientID, String physicianID, String illnessName, String dateTaken, String comebackDate)
    {
        IRBuilder = new IllnessRecordBuilder(caseNumber, patientID, physicianID, illnessName, dateTaken, comebackDate);
    }
    
    public boolean addCurrentIllnessRecord()
    {
        if(IRBuilder != null)
        {
            if(this.addIllnessRecord(IRBuilder.build()))
                return true;
            else return false;
        }
        else return false;
    }
    
    public boolean addIllnessRecord(IllnessRecord record)
    {
        if(currentAccount.getType().equals("Physician"))
        {
            IllnessRecordModel.add(record);
            return true;
        }
        else return false;
    }
    
    public IllnessRecord getIllnessRecord(String caseNumber)
    {
        if(currentAccount.getType().equals("Physician") || currentAccount.getType().equals("Secretary"))
            return IllnessRecordModel.get(caseNumber);
        else return null;
    }
    
    public boolean modifyIllnessRecord(IllnessRecord modifiedRecord)
    {
        if(currentAccount.getType().equals("Physician"))
        {
            if(IllnessRecordModel.set(modifiedRecord))
                return true;
            else return false;
        }
        else return false;
    }
    
    public boolean deleteIllnessRecord(String caseNumber)
    {
        if(currentAccount.getType().equals("Physician"))
        {
            if(IllnessRecordModel.delete(caseNumber))
                return true;
            else return false;
        }
        else return false;
    }
            
}
