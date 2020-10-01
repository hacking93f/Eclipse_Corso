/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matricola;

/**
 *
 * @author HackinG
 */
public class Matricola {

        
    String Nome;
    String Cognome;
    String Anni;
    int NumeroMatricola = 0;
    
        
    
public String getNome(){
    
    return Nome;
}
public void setNome(String Nome) {

this.Nome = Nome;

}
public String getCognome() {
    
    return Cognome;
}

public void setCognome(String Cognome){
    this.Cognome = Cognome;
}

public int getNumeroMatricola(){
    return NumeroMatricola;
}

public void setNumeroMatricola(int NumeroMatricola){
    this.NumeroMatricola = NumeroMatricola;
}

        
public void ComeTiChiami(){
  System.out.println("Mi chiamo: "+Nome+ " "+Cognome+ " il mio numero matricola è :"+NumeroMatricola);
}

}



       
