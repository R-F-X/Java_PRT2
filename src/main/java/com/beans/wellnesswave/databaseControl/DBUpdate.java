package com.beans.wellnesswave.databaseControl;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DBUpdate {
    private static Connection con = null;
    private static Statement SQLStatement = null;
    private static ResultSet rSet = null; 

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
            Logger.getLogger(DBUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // =====================================
    // JOSHUA 
    public static void updateJournal(String newEntry, String journalID){ 
// users need to view firstr, then type in the id of the entry
              
        String sql = "UPDATE JOURNAL SET JOURNAL_ENTRY" + " =?" + " WHERE JOURNAL_ID=? "; 
//set journal column value where userid
        
        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
           
             pstmt.setString(1, newEntry);
              pstmt.setString(2, journalID);

            // Execute the update statement
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Journal table updated successfully.");
                JOptionPane.showMessageDialog(null, "Record updated \nRefresh");
            } else {
                System.out.println("No rows affected.");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void updateDisorder(
            String tableName,
            String optionColumn,
            String dID, 
            String change
    ){
        System.out.println(optionColumn);
        System.out.println(change);
        System.out.println("about to update...");
        System.out.println("table affected: " + tableName + ", column name: " + optionColumn);
        System.out.println("ID ROW: " + " " + dID);
        
        String sql = "UPDATE DISORDER SET " + optionColumn + "=?" + " WHERE disorder_ID  =?";
        
        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
           
            pstmt.setString(1, change);
            pstmt.setString(2, dID);

            // Execute the update statement
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Disorder table updated successfully.");
                JOptionPane.showMessageDialog(null, "Table updated successfully");
            } 
            else {
                System.out.println("No rows affected.");
            }
            
            JOptionPane.showMessageDialog(null, "Updated successfully \nRefresh table");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // =====================================

    
    // mine
    // works? 
    public static void updateRecord(
            String tableName,
            String optionColumn,
            String IDKey, 
            String ID, 
            String change
    ){
        System.out.println(optionColumn);
        System.out.println(change);
        System.out.println("about to update");
        System.out.println("table affected: " + tableName + "," + "column name: " + optionColumn);
        System.out.println("ID ROW: " + " " + ID);
        
        String sql = "UPDATE " + tableName + " SET " + optionColumn + "=?" + " WHERE " + IDKey + "=?";
//        String sql = "UPDATE DISORDER SET " + optionColumn + "=?" + " WHERE disorder_ID  = ? ";

        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, change);
            pstmt.setString(2, ID);

            // Execute the update statement
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println(tableName + " table updated successfully.");
                JOptionPane.showMessageDialog(null, "Table updated successfully");
            } 
            
            else {
                System.out.println("No rows affected.");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        
    }
}
