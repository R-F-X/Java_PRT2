
package com.beans.wellnesswave;

import javax.swing.JOptionPane;

public class Tools {

    public static String createUserID(String name, String email){
        String userID = reverseStr(name) + email;
        return userID;
    }
    
    public static String reverseStr(String word){
        String reversed = "";
        
        for (int a=word.length()-1; a >= 0; a--){
            reversed += word.charAt(a);
        }
        return reversed; 
    }
    
    public static void closeApp(){
//        int option = JOptionPane.showConfirmDialog(
//                null,
//                "Are you sure you want to select this option (" + selectedDisorder + " )?",
//                "Confirm", 
//                JOptionPane.YES_NO_OPTION);
//        
//        System.out.println(option);
//        
//        if (option == 0){
//            System.out.println(selectedDisorder);
//            // save to db
//        }
    }
    // ===========================================
    // TEST
//    public static void main(String[] args){
////        Tools tools = new Tools();
//
//        String a = Tools.reverseStr("this");
//        String b = Tools.createUserID("James", "james@gmail.com");
//        
//        System.out.println(a);
//        System.out.println(b);
//
//    }

    // ===========================================

}
