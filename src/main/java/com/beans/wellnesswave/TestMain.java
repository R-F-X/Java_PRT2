
package com.beans.wellnesswave;

import com.beans.wellnesswave.GUI.WindowAdmin;
import com.beans.wellnesswave.GUI.WindowHome;
import com.beans.wellnesswave.GUI.WindowHome;
import com.beans.wellnesswave.databaseControl.DBDelete;
import com.beans.wellnesswave.databaseControl.DBInsert;
import com.beans.wellnesswave.utilities.FileHandler;
import com.beans.wellnesswave.utilities.Tools;
//------------------------

public class TestMain {

    public static void main(String[] args) {
//        FileHandler.openFile("new.txt", true);
//        FileHandler.writeToFile("testing...");
//        FileHandler.closeFile();
        

//        DBInsert insert = new DBInsert();
//
//        // adding doctors
//        // - doctor(doctor_ID(PK), title, doctor_name, doctor_surname, doctor_email, (disorder_ID/name))
//        String doctorID1 = Tools.createUserID(Tools.generateRandomNumStr(), "doctor");
////        insert.insertRecord(
////                "doctor", 
////                doctorID1, 
////                "Mrs", 
////                "Gill",
////                "Saash",
////                "gillash@gmail.com"
////        );
//        
//        // adding disorders
//        // - disorder(disorder_ID(PK), disorder_name, user_ID(FK), doctor_ID(FK))
//        String userID1 = "user2000000000";
//        String disorderID = Tools.createUserID(Tools.generateRandomNumStr(), "disorder");
//        insert.insertRecord(
//                "disorder", 
//                disorderID,
//                "depression", 
//                userID1,
//                doctorID1
//        );
//        
//
//
//           
//        insert.terminate();
    

//        String adminEmail = "hash@gmail.com"; 
//        new WindowAdmin(adminEmail).setVisible(true);

        String adminEmail = "hash@gmail.com";
        new WindowHome(adminEmail).setVisible(true);
    }
    
}
