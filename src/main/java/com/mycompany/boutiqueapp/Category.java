/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.boutiqueapp;

import java.awt.FlowLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Category extends javax.swing.JFrame {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/java";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Novel222@@@";
    private Home homeFrame;
    // Database connection
    private Connection connection;
    ArrayList<String> categories = new ArrayList<>();
    

    
//    constructor
    public Category(Home homeFrame) {
        initComponents();
        this.homeFrame = homeFrame;
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                // Set the visibility of the Home frame to true when Facturation frame is closed
                homeFrame.setVisible(true);
            }
        });
       

        displayCategories();
        
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            System.out.println("Connected to the database");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error connecting to the database: " + e.getMessage());
        }
         
         
    }
    
   
    
 
    
        private void displayCategories() {
        DefaultTableModel model = (DefaultTableModel) display_category_table.getModel();
        model.setRowCount(0); // Clear the existing rows

        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            String query = "SELECT * FROM categories";

            try (PreparedStatement preparedStatement = connection.prepareStatement(query);
                 ResultSet resultSet = preparedStatement.executeQuery()) {

                while (resultSet.next()) {
                    int categoryId = resultSet.getInt("category_id");
                    String categoryName = resultSet.getString("category_name");
            
                    // Add a new row to the table
                    model.addRow(new Object[]{categoryId, categoryName});
                }
            }
        } catch (SQLException e) {
            System.err.println("Error retrieving data from the database: " + e.getMessage());
        }
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jDialog3 = new javax.swing.JDialog();
        add_button = new javax.swing.JButton();
        edit_button = new javax.swing.JButton();
        delete_button = new javax.swing.JButton();
        home_button_icon = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        display_category_table = new javax.swing.JTable();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add_button.setBackground(new java.awt.Color(51, 204, 0));
        add_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add_button.setForeground(new java.awt.Color(255, 255, 255));
        add_button.setText("Add");
        add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(add_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 130, -1, -1));

        edit_button.setBackground(new java.awt.Color(51, 153, 255));
        edit_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        edit_button.setForeground(new java.awt.Color(255, 255, 255));
        edit_button.setText("Edit");
        edit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(edit_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 130, -1, -1));

        delete_button.setBackground(new java.awt.Color(255, 0, 0));
        delete_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        delete_button.setForeground(new java.awt.Color(255, 255, 255));
        delete_button.setText("Delete");
        delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(delete_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 130, -1, -1));

        home_button_icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\boutiqueApp\\src\\main\\java\\com\\mycompany\\boutiqueapp\\images\\accueil.png")); // NOI18N
        home_button_icon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_button_iconActionPerformed(evt);
            }
        });
        getContentPane().add(home_button_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 0, -1, 90));

        display_category_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Category Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(display_category_table);

        jScrollPane1.setViewportView(jScrollPane2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_buttonActionPerformed
        int selectedRow = display_category_table.getSelectedRow();
          if (selectedRow != -1) {
              String currentCategoryName = (String)display_category_table.getValueAt(selectedRow, 1);
                String newCategoryName = JOptionPane.showInputDialog(this, "Enter new category name to replace: "+currentCategoryName);

                // Check if the user clicked "Cancel" or closed the dialog
                if (newCategoryName != null && !newCategoryName.isEmpty()) {
                    try {
                        Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

                        // SQL statement to update data in the 'categories' table
                        String updateQuery = "UPDATE categories SET category_name = ? WHERE category_name = ?";

                        try (PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {
                            preparedStatement.setString(1, newCategoryName);
                            preparedStatement.setString(2, currentCategoryName);

                            int rowsAffected = preparedStatement.executeUpdate();
                            System.out.println(rowsAffected + " row(s) updated in Category.");
                        }
                    } catch (SQLException e) {
                        System.err.println("Error updating data in Categories: " + e.getMessage());
                    }

                    displayCategories();
                }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a caregory in the table to edit.");
        }
    }//GEN-LAST:event_edit_buttonActionPerformed

    private void delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_buttonActionPerformed
                int selectedRow = display_category_table.getSelectedRow();

        if (selectedRow != -1) {
            int categoryId = (int) display_category_table.getValueAt(selectedRow, 0);
            int choice = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this category?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION){
                try (Connection connect = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
                    String deleteQuery = "DELETE FROM categories WHERE category_id = ?";

                    try (PreparedStatement preparedStatement = connect.prepareStatement(deleteQuery)) {
                        preparedStatement.setInt(1, categoryId);

                        int rowsAffected = preparedStatement.executeUpdate();
                        System.out.println(rowsAffected + " row(s) deleted from the database.");

                        displayCategories();
                    }
                } catch (SQLException e) {
                    System.err.println("Error deleting data from the database: " + e.getMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a caregory in the table to delete.");
        }
    }//GEN-LAST:event_delete_buttonActionPerformed

    private void add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_buttonActionPerformed
           
            String new_category = JOptionPane.showInputDialog(this, "Enter new category:");
        
            // Check if the user clicked "Cancel" or closed the dialog
            if (new_category != null && !new_category.isEmpty()) {
                
                try {
                        Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

                        // SQL statement to insert data into the 'factures' table
                        String insertQuery = "INSERT INTO categories (category_name) VALUES (?)";

                        try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
                            preparedStatement.setString(1, new_category);
                        
                            int rowsAffected = preparedStatement.executeUpdate();
                            System.out.println(rowsAffected + " row(s) inserted into Category.");
                        }
                    } catch (SQLException e) {
                        System.err.println("Error inserting data into Categories: " + e.getMessage());
                    }

                displayCategories();
            }

        // Print the updated array
    }//GEN-LAST:event_add_buttonActionPerformed

    private void home_button_iconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_button_iconActionPerformed
        homeFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_home_button_iconActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Category(new Home()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_button;
    private javax.swing.JButton delete_button;
    private javax.swing.JTable display_category_table;
    private javax.swing.JButton edit_button;
    private javax.swing.JButton home_button_icon;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
