package com.beans.wellnesswave.utilities;

import java.sql.*;

public class Validation {
    private Connection DBConnection;
    private Statement SQLStatement;
    private ResultSet rSet;

    public Validation() {
        connect();
    }
    // --------------------

    public void connect() {
        String DBURL = "jdbc:derby://localhost:1527/wellnesswave";
        String username = "wellness";
        String password = "wave";

        try {
            DBConnection = DriverManager.getConnection(DBURL, username, password);
            SQLStatement = DBConnection.createStatement();
            System.out.println("\n<Connection establised>");
            System.out.println("<SQL Statement ready>");
        } catch (SQLException SQLEx) {
            System.out.println(SQLEx.getMessage());
        }
    }

    public void terminate() {
        try {
            DBConnection.close();
            SQLStatement.close();
            System.out.println("\n<Connection terminated>");
            System.out.println("<SQL Statement closed>");
        } catch (SQLException SQLEx) {
            System.out.println(SQLEx.getMessage());
        }
    }
    // --------------------

    // LOGIN
    /*
    * check if user/key in db
    * if found check is password is correct
    */
//    public boolean checkIfKeyInDB(String dataValue){}
    
    public boolean checkLoginPair(String dataValue, String userPassword) {
        boolean correctCredentials = false;

        try {
            String query = "SELECT * FROM login WHERE user_email='" + dataValue + "'";

            rSet = SQLStatement.executeQuery(query);
            System.out.println("<record found>");
            System.out.println("RSET: " + rSet);

            if (rSet != null) {
                // int row;
                while (rSet.next()) {
                    String correctEmail = rSet.getString(1);
                    String correctPassword = rSet.getString(2);
                    System.out.println(correctEmail + " + " + correctPassword);

                    if (userPassword.equals(correctPassword)) {
                        correctCredentials = true;
                        System.out.println("correct password!");
                    }

                    System.out.println("\nData from row:c " + correctEmail + correctPassword);
//                    System.out.println("\nData from row:c " + rSet.getString(1) + rSet.getString(2));
                }
            }

        } catch (SQLException SQLEx) {
            System.out.println(SQLEx.getMessage());
        }

        return correctCredentials;
    }
    // ***OVERLOAD*** //

//    public boolean checkIfKeyInDB(String tableName, String colName, String dataValue){
//        boolean keyExists = false;
//        
//        try{
//            String query = "SELECT * FROM " 
//                    + tableName 
//                    + " WHERE " 
//                    + colName + "=" + dataValue;
//            
//            rSet = SQLStatement.executeQuery(query);
//            System.out.println("RSET: " + rSet);
//        }
//        catch(SQLException SQLEx){
//            System.out.println(SQLEx.getMessage());
//        }
//        
//        return keyExists; 
//    }
    
    

    // LOGIN JOSHUA -------------
//    public void login(String email, String password) {
    public void login() {
        String userName = "name";
        String password = "password";
        String email = "email@gmail.com";
        
        System.out.println(userName);
        System.out.println(password);
        
        try {
            // select entire row data for user logging in, can do select name.... from etc isngle column
            String sqlSelect = "SELECT * FROM login WHERE email = ?"; 

            PreparedStatement prep = DBConnection.prepareStatement(
                    sqlSelect, 
                    ResultSet.TYPE_SCROLL_INSENSITIVE, 
                    ResultSet.CONCUR_READ_ONLY
            );
            prep.setString(1, email); 

            // returns a result 
            ResultSet resultSet = prep.executeQuery();

            if (!resultSet.next()) {
                System.out.println("that name does not exist in db, check your credentials or register");
            } 
//            else {
//                resultSet.beforeFirst(); // move cursor back to before first row
//            }

            
            if (resultSet.next()) {
                if (resultSet.getString("NAME").equals(userName)) { 
                // if resultSet.get(COLUMN NAME)          
                
                    String pass = resultSet.getString("ID"); 
                    // get password                
                    
                    System.out.println("password retrieved is: " + pass);
                    System.out.println("login successful");
                }
            }

        } 
        catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
    }
}
