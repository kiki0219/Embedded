import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class NativeBtn extends  JFrame{
	
	static{
		System.loadLibrary("simplelinux");
	}
	public native void hello();

	public static void main(String[] args) {
		new NativeBtn();
	}
	public NativeBtn(){
	   setSize(300,300);
	   setDefaultCloseOperation(EXIT_ON_CLOSE);
	   setLocationRelativeTo(null);
	   JButton  btn=new JButton("native ≤‚ ‘");
	   getContentPane().add(btn);
	   btn.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			  hello();
			
		}
	});
	   
	   setVisible(true);
	}
}
