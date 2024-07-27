package com.beans.wellnesswave;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBDelete {
    private static Connection con = null;
    private static Statement SQLStatement = null;


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

      
    public static void delete(String table, String attribute, String value){
        String query = "DELETE from " + table 
                + " WHERE " + attribute 
                + "='" + value + "'";
        
        try{
            SQLStatement.executeUpdate(query);
            System.out.println("<DELETED RECORD>");
        }
        catch(SQLException SQLEx){
            System.out.println(SQLEx.getMessage());
        }
    }
    
}
