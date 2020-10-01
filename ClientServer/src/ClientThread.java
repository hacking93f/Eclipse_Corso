
import java.io.*;
import java.net.*;
import java.util.Scanner;


public class ClientThread implements Runnable{

	private Socket sock;
	private PrintWriter out;
	private Server server;
	
	public ClientThread(Server server, Socket sock) {
		
		this.sock=sock;
		this.server=server;
		
		
	}
	
	private PrintWriter getWriter() {
		return out;
	}
	
	public void run() {
		
		try {
			
			this.out = new PrintWriter(sock.getOutputStream(), false);
			Scanner in = new Scanner(sock.getInputStream());
			
			//inizio comunicazione
			
			while(!sock.isClosed()) {
				
				
				if(in.hasNext()) {
					
					
				String input;
				
				input = in.nextLine();
				
//				for(ClientThread thatClient : server.acceptClients()) {
//					PrintWriter thatOut = thatClient.getWriter();
//					if(thatOut != null) {
//						
//						thatOut.write(input + "\r\n");
//						thatOut.flush();
//					}

						
//				}
				
				
				
			}
			}
			
		//	public PrintWriter getWriter() {
				
			//	return out;
		//	}
			
		} catch (Exception e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
}
