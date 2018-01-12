import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;

public class Client_File {
  public static void main(String[] argv) throws Exception {
    Socket clientSocket = new Socket("127.0.0.1", 9090);
    byte[] mybytearray = new byte[750000];
    InputStream is = clientSocket.getInputStream();
    ObjectInputStream inFromServer = new ObjectInputStream(clientSocket.getInputStream());
    String file_name = (String)inFromServer.readObject();
    System.out.println("Server is sending File "+file_name);
    FileOutputStream fos = new FileOutputStream("/home/onu/Desktop/"+file_name);
    BufferedOutputStream bos = new BufferedOutputStream(fos);
        while(true) {
            try{
            	int bytesRead = is.read(mybytearray, 0, mybytearray.length);
            	bos.write(mybytearray, 0, bytesRead);
            }catch(Exception e) {	
        	    bos.close();
        	    clientSocket.close();
            	break;
            }
        }
        System.out.println("File is Recieved");
  }
}