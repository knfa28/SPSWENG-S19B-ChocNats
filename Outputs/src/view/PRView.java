package view;

import model.PatientRecord;
import control.MainController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import javax.swing.UIManager;
import javax.swing.WindowConstants;
import model.Record;

public class PRView extends javax.swing.JFrame 
{
    private PatientRecord record;
    private MainController control;
    private DefaultListModel<String> Rec = new DefaultListModel<String>();
    public PRView(PatientRecord record, MainController control) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {}
        this.record = record;
        this.control = control;
        initComponents();
        recordList.setModel(Rec);
        patientIDData.setText(record.getPatientID());
        nameData.setText(record.getFName() + " " + record.getLName());
        ageData.setText(record.getAge() + "");
        sexData.setText(record.getSex() + "");
        birthPlaceData.setText(record.getBirthPlace());
        birthDateData.setText(record.getBirthday());
        addressData.setText(record.getStreet() + " " + record.getCity() + " " + record.getRegion());
        contactNumData.setText(record.getContactNum());
        emailData.setText(record.getEmail());
        referralData.setText(record.getReferredBy());
        recordDateData.setText(record.getRecordDate());
        modifyDateData.setText(record.getDateModified());
        editBtn.addActionListener(new editBtnActionListener());
        back1Btn.addActionListener(new cancelActionListener());
        this.setResizable(false);
        setLocationRelativeTo(null);  
        setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
    public void updatePatientInfo(PatientRecord record)
    {
        patientIDData.setText(record.getPatientID());
        nameData.setText(record.getFName() + " " + record.getLName());
        ageData.setText(record.getAge() + "");
        sexData.setText(record.getSex() + "");
        birthPlaceData.setText(record.getBirthPlace());
        birthDateData.setText(record.getBirthday());
        addressData.setText(record.getStreet() + " " + record.getCity() + " " + record.getRegion());
        contactNumData.setText(record.getContactNum());
        emailData.setText(record.getEmail());
        referralData.setText(record.getReferredBy());
        recordDateData.setText(record.getRecordDate());
        modifyDateData.setText(record.getDateModified());
    }
    
    public void updateRecords(ArrayList<Record> all)
    {
        Rec.removeAllElements();
        for(int i = 0; i < all.size(); i++)
        {
            Rec.addElement(all.get(i).getCaseNum() + " " + all.get(i).getIllness());
        }
    }
    
