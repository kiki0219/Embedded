package newer;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Recver extends Thread {
	
	private DatagramSocket udpsocket;
	private DatagramPacket pack;
	private boolean islive=true;
	public Recver(DatagramSocket  udpsck){
		udpsocket=udpsck;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		byte[] buf=new byte[1024];
		while(islive){
			try {
				pack=new DatagramPacket(buf, buf.length);
				udpsocket.receive(pack);
				String msg=new String(pack.getData(),0,pack.getLength());
				System.out.println(msg);
			} catch (Exception e) {
				// TODO: handle exception
				islive=false;
				e.printStackTrace();
			}
		}		
	}

}
