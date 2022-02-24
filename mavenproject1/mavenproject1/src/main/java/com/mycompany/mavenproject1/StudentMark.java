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
public class StudentMark implements Comparable<StudentMark> {
	private int mark;
	private String name;
	
	public StudentMark(){
		name = "Not set";
		mark =0;
	}
	
	public void setName(String studentName) {
		name = studentName;
	}
	
	public void setMark(int newMark) {
		mark = newMark;
	}
	
	public int getMark() {
		return mark;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean hasPassed(){
		return (mark>=40);
	}

	@Override
	public int compareTo(StudentMark o) {
		return o.mark-this.mark;
	}
}

