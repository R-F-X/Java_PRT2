//
//package com.beans.wellnesswave;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//public class TempDecryption {
//    Connection DBConnection; 
//    Statement SQLStatement; 
//    String DBURL; 
//    
//    TempDecryption(){
//        DBURL = "jdbc:derby://localhost:1527/database1";
//    }
//    // =======================================
//    
////    public void connect(){
////        try{
////            
////        }
////        
////    }
//    
//    // DECRYPTION
//    // i think
//    public void decrypt() {    
//        System.out.println("DECRYPTION...");
//        
//        String userName = "ausername";
////        String userName = "thisisaname";
//
//        String password = "notreal";
//        System.out.println(userName);
//        System.out.println(password);
//
//        String url = "jdbc:derby://localhost:1527/database1";
////        String url = "jdbc:derby:testdb2"; 
////        String url = "jdbc:derby://localhost:1527/derby14";
//        try{
//            //initialise driver needed for conn
////            Class.forName("org.apache.derby.jdbc.ClientDriver");
//            //connect to database
//            Connection conn = DriverManager.getConnection(url, "username", "name");
//            System.out.println("connection successful");
//
//            //create prep statement
//            String sqlSelect = "SELECT * FROM test1 WHERE name1 = ?"; // select entire row data for user logging in, can do select name.... from etc isngle column
//            PreparedStatement prep = conn.prepareStatement(sqlSelect,ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
//            // Set the parameter value
//            prep.setString(1, userName); // Change "John" to the desired name
//            
//            
//            // returns a result 
//            ResultSet resultSet = prep.executeQuery(); 
//            
//            //resultset starts before first row,.next makes
//            
//            // ok so next() have to keep calling for it to run over all rows
//            // so while(resultSet.next) makes it keep calling, when it runs out of rows resultset returns false and loop exits.
//            // in a general query without name search like im doing, it will return false if no more rows and true if cursor is on valid row
//            
//            // with a name search query, resultset might have many rows, but return false if search criteria(the name we want) isnt satisfied
//            // 
//            
//            //check if doesnt meet search criteria i created 
//            //might need a while loop here aswell, i need to make sure it runs through all db rows
//
//            // preparedstatement query runs, doesnt meet criteria for search then its false, so this code checks did the query return false
//            // if true, move cursor to beginning and get the password
//            if(!resultSet.next()){
//                System.out.println("that name does not exist in db, check your credentials or register");
//            }else{
//                resultSet.beforeFirst(); // move cursor back to before first row
//            }
//            // Process the results
//            
//            // dont i need a while loop here????? to run through all items, only working cause i currently have 1 row user
//            
//            //so summary 1. check if query criteria returns false, then dont search db 2. however,if true, check if any rows left in db
//            // 3. since the query returned true, the name must be there somewhere, so dont run through all rows, just get row where name = to query
//            // done
//            
//            // i think if(resultset.next) is saying,before first row, if there are any rows left, get * from the row where input name = db name
//            System.out.println("NAME THING...");
//            if(resultSet.next()) {             
//             if(resultSet.getString("name1").equals(userName)){ // if resultSet.get(COLUMN NAME)                
//                String pass = resultSet.getString("word1"); // get password                
//                 System.out.println("password retrieved is: " + pass);
//                 System.out.println("login successful");
//            }
//             
//             
//             // Retrieve the "name" column value from the result set
////                String name = resultSet.getString("NAME");
//              
////                System.out.println("Name from database is " + name);
//
//
//            //----------RETRIEVE HASHED PASS-------
//            //  you must hash the users login input, then retrieve hash password on database
//            // then compare them to see if they are the same. then login the user.
//            
////            if hashed_user_input_password == stored_hashed_password:
////                print("Password Matched!")
////            else:
////             print("Password Incorrect!")
//            }
//          
//            
//
//        }
//        catch(SQLException ex){
//            ex.printStackTrace();
//        } 
//    }                                     
//
//}