package newer.lkd;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class QuitButtonSimple extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				QuitButtonSimple bs=new QuitButtonSimple();
				bs.initGUI();
			}
		});
		
	}
	
	private void initGUI(){
		
		JButton btn=new JButton("quit");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		createLayout(btn);
		setTitle("Simple Frame");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void createLayout(JComponent... arg){
		Container panel=getContentPane();
		GroupLayout gl=new GroupLayout(panel);
		panel.setLayout(gl);
		
		gl.setAutoCreateContainerGaps(true);
		
		gl.setHorizontalGroup(gl.createSequentialGroup().addComponent(arg[0]));
		gl.setVerticalGroup(gl.createSequentialGroup().addComponent(arg[0]));		
	}
}
