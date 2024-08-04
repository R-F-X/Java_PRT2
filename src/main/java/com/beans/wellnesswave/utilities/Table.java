package com.beans.wellnesswave.utilities;

import com.beans.wellnesswave.databaseControl.DBDelete;
import com.beans.wellnesswave.databaseControl.DBRead;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Table {

    public static void clearTable(JTable tableName) {
        DefaultTableModel model = (DefaultTableModel) tableName.getModel();
        model.setRowCount(0);
    }

    public static void insertToJTable(JTable tableGUI, String tableDB, int numOfCols) {
        DBRead.connect();
        DBRead.readAllRecords(tableDB, numOfCols);

        // JTable
        DefaultTableModel model = (DefaultTableModel) tableGUI.getModel();

        // clear table
        model.setRowCount(0);

        try {
            ResultSet res = DBRead.getResult();
            if (res == null) {
                System.out.println("ResultSet is null.");
                return;
            }
            res.beforeFirst();

//            int numOfCols = numberOfCols;
            Object[] row = new Object[numOfCols];
            while (res.next()) {
                System.out.println("First loop...");

                for (int i = 1; i <= numOfCols; i++) {
                    row[i - 1] = res.getObject(i);
                }
                model.addRow(row);
            }

        } catch (SQLException ex) {
            System.out.println("this catch" + ex);
        }
        DBRead.terminate();
    }

//    public static void deleteFromTable(JTextField jTextField) {
//
////    public static void deleteFromTable(JTextField jTextField, jTable tableName){
//        System.out.println("deleting...");
//
//        String deleteValue = jTextField.getText();
//
//        DBDelete.connect();
//        DBDelete.delete("user_temp", "user_ID", deleteValue);
//
//        jTextField.setText("");
////                clearTable(tableName);
//
//        JOptionPane.showMessageDialog(null, "Record deleted");
//        DBDelete.terminate();
//    }

    // ***OVERLOAD    
    public static void deleteFromTable(
            JTextField jTextField,
            String tableDB,
            String colNameDB
    ) {
        System.out.println("deleting...");

        String deleteValue = jTextField.getText();

        DBDelete.connect();
        DBDelete.delete(tableDB, colNameDB, deleteValue);

        jTextField.setText("");
        JOptionPane.showMessageDialog(null, "Record deleted \nRefresh table");
        DBDelete.terminate();
    }

    // ***OVERLOAD    
    public static void deleteFromTable(
            JTextField jTextField,
            String tableDB,
            String colNameDB, 
            JTable tableName, 
            int numOfCols
    ) {
        String deleteValue = jTextField.getText();

        DBDelete.connect();
        DBDelete.delete(tableDB, colNameDB, deleteValue);

        jTextField.setText("");
        insertToJTable(tableName, tableDB, numOfCols);
        // clearTable(tableName);
                
        JOptionPane.showMessageDialog(null, "Record deleted \nRefresh table");
        DBDelete.terminate();
    }

}
