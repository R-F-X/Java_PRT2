//package com.beans.wellnesswave;
//
//import com.sun.net.httpserver.Request;
//import java.nio.charset.StandardCharsets;
//import java.security.MessageDigest;
//import java.security.NoSuchAlgorithmException;
//import java.sql.*;
//import java.util.Scanner;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//public class DatabaseController {
//
//    private Connection con = null;
//    private Statement SQLStatement = null;
//    private ResultSet result;
//
//    DatabaseController() {
//    }
//    // -------------------------
//
//    public void connect() {
//        System.out.println("Trying to connect to database...");
//        try {
//            String dbURL = "jdbc:derby://localhost:1527/database1";
//            String username = "username";
//            String password = "name";
//
//            System.out.println("About to get a connection....");
//            con = DriverManager.getConnection(dbURL, username, password);
//            System.out.println("\n<Connection Established Successfully>");
//            
//            SQLStatement = con.createStatement();
//            System.out.println("<SQL Statement ready>");
//        } catch (SQLException sqlErr) {
//            System.out.println("*Error*");
//            System.out.println(sqlErr.getMessage());
//        } catch (Exception e) {
//            System.out.println("*Error*");
//            System.out.println(e.getMessage());
//        }
//    }
//
//    // OVERLOAD
//    public void connect(String dbURL) {
//        System.out.println("Trying to connect to database...");
//        try {
//            String username = "username";
//            String password = "name";
//
//            System.out.println("About to get a connection....");
//            con = DriverManager.getConnection(dbURL, username, password);
//            System.out.println("\n<Connection Established Successfully>");
//
//            SQLStatement = con.createStatement();
//            System.out.println("<SQL Statement ready>");
//        } catch (SQLException sqlErr) {
//            System.out.println("*Error*");
//            System.out.println(sqlErr.getMessage());
//        } catch (Exception e) {
//            System.out.println("*Error*");
//            System.out.println(e.getMessage());
//        }
//    }
//    // =====================================
//
//    public void terminate() {
//        try {
//            SQLStatement.close();
//            System.out.println("\n<SQL Statement terminated>");
//            con.close();
//            System.out.println("<Connection terminated>");
//        } catch (SQLException ex) {
//            Logger.getLogger(DatabaseController.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//    // =====================================
//
//    
//    public boolean SQLQuery(String statement) {
//        boolean successful = false;
//        System.out.println(statement);
//
//        try {
//            System.out.println("ATTEMPTING TO PERFORM SQL OPERATION...");
//
//            SQLStatement.executeUpdate(statement);
//            System.out.println("\n<Query successful>");
//            successful = true;
//        } 
//        catch(SQLException SQLErr){
//            System.out.println("*Error*");
//            System.out.println(SQLErr.getMessage());
//        }
//        catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        return successful;
//    }
//    // =====================================
//
//
//    // INSERT
//    static final int DUPLICATE_KEY_ERROR_CODE = 1062;
//
//    public boolean insertRecord(String statement) {
//        boolean successful = false;
//        System.out.println(statement);
//
//        try {
//            SQLStatement = con.createStatement();
//            System.out.println("attemping to add...");
//
//            SQLStatement.executeUpdate(statement);
////            SQLStatement.executeUpdate("INSERT INTO Student values (12, 'name1')");
//            System.out.println("\n<Inserted usccesfully>");
//
//            SQLStatement.close();
//            System.out.println("<Statement closed successfully>");
//            successful = true;
//        } //        catch(SQLException SQLErr){
//        //            System.out.println("*Error*");
//        //            System.out.println(SQLErr.getMessage());
//        //        }
//        //        
//        catch (SQLException e) {
//            // Handle exceptions
//            if (((SQLException) e).getErrorCode() == DUPLICATE_KEY_ERROR_CODE) {
//                // Handle duplicate key violation
//                System.out.println("Duplicate key violation detected. Please change the Id Value");
//            } else {
//                // Print exception message
//                System.out.println(e.getMessage());
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        return successful;
//    }
//
//    // using prepared statements
//    public void insertRecord1(String word1, String word2) {
//        try {
//            System.out.println("attemping to add...");
//
//            String sql = "insert into test1 values(?,?)";
//            PreparedStatement pStatement = con.prepareStatement(sql);
//            pStatement.setString(1, word1);
//            pStatement.setString(2, word2);
//
//            // Execute SQL query i bleieve executeUpdate returns a response while the other one wont
//            int res = pStatement.executeUpdate();
//
//            System.out.println(res + " records inserted");
//        } catch (SQLException SQLErr) {
//            System.out.println("*Error*");
//            System.out.println(SQLErr.getMessage());
//        }
//    }
//
//    // OVERLOAD
//    public void insertRecord1(String table, String word1, String word2) {
//        try {
//            System.out.println("attemping to add...");
//
//            String sql = "insert into " + table + " values(?,?)";
//            PreparedStatement pStatement = con.prepareStatement(sql);
//            pStatement.setString(1, word1);
//            pStatement.setString(2, word2);
//
//            // Execute SQL query i bleieve executeUpdate returns a response while the other one wont
//            int res = pStatement.executeUpdate();
//
//            System.out.println(res + " records inserted");
//        } catch (SQLException SQLErr) {
//            System.out.println("*Error*");
//            System.out.println(SQLErr.getMessage());
//        }
//    }
//
//    // OVERLOAD
//    public void insertRecord1(String table, String word1, String word2, String word3) {
//        try {
//            System.out.println("attemping to add...");
//
//            String sql = "insert into " + table + " values(?,?,?)";
//            PreparedStatement pStatement = con.prepareStatement(sql);
//            pStatement.setString(1, word1);
//            pStatement.setString(2, word2);
//            pStatement.setString(3, word2);
//
//            // Execute SQL query i bleieve executeUpdate returns a response while the other one wont
//            int res = pStatement.executeUpdate();
//
//            System.out.println(res + " records inserted");
//        } catch (SQLException SQLErr) {
//            System.out.println("*Error*");
//            System.out.println(SQLErr.getMessage());
//        }
//    }
//    // =====================================
//
//    // read 
//    // display 
//    public void readAllRecords() {
//        System.out.println("\nALL DATA");
//        String retrieve_Values_qry = "SELECT * FROM test1";
//
//        ResultSet rs;
//        try {
//            rs = SQLStatement.executeQuery(retrieve_Values_qry);
//
//            System.out.println("rs: " + rs);
//
//            int row = 0;
//
//            if (rs != null) {
//                while (rs.next()) {
//                    row++;
//                    System.out.println("Data from row " + row + ": "
//                            + rs.getString(1) + " " + rs.getString(2));
//                }
//            }
//
//            rs.close();
//            System.out.println("SQL statement executed Successfully....");
//
//        } catch (SQLException ex) {
//            Logger.getLogger(DatabaseController.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//    // ***OVERLOAD***
//    public void readAllRecords(String tableName, int numOfCols) {
//        System.out.println("\nALL DATA from " + tableName + " <table>");
//        String retrieve_Values_qry = "SELECT * FROM " + tableName;
//
//        try {
//            result = SQLStatement.executeQuery(retrieve_Values_qry);
//
//            int row = 0;
//            if (result != null) {
//                while (result.next()) {
//                    row++;
//                    System.out.println("Data from row: " + row);
//                        
//                    for (int a=1; a < numOfCols+1; a++){
//                        System.out.print(result.getString(a) + " | ");
//                    }
//                    System.out.println("\n");
//                }
//            }
//
//            result.close();
//            System.out.println("\n<SQL statement executed Successfully>");
//
//        } catch (SQLException ex) {
//            Logger.getLogger(DatabaseController.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//    // =====================================
//    
//    // UPDATE
//    public void updateRecord(String statement) {
//        System.out.println(statement);
//
//        try {
//            SQLStatement = con.createStatement();
//            System.out.println("attemping to update...");
//
//            // SQLStatement.executeUpdate("UPDATE test1 SET name1='koo' WHERE word1='wrdd'");
//            SQLStatement.executeUpdate(statement);
//            System.out.println("\n<Updated usccesfully>");
//        } 
//        catch(SQLException SQLErr){
//                    System.out.println("*Error*");
//                    System.out.println(SQLErr.getMessage());
//                }
//    
//        catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//    // =====================================
//
//    
//    // DELETE
//    public void deleteRecord(String statement) {
//        System.out.println(statement);
//
//        try {
//            SQLStatement = con.createStatement();
//            System.out.println("attemping to delete...");
//
//            // SQLStatement.executeUpdate("DELETE FROM test1 WHERE word1='wrdd'");
//            SQLStatement.executeUpdate(statement);
//            System.out.println("\n<Deleted usccesfully>");
//        } 
//        catch(SQLException SQLErr){
//                    System.out.println("*Error*");
//                    System.out.println(SQLErr.getMessage());
//                }
//    
//        catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//
//    // =====================================
//
//    // ENCRYPTION
//    // SHA-256
//    public void encrypt() {          
//        System.out.println("ENCRYPTION");
//        String userName = "thisisaname";
//        String password = "jamesBatty";
//      
//        try{
//            // ---HASHING--- //
//            MessageDigest md = MessageDigest.getInstance("SHA-256");
//            
//            //create hash byte array for the password, this is what can be stored in db
//            byte[] hashedPassword = md.digest(password.getBytes(StandardCharsets.UTF_8));
//            System.out.println("\n<Encryption successful>");
//            
//            // ---prepare-statement--- //
//            String sql =  "insert into test1 values(?,?)";
//            PreparedStatement pStatement = con.prepareStatement(sql);
//
//            pStatement.setString(1, userName);
//            //send hashed password of datatype BYTE to db instead of normal string
//            pStatement.setBytes(2, hashedPassword);
//            
//            int res = pStatement.executeUpdate();
//            System.out.println(res + " records inserted");
//            System.out.println("\n<Insertion successful>");
//        }
//        catch(SQLException ex){
//            ex.printStackTrace();
//        } 
//       
//        catch (NoSuchAlgorithmException ex) {
//            System.out.println(ex.getMessage());
//        }
//    }                                     
//    // =====================================
//
//    
//}
