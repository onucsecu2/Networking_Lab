import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_File {
  public static void main(String[] args) throws IOException {
    ServerSocket welcomeSocket = new ServerSocket(9090);
    File myFile = new File("/home/onu/Pictures/human-dna-3d.jpg");
    String file_name="human-dna-3d.jpg";
    
    while (true) {
      Socket connectionSocket = welcomeSocket.accept();
      ObjectOutputStream outToClient = new ObjectOutputStream(connectionSocket.getOutputStream());
      outToClient.writeObject(file_name);
      byte[] mybytearray = new byte[(int) myFile.length()];
      BufferedInputStream bis = new BufferedInputStream(new FileInputStream(myFile));
      bis.read(mybytearray, 0, mybytearray.length);
      OutputStream os = connectionSocket.getOutputStream();
      os.write(mybytearray, 0, mybytearray.length);
      os.flush();
      connectionSocket.close();
    }
  }
}