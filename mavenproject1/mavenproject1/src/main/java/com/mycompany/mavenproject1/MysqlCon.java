/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author oweng
 */
import java.sql.*;

public class MysqlCon{
    private Connection conn = null;
    
    public MysqlCon(){
                
        

    }
    public boolean Connect(String filename)
    {
        try
        {
            String url = "jdbc:sqlite:"+filename;
            conn = DriverManager.getConnection(url);
            System.out.println("Connection to "+filename+"has been establishedd");
            
        }
        catch(SQLException e)
        {
            System.out.println("FAILED TO CONNECT TO "+filename);
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
    public boolean RunSQL(String sql){
        if(conn == null){
            System.out.println("There is no database loaded. Cannot run SQL.");
            return false;
        }
        try {
            Statement sqlStatement = conn.createStatement();
            sqlStatement.execute(sql);
        }
        catch(SQLException e){
            System.out.println("FAILED TO CONNECT TO "+sql);
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
    
    public ResultSet RunSQLQuery(String sql){
        ResultSet result;
        if(conn == null){
            System.out.println("There is no database loaded. Cannot run SQL.");
            return null;
        }
        try{
            Statement sqlStatement = conn.createStatement();
            //query.executeQuery();
            result = sqlStatement.executeQuery(sql);
           
        }
         catch(SQLException e){
            System.out.println("FAILED TO CONNECT TO "+sql);
            System.out.println(e.getMessage());
            return null;
        }
        return result;
    }
    
    public PreparedStatement sanatizeStatement(String sql){
        try{
            PreparedStatement pstmt = conn.prepareStatement(sql);
            
            return pstmt;
        }
        catch(SQLException e){
            System.out.println("FAILED TO CONNECT TO "+sql);
            System.out.println(e.getMessage());
            return null;
        }
    }
        
}  
