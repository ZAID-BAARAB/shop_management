
package Authentification;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class SignUp extends javax.swing.JFrame {
static Connection con;
static PreparedStatement ps;
 
    public SignUp() {
        initComponents();
    }
    
    
    public void connecter() {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "impossible to connect to Database");
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
    
    
    public boolean enregistrer(String nom, String prenom, String email, String pass) {
        String sql = "insert into users(nom,prenom,email,password) values(?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, nom);
            ps.setString(2, prenom);
            ps.setString(3, email);
            ps.setString(4, pass);
          
            ps.executeUpdate();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return true;
    }
    
    public void RedirectionToLogin(){
        
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null); 
        this.dispose();
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        lblboutique4up = new javax.swing.JLabel();
        lblpassword = new javax.swing.JPanel();
        lblsignup = new javax.swing.JLabel();
        lblprenom = new javax.swing.JLabel();
        txtprenom = new javax.swing.JTextField();
        lblemail = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        lblaccount = new javax.swing.JLabel();
        btnsignup = new javax.swing.JButton();
        btnlogin = new javax.swing.JButton();
        txtnom = new javax.swing.JTextField();
        lblnom = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign Up");

        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.setPreferredSize(new java.awt.Dimension(800, 500));
        panel1.setLayout(null);

        panel2.setBackground(new java.awt.Color(0, 142, 200));

        lblboutique4up.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        lblboutique4up.setForeground(new java.awt.Color(255, 255, 255));
        lblboutique4up.setText("BOUTIQUE4UP");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(lblboutique4up)
                .addContainerGap(131, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(lblboutique4up)
                .addContainerGap(270, Short.MAX_VALUE))
        );

        panel1.add(panel2);
        panel2.setBounds(0, 0, 400, 510);

        lblpassword.setBackground(new java.awt.Color(255, 255, 255));

        lblsignup.setBackground(new java.awt.Color(0, 102, 102));
        lblsignup.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblsignup.setText("SIGN UP");

        lblprenom.setBackground(new java.awt.Color(102, 102, 102));
        lblprenom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblprenom.setText("prenom");

        txtprenom.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtprenom.setForeground(new java.awt.Color(102, 102, 102));
        txtprenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprenomActionPerformed(evt);
            }
        });

        lblemail.setBackground(new java.awt.Color(102, 102, 102));
        lblemail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblemail.setText("Email");

        txtemail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtemail.setForeground(new java.awt.Color(102, 102, 102));

        txtpassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtpassword.setForeground(new java.awt.Color(102, 102, 102));

        lblaccount.setText("I've an account");

        btnsignup.setBackground(new java.awt.Color(0, 102, 200));
        btnsignup.setForeground(new java.awt.Color(255, 255, 255));
        btnsignup.setText("Sign Up");
        btnsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsignupActionPerformed(evt);
            }
        });

        btnlogin.setForeground(new java.awt.Color(255, 51, 51));
        btnlogin.setText("Login");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });

        txtnom.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtnom.setForeground(new java.awt.Color(102, 102, 102));

        lblnom.setBackground(new java.awt.Color(102, 102, 102));
        lblnom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblnom.setText("nom");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Password");

        javax.swing.GroupLayout lblpasswordLayout = new javax.swing.GroupLayout(lblpassword);
        lblpassword.setLayout(lblpasswordLayout);
        lblpasswordLayout.setHorizontalGroup(
            lblpasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblpasswordLayout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addComponent(lblsignup)
                .addGap(97, 97, 97))
            .addGroup(lblpasswordLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(lblpasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblpasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblprenom)
                        .addComponent(txtprenom)
                        .addComponent(lblemail)
                        .addComponent(txtemail, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                        .addComponent(txtpassword)
                        .addComponent(txtnom))
                    .addComponent(btnsignup, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(lblpasswordLayout.createSequentialGroup()
                        .addComponent(lblaccount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblnom)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lblpasswordLayout.setVerticalGroup(
            lblpasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblpasswordLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblsignup)
                .addGap(26, 26, 26)
                .addComponent(lblnom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblprenom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtprenom, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblemail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnsignup, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(lblpasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblaccount)
                    .addComponent(btnlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        panel1.add(lblpassword);
        lblpassword.setBounds(400, 0, 400, 510);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        // TODO add your handling code here:
        RedirectionToLogin();
    }//GEN-LAST:event_btnloginActionPerformed

    private void btnsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsignupActionPerformed
        // TODO add your handling code here:
        
        if (txtnom.getText().isEmpty() || txtprenom.getText().isEmpty() || txtemail.getText().isEmpty() || txtpassword.getText().isEmpty() ) {
                JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs");
            } else {
//                int rep=JOptionPane.showConfirmDialog(null, "vraiment?", "Ajouter Etudiant", 2,3);
               

                  
                    String nom = txtnom.getText();
                    String prenom = txtprenom.getText();
                    String email = txtemail.getText();
                    String pass = txtpassword.getText();
                    connecter();
                    enregistrer(nom, prenom, email,pass);
                    JOptionPane.showMessageDialog(null, "your account is created succesfully!");
                    
                    RedirectionToLogin();
                    

                


            }
    }//GEN-LAST:event_btnsignupActionPerformed

    private void txtprenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprenomActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnsignup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblaccount;
    private javax.swing.JLabel lblboutique4up;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblnom;
    private javax.swing.JPanel lblpassword;
    private javax.swing.JLabel lblprenom;
    private javax.swing.JLabel lblsignup;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtnom;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtprenom;
    // End of variables declaration//GEN-END:variables
}
