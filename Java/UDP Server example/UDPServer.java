import java.io.*;
import java.net.*;
public class UDPServer {

	public static void main(String[] args) throws Exception{
		DatagramSocket serverSocket = new DatagramSocket(9876);
		byte[] receiveData = new byte[1024];
		byte[] sendData = new byte[1024];
		BufferedReader infromUser = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
			serverSocket.receive(receivePacket);
			String sentence = new String(receivePacket.getData());
			System.out.println("Received from "+receivePacket.getAddress() + ": " + sentence);
			InetAddress IPAddress = receivePacket.getAddress();
			int Port = receivePacket.getPort();
			System.out.println("Enter data:");
			String response = infromUser.readLine();
			sendData = response.getBytes();
			DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length,IPAddress, Port);
			serverSocket.send(sendPacket);
			
			
		}
	

	}

}
