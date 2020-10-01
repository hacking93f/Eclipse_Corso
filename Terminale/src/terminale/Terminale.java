/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terminale;

import java.util.Scanner;

/**
 *
 * @author HackinG
 */
public class Terminale extends Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Persona utente = new Persona();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Come Ti Chiami?");
        utente.setName(sc1.nextLine());
        System.out.println(utente.iName);
        System.out.println("Quanti viaggi hai effettuato?");
        Scanner scnm = new Scanner(System.in);
        utente.setViaggiEffettuati(scnm.nextInt());
        utente.PrintToScreenViaggi();
        
        
        
        // TODO code application logic here
    }
    
}
