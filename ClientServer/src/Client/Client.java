package Client;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


/**
 *
 * @author HACKING
 */

public class Client {



		Socket client;
		int porta;
		
			
		// private static class ClientThread()throws IOException {
		    		 
		  //  }
		  
		  
	   
		public static void main(String args[]) throws Exception
		{
	    	
			Socket sk=new Socket("127.0.0.1",5000);
			
			BufferedReader sin=new BufferedReader(new InputStreamReader(sk.getInputStream()));
			PrintStream sout=new PrintStream(sk.getOutputStream());
			BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
			
			String s = null;
			String ricevi = null;
			
			//loop di ascolto messaggi
			while (true)
			{
				//ricevi
				System.out.print("Client : ");
				s=stdin.readLine();
				sout.println(s);
				
				//invia
				ricevi=sin.readLine();
				System.out.print("Server : "+ricevi+"\n");
//				
	                        if ( s.equalsIgnoreCase("--out") )
	                        {
	                          System.out.println("Connessione terminata ...");
	                          
	                          
	// se   torna vero temrina ciclo e salta all istruzione successiva         
	 			  break;
//				
	                        }

			
			
				
	  			
			}
			 sk.close();
			 sin.close();
			 sout.close();
	 		stdin.close();
	}
	    
	   
}
	
