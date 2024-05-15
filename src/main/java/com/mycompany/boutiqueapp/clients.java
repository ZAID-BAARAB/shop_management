
package com.mycompany.boutiqueapp;
import com.mycompany.boutiqueapp.AjouterClient;
import java.sql.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class clients extends javax.swing.JFrame {
    
        private static final String JDBC_URL = "jdbc:mysql://localhost:3306/java";
        private static final String USERNAME = "root";
        private static final String PASSWORD = "Novel222@@@";
        private Home homeFrame;
    public clients( Home homeFrame) {
        initComponents();
        getClients();
        this.homeFrame = homeFrame;
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                // Set the visibility of the Home frame to true when Facturation frame is closed
                homeFrame.setVisible(true);
            }
        });
    }
    
    public void getClients(){
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Clear the existing rows

        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            String query = "SELECT * FROM clients";

            try (PreparedStatement preparedStatement = connection.prepareStatement(query);
                 ResultSet resultSet = preparedStatement.executeQuery()) {

                while (resultSet.next()) {
                    int clientId = resultSet.getInt("id");
                    String nom = resultSet.getString("nom");
                    String prenom = resultSet.getString("prenom");
                    String adress = resultSet.getString("adress");
                    String num_tele = resultSet.getString("num_tele");
                    String email = resultSet.getString("email");

                    // Add a new row to the table
                    model.addRow(new Object[]{clientId, nom, prenom, adress, num_tele, email});
                }
            }
        } catch (SQLException e) {
            System.err.println("Error retrieving data from the database: " + e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnajouter = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Search = new javax.swing.JButton();
        search_feild = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        brundcrump = new javax.swing.JLabel();
//        brundcrump1 = new javax.swing.JLabel();
        brundcrump1= new javax.swing.JButton("Home");
        utxtemail = new javax.swing.JTextField();
        utxtprenom = new javax.swing.JTextField();
        utxtnom = new javax.swing.JTextField();
        utxtnum_tele = new javax.swing.JTextField();
        utxtadress = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnajouter.setBackground(new java.awt.Color(0, 255, 0));
        btnajouter.setText("Ajouter Client");
        btnajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnajouterActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "Nom", "Prenom", "Adress", "Num de Téléphone", "Email"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        Update.setBackground(new java.awt.Color(255, 255, 0));
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Delete.setBackground(new java.awt.Color(255, 0, 0));
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Search.setBackground(new java.awt.Color(0, 255, 255));
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        brundcrump.setBackground(new java.awt.Color(50, 50, 50));
        brundcrump.setText("clients ");

//        brundcrump1.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
//        brundcrump1.setText("Home / ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(brundcrump1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(brundcrump)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brundcrump)
                    .addComponent(brundcrump1))
                .addContainerGap())
        );

        utxtnom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utxtnomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnajouter)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                                .addComponent(search_feild, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Search)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Delete)
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Update)
                                    .addComponent(utxtnom, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(utxtprenom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(utxtadress, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(utxtnum_tele, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(utxtemail, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Search)
                            .addComponent(Delete)
                            .addComponent(search_feild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Update))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(utxtnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(utxtprenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(utxtadress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(utxtnum_tele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(utxtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(110, 110, 110))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnajouterActionPerformed
        // TODO add your handling code here:
        AjouterClient AjouterClientsFrame = new AjouterClient();
        
        AjouterClientsFrame.setVisible(true);
        AjouterClientsFrame.pack();
        AjouterClientsFrame.setLocationRelativeTo(null); 
        this.dispose();
    }//GEN-LAST:event_btnajouterActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
                    String searchTerm = search_feild.getText().trim();

        if (!searchTerm.isEmpty()) {
            DefaultTableModel displayModel = (DefaultTableModel) table.getModel();
            displayModel.setRowCount(0); // Clear the existing rows

            try (Connection connect = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
                // SQL statement to select products with matching product name
                String selectQuery = "SELECT * FROM clients WHERE nom LIKE ? or prenom LIKE ? or adress LIKE ?";

                try (PreparedStatement preparedStatement = connect.prepareStatement(selectQuery)) {
                    preparedStatement.setString(1, "%" + searchTerm + "%"); // Use "%" for partial matching
                    preparedStatement.setString(2, "%" + searchTerm + "%"); // Use "%" for partial matching
                    preparedStatement.setString(3, "%" + searchTerm + "%"); // Use "%" for partial matching
                   

                    try (ResultSet resultSet = preparedStatement.executeQuery()) {
                        while (resultSet.next()) {
                            int clientId = resultSet.getInt("id");
                            String nom = resultSet.getString("nom");
                            String prenom = resultSet.getString("prenom");
                            String adress = resultSet.getString("adress");
                            String num_tele = resultSet.getString("num_tele");
                            String email = resultSet.getString("email");


                            // Add a new row to the display table
                            displayModel.addRow(new Object[]{clientId, nom, prenom, adress, num_tele, email});
                        }
                    }
                }
            } catch (SQLException e) {
                System.err.println("Error querying data from the database: " + e.getMessage());
            }
        } else {
            // If the search term is empty, display all clients
            getClients();
        }
    }//GEN-LAST:event_SearchActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        int selectedRow = table.getSelectedRow();
        

        if (selectedRow != -1) {

            try (Connection connect = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
                // SQL statement to delete the product by ID
                String sql = "UPDATE clients SET  nom=?,prenom=?,adress=?,num_tele=?,email=? where id=?";

                int clientId = (int) table.getValueAt(selectedRow, 0);
                String nom=utxtnom.getText();
                String prenom=utxtprenom.getText();
                String adress=utxtadress.getText();
                String num_tele=utxtnum_tele.getText();
                String email=utxtemail.getText();

                try (PreparedStatement preparedStatement = connect.prepareStatement(sql)) {
                    preparedStatement.setString(1, nom);
                    preparedStatement.setString(2, prenom);
                    preparedStatement.setString(3, adress);
                    preparedStatement.setString(4, num_tele);
                    preparedStatement.setString(5, email);
                    preparedStatement.setInt(6, clientId);


                    int rowsAffected = preparedStatement.executeUpdate();
                    System.out.println(rowsAffected + " row(s) updated.");

                    // Refresh the clients
                    getClients();
                }
            } catch (SQLException e) {
                System.err.println("Error updating data from the database: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a client to delete.");
        }     
    }

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = table.getSelectedRow();

    if (selectedRow != -1) {
        int clientId = (int) table.getValueAt(selectedRow, 0);

        try (Connection connect = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            // SQL statement to delete the product by ID
            String deleteQuery = "DELETE FROM clients WHERE id = ?";

            try (PreparedStatement preparedStatement = connect.prepareStatement(deleteQuery)) {
                preparedStatement.setInt(1, clientId);

                int rowsAffected = preparedStatement.executeUpdate();
                System.out.println(rowsAffected + " row(s) deleted from the database.");

                // Refresh the products_display_table
                getClients();
            }
        } catch (SQLException e) {
            System.err.println("Error deleting data from the database: " + e.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please select a client to delete.");
    }
    }//GEN-LAST:event_DeleteActionPerformed

    private void utxtnomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utxtnomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_utxtnomActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        String nom=model.getValueAt(table.getSelectedRow(),1).toString();
        String prenom=model.getValueAt(table.getSelectedRow(),2).toString();
        String adress=model.getValueAt(table.getSelectedRow(),3).toString();
        String num_tele=model.getValueAt(table.getSelectedRow(),4).toString();
        String email=model.getValueAt(table.getSelectedRow(),5).toString();
        
        //set to text field
        utxtnom.setText(nom);
        utxtprenom.setText(prenom);
        utxtadress.setText(adress);
        utxtnum_tele.setText(num_tele);
        utxtemail.setText(email);        
    }//GEN-LAST:event_tableMouseClicked

    private void brundcrump1ActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        homeFrame.setVisible(true);
        this.dispose();
    }  
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new clients(new Home()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JButton Search;
    private javax.swing.JButton Update;
    private javax.swing.JLabel brundcrump;
    private javax.swing.JButton brundcrump1;
    private javax.swing.JButton btnajouter;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField search_feild;
    private javax.swing.JTable table;
    private javax.swing.JTextField utxtadress;
    private javax.swing.JTextField utxtemail;
    private javax.swing.JTextField utxtnom;
    private javax.swing.JTextField utxtnum_tele;
    private javax.swing.JTextField utxtprenom;
    // End of variables declaration//GEN-END:variables
}
