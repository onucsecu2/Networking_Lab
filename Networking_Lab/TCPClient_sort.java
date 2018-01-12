
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;
import java.net.*;

public class TCPClient_sort {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	
		  Scanner s=new Scanner(System.in);
		  int n = s.nextInt();
		  int arr[]= new int[n];


		  
		  try(Socket clientSocket = new Socket("localhost", 9090)){
			  //System.out.println("yo");
		  ObjectOutputStream outToServer = new ObjectOutputStream(clientSocket.getOutputStream());
		  ObjectInputStream inFromServer = new ObjectInputStream(clientSocket.getInputStream());
		  for (int i = 0; i <n; i++) {
			  	arr[i]=s.nextInt();
		  }
		  outToServer.writeObject(arr);
		  //System.out.println("paice");
		  int[] arrFromServer = (int[])inFromServer.readObject();
		  
		  
		  System.out.println("FROM SERVER: ");
		   for (int i = 0; i < arrFromServer.length; i++) {
		        System.out.println(arrFromServer[i]+" ");
		   }
		  clientSocket.close();
		  }catch (Exception e){
			  System.out.println("error!");
		  }
	}

}