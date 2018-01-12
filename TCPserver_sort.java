

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.net.*;

public class TCPserver_sort {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		//ServerSocket welcomeSocket = new ServerSocket(6786);
		ServerSocket welcomeSocket = new ServerSocket(9090,0,InetAddress.getByName("localhost"));
		while(true){
			Socket connectionSocket = welcomeSocket.accept();
		    ObjectInputStream inFromClient = new ObjectInputStream(connectionSocket.getInputStream());
		    ObjectOutputStream outToClient = new ObjectOutputStream(connectionSocket.getOutputStream());
		    int[] arrFromClient = (int[]) inFromClient.readObject();
		    Arrays.sort(arrFromClient);
		    outToClient.writeObject(arrFromClient);
		}

	}
}
