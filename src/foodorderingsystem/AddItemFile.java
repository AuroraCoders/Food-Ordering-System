/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodorderingsystem;
import java.io.*;
import java.io.Serializable.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
class Item implements Serializable{

private static final long serialVersionUID = -7733069808182863451L;
    ArrayList<String> itemList = new ArrayList<>();
   
     public void write(String s){
        itemList.add(s);
         try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("update7.txt"))) {
            for (String item : itemList) {
                objectOutputStream.writeObject(item);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
     public void read(){
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("update7.txt"))) {
           
            while (true) {
                try {
                    String itemRead =  (String)objectInputStream.readObject();
                    itemList.add(itemRead);
                    
       
                         
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
        
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("update7.txt"))) {
           
            while (true) {
                try {
                    String itemRead =  (String)objectInputStream.readObject();
                itemList.add(itemRead);
                    
       
                         
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
     
    
                for (String i : itemList) {
                   
                  a.append(i+"\n");
     
            
        }
    

     }
}
public class AddItemFile {

}
