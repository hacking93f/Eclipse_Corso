/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programma;

/**
 *
 * @author HackinG
 */
public class Persona  {
    
    
     public String Nome = ("nome");
    public String Cognome = ("cognome");
    
    public String getName(){
        return Nome;
    }
    public String getCognome(){
        return Cognome;
    }
    public boolean getViaggio(){
        return Viaggio;
    }
    
    public void setName(String Nome){
        this.Nome = Nome;
    }
    public void setCognome(String Cognome){
        this.Cognome = Cognome;
    }
    public void setViaggio(boolean Viaggio){
        this.Viaggio = Viaggio;
    }
    
    public void printNome(){
        System.out.println(Nome + "" +Cognome);
    }
    
public boolean Viaggio = false;

public void printStream(){
    
   if(Viaggio == false)
       System.out.println("nessun utente con viaggi effettuati");
   else
       System.out.println("1 utente con 1 viaggio effettuato Trovato");
    
}


    
    
}
