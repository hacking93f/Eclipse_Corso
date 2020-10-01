/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matricola;

import java.util.Scanner;

/**
 *
 * @author HackinG
 */
public class Test extends Matricola{
    public static void main(String Args[]){
        Matricola A = new Matricola();
          Scanner nOme = new Scanner(System.in);
          System.out.println("Scrivi Il Tuo Nome");
          Scanner CoGnome = new Scanner(System.in);
         System.out.println("Scrivi Il Tuo Cognome");
          

        A.setNome(nOme.nextLine());
        A.setCognome(CoGnome.nextLine());
        A.setNumeroMatricola(120008970);
        A.ComeTiChiami();
        
        
                
    }
    
}
