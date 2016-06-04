package  newer;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MonitorDemo {
/*每个一定时间抓取屏幕,并发送
 * */
	private ServerSocket  server_sck=null;
	private Socket  client_sck=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MonitorDemo  md=new MonitorDemo();
		try {
			md.initNetServer();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}		
	}
	
    public void  initNetServer() throws Exception{
    	server_sck=new ServerSocket(7788);
    	client_sck=server_sck.accept();
    	OutputStream outs=client_sck.getOutputStream();
    	ObjectOutputStream  objouts=new ObjectOutputStream(outs);
    	
    	Sender  senderobj=new Sender(objouts);
    	senderobj.start();
    }
}
