package newer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TcpClientSocket {

	private Socket  clientsck=null;
	private InputStream  ins=null;
	private OutputStream outs=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TcpClientSocket  clientc=new TcpClientSocket();
				clientc.run();
	}
	
	public void run(){
		try {
			clientrun();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally{
			try {
				if(clientsck==null){
					clientsck.close();
					clientsck=null;
				}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
			
		}
	}
	
	public  void   clientrun() throws Exception{
		clientsck=new Socket("127.0.0.1", 1234);
		ins=clientsck.getInputStream();
		outs=clientsck.getOutputStream();
		
		Scanner sc=new Scanner(System.in);
		String msg=sc.nextLine();
		byte[] buf=msg.getBytes();
		outs.write(buf);
		
		buf=new byte[1024];
		int len=ins.read(buf);
		System.out.println(new String(buf,0,len));
	}

}
