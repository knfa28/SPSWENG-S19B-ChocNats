package view;

import model.Account;
import model.AccountsModel;
import control.MainController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.WindowConstants;

public class EditAcctView extends javax.swing.JFrame 
{
    private Account currentAccount;
    private boolean isEditing;
    private String fName;
    private String lName;
    private MainController control;
    public EditAcctView(MainController control, boolean isEditing) {
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
        fName = "";
        lName = "";
        initComponents();
        if(this.isEditing)
        {
            jLabel1.setText("Edit Account");
        }
        registerBtn.addActionListener(new registerBtnActionListener());
        cancelBtn.addActionListener(new cancelActionListener());
        this.setResizable(false);
        setLocationRelativeTo(null);  
        setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
    public void setAccountToModify(Account account)
    {
        currentAccount = account;
        
        if(isEditing)
        {
            System.out.println("Editing");
            employeeIDData.setText(currentAccount.getUserID());
            if(currentAccount.getType().equals("Physician"))
            {
                typeCombo.setSelectedIndex(1);
            }
            else if(currentAccount.getType().equals("Secretary"))
            {
                typeCombo.setSelectedIndex(0);
            }
            else
            {
                typeCombo.setSelectedIndex(2);
            }
            fNameTxtbx.setText(currentAccount.getFName());
            lNameTxtbx.setText(currentAccount.getLName());
            mobileNumTxtbx.setText(currentAccount.getMobNum());
            emailTxtbx.setText(currentAccount.getEmail());
            String password = currentAccount.getPassword();
            cPassTxtbx.setText(password);
            passTxtbx.setText(password);
        }
    }
    
    private void setAccountID(String fName, String lName)
    {
        employeeIDData.setText(fName + "_" + lName);
    }
    
    class registerBtnActionListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            boolean valid = true;
            String errorMessage;
            if(isEditing)
            {
                errorMessage = "Unable to Edit Account due to the following errors: \n\n";
            }
            else
            {
                errorMessage = "Unable to Create Account due to the following errors: \n\n";
            }
                
  			if(!(fNameTxtbx.getText().matches("([a-zA-Z]+\\s+)*[a-zA-Z]+")) || !(lNameTxtbx.getText().matches("([a-zA-Z]+\\s+)*[a-zA-Z]+"))) 			{
  				valid = false;
  				errorMessage = errorMessage + "Invalid First Name: Alphabet letters only!\n";
  			}
  			
  			if(!(mobileNumTxtbx.getText().matches("[0-9]+")))
  			{
  				valid = false;
  				errorMessage = errorMessage + "Invalid Last Name: Numerical number only!\n";
  			}
  			
  			Pattern p = Pattern.compile(".+@.+\\.[a-z]+");
  			Matcher m = p.matcher(emailTxtbx.getText());
  			boolean matchFound = m.matches();
  					if (!matchFound) {
  						valid = false;
  						errorMessage = errorMessage + "Invalid email address!\n";
  					}

        	
        	String password = "";
            char[] passwordArr = passTxtbx.getPassword();
            for(int i = 0; i < passwordArr.length; i++)
            {
                password = password + passwordArr[i];
            }
            String cpassword = "";
            char[] cpasswordArr = cPassTxtbx.getPassword();
            for(int i = 0; i < cpasswordArr.length; i++)
            {
                cpassword = cpassword + cpasswordArr[i];
            }
            
            if(!(password.equals(cpassword)))
            {
            	valid =  false;
            	errorMessage = errorMessage + "Passwords does not match!\n";
            }
            
            if(valid)
            {
	            try
	            {
	                if(isEditing)
	                {
	                    control.modifyAccount(employeeIDData.getText(), password, fNameTxtbx.getText(), lNameTxtbx.getText(), typeCombo.getSelectedItem()+ "", mobileNumTxtbx.getText(), emailTxtbx.getText(), currentAccount.getRegisterDate());
	                }
	                else
	                {
	                    control.addAccount(employeeIDData.getText(), password, fNameTxtbx.getText(), lNameTxtbx.getText(), typeCombo.getSelectedItem()+ "", mobileNumTxtbx.getText(), emailTxtbx.getText(), Calendar.getInstance().get(Calendar.YEAR) + "-" + (Calendar.getInstance().get(Calendar.MONTH) + 1 ) + "-" + Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
	                }
	            }catch(NumberFormatException ex)
	            {
	                JOptionPane.showMessageDialog(null, "Age must be an integer!", "Message", JOptionPane.ERROR_MESSAGE);
	                ex.printStackTrace();
	            }
            }
            else
            {
                JOptionPane.showMessageDialog(null, errorMessage, "Message", JOptionPane.ERROR_MESSAGE);
            }
            dispose();
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

        titleLabel = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        fNameLabel = new javax.swing.JLabel();
        lNameLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        cPassLabel = new javax.swing.JLabel();
        registerBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        lNameTxtbx = new javax.swing.JTextField();
        passTxtbx = new javax.swing.JPasswordField();
        cPassTxtbx = new javax.swing.JPasswordField();
        typeCombo = new javax.swing.JComboBox();
        fNameTxtbx = new javax.swing.JTextField();
        mobileNumLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        mobileNumTxtbx = new javax.swing.JTextField();
        emailTxtbx = new javax.swing.JTextField();
        employeeIDData = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setText("Register Account:");

        typeLabel.setText("User Type:");

        fNameLabel.setText("First Name:");

        lNameLabel.setText("Last Name:");

        passLabel.setText("Password:");

        cPassLabel.setText("Confirm Password:");

        registerBtn.setText("Register");

        cancelBtn.setText("Cancel");

        lNameTxtbx.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lNameTxtbxKeyReleased(evt);
            }
        });

        typeCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Secretary", "Physician", "Researcher"}));

        fNameTxtbx.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fNameTxtbxKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fNameTxtbxKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fNameTxtbxKeyTyped(evt);
            }
        });

        mobileNumLabel.setText("Contact Number:");

        emailLabel.setText("Email Address:");

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel1.setText("Register Account");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fNameLabel)
                            .addComponent(lNameLabel)
                            .addComponent(typeLabel)
                            .addComponent(titleLabel)
                            .addComponent(emailLabel)
                            .addComponent(mobileNumLabel)
                            .addComponent(passLabel))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(emailTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mobileNumTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lNameTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fNameTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(typeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(employeeIDData, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cPassLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(registerBtn))
                            .addComponent(cPassTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLabel)
                    .addComponent(employeeIDData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeLabel)
                    .addComponent(typeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fNameLabel)
                    .addComponent(fNameTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNameLabel)
                    .addComponent(lNameTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobileNumLabel)
                    .addComponent(mobileNumTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cPassTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cPassLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerBtn)
                    .addComponent(cancelBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fNameTxtbxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fNameTxtbxKeyTyped

    }//GEN-LAST:event_fNameTxtbxKeyTyped

    private void fNameTxtbxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fNameTxtbxKeyPressed

    }//GEN-LAST:event_fNameTxtbxKeyPressed

    private void fNameTxtbxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fNameTxtbxKeyReleased
        fName = fNameTxtbx.getText();
        setAccountID(fName,lName);
    }//GEN-LAST:event_fNameTxtbxKeyReleased

    private void lNameTxtbxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lNameTxtbxKeyReleased
        lName = lNameTxtbx.getText();
        setAccountID(fName,lName);
    }//GEN-LAST:event_lNameTxtbxKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cPassLabel;
    private javax.swing.JPasswordField cPassTxtbx;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTxtbx;
    private javax.swing.JTextField employeeIDData;
    private javax.swing.JLabel fNameLabel;
    private javax.swing.JTextField fNameTxtbx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lNameLabel;
    private javax.swing.JTextField lNameTxtbx;
    private javax.swing.JLabel mobileNumLabel;
    private javax.swing.JTextField mobileNumTxtbx;
    private javax.swing.JLabel passLabel;
    private javax.swing.JPasswordField passTxtbx;
    private javax.swing.JButton registerBtn;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JComboBox typeCombo;
    private javax.swing.JLabel typeLabel;
    // End of variables declaration//GEN-END:variables
}
