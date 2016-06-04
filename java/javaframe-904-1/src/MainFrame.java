import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.PaintEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Painter;

public class MainFrame extends  JFrame {
    private JTextField tf=null;
    private Graphics  graphics=null;
    private  int x;
    private int y;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainFrame  mf=new MainFrame();
		
		mf.initGUI();
		mf.addMouseListener(new  MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				if(e.getButton()==MouseEvent.BUTTON1){
					String value=String.format("x=%d,y=%d", e.getY(),e.getY());
					mf.tf.setText(value);
					mf.x=e.getX();
					mf.y=e.getY();
				}				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	public void paint(Graphics g){
		super.paint(g);
		graphics.drawOval(x, y, 20, 20);
		System.out.println("paint");
	}
	
	public  void initGUI(){	
		graphics=this.getGraphics();
		setTitle("´°ÌåÀý×Ó");
		setSize(300,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	  
	    tf=new JTextField();
	    tf.setPreferredSize(new Dimension(200, 30));	 
	    this.setLayout(new BorderLayout());
	    this.add(tf,BorderLayout.NORTH);    
	    
	    setVisible(true);	    
	}	
}
