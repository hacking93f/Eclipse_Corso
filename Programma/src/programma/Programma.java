/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programma;

import java.util.Scanner;


/**
 *
 * @author HackinG
 */


public class Programma extends Persona {

   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona A = new Persona();
        System.out.println("Benvenuto Per iniziare Incapsuliamo un po di informazioni");
                System.out.println("Inserisci il tuo nome");

        Scanner sc = new Scanner(System.in);
        A.setName(sc.nextLine());
        
                System.out.println("il tuo cognome?");
                Scanner sc2 = new Scanner(System.in);
                A.setCognome(sc2.nextLine());
                
                A.printNome();
                
                System.out.println("Hai effettuato viaggi?");
                                System.out.println("True/False?");

                Scanner bol = new Scanner(System.in);
                A.setViaggio(bol.nextBoolean());
                A.printStream();

        
    
        
        
        
        
                
        
        
        
        
        
    }
    
}
