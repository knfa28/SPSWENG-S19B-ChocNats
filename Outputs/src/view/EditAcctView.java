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
        initComponents();
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
    
    class registerBtnActionListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            boolean valid = true;

  			if(!(fNameTxtbx.getText().matches("([a-zA-Z]+\\s+)*[a-zA-Z]+")) || !(lNameTxtbx.getText().matches("([a-zA-Z]+\\s+)*[a-zA-Z]+"))) 			{
  				valid = false;
  				JOptionPane.showMessageDialog(null, "Invalid Input: Alphabet letters only!");
  			}
  			
  			if(!(mobileNumTxtbx.getText().matches("[0-9]+")))
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
            	JOptionPane.showMessageDialog(null, "Passwords does not match!");
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setText("Register Account:");

        typeLabel.setText("User Type:");

        fNameLabel.setText("First Name:");

        lNameLabel.setText("Last Name:");

        passLabel.setText("Password:");

        cPassLabel.setText("Confirm Password:");

        registerBtn.setText("Register");

        cancelBtn.setText("Cancel");

        typeCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Secretary", "Physician", "Researcher"}));

        mobileNumLabel.setText("Contact Number:");

        emailLabel.setText("Email Address:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cPassLabel)
                            .addComponent(passLabel)
                            .addComponent(fNameLabel)
                            .addComponent(lNameLabel)
                            .addComponent(typeLabel)
                            .addComponent(titleLabel)
                            .addComponent(emailLabel)
                            .addComponent(mobileNumLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(mobileNumTxtbx, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passTxtbx, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lNameTxtbx, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(typeCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, 164, Short.MAX_VALUE)
                            .addComponent(fNameTxtbx, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cPassTxtbx, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailTxtbx)
                            .addComponent(employeeIDData))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(registerBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passLabel)
                    .addComponent(passTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cPassLabel)
                    .addComponent(cPassTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerBtn)
                    .addComponent(cancelBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cPassLabel;
    private javax.swing.JPasswordField cPassTxtbx;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTxtbx;
    private javax.swing.JTextField employeeIDData;
    private javax.swing.JLabel fNameLabel;
    private javax.swing.JTextField fNameTxtbx;
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
