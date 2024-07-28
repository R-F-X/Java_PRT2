
package com.beans.wellnesswave;

import com.beans.wellnesswave.databaseControl.DBDelete;
import com.beans.wellnesswave.utilities.FileHandler;
//------------------------

public class TestMain {

    public static void main(String[] args) {
        System.out.println("Testing");
        
        FileHandler.openFile("new.txt", true);
        FileHandler.writeToFile("testing...");
        FileHandler.closeFile();
    }
    
}
