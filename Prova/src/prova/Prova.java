/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;
    
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
        
/**
 *
 * @author HackinG
 */

public class Prova {

  public static void main(String[] args){
      
    String s1,s2;
    
    s1 = JOptionPane.showInputDialog("Please input a value");
    s2 = JOptionPane.showInputDialog("Please input a value");
     
    if (s1.contains(s2)|| s2.contains(s1)) {
      JOptionPane.showMessageDialog(null,"TRUE");
    }
    else{
      JOptionPane.showMessageDialog(null,"False");
        
       
        
    }
        
    // show a joptionpane dialog using showMessageDialog
   
  
    
    
    
  }
}
