
package com.beans.wellnesswave;

import javax.swing.JOptionPane;

public class TestMain {

    public static void main(String[] args) {
        System.out.println("Testing");
        
//        DatabaseController dbc = new DatabaseController();
//        dbc.connect();
        
        // ===============================================

        // INSERT
        // version1
//        String insert1 = "INSERT INTO users1 VALUES ("
//                + "'jams', "
//                + "'sammy', "
//                + "23, "
//                + "'newUser', "
//                + "'ddf@gmail.com', "
//                + "'1002'"
//                + ")";  
        // -------------------------------------------------

        String name = "'Louis', ";
        String surname = "'La kekh', ";
        String email = "'wasmy@gmail.com', ";
        String isAdmin = "'false'"; 
        // or user a boolean attribute (isAdmin) in table 
        
        String insert2 = "INSERT INTO users2 VALUES("
                + name + surname + email + String.valueOf(isAdmin)
                + ")";

        String insert3 = "INSERT INTO test1 VALUES('string', 'str')";
        
        // dbc.SQLQuery(insert3);
        
        // boolean a = dbc.SQLQuery(insert2);
        
//        boolean a = dbc.insertRecord(insert2);
//        
//        if (!a){
//            System.out.println();
//            System.out.println("Unsuccessful");
//            System.out.println("Re-enter the query");
//            
//            JOptionPane.showMessageDialog(null, "Re-enter details");
//        }
//        else{
//            JOptionPane.showMessageDialog(null, "SUCCESS");
//        }
        // -------------------------------------------------

        // version2
        // using prepared statements
//        String a = "word1";
//        String b = "wrdd";
//        dbc.insertRecord1(a, b);

        // ===============================================

        // READ
//        dbc.readAllRecords();
        // dbc.readAllRecords("users2", 4);
        // ===============================================

        // UPDATE
        // String query = "UPDATE users1SET userfirstname='tomb...' WHERE username='newUser'";
        String query1 = "UPDATE test1 SET name1='thisisaname' WHERE word1='str'";
        // dbc.SQLQuery(query1);
        // ===============================================

        // DELETE
        String queryD = "DELETE FROM users1 WHERE userfirstname='tomb...'";
        // dbc.deleteRecord(query1);
        // ===============================================

        // ENCRYPTION
        // and insertion
        // dbc.encrypt(); 
        // ===============================================

        // DECRYPTION
//        TempDecryption obj = new TempDecryption();
//        obj.decrypt();
        // ===============================================

        
        // WILD-CARD
        String anyOp = "";
        // dbc.SQLQuery(anyOp); 

        // close
//        dbc.terminate(); 


        // ===============================================
//        NEW TEST
    
//        Validation vObj = new Validation();
//        
////        vObj.checkIfKeyInDB("name"); 
////        boolean validCredentials = vObj.checkLoginPair("str", "password"); 
//        boolean validCredentials = vObj.checkLoginPair("str", "thisisaname"); 
//        System.out.println("Correct credentials? " + validCredentials);
//        
//
//        vObj.terminate();
//
//        if (validCredentials){
//            new WindowHome().setVisible(true);
//        }
        // ===============================================
//        NEW TEST

//        DBUpdate.connect();
//        DBUpdate.update(); 
        
        DBDelete.connect();
        DBDelete.delete("user_temp", "user_first_name", "newww");
        DBDelete.terminate();
    }
}
