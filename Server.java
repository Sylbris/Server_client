import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String args[] ) throws IOException
	{
		ServerSocket ss=new ServerSocket( 4999);
		Socket s=ss.accept();
		
		System.out.println("Client connected successfully");
		
		InputStreamReader in=new InputStreamReader(s.getInputStream());
		BufferedReader bf=new BufferedReader(in);
		
		System.out.println("Status : " + bf.readLine());
		}
}
