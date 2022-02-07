/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author W20008404
 */
public class Recorder {
     RecorderUI UI;
     
     Recorder(){
         UI = new RecorderUI(this);
         UI.display();
     }
     
     void CreateClass(int numStudents){
         MarkCollection records = new MarkCollection();
         records.setSize(numStudents);
         
                 
     }
}
