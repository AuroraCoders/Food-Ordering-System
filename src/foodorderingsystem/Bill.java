/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodorderingsystem;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JTextArea;

class Total implements Serializable {
    
    ArrayList<Integer> integer=new ArrayList<>();
  
    public void write(int s){
        integer.add(s);
         try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Total7.txt"))) {
            for (Integer item : integer) {
                objectOutputStream.writeObject(item);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public void read(){
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Total7.txt"))) {
           
            while (true) {
                try {
                    Integer itemRead =  (Integer)objectInputStream.readObject();
                integer.add(itemRead);
                    
       
                         
                } catch (EOFException ex) {
                    // End of file reached
                    break;
                } catch (ClassNotFoundException ex) {
                    ex.printStackTrace();
                }
               
            }
            
          
             
        } catch (FileNotFoundException ex) {
            // File does not exist (first-time run)
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    
                          
                
    

     }
     public void read1(JTextArea a){
        
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Total7.txt"))) {
           
            while (true) {
                try {
                    Integer itemRead =  (Integer)objectInputStream.readObject();
                integer.add(itemRead);
                    
       
                         
                } catch (EOFException ex) {
                    // End of file reached
                    break;
                } catch (ClassNotFoundException ex) {
                    ex.printStackTrace();
                }
               
            }
            
          
             
        } catch (FileNotFoundException ex) {
            // File does not exist (first-time run)
        } catch (IOException ex) {
            ex.printStackTrace();
        }
     
    
                   int sum=0;
                for (Integer i : integer) {
                   
                  sum=sum+i;

            
        }
                
               a.append("Total :   "+sum);
    

     }
    
}
public class Bill {
    
}
