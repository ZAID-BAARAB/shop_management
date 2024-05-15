
package Authentification;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

  class  Database {
      

    
    static Connection con=null;
    
        // Database connection parameters
        private static String url = "jdbc:mysql://localhost:3306/java";
        private static String username = "root";
        private static String password = "password";
        
        public static void connecter() {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {

            e.printStackTrace();

            return;
        }

        

        try {

            con = DriverManager.getConnection(url, username, password);

            System.out.println("Connected !");
        } catch (SQLException e) {

            e.printStackTrace();

        }
    }
    
}
