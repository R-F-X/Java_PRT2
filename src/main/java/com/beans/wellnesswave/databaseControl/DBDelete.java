package com.beans.wellnesswave.databaseControl;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

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
    

    // =====================================
    // JOSHUA 
    // ***OVERLOAD*** //
    public static void delete(String table, String attribute, int value){
        String query = "DELETE from " + table + " WHERE " + attribute + " = " + value;
       
        try{
            int rowsAffected = SQLStatement.executeUpdate(query);
            if(rowsAffected > 0){
                  System.out.println("<DELETED RECORD>" + "with an ID of: " + value + " " + " rows affected: " + rowsAffected);
            }else{
                System.out.println("no rows with ID of: " + value);
            }
              
        }
        catch(SQLException SQLEx){
            System.out.println(SQLEx.getMessage());
        }
    }
    
     
//    public static void delete(String table, int deleteID){
    public static void delete(String table, String deleteID){
        String query = "DELETE FROM " + table + " WHERE JOURNAL_ID = '" + deleteID + "'";
        
        try{
            SQLStatement.executeUpdate(query);
            System.out.println("<DELETED RECORD>");
            JOptionPane.showMessageDialog(null, "Record deleted \nRefresh");
        }
        catch(SQLException SQLEx){
            System.out.println(SQLEx.getMessage());
        }
    }
    

    // =====================================

}
