
package com.beans.wellnesswave;


public interface DBController {
    
    public void connect(); 
    
    public void terminate();
    
    public void wildQuery(String SQLQuery);
    
    public void createTables(String statement);
    
    public void insertRecord(String statement);
    
    public void updateRecord(String statement);
    
    public void readRecord(String statement);
    
    public void deleteRecord(String statement);
    
    public void encrypt();
    
    // ---------------------------------
    // more; should move to a different class or interface
    
    public boolean checkCredentials(String credentials);
    
//    public boolean checkIfIDExists();
    // or 
    public boolean checkIfPrimaryKeyExists(String key);

    public void addUser(String statement);
    
    // for journal
    public String getJournalEntry();
    
    // for making an appointment
    public void bookAppointment();

    // ---------------------------------

}
