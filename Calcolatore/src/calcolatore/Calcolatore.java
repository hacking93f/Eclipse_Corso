/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcolatore;

import java.util.Scanner;

/**
 *
 * @author HackinG
 */


public class Calcolatore {

    public int Result = 0;
    String name = ("nome");
    String surname = ("cognome");

    
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
     public String getSourname(){
        return surname;
    }
    
    public void setSourname(String surname){
        this.surname = surname;
    }
    
    public void PrintToScreen(){
        
        System.out.println("Ti Chiami:");
        System.out.println(name + "" +surname);
    }
    
     
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Come Ti Chiami??");
        Scanner sc1 = new Scanner(System.in);
        Calcolatore Persona = new Calcolatore();
        Persona.setName(sc1.nextLine());
     System.out.println("Cognome?");
     Scanner sc2 = new Scanner(System.in);
     Persona.setSourname(sc2.nextLine());
     System.out.println("....Facciamo un Addizione....");
     System.out.println("....Scrivi un numero....");
     Scanner add = new Scanner(System.in);
     int x = add.nextInt();
     System.out.println("ok ora Scrivine un altro per favore");
     Scanner add2 = new Scanner(System.in);
     int xx = add2.nextInt();
     
     Persona.PrintToScreen();
     System.out.println(x + xx);
     
    }
    
    
}
