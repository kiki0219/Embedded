package newer.lkd;

import javax.swing.JFrame;

public class SimpleFrame extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new SimpleFrame().initGUI();
	}
	
	private void initGUI(){
		setTitle("Simple Frame");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
