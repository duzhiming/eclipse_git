package test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class testUDPClient {

	public static void main(String[] args) {
		
		try {
			byte[] sendData = "hello".getBytes();
			InetAddress inet = InetAddress.getByName("127.0.0.1");
			int port = 9999;
			DatagramPacket sendPkt = new DatagramPacket(sendData,
					sendData.length,inet,port);
			DatagramSocket socket = new DatagramSocket();
			socket.send(sendPkt);
			byte[] reveiveData = new byte[1024*1024];
			//DatagramPacket rece = new DatagramPacket(reveiveData, reveiveData.);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
