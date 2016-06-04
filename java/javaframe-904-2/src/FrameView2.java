import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameView2  extends  JFrame  implements  MouseListener, ActionListener{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrameView2  fv=new FrameView2();
	}
	
	public  FrameView2(){	
		setTitle("´°ÌåÀý×Ó");
		setSize(300,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	    
	  
	    
	    //JButton b = new JButton("aa");
	    //b.addActionListener(this);
	    //getContentPane().add(b);
		
		//getContentPane().addMouseListener(this);
		this.addMouseListener(this);//×¢²á
	    
	    setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("ok");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		//System.out.println("ok");
		
	}

}
