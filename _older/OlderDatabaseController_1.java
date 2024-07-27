//package com.beans.wellnesswave;
//
//import java.nio.charset.StandardCharsets;
//import java.security.MessageDigest;
//import java.security.NoSuchAlgorithmException;
//import java.sql.*;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//public class OlderDatabaseController {
//    private Connection con = null;
//    private Statement SQLStatement = null;
//    private ResultSet result;
//
//    // DatabaseController() {}
//    // -------------------------
//
//    // CONNECT
//    public void connect() {
//        System.out.println("Trying to connect to database...");
//        try {
////            String dbURL = "jdbc:derby://localhost:1527/database1";
////            String username = "username";
////            String password = "name";
//            
//            String dbURL = "jdbc:derby://localhost:1527/wellnesswave";
//            String username = "wellness";
//            String password = "wave";
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
//    // ***OVERLOAD*** //
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
//    // TERMINATE
//    public void terminate() {
//        try {
//            SQLStatement.close();
//            System.out.println("\n<SQL Statement method terminated>");
//            con.close();
//            System.out.println("<Connection terminated>");
//        } catch (SQLException ex) {
//            Logger.getLogger(OlderDatabaseController.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//    // =====================================
//
//    // WILD CARD
//    /*
//    * can be used to execute most SQL operations
//    * [insert, update, delete]; not read
//    */
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
//    // INSERT
//    // using prepared statements
//    /* 
//    * for a tables that has 2 columns
//    * all columns store string values
//    */
//    public void insertRecord1(String word1, String word2) {
//        try {
//            System.out.println("attemping to add...");
//
//            String sql = "insert into test1 values(?,?)";
//            PreparedStatement pStatement = con.prepareStatement(sql);
//            pStatement.setString(1, word1);
//            pStatement.setString(2, word2);
//
//            int res = pStatement.executeUpdate();
//            System.out.println(res + " records inserted");
//        } catch (SQLException SQLErr) {
//            System.out.println("*Error*");
//            System.out.println(SQLErr.getMessage());
//        }
//    }
//    // ***OVERLOAD*** //
//    /* 
//    * for a tables that has 2 columns
//    * all columns store string values
//    * can specific the table name to insert to
//    */
//    public void insertRecord1(String table, String word1, String word2) {
//        try {
//            System.out.println("attemping to add...");
//
//            String sql = "insert into " + table + " values(?,?)";
//            PreparedStatement pStatement = con.prepareStatement(sql);
//            pStatement.setString(1, word1);
//            pStatement.setString(2, word2);
//
//            int res = pStatement.executeUpdate();
//            System.out.println(res + " records inserted");
//        } catch (SQLException SQLErr) {
//            System.out.println("*Error*");
//            System.out.println(SQLErr.getMessage());
//        }
//    }
//    // ***OVERLOAD*** //
//    /* 
//    * for a tables that has 3 columns
//    * all columns store string values
//    * can specific the table name to insert to
//    */
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
//            int res = pStatement.executeUpdate();
//            System.out.println(res + " records inserted");
//        } catch (SQLException SQLErr) {
//            System.out.println("*Error*");
//            System.out.println(SQLErr.getMessage());
//        }
//    }
//    // ***OVERLOAD*** //
//
//    
//    public void insertRecord(
//            String table, 
//            String value1, 
//            String value2, 
//            String value3, 
//            String value4
//    ) {
//        try {
//            System.out.println("attemping to add...");
//
//            String sql = "insert into " + table + " values(?,?,?,?)";
//            PreparedStatement pStatement = con.prepareStatement(sql);
//            pStatement.setString(1, value1);
//            pStatement.setString(2, value2);
//            pStatement.setString(3, value3);
//            pStatement.setString(4, value4);
//
//
//            int res = pStatement.executeUpdate();
//            System.out.println("<Record inserted>");
//        } catch (SQLException SQLErr) {
//            System.out.println("*Error*");
//            System.out.println(SQLErr.getMessage());
//        }
//    }
//    // =====================================
//
//    // READ and display 
//    public void readAllRecords() {
//        System.out.println("\nALL DATA");
//        String retrieve_Values_qry = "SELECT * FROM test1";
//
//        ResultSet rs;
//        try {
//            rs = SQLStatement.executeQuery(retrieve_Values_qry);
//            System.out.println("rs: " + rs);
//
//            int row = 0;
//            if (rs != null) {
//                while (rs.next()) {
//                    row++;
//                    System.out.println(
//                            "Data from row " 
//                            + row 
//                            + ": "
//                            + rs.getString(1) 
//                            + " " 
//                            + rs.getString(2)
//                    );
//                }
//            }
//
//            rs.close();
//            System.out.println("SQL statement executed Successfully....");
//
//        } catch (SQLException ex) {
//            Logger.getLogger(OlderDatabaseController.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//    // ***OVERLOAD*** //
//    /*
//    * can specify the table name to read from
//    * must specify the number of columns in the table
//    */
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
//            Logger.getLogger(OlderDatabaseController.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//    // =====================================
//
//    // ENCRYPTION
//    /* 
//    * using the SHA-256 encryption algorithm
//    * and inserts records 
//    */
//    public void encrypt() {          
//        System.out.println("ENCRYPTION");
//        String userName = "thisisaname";
//        String password = "jamesBatty";
//      
//        try{
//            // ---HASHING--- //
//            MessageDigest md = MessageDigest.getInstance("SHA-256");
//            
//            // create hash byte array for the password, this is what can be stored in db
//            byte[] hashedPassword = md.digest(password.getBytes(StandardCharsets.UTF_8));
//            System.out.println("\n<Encryption successful>");
//            
//            // ---prepare-statement--- //
//            String sql =  "insert into test1 values(?,?)";
//            PreparedStatement pStatement = con.prepareStatement(sql);
//            pStatement.setString(1, userName);
//            // send hashed password of datatype BYTE to db instead of normal string
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
//}
