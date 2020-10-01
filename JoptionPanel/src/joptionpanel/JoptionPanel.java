/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joptionpanel;

import javax.swing.*;
import java.util.*;
import sun.security.util.Password;
        
/**
 *
 * @author HackinG
 */
public class JoptionPanel {

    private static String Password;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        /*
        Come incapsulare array di dati
        */
        int GiorniSettimana = 7;
        
        String[] giorni = new String[GiorniSettimana];
        
        
        giorni [0] = "lunedi";
        giorni [1] = "martedi";
        giorni [2] = "mercoledi";
        giorni [3] = "giovedi";
        giorni [4] = "venerdi";
        giorni [5] = "sabato";
        giorni [6] = "domenica";
      
         
                        
    
        System.out.println(giorni);
        
            
    
        
       
        String nome1 = ("SI");
        String nome = JOptionPane.showInputDialog("Facciamo Delle Operazioni? SI/NO?");
        //il valore inserito verra trasformato automaticamente in Maiuscolo
            nome = nome.toUpperCase();
        
        if (nome.equals(nome1) && (nome.length()>0))          
            
        {   
        	//i 2 pulsanti
            Object[] options = { "OK", "CANCEL" };
            
JOptionPane.showOptionDialog(null, "Click OK to continue", "PROSSIMO STEP",
JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
null, options, options[0]);

String Number = JOptionPane.showInputDialog("inserisci un numero");
//string to int
int result = Integer.parseInt(Number);
System.out.println(result);

String Number2 = JOptionPane.showInputDialog("inserisci un numero");
//string to int
int result2 = Integer.parseInt(Number2);
System.out.println(result2);

int FResult = result * result2 / 2;

System.out.println(FResult);





        }
        
        

Object[] possibleValues = { "ooooppsss", "Second", "Third" };
Object selectedValue = JOptionPane.showInputDialog(null,
"opppsss", "Input",
JOptionPane.INFORMATION_MESSAGE, null,
possibleValues, possibleValues[0]);

    }
    
    //metodi getter and setter

	public static String getPassword() {
		return Password;
	}

	public static void setPassword(String password) {
		Password = password;
	}

    
}