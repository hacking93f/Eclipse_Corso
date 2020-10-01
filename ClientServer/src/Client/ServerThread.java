package Client;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.LinkedList;
import java.util.Scanner;

import org.omg.CORBA.portable.InputStream;


public class ServerThread implements Runnable {

	Socket sock;

	
	
	
	 private String userName;
	    private boolean isAlived;
	    private final LinkedList<String> messagesToSend;
	    private boolean hasMessages = false;

	    public ServerThread(Socket socket, String userName){
	        this.sock = socket;
	        this.userName = userName;
	        messagesToSend = new LinkedList<String>();
	    }

	    public void addNextMessage(String message){
	        synchronized (messagesToSend){
	            hasMessages = true;
	            messagesToSend.push(message);
	        }
	        
	        
	    }


		
	    
	    
	    @Override
	    public void run(){
	        System.out.println("Welcome :" + userName);

	        System.out.println("Local Port :" + sock.getLocalPort());
	        System.out.println("Server = " + sock.getRemoteSocketAddress() + ":" + sock.getPort());

	        try{
	            PrintWriter serverOut = new PrintWriter(sock.getOutputStream(), false);
	            InputStream serverInStream = (InputStream)sock.getInputStream();
	            Scanner serverIn = new Scanner(serverInStream);
	            // BufferedReader userBr = new BufferedReader(new InputStreamReader(userInStream));
	            // Scanner userIn = new Scanner(userInStream);

	            while(!sock.isClosed()){
	                if(serverInStream.available() > 0){
	                    if(serverIn.hasNextLine()){
	                        System.out.println(serverIn.nextLine());
	                    }
	                }
	                if(hasMessages){
	                    String nextSend = "";
	                    synchronized(messagesToSend){
	                        nextSend = messagesToSend.pop();
	                        hasMessages = !messagesToSend.isEmpty();
	                    }
	                    serverOut.println(userName + " > " + nextSend);
	                    serverOut.flush();
	                }
	            }
	        }
	        catch(Exception ex){
	            ex.printStackTrace();
	        }

	    }
	
	
	
	
	

	
}
