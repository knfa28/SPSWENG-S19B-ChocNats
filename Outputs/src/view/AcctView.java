package view;

import control.MainController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import model.Account;

public class AcctView extends javax.swing.JFrame {
    private MainController control;
    private Account currentAccount;
    public AcctView(MainController control, Account currentAccount) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {}
        this.control = control;
        this.currentAccount = currentAccount;
        initComponents();
        
        if(control.getCurrAcctType().equals("Administrator"))
        {
            ResetPasswordBtn.setVisible(true);
        }
        else if(control.getCurrAcctType().equals("Physician") && currentAccount.getType().equals("Physician"))
        {
            ResetPasswordBtn.setVisible(true);
        }
        else
        {
            ResetPasswordBtn.setVisible(false);
        }
        
        if(control.getCurrAcctType().equals("Administrator"))
        {
            ResetPasswordBtn.setText("Reset Password");
        }
        else if(control.getCurrAcctType().equals("Physician"))
        {
            ResetPasswordBtn.setText("Refer Patient");
        }
        
        employeeIDData.setText(currentAccount.getUserID());
        typeData.setText(currentAccount.getType());
        nameData.setText(currentAccount.getFName() + " " + currentAccount.getLName());
        mobileNumData.setText(currentAccount.getMobNum());
        emailData.setText(currentAccount.getEmail());
        backData.addActionListener(new cancelActionListener());
        this.setResizable(false);
        setLocationRelativeTo(null);  
        setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
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

        employeeIDLabel = new javax.swing.JLabel();
        employeeIDData = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        typeData = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        nameData = new javax.swing.JLabel();
        contactLabel = new javax.swing.JLabel();
        mobileNumLabel = new javax.swing.JLabel();
        mobileNumData = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        emailData = new javax.swing.JLabel();
        backData = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        ResetPasswordBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        employeeIDLabel.setText("Employee ID:");

        employeeIDData.setText("[employeeID]");

        typeLabel.setText("Employee Type:");

        typeData.setText("[type]");

        nameLabel.setText("Name:");

        nameData.setText("[lastName + firstName]");

        contactLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        contactLabel.setText("Contact Details:");

        mobileNumLabel.setText("Contact Number:");

        mobileNumData.setText("[mobileNum]");

        emailLabel.setText("Email Address:");

        emailData.setText("[email]");

        backData.setText("Back");
        backData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backDataActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        titleLabel.setText("Employee Account Details");

        ResetPasswordBtn.setText("Reset Password");
        ResetPasswordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetPasswordBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contactLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mobileNumLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mobileNumData))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(typeLabel)
                                    .addComponent(nameLabel)
                                    .addComponent(employeeIDLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(employeeIDData)
                                    .addComponent(nameData)
                                    .addComponent(typeData)))
                            .addComponent(titleLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(emailLabel)
                                .addGap(18, 18, 18)
                                .addComponent(emailData))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 66, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ResetPasswordBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backData, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeIDLabel)
                    .addComponent(employeeIDData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeLabel)
                    .addComponent(typeData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameData))
                .addGap(33, 33, 33)
                .addComponent(contactLabel)
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobileNumLabel)
                    .addComponent(mobileNumData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailData))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backData)
                    .addComponent(ResetPasswordBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backDataActionPerformed
        dispose();
    }//GEN-LAST:event_backDataActionPerformed

    private void ResetPasswordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetPasswordBtnActionPerformed
        
        
        if(control.getCurrAcctType().equals("Administrator"))
        {
            String password = "";
            String adminPassword = "";
            JPasswordField Password = new JPasswordField();
            JPasswordField AdminPassword = new JPasswordField();
            char[] passwordArr;
            Object[] passField = {
            "New Password",Password,
            "Admin Password", AdminPassword        
            };

            JOptionPane.showConfirmDialog(null, passField, "Change Password", JOptionPane.DEFAULT_OPTION);
            passwordArr = Password.getPassword();
            for(int i = 0; i < passwordArr.length; i++)
            {
                password = password + passwordArr[i];
            }
            passwordArr = AdminPassword.getPassword();
            for(int i = 0; i < passwordArr.length; i++)
            {
                adminPassword = adminPassword + passwordArr[i];
            }
            System.out.println("DONE!");
            control.resetPassword(currentAccount, password, adminPassword);
        }
        else if(control.getCurrAcctType().equals("Physician"))
        {
            //refer patient
        }
    }//GEN-LAST:event_ResetPasswordBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ResetPasswordBtn;
    private javax.swing.JButton backData;
    private javax.swing.JLabel contactLabel;
    private javax.swing.JLabel emailData;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel employeeIDData;
    private javax.swing.JLabel employeeIDLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel mobileNumData;
    private javax.swing.JLabel mobileNumLabel;
    private javax.swing.JLabel nameData;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel typeData;
    private javax.swing.JLabel typeLabel;
    // End of variables declaration//GEN-END:variables
}
