
package foodorderingsystem;
import java.io.*;
import java.io.Serializable.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
class person1 implements Serializable{
ArrayList<person1> personList = new ArrayList<>();
private static final long serialVersionUID = -2277924193010853189L;

    String Email;
    String Password;
    
    person1(){
        
    }
      person1(String e, String p){
        Email=e;
        Password=p;
    }
 
   
    public void write(){
         personList.add(this);
         try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("T8"))) {
            for (person1 person : personList) {
                objectOutputStream.writeObject(person);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public void read(){
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("T8"))) {
            boolean flag =false;
            while (true) {
                try {
                    person1 personRead = (person1) objectInputStream.readObject();
                    personList.add(personRead);
                    
                     if(this.Email.equals(personRead.Email)){
                         flag=true;
                         
                            JOptionPane.showMessageDialog(null, "", "Error", JOptionPane.ERROR_MESSAGE);
                            break;
                         
                     }
                         
                } catch (EOFException ex) {
                    // End of file reached
                    break;
                } catch (ClassNotFoundException ex) {
                    ex.printStackTrace();
                }
               
            }
            
            if(flag==false){
                this. write();
                Login L=new Login();
                L.setVisible(true);
                
            }
             
        } catch (FileNotFoundException ex) {
            // File does not exist (first-time run)
        } catch (IOException ex) {
            ex.printStackTrace();
        }
       
                
    }
      public void read2(){
         try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("T8"))) {
           boolean flag=false;
            while (true) {
                try {
                    person1 personRead = (person1) objectInputStream.readObject();
                    personList.add(personRead);
                    
                     if(this.Email.equals(personRead.Email)){
                        
                           Menuu m=new Menuu();
                           m.setVisible(true);
                         
                           flag=true;
                           break;
                         
                     }
                         
                } catch (EOFException ex) {
                    // End of file reached
                    break;
                } catch (ClassNotFoundException ex) {
                    ex.printStackTrace();
                }
               
            }
            if(flag==false){
                
                 JOptionPane.showMessageDialog(null, "Invalid Data", "Error", JOptionPane.ERROR_MESSAGE);
                 
            }
            
          
             
        } catch (FileNotFoundException ex) {
            // File does not exist (first-time run)
        } catch (IOException ex) {
            ex.printStackTrace();
        }
       
      
    }
   

}

public class PersonTrue {
    public static void main(String[] args) {
 
    }
    }

