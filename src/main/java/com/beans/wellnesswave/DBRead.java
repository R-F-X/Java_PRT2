package com.beans.wellnesswave;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBRead {
    private static Connection con = null;
    private static Statement SQLStatement = null;
    private static ResultSet result;


    // CONNECT
    public static void connect() {
        System.out.println("Trying to connect to database...");
        try {
            String dbURL = "jdbc:derby://localhost:1527/wellnesswave";
            String username = "wellness";
            String password = "wave";

            System.out.println("About to get a connection....");
            con = DriverManager.getConnection(dbURL, username, password);
            System.out.println("\n<Connection Established Successfully>");
            
            SQLStatement = con.createStatement();
            System.out.println("<SQL Statement ready>");
        } catch (SQLException sqlErr) {
            System.out.println("*Error*");
            System.out.println(sqlErr.getMessage());
        } catch (Exception e) {
            System.out.println("*Error*");
            System.out.println(e.getMessage());
        }
    }
    // =====================================

    // TERMINATE
    public static void terminate() {
        try {
            SQLStatement.close();
            System.out.println("\n<SQL Statement method terminated>");
            con.close();
            System.out.println("<Connection terminated>");
        } catch (SQLException ex) {
            Logger.getLogger(DBDelete.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // =====================================

    /*
    * SELECT query examples
    * ---------------------
    
    * SELECT * FROM users
    * SELECT user_ID FROM users
    * SELECT * FROM users WHERE email='email@gmail.com'
    
    EXAMPLE
    * String sqlSelect = "SELECT * FROM users WHERE email = ?";
    * String email = "email@gmail.com";
    * PreparedStatement prepStatement = conn.prepareStatement(
        sqlSelect,
        ResultSet.TYPE_SCROLL_INSENSITIVE, 
        ResultSet.CONCUR_READ_ONLY
    );
    * prepStatement.setString(1, email);
    */
   
    // READ and display 
    public static void readAllRecords(String tableName, int numOfCols) {
        System.out.println("\nALL DATA from " + tableName + " <table>");
        String retrieve_Values_qry = "SELECT * FROM " + tableName;

        try {
            result = SQLStatement.executeQuery(retrieve_Values_qry);

            int row = 0;
            if (result != null) {
                while (result.next()) {
                    row++;
                    System.out.println("Data from row: " + row);
                        
                    for (int a=1; a < numOfCols+1; a++){
                        System.out.print(result.getString(a) + " | ");
                    }
                    System.out.println("\n");
                }
            }

            result.close();
            System.out.println("\n<SQL statement executed Successfully>");

        } catch (SQLException ex) {
            Logger.getLogger(DBRead.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //***OVERLOAD***//
    public static void readAllRecords(String tableName, String colName) {
    
    }
    // =====================================
}
