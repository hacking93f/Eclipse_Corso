/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terminale;

/**
 *
 * @author HackinG
 */
public class Persona {
    
    public String iName = ("Name");
    public String iCognome = ("Cognome");
    public String NomeAzienda =("123d3d3d");
    public int ViaggiEffettuati = 0 ;
    public boolean TravelBol = false ; 
    
    public String getName(){
        return iName;
    }
    
    public String getSurname(){
        return iCognome;
    }
    
    public String getNomeAzienda(){
        return NomeAzienda;
    }
    
    public int getViaggiEffettuati(){
        return ViaggiEffettuati;
    }
    
    public boolean getTravelBol(){
        return TravelBol;
    }
    
    public void setName(String iName){
        this.iName = iName;
    }
    
    public void setSurname(String iCognome){
        this.iCognome = iCognome;
    }
    
    public void setNomeAzienda(String NomeAzienda){
        this.NomeAzienda = NomeAzienda;
    }
    
    public void setViaggiEffettuati(int ViaggiEffetuati){
        this.ViaggiEffettuati = 0;
    }
    public void setTravelBol(boolean TravelBol){
        this.TravelBol = TravelBol;
    }
    
    
    
  /*
    Fine GET E SET 
    
    Inizio Print To Screen
    */

        public void PrintToScreenViaggi(){
        
     if(ViaggiEffettuati <= 1 )
   System.out.println("L'utente Ha Effettuato: "+ViaggiEffettuati+ "Viaggi");
    else
        TravelBol = false;
     System.out.println("L'utente non ha effettuato Viaggi");

    }
    
   
}
