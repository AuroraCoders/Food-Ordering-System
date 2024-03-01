
package foodorderingsystem;


class Button {
    
 static int C = 0;
    
    public  Button( ){
        C++;
        if (C == 1){
             ShowCart S = new ShowCart();
             S.setVisible(true);
             S.setAlwaysOnTop(true);
         }
        
    }   
}

public class AddToCartB {
     public static void main(String[]args){
         
     }
    
    
}
