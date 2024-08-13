package com.beans.wellnesswave.tests;

import com.beans.wellnesswave.databaseControl.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QuickAdd {

    /*
    PROCESS
    1. connect to DB
    2. create tables
    */

    // TABLES
    // example
//        String table1 = "CREATE TABLE user_temp( "
//            + "user_ID VARCHAR(30) NOT NULL GENERATED ALWAYS AS IDENTITY, "
//            + "user_first_name VARCHAR(30), "
//            + "user_last_name VARCHAR(30), "
//            + "user_email VARCHAR(30) NOT NULL, "
//            + "account_type VARCHAR(30), "
//            + "PRIMARY KEY (user_ID)"
//            + ")";
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
    String table1 = "CREATE TABLE bill_temp("
            + "order_ID VARCHAR(30), "
            + "user_ID VARCHAR(30), "
            + "account_number VARCHAR(30), "
            + "card_type VARCHAR(30), "
            + "price VARCHAR(30), "
            + "PRIMARY KEY (order_ID)"
            + ")";

    String table2 = "CREATE TABLE disorder("
            + "disorder_ID VARCHAR(30), "
            + "disorder_name VARCHAR(30), "
            + "user_ID VARCHAR(30), "
            + "doctor_ID VARCHAR(30), "
            + "PRIMARY KEY (disorder_ID)"
            + ")";
    
    String table3 = "CREATE TABLE doctor("
            + "doctor_ID VARCHAR(30), "
            + "title VARCHAR(30), "
            + "doctor_name VARCHAR(30), "
            + "doctor_surname VARCHAR(30), "
            + "doctor_email VARCHAR(30), "
            + "PRIMARY KEY (doctor_ID)"
            + ")";
    
    String table4 = "CREATE TABLE journal("
            + "journal_ID VARCHAR(40), "
            + "user_ID VARCHAR(30), "
            + "journal_entry VARCHAR(1000), "
            + "PRIMARY KEY (journal_ID)"
            + ")";
    
    String table5 = "CREATE TABLE login("
            + "user_email VARCHAR(30), "
            + "user_password VARCHAR(30), "
            + "PRIMARY KEY (user_email)"
            + ")";
    
    String table6 = "CREATE TABLE user_temp("
            + "user_ID VARCHAR(30), "
            + "user_first_name VARCHAR(30), "
            + "user_last_name VARCHAR(30), "
            + "user_email VARCHAR(30), "
            + "account_type VARCHAR(30), "
            + "PRIMARY KEY (user_ID)"
            + ")";
    // --------------------------------
    Connection DBC;
    Statement SQLStatement;
    ResultSet rSet;
    PreparedStatement pStatement;

    public void connect() {
        DBC = Connect.initDBConnection();
        try {
            SQLStatement = DBC.createStatement();
            System.out.println("\n<SQL Statment ready>");
        } catch (SQLException SQLEx) {
            System.out.println(SQLEx.getMessage());
        }
    }

    /*
    create a table class? 
    table(2-6 fields)
    overload the constructor, and have default values 
    */
    
    public void wildCard(String sqlOp) {
        System.out.println("\n");
        System.out.println(sqlOp);
        try {
            SQLStatement.executeUpdate(sqlOp);
            System.out.println("<SQL Statement successful>");
        } catch (SQLException SQLEx) {
            System.out.println(SQLEx.getMessage());
        }
    }
    

    // public boolean createAllTables() {
    public void createAllTables() {
        // creating the tables
        wildCard(table1);
        wildCard(table2);
        wildCard(table3);
        wildCard(table4);
        wildCard(table5);
        wildCard(table6);
    }

    // public static void createTable(String tableStructure) {}
    // -----------------------------------------


    public void addDoctors() {

    }

    public void addDisorders() {

    }

    public void addUsers() {

    }

    public void addLogin() {

    }

    public void addJournalEntries() {

    }

    public void addBills() {

    }

    // -----------------------------------------
    // TESTING
    public static void main(String[] args) {
        QuickAdd obj = new QuickAdd();

        obj.connect();
        obj.createAllTables();
        
        System.out.println("\n<END OF TEST>");
    }
}
