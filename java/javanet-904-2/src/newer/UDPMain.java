package newer;

import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class UDPMain {

	public static void main(String[] args) throws SocketException, UnknownHostException {
		// TODO Auto-generated method stub    
		
		Scanner sc=new Scanner(System.in);		
		int port=sc.nextInt();
		
		InetAddress  addr=InetAddress.getByName("localhost");		
		DatagramSocket udsocket=new DatagramSocket(port, addr);
		
		Recver r=new Recver(udsocket);
		Sender s=new Sender(udsocket);
		r.start();
		s.start();
		
		
	}

}
