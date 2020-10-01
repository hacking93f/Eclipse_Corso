import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HACKING
 */
public class Server {

    int port;
    ServerSocket server=null;
    Socket client=null;
    ExecutorService pool = null;
    int clientcount=0;
    
   
    public static void main(String[] args) throws IOException {
        Server serverobj=new Server(5000);
        serverobj.startServer();
    }
    
    Server(int port){
        this.port=port;
        pool = Executors.newFixedThreadPool(5);
    }

    public void startServer() throws IOException {
        
    	
    	//server avviato
        server=new ServerSocket(5000);
        System.out.println("[1]Server Avviato");
        System.out.println("[1]In Ascolto sulla porta :"+port);
        System.out.println("[2]Per interrompere la connessione scrivere --out");
        while(true)
        {
        	//connessione client accettata
            client=server.accept();
            clientcount++;
            //crea Thread
            ServerThread runnable= new ServerThread(client,clientcount,this);
            pool.execute(runnable);
        }
        
    }

    private static class ServerThread implements Runnable {
        
        Server server=null;
        Socket client=null;
        BufferedReader cin;
        PrintStream cout;
        Scanner sc=new Scanner(System.in);
        int id;
        String s;
        
        ServerThread(Socket client, int count ,Server server ) throws IOException {
            
            this.client=client;
            this.server=server;
            this.id=count;
            System.out.println("[3]Connection "+id+"established with client "+client);
            
            cin=new BufferedReader(new InputStreamReader(client.getInputStream()));
            cout=new PrintStream(client.getOutputStream());
        
        }

        @Override
        public void run() {
        	
        	
            int x=1;
            
         try{
        	 
         while(true){
               s=cin.readLine();
  			 
			System. out.print("Client("+id+") :"+s+"\n");
			System.out.print("Server : ");
			//s=stdin.readLine();
                            s=sc.nextLine();
                        if (s.equalsIgnoreCase("--out")||s.equalsIgnoreCase("--OUT"))
                        {
                            cout.println("disconnessione in corso...");
                            x=0;
                            System.out.println("Connessione Terminata alla prossima :)");
                            break;
                        }
			cout.println(s);
		}
		
            
                cin.close();
                client.close();
		cout.close();
                if(x==0) {
			System.out.println( "Server cleaning up." );
			System.exit(0);
                }
         } 
         catch(IOException ex){
             System.out.println("Error : "+ex);
         }
            
 		
        }
    }
    
}