/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1; 
 import java.util.ArrayList; // import the ArrayList class
import java.util.Collections;

public class MarksSystemApp{
    Boolean loggedIn = false;
    LoginPage passwordWindow;
    practiceWeek4 theMainWindow;            // The GUI to communicate with user
    ArrayList<StudentMark> theMarksList;    // List of students. Will be replaced later with a database connection
    MarksSystemDatabase MSD = new MarksSystemDatabase();

    // This is just to run the program
    public static void main(String[] args) {
        MarksSystemApp mh = new MarksSystemApp();
        
    }
    
    // Constructor. Creates the GUI and displays the data.
    // This does more than I normally like a constructor to do,
    // but I am trying to keep things simple.
    public MarksSystemApp(){
        passwordWindow = new LoginPage(this);
        passwordWindow.setVisible(true);
        
        theMarksList = new ArrayList<StudentMark>();
        
        loadMarks();
        
        // Tempted to convert to an Object[][] at this point.
        // But I'll let the GUI do it, since it will be replaced by
        // database ResultSet, anyway.
        //theMainWindow.displayTableData(theMarksList);
    }
    
    
    // Eventually, this will connect to a database.
    // For now, I am faking it. 
    public void loadMarks()
    {
        
        theMarksList=MSD.getAllStudents();
        /*theMarksList.clear();
        StudentMark s = new StudentMark();
        s.setName("Augustus DeMorgan");
        s.setMark(60);
        theMarksList.add(s);
        
        s = new StudentMark();
        s.setName("Leonard Weyveguse");
        s.setMark(73);
        theMarksList.add(s);
        
        s = new StudentMark();
        s.setName("Caroline Lamb");
        s.setMark(33);
        theMarksList.add(s);
        
        s = new StudentMark();
        s.setName("Annabelle Milbank");
        s.setMark(85);
        theMarksList.add(s);
        
        s = new StudentMark();
        s.setName("Augusta Leigh");
        s.setMark(53);
        theMarksList.add(s);*/
        
        Collections.sort(theMarksList);
    }
    
    
    // Eventually this will save data to a database but I am faking
    // it for now
    void saveMarks() {
        
    }
    
    // Deletes a specific student, and updates the jTable.
    // What happens if two students have the same name?
    // Ignore that for this example, but that's what
    // a studentID is for.
    void deleteStudent(String studentName) {

        // Find a reference to the student, if any
        StudentMark found=null;
        for (StudentMark s: theMarksList) { 
            if(s.getName()==studentName) {
                found=s;
            }
        } 
        
        // If a matching student was found, then delete it from the list
        if(found!=null) {
            theMarksList.remove(found);
            MSD.deleteStudent(studentName);
        }
        
        // Send the data to the JTable. This reloads the entire damn
        // table. Not efficient, but safe and simple.
        theMainWindow.displayTableData(theMarksList);
    }
    
    void updateMark(String studentName, int newMark) {
        // Find a reference to the student, if any
        StudentMark found=null;
        for (StudentMark s: theMarksList) { 
            if(s.getName().equals(studentName)) {
                found=s;
            }
        } 
        System.out.println(found);
        // If a matching student was found, then change the mark
        if(found!=null) {
            if(newMark>100) {
                newMark = 100;
            }
            if(newMark<0) {
                newMark = 0;
            }
            found.setMark(newMark);
            MSD.updateStudent(studentName, newMark);
        }
        
        // Send the data to the JTable. This reloads the entire damn
        // table. Not efficient, but safe and simple.
        theMainWindow.displayTableData(theMarksList);
    }
    
    public void addStudent(String studentName, int mark) {
        
        // Create the student
        StudentMark newStudent = new StudentMark();
        newStudent.setName(studentName);
        newStudent.setMark(mark);
        
        // Add to the list
        theMarksList.add(newStudent);
        MSD.addStudent(studentName, mark);
        
        // Send the data to the JTable. This reloads the entire damn
        // table. Not efficient, but safe and simple.
        theMainWindow.displayTableData(theMarksList);
    }
    
    public Boolean login(String userName, String password)
    {   
        Boolean loggedIn = false;
        Boolean passed = MSD.checkLogin(userName, password);
        System.out.println(passed);
        if(!passed) {
            System.out.println("Please try again");
            return loggedIn;
        }
        else if(passed.equals(true)) {
            loggedIn = true;
            return loggedIn;
            
        }
        theMainWindow.displayTableData(theMarksList);
        return loggedIn;
    }
    
    void createHomePage()
    {
        theMainWindow = new practiceWeek4(this);
        theMainWindow.setVisible(true);
        theMainWindow.displayTableData(theMarksList);
        passwordWindow.dispose();
    }
    
    void createLoginPage(){
        passwordWindow = new LoginPage(this);
        passwordWindow.setVisible(true);
        theMainWindow.dispose();
    }
    
    
}