    class editBtnActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            control.editPatientRecord(record.getPatientID());
            System.out.println("Updated");
        }
    }
    class cancelActionListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        patientRecordPane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        patientIDLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        sexLabel = new javax.swing.JLabel();
        bPlaceLabel = new javax.swing.JLabel();
        bDateLabel = new javax.swing.JLabel();
        contactsLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        numberLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        referralLabel = new javax.swing.JLabel();
        patientIDData = new javax.swing.JLabel();
        nameData = new javax.swing.JLabel();
        ageData = new javax.swing.JLabel();
        sexData = new javax.swing.JLabel();
        birthPlaceData = new javax.swing.JLabel();
        birthDateData = new javax.swing.JLabel();
        addressData = new javax.swing.JLabel();
        contactNumData = new javax.swing.JLabel();
        emailData = new javax.swing.JLabel();
        referralData = new javax.swing.JLabel();
        recordDateLabel = new javax.swing.JLabel();
        modifyDateLabel = new javax.swing.JLabel();
        recordDateData = new javax.swing.JLabel();
        modifyDateData = new javax.swing.JLabel();
        editBtn = new javax.swing.JButton();
        back1Btn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        searchLabel = new javax.swing.JLabel();
        sortLabel = new javax.swing.JLabel();
        sortCombo = new javax.swing.JComboBox();
        searchTxtbx = new javax.swing.JTextField();
        viewBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        recordList = new javax.swing.JList();
        searchCombo = new javax.swing.JComboBox();
        searchBtn = new javax.swing.JButton();
        addRecordBtn = new javax.swing.JButton();
        recordCombo = new javax.swing.JComboBox();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 533, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 356, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        patientRecordPane.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        patientIDLabel.setText("Patient ID:");

        nameLabel.setText("Name:");

        ageLabel.setText("Age:");

        sexLabel.setText("Sex:");

        bPlaceLabel.setText("Birth Country:");

        bDateLabel.setText("Birth Date:");

        contactsLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        contactsLabel.setText("Contact Details:");

        addressLabel.setText("Address:");

        numberLabel.setText("Contact Number:");

        emailLabel.setText("Email Address:");

        referralLabel.setText("Source of Referral:");

        patientIDData.setText("[patientID]");

        nameData.setText("[lastName + firstName]");

        ageData.setText("[age]");

        sexData.setText("[sex]");

        birthPlaceData.setText("[birthPlace]");

        birthDateData.setText("[birthDate]");

        addressData.setText("[street + city + region]");

        contactNumData.setText("[contactNum]");

        emailData.setText("[email]");

        referralData.setText("[referredBy]");

        recordDateLabel.setText("Date Recorded:");

        modifyDateLabel.setText("Date Modified:");

        recordDateData.setText("[dd/MM/yyy]");

        modifyDateData.setText("[dd/MM/yyy]");

        editBtn.setText("Edit");

        back1Btn.setText("Back");
        back1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back1BtnActionPerformed(evt);
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
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bPlaceLabel)
                                    .addComponent(bDateLabel)
                                    .addComponent(sexLabel))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sexData)
                                    .addComponent(birthDateData)
                                    .addComponent(birthPlaceData)
                                    .addComponent(ageData)))
                            .addComponent(contactsLabel)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ageLabel)
                                    .addComponent(nameLabel))
                                .addGap(54, 54, 54)
                                .addComponent(nameData))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(referralLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(referralData))
                            .addComponent(addressLabel)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(numberLabel)
                                    .addComponent(emailLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailData)
                                    .addComponent(contactNumData)
                                    .addComponent(addressData)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(patientIDLabel)
                                .addGap(33, 33, 33)
                                .addComponent(patientIDData)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(recordDateLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(recordDateData))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(modifyDateLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(modifyDateData))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(back1Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(patientIDLabel)
                        .addComponent(patientIDData))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(recordDateData)
                        .addComponent(recordDateLabel)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameData)
                            .addComponent(nameLabel)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modifyDateLabel)
                            .addComponent(modifyDateData))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabel)
                    .addComponent(ageData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sexLabel)
                    .addComponent(sexData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bPlaceLabel)
                    .addComponent(birthPlaceData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bDateLabel)
                    .addComponent(birthDateData))
                .addGap(23, 23, 23)
                .addComponent(contactsLabel)
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressData, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addressLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberLabel)
                    .addComponent(contactNumData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailData))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(referralLabel)
                    .addComponent(referralData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editBtn)
                    .addComponent(back1Btn))
                .addContainerGap())
        );

        patientRecordPane.addTab("Patient Details", jPanel1);

        searchLabel.setText("Search:");

        sortLabel.setText("Sort By:");

        sortCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Case Number(asc)", "Case Number(desc)", "Date Recorded(asc)", "Date Recorded(desc)", "Date Modified(asc)", "Date Modified(desc)" }));

        viewBtn.setText("View");

        recordList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(recordList);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
        );

        searchCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Case Number", "Illness" }));

        searchBtn.setText("Go!");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        addRecordBtn.setText("Add Record");
        addRecordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRecordBtnActionPerformed(evt);
            }
        });

        recordCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "APAS", "Allergy and ADR", "Immunodeficiency" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(viewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(recordCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addRecordBtn))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(searchLabel)
                        .addGap(5, 5, 5)
                        .addComponent(searchCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(sortLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sortCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchLabel)
                    .addComponent(sortCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn)
                    .addComponent(sortLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewBtn)
                    .addComponent(addRecordBtn)
                    .addComponent(recordCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        patientRecordPane.addTab("Medical Records", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(patientRecordPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(patientRecordPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addRecordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRecordBtnActionPerformed
        if(recordCombo.getSelectedItem() == "APAS")
            new EditApasView();
    }//GEN-LAST:event_addRecordBtnActionPerformed

    private void back1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back1BtnActionPerformed
       dispose();
    }//GEN-LAST:event_back1BtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        if(searchTxtbx.getText() == "")
            JOptionPane.showMessageDialog(null, "Please enter a valid Input!", "Message", JOptionPane.ERROR_MESSAGE);
	else{
            if(searchCombo.getSelectedItem() == "Case Number")
                control.searchRecord(searchTxtbx.getText(), 0);
            else if(searchCombo.getSelectedItem() == "Illness")
                control.searchRecord(searchTxtbx.getText(), 1);
	}
	searchTxtbx.setText("");
    }//GEN-LAST:event_searchBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addRecordBtn;
    private javax.swing.JLabel addressData;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel ageData;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JLabel bDateLabel;
    private javax.swing.JLabel bPlaceLabel;
    private javax.swing.JButton back1Btn;
    private javax.swing.JLabel birthDateData;
    private javax.swing.JLabel birthPlaceData;
    private javax.swing.JLabel contactNumData;
    private javax.swing.JLabel contactsLabel;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel emailData;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel modifyDateData;
    private javax.swing.JLabel modifyDateLabel;
    private javax.swing.JLabel nameData;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel numberLabel;
    private javax.swing.JLabel patientIDData;
    private javax.swing.JLabel patientIDLabel;
    private javax.swing.JTabbedPane patientRecordPane;
    private javax.swing.JComboBox recordCombo;
    private javax.swing.JLabel recordDateData;
    private javax.swing.JLabel recordDateLabel;
    private javax.swing.JList recordList;
    private javax.swing.JLabel referralData;
    private javax.swing.JLabel referralLabel;
    private javax.swing.JButton searchBtn;
    private javax.swing.JComboBox searchCombo;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JTextField searchTxtbx;
    private javax.swing.JLabel sexData;
    private javax.swing.JLabel sexLabel;
    private javax.swing.JComboBox sortCombo;
    private javax.swing.JLabel sortLabel;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}
