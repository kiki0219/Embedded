package newer;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Sender extends Thread {
	
	private DatagramSocket  udpsocket;
	private boolean islive=true;
	public Sender(DatagramSocket  udpsck){
		udpsocket=udpsck;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		InetAddress  addr=null;
		while(islive){
			int port=sc.nextInt();
			try {
				 addr=InetAddress.getByName("localhost");
			} catch (Exception e) {
				// TODO: handle exception
				islive=false;
				e.printStackTrace();				
			}	
			
			String msg=sc.nextLine();
			DatagramPacket pack=new DatagramPacket(msg.getBytes(),msg.getBytes().length,addr,port);
			try {
				udpsocket.send(pack);
			} catch (Exception e) {
				// TODO: handle exception
				islive=false;
				e.printStackTrace();
			}			
		}		
	}
}
