package newer;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.ObjectOutputStream;

import javax.swing.ImageIcon;

public class Sender  extends  Thread {

	private ObjectOutputStream  objouts=null;
	private boolean islive=true;
	public Sender(ObjectOutputStream objouts) {
		this.objouts=objouts;
	}
	@Override
	public void run() {
		
		while(islive){
			Toolkit  tkit=Toolkit.getDefaultToolkit();
			Dimension screen_size=tkit.getScreenSize();
			Rectangle rect=new Rectangle(0, 0, screen_size.width, screen_size.height);
			Robot rb=null;
			try {
				rb= new Robot();
				BufferedImage bufimage=rb.createScreenCapture(rect);
				ImageIcon image=new ImageIcon(bufimage);
				objouts.writeObject(image);
				objouts.flush();
				sleep(3000);
			} catch (Exception e) {
				// TODO: handle exception
				islive=false;
				e.printStackTrace();
			}			
		}
	}
}
