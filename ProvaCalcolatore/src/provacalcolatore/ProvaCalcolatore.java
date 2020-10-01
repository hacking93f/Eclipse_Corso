/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provacalcolatore;

import java.util.Scanner;





/**
 *
 * @author HackinG
 */
public class ProvaCalcolatore {

    
    
    public static String nome = "";
    public static String cognome = "";
    public static String sede = "";
    public static String viaggio ="";
    public static boolean dirigente = false;
    public static boolean ViaggioSi = false;
    public String SedeAzienda = "0arme033";
    
    
    
    
 
    /*
    getter & setter
    */
    
    public String getViaggio(){
        return viaggio;
    }
    
    public void setViaggio(String viaggio){
        this.viaggio = viaggio;
    }
    
    public boolean getDirigente(){
        return dirigente;
    }
    
    public void setDirigente(boolean dirigente){
        this.dirigente = dirigente;
    }
    
    public boolean getViaggioSi(){
        return ViaggioSi;
    }
    
    public void setViaggioSi(boolean ViaggioSi){
        this.ViaggioSi = ViaggioSi;
    }
    
    
    
    
    
    
    
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner VG = new Scanner(System.in);
        System.out.println("Hai effettuati un viaggio? se si dove? altrimenti lascia lo spazio bianco ");
        viaggio = VG.nextLine();
        System.out.println("sei dirigente? si/no");
        Scanner DRG = new Scanner(System.in);
       dirigente = false;
       String dirigentesn = "";
       String dirigentesna = "SI";
       dirigentesn = DRG.nextLine();
       
       
     
        //Viaggio
       if(viaggio.length() >3){
           System.out.print(viaggio);
           ViaggioSi = true;
       }
       else
             ViaggioSi = false;
       
           if(viaggio.length() == 0)
               System.out.println("non sono stati effettuati viaggi");
             
       
       
       
       //dirigente
       
       
           dirigentesn.toUpperCase();
      
    
       
           if (dirigentesn == dirigentesna){
               
               System.out.println("Utente Dirigente");
           }
           else
               
           System.out.println("non Dirigente");
        
           
    }
    
    
    
    
    
}
