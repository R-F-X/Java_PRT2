
package com.beans.wellnesswave.utilities;

import java.io.FileWriter; 
import java.io.BufferedWriter; 
import java.io.IOException; 


public class FileHandler {
    private static BufferedWriter bWriter; 
    private static FileWriter writer;

    public FileHandler(){
        
    }
    // -----------------------------------
    
    public static void openFile(String fileName, boolean appendMode){
        try{
            writer = new FileWriter(fileName, appendMode); 
            bWriter = new BufferedWriter(writer);
            System.out.println("<File (" + fileName +  ") opened successfully>");
        }
        catch(IOException IOEx){
            System.out.println(IOEx.getMessage());
        }
    }
    
    public static void closeFile(){
        try{
//            writer.close();
            bWriter.close();
            System.out.println("<File closed>");
        }
        catch(IOException IOEx){
            System.out.println(IOEx.getMessage());
        }
    }
    // -----------------------------------

    public static void writeToFile(String str){
        try{
            bWriter.write(str);
            System.out.println("<Successfully wrote to file>");
        }
        catch(IOException IOEx){
            System.out.println(IOEx.getMessage());
        }
    }
    // ***OVERLOAD***
    public static void writeToFile(String str, boolean addNewLine){
        try{
            bWriter.write(str);
            bWriter.write("\n");
            System.out.println("<Successfully wrote to file>");
        }
        catch(IOException IOEx){
            System.out.println(IOEx.getMessage());
        }
    }

}
