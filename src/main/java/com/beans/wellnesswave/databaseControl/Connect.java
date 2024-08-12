
package com.beans.wellnesswave.databaseControl; 

import java.sql.*; 

public class Connect {
    
    public static Connection initDBConnection(){
        Connection dbc = null; 
        String DBURL = "jdbc:derby://localhost:1527/broken";
        String username = "shattered";
        String password = "dil";
        
        System.out.println("attempting to establish connection...");
        try{
            dbc = DriverManager.getConnection(DBURL, username, password);
            System.out.println("\n<CONNECTION ESTABLISHED>");
        }
        catch(SQLException SQLEx){
            System.out.println(SQLEx.getMessage());
        }
        return dbc; 
    }
    
}
