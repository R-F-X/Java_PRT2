package com.beans.wellnesswave.encrypt;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encryption {
    public static byte[] hashedPassword;

    Encryption() { }

    public static byte[] hashPass(String password) {
        // FOR DEBUGGING REMOVE LATER 
        System.out.println(password + " " + "is the password about to be hashed");
        
        // Hash password                    
        // instantiate object for sha 256 hashing
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            //create hash byte array for the password, this is what can be stored in db
            hashedPassword = md.digest(password.getBytes(StandardCharsets.UTF_8));

        } 
        catch (NoSuchAlgorithmException e) {

        }

        return hashedPassword;
    }

}
