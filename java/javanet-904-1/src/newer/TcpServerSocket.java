package  newer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class TcpServerSocket {

	private ServerSocket  sersck=null;	
	private InputStream  ins=null;
	private OutputStream  outs=null;
	private Socket  sck=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TcpServerSocket tcps=new TcpServerSocket();
		tcps.run();
		
	}	
	
	public void  run(){
		try {
			serverrun();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				if(sck!=null){
					sck.close();
					sck=null;
				}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
			
			try {
				if(sersck!=null){
					sersck.close();
					sersck=null;
				}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
			
		}       
	}
	
	public  void  serverrun() throws Exception {
		sersck=new ServerSocket(1234);
		sck=sersck.accept();
		ins=sck.getInputStream();
		outs=sck.getOutputStream();
		byte[] buf=new byte[1024];
		int len=ins.read(buf);
		String msg=new String(buf,0,len);
		System.out.println(msg);
		msg=msg+new Date().toString();
		outs.write(msg.getBytes());
	}
}
