
package com.beans.wellnesswave.utilities;

import java.util.Scanner; 
import java.util.ArrayList; 
import java.util.Arrays;
import java.util.Collections;

public class QuestionnaireLogic {
    public static int counterD1; 
    public static int counterD2; 
    public static int counterD3; 
    public static int counterD4; 
    public static int counterD5; 
    public static int counterD6; 

    private Scanner userIn; 
    public static ArrayList<Integer> counters; 
    public static ArrayList<String> disorders; 
    
    public QuestionnaireLogic(){
        userIn = new Scanner(System.in);
        counters = new ArrayList<>(); 
        // counterD2 = 10; 
        
        disorders = new ArrayList<>(); 
        disorders.add("ADHD");
        disorders.add("Anxiety");
        disorders.add("Bipolar Disorder");
        disorders.add("Depression");
        disorders.add("PTSD");
        disorders.add("Suicidal");
    }
    // -----------------------------------
   
    public void updateList(){
        counters.clear();
        
        // adding to arraylist
        counters.add(counterD1);
        counters.add(counterD2);
        counters.add(counterD3);
        counters.add(counterD4);
        counters.add(counterD5);
        counters.add(counterD6);
    }
    
    
    public static String displayDisorder(){
        System.out.println("\nDISORDER");

        System.out.println("Maximum Element in ArrayList = "  + Collections.max(counters));
        
        int index = counters.indexOf(Collections.max(counters)); 
        System.out.println("index: " + counters.indexOf(Collections.max(counters)));
        System.out.println("disorder: " + disorders.get(index));

        String potentialDisorder = disorders.get(index);
        return potentialDisorder; 
    }
    
    public static void mostLikelyAilment(){
        // maybe use arraylists
//        System.out.println(this.counters.length);
//        
//        int highest = 0;
//        int index = 0; 
//        for (int a=0; a < this.counters.length; a++){
//            System.out.println(counters[a]);
//            
//            if (counters[a] > highest){
//                highest = counters[a];
//                index = a;
//            }
//        }
    }
    
    // -----------------------------------
    // MAIN
//    public static void main(String[] args){
//        System.out.println("<START>");
//
//        QuestionnaireLogic obj = new QuestionnaireLogic();
//        
//        obj.function1();
//        obj.displayDisorder();
//        
//        System.out.println("\n<END>");
//    }
    // -----------------------------------

}
