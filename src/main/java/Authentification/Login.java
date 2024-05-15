
package Authentification;

import java.sql.DriverManager;
import java.sql.SQLException;
import static Authentification.SignUp.con;
import com.mycompany.boutiqueapp.Home;
import java.sql.PreparedStatement;
import java.sql.*;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

  
    public Login() {
        initComponents();
    }
    
    public void RedirectionToDashbord(){
      // Create an instance of the Home class
        Home homeFrame = new Home();

        // Make the Home frame visible
        homeFrame.setVisible(true);
        homeFrame.pack();
        homeFrame.setLocationRelativeTo(null);

        // Hide the Login frame
        this.dispose();
        
    }
    
        public void connecter() {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {

            e.printStackTrace();

            return;
        }

        // Database connection parameters
        String url = "jdbc:mysql://localhost:3306/java";
        String username = "root";
        String password = "Novel222@@@";

        try {

            con = DriverManager.getConnection(url, username, password);

            System.out.println("Connected !");
        } catch (SQLException e) {

            e.printStackTrace();

        }
    }
    
        
    
    private Boolean Verification(String email,String pass) {
            connecter();
            boolean isVerified = false;
            String sql = "SELECT email, password FROM users WHERE email=? AND password=?";
            try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
                preparedStatement.setString(1, email);
                preparedStatement.setString(2, pass);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        
                        
                        System.out.println("User found");
                        isVerified= true;
                    } else {
                     
                        System.out.println("User NOT found");
                        isVerified = false;
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return isVerified;
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        lblboutique4up = new javax.swing.JLabel();
        welcome = new javax.swing.JLabel();
        Left = new javax.swing.JPanel();
        lbllogin = new javax.swing.JLabel();
        lblemail = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        lblpassword = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        btnlogin = new javax.swing.JButton();
        lblaccount = new javax.swing.JLabel();
        btnsignup = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setPreferredSize(new java.awt.Dimension(800, 500));
        panel.setLayout(null);

        Right.setBackground(new java.awt.Color(0, 142, 200));
        Right.setPreferredSize(new java.awt.Dimension(400, 500));

        lblboutique4up.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        lblboutique4up.setForeground(new java.awt.Color(255, 255, 255));
        lblboutique4up.setText("BOUTIQUE4UP");

        welcome.setFont(new java.awt.Font("C059", 1, 24)); // NOI18N
        welcome.setForeground(new java.awt.Color(255, 255, 255));
        welcome.setText("Welcome !");

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(lblboutique4up))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(welcome)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(welcome)
                .addGap(28, 28, 28)
                .addComponent(lblboutique4up)
                .addContainerGap(208, Short.MAX_VALUE))
        );

        panel.add(Right);
        Right.setBounds(0, 0, 400, 500);

        Left.setBackground(new java.awt.Color(255, 255, 255));
        Left.setMinimumSize(new java.awt.Dimension(400, 500));

        lbllogin.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbllogin.setText("LOGIN");

        lblemail.setBackground(new java.awt.Color(102, 102, 102));
        lblemail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblemail.setText("Email");

        txtemail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtemail.setForeground(new java.awt.Color(102, 102, 102));

        lblpassword.setBackground(new java.awt.Color(102, 102, 102));
        lblpassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblpassword.setText("Password");

        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });

        btnlogin.setBackground(new java.awt.Color(0, 102, 200));
        btnlogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(255, 255, 255));
        btnlogin.setText("Login");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });

        lblaccount.setText("I don't have an account");

        btnsignup.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnsignup.setForeground(new java.awt.Color(255, 51, 51));
        btnsignup.setText("Sign Up");
        btnsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsignupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(lbllogin))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblemail)
                                .addComponent(txtemail)
                                .addComponent(lblpassword)
                                .addComponent(txtpassword, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                                .addComponent(btnlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(LeftLayout.createSequentialGroup()
                                .addComponent(lblaccount)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnsignup)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(lbllogin)
                .addGap(40, 40, 40)
                .addComponent(lblemail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblpassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblaccount)
                    .addComponent(btnsignup))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        panel.add(Left);
        Left.setBounds(400, 0, 400, 485);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsignupActionPerformed
        
        SignUp SignUpFrame = new SignUp();
        SignUpFrame.setVisible(true);
        SignUpFrame.pack();
        SignUpFrame.setLocationRelativeTo(null); 
        this.dispose();
    }//GEN-LAST:event_btnsignupActionPerformed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        // TODO add your handling code here:
       if (txtemail.getText().isEmpty() || txtpassword.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs");
        } else{
        
            String email=txtemail.getText();
            String pass=txtpassword.getText();

            connecter();

            Boolean resp = Verification(email,pass);
            if(resp){
                RedirectionToDashbord();
            }else{
                JOptionPane.showMessageDialog(null, "Email or password invalid");
            }
            
       }
       
    }//GEN-LAST:event_btnloginActionPerformed

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private javax.swing.JPanel Right;
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnsignup;
    private javax.swing.JLabel lblaccount;
    private javax.swing.JLabel lblboutique4up;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lbllogin;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField txtemail;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
