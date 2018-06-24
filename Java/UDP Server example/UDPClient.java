import java.io.*;
import java.net.*;
public class UDPClient{
	public static void main(String args[]) throws Exception{
		try {
			BufferedReader infromUser = new BufferedReader(new InputStreamReader(System.in));
			DatagramSocket clientSocket = new DatagramSocket();
			InetAddress IPAddress = InetAddress.getByName("localhost");
			while(true) {
				byte[] sendData = new byte[1024];
				byte[] receiveData = new byte[1024];
				System.out.println("Enter data:");
				String sentence = infromUser.readLine();
				sendData = sentence.getBytes();
				DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length,IPAddress, 9876);
				clientSocket.send(sendPacket);
				DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
				clientSocket.receive(receivePacket);
				String receivedSentence = new String(receivePacket.getData());
				System.out.println("From server:" + receivedSentence);
			}
			//clientSocket.close();
		}catch (SocketTimeoutException ex) {
            System.out.println("Timeout error: " + ex.getMessage());
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println("Client error: " + ex.getMessage());
            ex.printStackTrace();
        } 
	}
}