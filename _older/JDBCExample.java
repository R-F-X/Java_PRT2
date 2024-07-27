//package com.beans.wellnesswave;
//
//import java.sql.*;
//
//public class JDBCExample {
//
//    public static void main(String[] args) {
//        String create_Table_stmt = "create table Student (Student_ID INTEGER, Name VARCHAR(30))";
//        String insert_Values_stmt = "insert into Student values   (100,'Sarah')";
//        String update_Values_stmt = "UPDATE Student SET NAME='PEGGY'      WHERE Student_ID=100";
//        String delete_Values_stmt = "DELETE FROM Student WHERE    Student_ID =   100";
//        String retrieve_Values_qry = "SELECT * FROM Student ";
//
//        try {
//
////            String dbURL = "jdbc:derby://localhost:1527/University";
////            String username = "administrator";
////            String password = "admin";
//            //specify the full pathname of the database
//
//
//            String dbURL = "jdbc:derby://localhost:1527/database1";
//            String username = "username";
//            String password = "name";
//            
//            System.out.println("About to get a connection....");
//            Connection con = DriverManager.getConnection(dbURL, username, password);
//            System.out.println("\nConnection Established Successfully....");
//            // create a java.sql.Statement so we can run queries
//            System.out.println("Creating statement Object....");
//            Statement s = con.createStatement();
//            System.out.println("Statement object created Successfully....");
//
//            System.out.println("About to execute SQL stmt....");
//            // execute the SQL statement
////            s.executeUpdate(create_Table_stmt); 
//            s.executeUpdate(insert_Values_stmt); 
////            s.executeUpdate(update_Values_stmt); 
////            s.executeUpdate(delete_Values_stmt); 
//
//
////----------------------------------------------------
//            System.out.println("\nALL DATA");
////        String retrieve_Values_qry = "SELECT * FROM Student ";
//
//        ResultSet rs = s.executeQuery(retrieve_Values_qry); 
//// select the data from the table
//      int row = 0;
//       if (rs != null) 
//       while ( rs.next() ) 
//// this will step through our data row-by-row
//       {
//           row++;
//          System.out.println("Data from row " + row + ": " 
//           + rs.getInt(1) + " "+rs.getString(2) );
//       }//end while
//       rs.close();
////----------------------------------------------------
//            System.out.println("SQL statement executed  Successfully....");
//
//            System.out.println("About to close Statement....");
//            s.close(); // close the Statement to let the database know we're done with it
//            con.close(); // close the Connection to let the database know we're done with it
//            System.out.println("Statement closed successfully....");
//        } 
//        
//        catch (SQLException err) {
//            System.out.println("ERROR: " + err);
//        }
//    }//end main
//}
