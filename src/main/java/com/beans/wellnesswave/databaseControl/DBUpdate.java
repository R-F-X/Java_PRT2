package com.beans.wellnesswave.databaseControl;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    
    
    
    // UPDATE subject SET subject='new_subject WHERE subject_ID=1'
//    String update_Values_stmt = "UPDATE Student SET NAME='PEGGY'      WHERE Student_ID=100";

    public static void checkIfValueExists(){
        
    }
    
    
    public static boolean checkIfKeyInDB(String tableName, String colName, String dataValue){
        boolean keyExists = false;
        
        try{
            String query = "SELECT * FROM " 
                    + tableName 
                    + " WHERE " 
                    + colName + "=" + dataValue;
            
            rSet = SQLStatement.executeQuery(query);
            System.out.println("RSET: " + rSet);

            System.out.println("R1: " + rSet.getString(1));
            System.out.println("R2: " + rSet.getString(2));

        }
        catch(SQLException SQLEx){
            System.out.println(SQLEx.getMessage());
        }
        
        return keyExists; 
    }
    
//     public boolean checkIfKeyInDB(String dataValue){
//    public boolean checkLoginPair(String dataValue, String userPassword){
//
//        boolean correctCredentials = false;
//        
//        try{
////            String query = "SELECT * FROM test1 WHERE word1='" + dataValue + "'";
//            String query = "SELECT * FROM login WHERE user_email='" + dataValue + "'";
//
//            rSet = SQLStatement.executeQuery(query);
//            System.out.println("RSET: " + rSet);
//            
//
////            String correctUsername = rSet.getString(1);
////            String correctPassword = rSet.getString(2); 
////            System.out.println(correctUsername + " + " + correctPassword);
////            
////            if (userPassword.equals(correctPassword)){
////                correctCredentials = true;
////            }
//            
//            if (rSet != null){
////                
//            
//                int row; 
//                while(rSet.next()){
//                    String correctUsername = rSet.getString(2);
//            String correctPassword = rSet.getString(1); 
//            System.out.println(correctUsername + " + " + correctPassword);
//            
//            if (userPassword.equals(correctPassword)){
//                correctCredentials = true;
//            }
//                    System.out.println("\nData from row " + rSet.getString(1) + rSet.getString(2));
//                }
//            }
//
//        
//        }
//        catch(SQLException SQLEx){
//            System.out.println(SQLEx.getMessage());
//        }
//        
//        return correctCredentials;  
//    }


//    public static void update(){
////        String query = "UPDATE user_temp SET user_first_name='newww' WHERE user_ID='0' ";
//        String query = "UPDATE user_temp SET user_first_name='newww' WHERE user_ID='sdsdagfh'";
//       
//        try{
//            SQLStatement.executeUpdate(query);
//            System.out.println("<UPDATED RECORD>");
//        }
//        catch(SQLException SQLEx){
//            System.out.println(SQLEx.getMessage());
//        }
//    }
     
    public static void update(String table, String newValue, String refValue){
//        String query = "UPDATE user SET first_name='newww' WHERE user_ID=0 ";
//        String query = "UPDATE " + table + " SET first_name=? WHERE user_ID=?";

//        String query = "UPDATE " + table + " SET user_password=? WHERE user_email=?";

        String query = (
                "UPDATE " + table + 
                " SET user_password='" + newValue + "'" +
                " WHERE user_email='" + refValue + "'"
                );

//        String query = "UPDATE ? SET user_password=? WHERE user_email=?";

        System.out.println(query);
//        String query = "UPDATE " + table + "SET first_name=? WHERE user_ID=?";
// "UPDATE Student SET NAME='PEGGY'      WHERE Student_ID=100";
        
        try{
//            PreparedStatement pStatement = con.prepareStatement(query); 
//            pStatement.setString(1, newValue);
//            pStatement.setString(2, refValue);
//            
////            pStatement.setString(1, table);
////            pStatement.setString(2, newValue);
////            pStatement.setString(3, refValue);
//
//            pStatement.executeUpdate();

            SQLStatement.executeUpdate(query);
            System.out.println("....");
//            SQLStatement.executeQuery(query);
            // SQLStatement.executeUpdate(query);
            System.out.println("<UPDATED RECORD>");
        }
        catch(SQLException SQLEx){
            System.out.println(SQLEx.getMessage());
        }
    }
     
     // example from  https://stackoverflow.com/questions/40126787/update-sql-database-with-preparedstatement-in-java
     
    String query = ("UPDATE TB01 SET BLADETYPE=?,STARTT1=?,AIRT1=?,FOAMT1=?,SCT1=?,FINISHT1=? WHERE SERIAL=?");
//try (PreparedStatement pstmt = conn.prepareStatement(query)) {
//    pstmt.setString(7, bladeSerial);
//    pstmt.setString(1, itemText);
//    pstmt.setString(2, String.valueOf(startTime1));
//    pstmt.setString(3, String.valueOf(airTime1));
//    pstmt.setString(4, String.valueOf(foamTime1));
//    pstmt.setString(5, String.valueOf(scTime1));
//    pstmt.setString(6, String.valueOf(finishTime1));
//    pstmt.executeUpdate();
//                                                             }
//catch (SQLException ex) {
//    // Exception handling
//    Logger.getLogger(FormTwo1.class.getName()).log(Level.SEVERE, null, ex);
//    
    
    

    
}
