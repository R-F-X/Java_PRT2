package com.beans.wellnesswave;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBC {
    private Connection con = null;
    private Statement SQLStatement = null;

    // DatabaseController() {}
    // -------------------------

    // CONNECT
    public void connect() {
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
    // ***OVERLOAD*** //
    public void connect(String dbURL) {
        System.out.println("Trying to connect to database...");
        try {
            String username = "username";
            String password = "name";

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
    public void terminate() {
        try {
            SQLStatement.close();
            System.out.println("\n<SQL Statement method terminated>");
            con.close();
            System.out.println("<Connection terminated>");
        } catch (SQLException ex) {
            Logger.getLogger(DBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // =====================================

    // WILD CARD
    /*
    * can be used to execute most SQL operations
    * [insert, update, delete]; not read
    */
    public boolean SQLQuery(String statement) {
        boolean successful = false;
        System.out.println(statement);

        try {
            System.out.println("ATTEMPTING TO PERFORM SQL OPERATION...");

            SQLStatement.executeUpdate(statement);
            System.out.println("\n<Query successful>");
            successful = true;
        } 
        catch(SQLException SQLErr){
            System.out.println("*Error*");
            System.out.println(SQLErr.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return successful;
    }
    // =====================================

   
    // ENCRYPTION
    /* 
    * using the SHA-256 encryption algorithm
    * and inserts records 
    */
    public void encrypt() {          
        System.out.println("ENCRYPTION");
        String userName = "thisisaname";
        String password = "jamesBatty";
      
        try{
            // ---HASHING--- //
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            
            // create hash byte array for the password, this is what can be stored in db
            byte[] hashedPassword = md.digest(password.getBytes(StandardCharsets.UTF_8));
            System.out.println("\n<Encryption successful>");
            
            // ---prepare-statement--- //
            String sql =  "insert into test1 values(?,?)";
            PreparedStatement pStatement = con.prepareStatement(sql);
            pStatement.setString(1, userName);
            // send hashed password of datatype BYTE to db instead of normal string
            pStatement.setBytes(2, hashedPassword);
            
            int res = pStatement.executeUpdate();
            System.out.println(res + " records inserted");
            System.out.println("\n<Insertion successful>");
        }
        catch(SQLException ex){
            ex.printStackTrace();
        } 
       
        catch (NoSuchAlgorithmException ex) {
            System.out.println(ex.getMessage());
        }
    }                                     
    // =====================================
    
}
