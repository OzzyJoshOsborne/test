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
public class user {
    private String username;
    private String password;

    public user(){
            username = "Not set";
            password = "Not set";
    }

    public void setName(String studentName) {
            username = studentName;
    }

    public void setMark(String newPassword) {
            password = newPassword;
    }

    public String getPassword() {
            return password;
    }

    public String getName() {
            return username;
    }

}
