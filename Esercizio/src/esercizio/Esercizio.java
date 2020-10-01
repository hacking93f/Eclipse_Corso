/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio;

import java.util.*;
import java.io.*;
import javax.swing.*;
/**
 *
 * @author HackinG
 */
public class Esercizio {

     
    int A ;
    int B ;
    
    public int getA(){
        return A;
    }
    
    public int getB(){
        return B;
    }
    
    public void setA(int A){
        this.A = A;
    }
    
     public void setB(int B){
        this.B = B;
    }
     
    
    
     
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Esercizio E = new Esercizio();
        
        System.out.println("Inserisci 2 numeri");
System.out.println("inserisci il primo numero");
      Scanner sc1 = new Scanner(System.in);
      int x1 = sc1.nextInt();
      System.out.println("inserisci il secondo numero");
      Scanner sc2 = new Scanner(System.in);
      int x2 = sc2.nextInt();
      
       while((x1 >0) || (x2 >0)){
           
           E.ChiediNumero();
        int  xx = (x1*x2);
        int xxx = (xx / 2);
           System.out.println(xxx);
           
           
           
    
    
                }
       
       
        
    }
     
   
 public void ChiediNumero(){
     System.out.println("Inserisci il primo numero");
         Scanner sc1 = new Scanner(System.in);
      int x1 = sc1.nextInt();
      System.out.println("Inserisci il secondo numero");
      Scanner sc2 = new Scanner(System.in);
      int x2 = sc2.nextInt();
      
           
        int  xx = (x1*x2);
        int xxx = (xx / 2);
        
           System.out.println(xxx);
      
       }
     
     }
        
    
       
    
