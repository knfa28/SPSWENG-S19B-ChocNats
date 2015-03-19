package view;

import control.MainController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.time.Clock.system;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.WindowConstants;

public class LoginView extends javax.swing.JFrame {

    private MainController control;
    public LoginView(MainController control) {
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {}
        this.control = control;
        this.setResizable(false);
        initComponents();
        setLocationRelativeTo(null);  
        setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        loginBtn.addActionListener(new loginBtnActionListener());
    }
    
    public void noUser() {
        JOptionPane.showMessageDialog(null, "No such user!");
    }

    public void wrongPassword() {
        JOptionPane.showMessageDialog(null, "Wrong password!");
    }

    class loginBtnActionListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            String password = "";
            char[] passwordArr = passTxtbx.getPassword();
            
            if(userTxtbx.getText()=="" || passTxtbx.getPassword().toString()=="")
                JOptionPane.showMessageDialog(null, "Please input user ID and password!");
            else{
                for(int i = 0; i < passwordArr.length; i++){
                    password = password + passwordArr[i];
                }

                if(control.login(userTxtbx.getText(), password))
                    dispose();    
                else{
                    JOptionPane.showMessageDialog(null, "Username/Password is invalid!");
                    userTxtbx.setText("");
                    passTxtbx.setText("");
                }
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        passTxtbx = new javax.swing.JPasswordField();
        userTxtbx = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        userLabel.setText("Username:");

        passLabel.setText("Password:");

        loginBtn.setText("Login");

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
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
                            .addComponent(userLabel)
                            .addComponent(passLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userTxtbx)
                            .addComponent(passTxtbx)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userLabel)
                    .addComponent(userTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passLabel)
                    .addComponent(passTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginBtn)
                    .addComponent(cancelBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cancelBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel passLabel;
    private javax.swing.JPasswordField passTxtbx;
    private javax.swing.JLabel userLabel;
    private javax.swing.JTextField userTxtbx;
    // End of variables declaration//GEN-END:variables
}
