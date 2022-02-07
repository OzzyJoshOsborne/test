
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author W20008404
 */
public class RecorderUI {
    
    int numStudents;
    Recorder test2;
    
    RecorderUI(Recorder Input){
        test2 = Input;
    }
    
    void display(){
        try
        {
            BufferedReader cons=new BufferedReader(new InputStreamReader(System.in)); 
            System.out.println("Enter the size of the student group:");
            numStudents = Integer.parseInt(cons.readLine());
            test2.CreateClass(numStudents);
            DisplayMarksEntry();
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
    
    void DisplayMarksEntry(){
        
        
    }
    
}
