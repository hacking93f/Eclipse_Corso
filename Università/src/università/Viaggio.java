/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package università ;

import static java.awt.PageAttributes.MediaType.A;
import java.util.Scanner;
import static javafx.scene.input.KeyCode.A;
import static javax.print.attribute.standard.MediaSize.Engineering.A;

/**
 *
 * @author HackinG
 */


class Viaggio extends Università  {
    
    public boolean getViaggio(){
        return Viaggio;
    }
    public void setViaggio(boolean viaggio){
        this.Viaggio = viaggio;
        
    }
    
    Scanner sc1 = new Scanner(System.in);
    Viaggio A = new Viaggio();
    A = sc1.nextBoolean();

   
}

