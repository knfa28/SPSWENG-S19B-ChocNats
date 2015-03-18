package view;

import model.PatientRecord;
import control.MainController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

public class EditPRView extends javax.swing.JFrame {

    private MainController control;
    private boolean isEditing;
    private PatientRecord record;
    
    public EditPRView(MainController control, boolean isEditing) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {}
        this.control = control;
        this.isEditing = isEditing;
        this.setResizable(false);
        initComponents();
        cancelBtn.addActionListener(new cancelActionListener());
        registerBtn.addActionListener(new registerBtnActionListener());
        setLocationRelativeTo(null);  
        setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
    public void setRecordToModify(PatientRecord record)
    {
       this.record = record;
       if(isEditing)
        {
            patientIDData.setText(record.getPatientID());
            fNameTxtbx.setText(record.getFName());
            lNameTxtbx.setText(record.getLName());
            ageTxtbx.setText(record.getAge() + "");
            if(record.getSex() == 'M')
            {
                sexCombo.setSelectedIndex(0);
            }
            else
                sexCombo.setSelectedIndex(1);
            bCountryTxtbx.setText(record.getBirthPlace());
            statusTxtbx.setText(record.getStatus());
            addressTxtbx.setText(record.getStreet());
            cityTxtbx.setText(record.getCity());
            regionTxtbx.setText(record.getRegion());
            numberTxtbx.setText(record.getContactNum());
            emailTxtbx.setText(record.getEmail());
            referralTxtbx.setText(record.getReferredBy());
            
        }
    }
    
