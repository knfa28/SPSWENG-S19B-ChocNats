package view;

import model.Account;
import model.PatientRecord;
import control.MainController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

public class PhysicianView extends javax.swing.JFrame {
    private MainController control;
    private DefaultListModel<String> Str = new DefaultListModel<String>();
    private DefaultListModel<String> Phy = new DefaultListModel<String>();
    public PhysicianView(MainController control) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {}
        
        this.control = control;
        initComponents();
        
        
        
        patientsList.setModel(Str);
        physiciansList.setModel(Phy);
        registerPatientBtn.addActionListener(new registerPntBtnActionListener());
        viewBtn.addActionListener(new viewBtnActionListener());
        editAccntBtn.addActionListener(new editAccntBtnActionListener());
        view2Btn.addActionListener( new viewPhysicianBtnActionListener());
        this.setResizable(false);
        setLocationRelativeTo(null);  
        setVisible(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
    }
    
    public void updateAccount(Account currentAccount)
    {
        
        employeeIDData.setText(currentAccount.getUserID());
        typeData.setText(currentAccount.getType());
        nameData.setText(currentAccount.getFName() + " " + currentAccount.getLName());
        mobileNumData.setText(currentAccount.getMobNum());
        emailData.setText(currentAccount.getEmail());
        registerDateData.setText(currentAccount.getRegisterDate());
        
        //access modifiers
        if(control.getCurrAcctType().equals("physician"))
        {
            registerPatientBtn.setVisible(false);
        }
        else
        {
            registerPatientBtn.setVisible(true);
        }
        
        if(!control.getCurrAcctType().equals("Administrator"))
        {
            regAcctBtn.setVisible(false);
        }
        else
        {
            regAcctBtn.setVisible(true);
        }
        
    }
    
    public void addPatient(PatientRecord patient)
    {
        Str.addElement(patient.getPatientID() + " " + patient.getFName() + " " + patient.getLName());
    }
    
    public void SetVisible(boolean visibility)
    {
       setVisible(visibility);
    }


    public void updatePatients(ArrayList<PatientRecord> all) {
        Str.removeAllElements();
        for(int i = 0; i < all.size(); i++)
        {
            Str.addElement(all.get(i).getPatientID() + " " + all.get(i).getFName() + " " + all.get(i).getLName());
        }
    }
    
    public void updatePhysicians(ArrayList<Account> all)
    {
        Phy.removeAllElements();
        for(int i = 0; i < all.size(); i++)
        {
            Phy.addElement(all.get(i).getUserID() + " " + all.get(i).getFName() + " " + all.get(i).getLName());
        }
    }
    
    class viewPhysicianBtnActionListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(physiciansList.getSelectedValue() == null)
                JOptionPane.showMessageDialog(null, "Please select a Physician to be viewed first!", "Message", JOptionPane.ERROR_MESSAGE);
            else{
                String valueAtPatient = physiciansList.getSelectedValue() + "";
                String[] strings = valueAtPatient.split(" ");
                String userID = strings[0];
                control.viewAccount(userID);
            }
        }
        
    }
    
    class editAccntBtnActionListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) 
        {
            control.editAccount();
        }
        
    }
    
    class registerPntBtnActionListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(control.getCurrAcctType().equals("Physician"))
                new EditPRView(control, false);
            else
            {
                JOptionPane.showMessageDialog(null, "You are not allowed to register a new patient!", "Message", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }
    
    class viewBtnActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(patientsList.getSelectedValue() == null)
                JOptionPane.showMessageDialog(null, "Please select a Patient to be viewed first!", "Message", JOptionPane.ERROR_MESSAGE);
            else{
                String valueAtPatient = patientsList.getSelectedValue() + "";
                String[] strings = valueAtPatient.split(" ");
                String patientID = strings[0];
                System.out.println("PatientID:" + patientID);
                control.viewPatientRecord(patientID);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        employeeIDLabel = new javax.swing.JLabel();
        employeeIDData = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        nameData = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        typeData = new javax.swing.JLabel();
        contactsLabel = new javax.swing.JLabel();
        mobileNumLabel = new javax.swing.JLabel();
        mobileNumData = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        emailData = new javax.swing.JLabel();
        registerDateLabel = new javax.swing.JLabel();
        registerDateData = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();
        editAccntBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        searchLabel = new javax.swing.JLabel();
        searchCombo = new javax.swing.JComboBox();
        searchTxtbx = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        sortLabel = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        patientsList = new javax.swing.JList();
        viewBtn = new javax.swing.JButton();
        registerPatientBtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        search2Label = new javax.swing.JLabel();
        view2Btn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        physiciansList = new javax.swing.JList();
        search2Txtbx = new javax.swing.JTextField();
        search2Btn = new javax.swing.JButton();
        sort2Combo = new javax.swing.JComboBox();
        sort2Label = new javax.swing.JLabel();
        search2Combo = new javax.swing.JComboBox();
        regAcctBtn = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        employeeIDLabel.setText("Employee ID:");

        employeeIDData.setText("[employeeID]");

        nameLabel.setText("Name:");

        nameData.setText("[lastName + firstName]");

        typeLabel.setText("Employee Type:");

        typeData.setText("[type]");

        contactsLabel.setText("Contact Details:");

        mobileNumLabel.setText("Contact Number:");

        mobileNumData.setText("[mobileNum]");

        emailLabel.setText("Email Address:");

        emailData.setText("[email]");

        registerDateLabel.setText("Date Registered:");

        registerDateData.setText("[dd/MM/yyyy]");

        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        editAccntBtn.setText("Edit Account");
        editAccntBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAccntBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(employeeIDLabel)
                            .addComponent(nameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 326, Short.MAX_VALUE)
                        .addComponent(registerDateLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(registerDateData))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editAccntBtn)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(mobileNumLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mobileNumData))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(typeLabel)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(employeeIDData)
                                    .addComponent(typeData)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(contactsLabel)
                                    .addComponent(emailLabel))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailData)
                                    .addComponent(nameData))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(employeeIDLabel)
                            .addComponent(registerDateLabel)
                            .addComponent(registerDateData))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(typeLabel)
                            .addComponent(typeData))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLabel)
                            .addComponent(nameData))
                        .addGap(18, 18, 18)
                        .addComponent(contactsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mobileNumLabel)
                            .addComponent(mobileNumData)))
                    .addComponent(employeeIDData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailData, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logoutBtn)
                    .addComponent(editAccntBtn))
                .addGap(19, 19, 19))
        );

        jTabbedPane1.addTab("Account Details", jPanel1);

        searchLabel.setText("Search:");

        searchCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Patient ID", "Name", "Case Number"
        }));

        searchBtn.setText("Go!");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        sortLabel.setText("Sort By:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Case Number(asc)", "Case Number(desc)", "Date Recorded(asc)", "Date Recorded(desc)", "Date Modified(asc)", "Date Modified(desc)" }));

        patientsList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(patientsList);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
        );

        viewBtn.setText("View");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        registerPatientBtn.setText("Register Patient");
        registerPatientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerPatientBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(searchLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addComponent(sortLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(viewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(registerPatientBtn)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn)
                    .addComponent(sortLabel)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewBtn)
                    .addComponent(registerPatientBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Patients", jPanel2);

        search2Label.setText("Search:");

        view2Btn.setText("View");

        physiciansList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(physiciansList);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
        );

        search2Btn.setText("Go!");
        search2Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search2BtnActionPerformed(evt);
            }
        });

        sort2Combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Employee ID", "Name", "Specialty" }));

        sort2Label.setText("Sort By:");

        search2Combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Employee ID", "Name", "Specialty"}));

        regAcctBtn.setText("Register Account");
        regAcctBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regAcctBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(search2Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search2Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search2Txtbx, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search2Btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addComponent(sort2Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sort2Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(view2Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(regAcctBtn)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search2Label)
                    .addComponent(search2Txtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search2Btn)
                    .addComponent(sort2Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search2Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sort2Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(view2Btn)
                    .addComponent(regAcctBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Accounts", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void editAccntBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAccntBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editAccntBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        dispose();
        MainController.getInstance();
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewBtnActionPerformed

    private void registerPatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerPatientBtnActionPerformed
 
    }//GEN-LAST:event_registerPatientBtnActionPerformed

    private void regAcctBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regAcctBtnActionPerformed
        System.out.println(control.getCurrAcctType());
    	if(control.getCurrAcctType().equals("Administrator"))
        {
            control.registerAccount();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "You are not allowed to register a new account!", "Message", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_regAcctBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        if(searchTxtbx.getText() == "")
            JOptionPane.showMessageDialog(null, "Please input a valid Patient ID!", "Message", JOptionPane.ERROR_MESSAGE);
	else{
            if(searchCombo.getSelectedItem() == "Patient ID")
                control.searchPatient(searchTxtbx.getText(), 0);
            else if(searchCombo.getSelectedItem() == "Name")
                control.searchPatient(searchTxtbx.getText(), 1);
            else if(searchCombo.getSelectedItem() == "Patient ID")
                control.searchPatient(searchTxtbx.getText(), 2);
	}
	searchTxtbx.setText("");
    }//GEN-LAST:event_searchBtnActionPerformed

    private void search2BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search2BtnActionPerformed
        if(search2Txtbx.getText() == "")
            JOptionPane.showMessageDialog(null, "Please input a valid Employee ID!", "Message", JOptionPane.ERROR_MESSAGE);
        else{
            if(search2Combo.getSelectedItem() == "Employee ID")
                control.searchAccount(search2Txtbx.getText(), 0);
            else if(search2Combo.getSelectedItem() == "Name")
                control.searchAccount(search2Txtbx.getText(), 1);
            else if(search2Combo.getSelectedItem() == "Specialty")
                control.searchAccount(search2Txtbx.getText(), 2);
        }
        search2Txtbx.setText("");
    }//GEN-LAST:event_search2BtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contactsLabel;
    private javax.swing.JButton editAccntBtn;
    private javax.swing.JLabel emailData;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel employeeIDData;
    private javax.swing.JLabel employeeIDLabel;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel mobileNumData;
    private javax.swing.JLabel mobileNumLabel;
    private javax.swing.JLabel nameData;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JList patientsList;
    private javax.swing.JList physiciansList;
    private javax.swing.JButton regAcctBtn;
    private javax.swing.JLabel registerDateData;
    private javax.swing.JLabel registerDateLabel;
    private javax.swing.JButton registerPatientBtn;
    private javax.swing.JButton search2Btn;
    private javax.swing.JComboBox search2Combo;
    private javax.swing.JLabel search2Label;
    private javax.swing.JTextField search2Txtbx;
    private javax.swing.JButton searchBtn;
    private javax.swing.JComboBox searchCombo;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JTextField searchTxtbx;
    private javax.swing.JComboBox sort2Combo;
    private javax.swing.JLabel sort2Label;
    private javax.swing.JLabel sortLabel;
    private javax.swing.JLabel typeData;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JButton view2Btn;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}
