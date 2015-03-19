package view;

import model.Account;
import control.MainController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.UIManager;
import javax.swing.WindowConstants;

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
        employeeIDData.setText(currentAccount.getUserID());
        typeData.setText(currentAccount.getType());
        nameData.setText(currentAccount.getFName() + " " + currentAccount.getLName());
        mobileNumData.setText(currentAccount.getMobNum());
        emailData.setText(currentAccount.getEmail());
        backData.addActionListener(new cancelActionListener());
        ArrayList<String> specialty = currentAccount.getSpecializations();
        for(int i = 0; i < specialty.size(); i++)
        {
            specialtiesCombo.addItem(specialty.get(i));
        }
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
        specialtiesLabel = new javax.swing.JLabel();
        specialtiesCombo = new javax.swing.JComboBox();
        contactLabel = new javax.swing.JLabel();
        mobileNumLabel = new javax.swing.JLabel();
        mobileNumData = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        emailData = new javax.swing.JLabel();
        backData = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        employeeIDLabel.setText("Employee ID:");

        employeeIDData.setText("[employeeID]");

        typeLabel.setText("Employee Type:");

        typeData.setText("[type]");

        nameLabel.setText("Name:");

        nameData.setText("[lastName + firstName]");

        specialtiesLabel.setText("Specialties:");

        specialtiesCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));

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

        titleLabel.setText("Employee Details:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(backData, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contactLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(emailLabel)
                                .addGap(18, 18, 18)
                                .addComponent(emailData))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mobileNumLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mobileNumData))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(specialtiesLabel)
                                .addGap(29, 29, 29)
                                .addComponent(specialtiesCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(titleLabel))
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeIDLabel)
                    .addComponent(employeeIDData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeLabel)
                    .addComponent(typeData))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(specialtiesLabel)
                    .addComponent(specialtiesCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(contactLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobileNumLabel)
                    .addComponent(mobileNumData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailData))
                .addGap(29, 29, 29)
                .addComponent(backData)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backDataActionPerformed
        dispose();
    }//GEN-LAST:event_backDataActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backData;
    private javax.swing.JLabel contactLabel;
    private javax.swing.JLabel emailData;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel employeeIDData;
    private javax.swing.JLabel employeeIDLabel;
    private javax.swing.JLabel mobileNumData;
    private javax.swing.JLabel mobileNumLabel;
    private javax.swing.JLabel nameData;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JComboBox specialtiesCombo;
    private javax.swing.JLabel specialtiesLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel typeData;
    private javax.swing.JLabel typeLabel;
    // End of variables declaration//GEN-END:variables
}
