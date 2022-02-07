
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author W20008404
 */
public class MarkCollection {
    
    ArrayList<MarkRecord> allRecords;
    
    MarkCollection(){
        allRecords = new ArrayList<MarkRecord>();
        
    }
    
    void setSize(int size){
        
        for(int i = 0 ; i < size; i++){
            allRecords.add(new MarkRecord());
        }
        System.out.print(allRecords.size());
    }
}
