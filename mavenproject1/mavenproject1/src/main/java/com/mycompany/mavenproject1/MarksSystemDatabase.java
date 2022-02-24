/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;
import java.util.ArrayList; // import the ArrayList class
import java.sql.*;

/**
 *
 * @author oweng
 */
public class MarksSystemDatabase {
    private MysqlCon database;
    
    public MarksSystemDatabase(){
        database = new MysqlCon();
        database.Connect("D:\\UNI\\Year 2\\SENG\\sqlite-tools-win32-x86-3340100\\sqlite-tools-win32-x86-3340100\\marks.db");

    }
    
    public void deleteStudent(String studentName){
        String sqlString = new String("Delete FROM student WHERE name = '"+studentName+"';");
        boolean success = database.RunSQL(sqlString);
        if(!success) {
            System.out.println("Failed: "+sqlString);
        }
    }
    
    public void updateStudent(String studentName, int newMark){ 
         String sqlString = new String("UPDATE student "
                 + "                    SET mark ="+newMark+" "
                         + "            WHERE name = '"+studentName+"';");
        boolean success = database.RunSQL(sqlString);
        if(!success) {
            System.out.println("Failed: "+sqlString);
        }
    }
    
    public ArrayList<StudentMark> getAllStudents(){
        String sqlString = new String("SELECT name, mark FROM student;");
        ResultSet studentList =database.RunSQLQuery(sqlString);
        ArrayList<StudentMark> answer = new ArrayList<StudentMark>();
        
        try{
            while(studentList.next()) {
                StudentMark newStudent = new StudentMark();
                newStudent.setName(studentList.getString(1));
                newStudent.setMark(studentList.getInt(2));
                answer.add(newStudent);
            }
        }
        catch(SQLException e){
            System.out.println("FAILED");
            System.out.println(e.getMessage());
            return null;
        }
        return answer;
    }
    
     public void addStudent(String studentName, int mark){
        String sqlString = new String("INSERT INTO student(name, mark) "
                + "                     VALUES('"+studentName+"','"+mark+"');");
        boolean success = database.RunSQL(sqlString);
        if(!success) {
            System.out.println("Failed: "+sqlString);
        }
    }
     
    public Boolean checkLogin(String userName, String password)
    {
        String sqlString = new String("SELECT userName, password FROM users WHERE userName ='"+userName+"';");
        ResultSet success = database.RunSQLQuery(sqlString);
        ArrayList<user> answer = new ArrayList<user>();
        try{
            while(success.next()) {
                user newUser = new user();
                newUser.setName(success.getString(1));
                newUser.setMark(success.getString(2));
                answer.add(newUser);
            }
            int size = answer.size();
            System.out.println(size);
             if(answer.size() == 0) {
                System.out.println("Failed: "+sqlString);
                return false;
            }
            return true;
            
        }
        catch(SQLException e){
            System.out.println("FAILED");
            System.out.println(e.getMessage());
            return null;
        }
       /* try {
            success.last();
            int size = success.getRow();
            System.out.println(size );
            System.out.println(success);
            if(size == 0) {
                System.out.println("Failed: "+sqlString);
                return false;
            }
            return true;
        }
         catch(SQLException e){
            System.out.println("FAILED");
            System.out.println(e.getMessage());
            return false;
        }*/
       //return false;
    }
     
    
}