    class cancelActionListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
        }
    }
    
    class registerBtnActionListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) 
        {
            char sex;
            int age;
            boolean valid = true;
            String birthday;
            if(sexCombo.getSelectedItem().equals("Male"))
            {
                sex = 'M';
            }
            else
            {
                sex = 'F';
           }
            
            int year = (int) yearSpinner.getValue();
            int day = (int) daySpinner.getValue();
            int month = (int) monthSpinner.getValue();
			
			if( year == 0 && day == 0 && month == 0)
			{
            	valid = false;
               JOptionPane.showMessageDialog(null, "Please input birthday!");
            }
			else
			{
				if(year >  Calendar.getInstance().get(Calendar.YEAR))
				{
					valid = false;
		            JOptionPane.showMessageDialog(null, "Invalid year: " + year);
				}
				
				if(month > 12 || month < 1)
				{
					valid = false;
		            JOptionPane.showMessageDialog(null, "Invalid month: " + month);
				}
				
				if(day > 31 || day < 1)
				{
					valid = false;
		            JOptionPane.showMessageDialog(null, "Invalid day: " + day);
				}
				
			}
			
			if(!(fNameTxtbx.getText().matches("([a-zA-Z]+\\s+)*[a-zA-Z]+")) || !(lNameTxtbx.getText().matches("([a-zA-Z]+\\s+)*[a-zA-Z]+")) || !(statusTxtbx.getText().matches("[a-zA-Z]+")) || !(cityTxtbx.getText().matches("([a-zA-Z]+\\s+)*[a-zA-Z]+")) || !(regionTxtbx.getText().matches("([a-zA-Z]+\\s+)*[a-zA-Z]+")) || !(referralTxtbx.getText().matches("([a-zA-Z]+\\s+)*[a-zA-Z]+")) )
			{
				valid = false;
				JOptionPane.showMessageDialog(null, "Invalid Input: Alphabet letters only!");
			}
			
			if(!(numberTxtbx.getText().matches("[0-9]+")))
			{
				valid = false;
				JOptionPane.showMessageDialog(null, "Invalid Input: Numerical number only!");
			}
			
			Pattern p = Pattern.compile(".+@.+\\.[a-z]+");
			Matcher m = p.matcher(emailTxtbx.getText());
			boolean matchFound = m.matches();
					if (!matchFound) {
						valid = false;
						JOptionPane.showMessageDialog(null, "Invalid email address!");
					}
			
			
		    try{
	        	  age = Integer.parseInt(ageTxtbx.getText());        	   
	          }
	          catch (NumberFormatException a) {
	        	  valid = false;
	        	   JOptionPane.showMessageDialog(null, "Invalid age: Numerical number only!");
	          }
				
            birthday = year + "-" + month + "-" + day;
            System.out.println("Birthday:" + birthday);
            
            if(valid)
            {
	            if(isEditing && record != null)
	            {
	                if(control.modifyPatientRecord(patientIDData.getText(), Calendar.getInstance().get(Calendar.YEAR) + "-" + (Calendar.getInstance().get(Calendar.MONTH) + 1 ) + "-" + Calendar.getInstance().get(Calendar.DAY_OF_MONTH), record.getRecordDate(), fNameTxtbx.getText(), lNameTxtbx.getText(), Integer.parseInt(ageTxtbx.getText()), sex, birthday, bCountryTxtbx.getText(),statusTxtbx.getText(), referralTxtbx.getText(), addressTxtbx.getText(), cityTxtbx.getText(), regionTxtbx.getText(), numberTxtbx.getText(), emailTxtbx.getText()))
	                	System.out.println("Patient Modified");
	            }
	            else
	            {
	                control.addPatientRecord(patientIDData.getText(), Calendar.getInstance().get(Calendar.YEAR) + "-" + (Calendar.getInstance().get(Calendar.MONTH) + 1 ) + "-" + Calendar.getInstance().get(Calendar.DAY_OF_MONTH), Calendar.getInstance().get(Calendar.YEAR) + "-" + (Calendar.getInstance().get(Calendar.MONTH) + 1 ) + "-" + Calendar.getInstance().get(Calendar.DAY_OF_MONTH), fNameTxtbx.getText(), lNameTxtbx.getText(), Integer.parseInt(ageTxtbx.getText()), sex, birthday, bCountryTxtbx.getText(),statusTxtbx.getText(), referralTxtbx.getText(), addressTxtbx.getText(), cityTxtbx.getText(), regionTxtbx.getText(), numberTxtbx.getText(), emailTxtbx.getText());
	                System.out.println("Patient Added");
	            }
            }
            dispose();
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        titleLabel = new javax.swing.JLabel();
        patientIDData = new javax.swing.JLabel();
        fNameLabel = new javax.swing.JLabel();
        lNameLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        sexLabel = new javax.swing.JLabel();
        contactsLabel = new javax.swing.JLabel();
        fNameTxtbx = new javax.swing.JTextField();
        lNameTxtbx = new javax.swing.JTextField();
        ageTxtbx = new javax.swing.JTextField();
        sexCombo = new javax.swing.JComboBox();
        addressLabel = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        regionLabel = new javax.swing.JLabel();
        numberLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        referralLabel = new javax.swing.JLabel();
        addressTxtbx = new javax.swing.JTextField();
        numberTxtbx = new javax.swing.JTextField();
        emailTxtbx = new javax.swing.JTextField();
        referralTxtbx = new javax.swing.JTextField();
        registerBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        cityTxtbx = new javax.swing.JTextField();
        regionTxtbx = new javax.swing.JTextField();
        bDateLabel = new javax.swing.JLabel();
        bCountryLabel = new javax.swing.JLabel();
        bCountryTxtbx = new javax.swing.JTextField();
        daySpinner = new javax.swing.JSpinner();
        monthSpinner = new javax.swing.JSpinner();
        yearSpinner = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        statusTxtbx = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setText("Register Patient:");

        patientIDData.setText("[patientID]");

        fNameLabel.setText("First Name:");

        lNameLabel.setText("Last Name:");

        ageLabel.setText("Age:");

        sexLabel.setText("Sex:");

        contactsLabel.setText("Contact Details:");

        sexCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female", "Other"}));

        addressLabel.setText("Address Line:");

        cityLabel.setText("City:");

        regionLabel.setText("Region:");

        numberLabel.setText("Contact Number:");

        emailLabel.setText("Email Address:");

        referralLabel.setText("Source of Referral:");

        registerBtn.setText("Register");

        cancelBtn.setText("Cancel");

        bDateLabel.setText("Birth Date: dd/MM/yyyy");

        bCountryLabel.setText("Birth Country:");

        jLabel1.setText("Civil Status:");

        statusTxtbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusTxtbxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(referralTxtbx)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(registerBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addressLabel)
                            .addComponent(regionLabel)
                            .addComponent(cityLabel))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cityTxtbx)
                            .addComponent(regionTxtbx)
                            .addComponent(addressTxtbx)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(numberLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numberTxtbx))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(emailLabel)
                        .addGap(22, 22, 22)
                        .addComponent(emailTxtbx))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(referralLabel)
                            .addComponent(contactsLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(titleLabel)
                                    .addComponent(fNameLabel)
                                    .addComponent(lNameLabel)
                                    .addComponent(ageLabel)
                                    .addComponent(sexLabel)
                                    .addComponent(bCountryLabel)
                                    .addComponent(bDateLabel)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(daySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(monthSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(yearSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(patientIDData)
                                    .addComponent(lNameTxtbx)
                                    .addComponent(ageTxtbx)
                                    .addComponent(sexCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bCountryTxtbx)
                                    .addComponent(fNameTxtbx)
                                    .addComponent(statusTxtbx))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLabel)
                    .addComponent(patientIDData))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fNameLabel)
                    .addComponent(fNameTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNameLabel)
                    .addComponent(lNameTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabel)
                    .addComponent(ageTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sexLabel)
                    .addComponent(sexCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCountryLabel)
                    .addComponent(bCountryTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bDateLabel)
                    .addComponent(yearSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(daySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(statusTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(contactsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel)
                    .addComponent(addressTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regionLabel)
                    .addComponent(regionTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberLabel)
                    .addComponent(numberTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(referralLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(referralTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBtn)
                    .addComponent(registerBtn)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void statusTxtbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusTxtbxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusTxtbxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressTxtbx;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTxtbx;
    private javax.swing.JLabel bCountryLabel;
    private javax.swing.JTextField bCountryTxtbx;
    private javax.swing.JLabel bDateLabel;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField cityTxtbx;
    private javax.swing.JLabel contactsLabel;
    private javax.swing.JSpinner daySpinner;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTxtbx;
    private javax.swing.JLabel fNameLabel;
    private javax.swing.JTextField fNameTxtbx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lNameLabel;
    private javax.swing.JTextField lNameTxtbx;
    private javax.swing.JSpinner monthSpinner;
    private javax.swing.JLabel numberLabel;
    private javax.swing.JTextField numberTxtbx;
    private javax.swing.JLabel patientIDData;
    private javax.swing.JLabel referralLabel;
    private javax.swing.JTextField referralTxtbx;
    private javax.swing.JLabel regionLabel;
    private javax.swing.JTextField regionTxtbx;
    private javax.swing.JButton registerBtn;
    private javax.swing.JComboBox sexCombo;
    private javax.swing.JLabel sexLabel;
    private javax.swing.JTextField statusTxtbx;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JSpinner yearSpinner;
    // End of variables declaration//GEN-END:variables
}
