import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FrameView  extends  JFrame  {

	private Graphics  graphics=null;
	private int x=20;
	private int y=30;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FrameView  fv=new FrameView();
		fv.initGUI();
		fv.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				fv.x=e.getX();
				fv.y=e.getY();
				fv.repaint();//paint
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
        
	}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		//graphics=g;
		//g.drawLine(20, 10, x, y);
		graphics.setColor(Color.red);
		graphics.fillOval(x, y, 100, 100);
		//g.drawOval(x, y, 100, 100);
		System.out.println("end");
	}
	
	
	public  void initGUI(){	
		graphics=this.getGraphics();
		setTitle("��������");
		setSize(300,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	    
	    setVisible(true);	    
	}
}


/*public class FrameView  extends JFrame{

	private Graphics  graphicsf=null;
	private DefineDraw drawobj=null;
	private Graphics graphics=null;
	private int row=10;
	private int col=10;
	private int chesswidth=50;
	private int chessheight=50;
	private int startx=50;
	private int starty=50;
	private int clickcounter=1;
	private int[][] chessstate;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrameView mf=new FrameView();
        mf.initGUI();
	}	
	//��ʼ����������
	void  initGUI()
	{
		this.setTitle("XX������");
		this.setSize(600,600);//���ô����С
		this.setResizable(false);
		this.setVisible(true);//���ô���ɼ�
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�رմ���ʱ����
		this.setLocationRelativeTo(null);//����
		graphicsf=this.getGraphics();
		drawobj=new DefineDraw(graphicsf);
		this.addMouseListener(new MouseListener() {			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				//��걻���»�����
				if(e.getButton()==MouseEvent.BUTTON1)
				{
					int relx=e.getX();
					int rely=e.getY();
					int clickr=rely/chessheight;
					int lickc=relx/chesswidth;
					int circlex=(lickc+1)*chesswidth;
					int circley=(clickr+1)*chessheight;
					//System.out.println(clickr+";"+lickc);
					//System.out.println(circlex+";"+circley);
					if(relx>=circlex-10 && relx<=circlex && rely>=circley-10 && rely<=circley)
					{
						drawobj.drawchess(circlex,circley);
					}				
					
				}				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	//��ɴ�����Ԫ�ػ滭
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		drawobj.drawchessboard();
		//�ػ���һ�����ӵ�״̬
		drawobj.redrawchess();		
	}	
	
	
	
	//����滭��
	class DefineDraw{	
		public DefineDraw(Graphics g)
		{
			graphics=g;
			chessstate=new int[row+1][col+1];
			initarray();
		}
		//��ʼ������
		public void initarray()
		{
			for(int i=0;i<row+1;i++)
			{
				for(int j=0;j<col+1;j++)
				{
					chessstate[i][j]=-1;//û�з�����
					//0:����  1:����
				}
			}
		}
		
		//������
		public  void  drawchessboard()
		{
			//��ֹ���̵�������ɫ��������ʱ�ı�
			graphics.setColor(Color.black);
			int i;
			for(i=0;i<=row;i++)
			{
			   graphics.drawLine(startx, starty+i*chessheight,col*chesswidth+startx, starty+i*chessheight);
			}	
			
			for(i=0;i<=col;i++)
			{
				graphics.drawLine(startx+i*chesswidth, starty, startx+i*chesswidth,starty+row*chessheight);
			}
		}
		
		//������
		public void drawchess(int cx,int cy)
		{
			int r=(cy-starty)/chessheight;
			int c=(cx-startx)/chesswidth;
			if(chessstate[r][c]==-1)
			{
			   if(clickcounter%2!=0)
			   {
				  graphics.setColor(Color.black);
				  graphics.fillOval(cx-chesswidth/2, cy-chessheight/2, chesswidth, chessheight);	
				  clickcounter++;		
				  chessstate[r][c]=0;
				  if(iswin(r, c, 0))
				  {
					 JOptionPane.showMessageDialog(null,"����Ӯ","information",JOptionPane.INFORMATION_MESSAGE);
					 initarray();
					 update(graphics);
					 clickcounter=1;
				  }			
			    }
			   else if(clickcounter%2==0)
			    {
				  graphics.setColor(Color.white);
				  graphics.fillOval(cx-chesswidth/2, cy-chessheight/2, chesswidth, chessheight);	
				  clickcounter++;		
				  chessstate[r][c]=1;
				  if(iswin(r, c, 1))
				  {
					  JOptionPane.showMessageDialog(null,"����Ӯ","information",JOptionPane.INFORMATION_MESSAGE);
					  initarray();
					  update(graphics);
					  clickcounter=1;
				  }			
			    }				   
			}
		}
		
		//�ػ滭����
		public  void  redrawchess()
		{
			int i,j;
			int cx,cy;
			for(i=0;i<row+1;i++)
			{
				for(j=0;j<col+1;j++)
				{
					cx=(j+1)*chesswidth;
					cy=(i+1)*chessheight;
					if(chessstate[i][j]==0)
					{
						graphics.setColor(Color.black);
						graphics.fillOval(cx-chesswidth/2, cy-chessheight/2, chesswidth, chessheight);	
					}
					if(chessstate[i][j]==1)
					{
						graphics.setColor(Color.white);
						graphics.fillOval(cx-chesswidth/2, cy-chessheight/2, chesswidth, chessheight);	
					}
				}
			}
		}	
		
		//�ж���Ӯ
		public boolean iswin(int r,int c,int value)
		{
			int chesscounter=0;
			boolean ret=false;
			//����
			int i,j;
			
			for(i=r;i>=0;i--)
			{
				if(chesscounter==5)
				{
					ret=true;
					break;
				}
					
				if(chessstate[i][c]==value)
				{
					chesscounter++;					
				}	
				else
					break;
			}
			
			//����			
			for(i=r+1;i<r+5&&i<=10;i++)
			{
				if(chesscounter==5)
				{
					ret=true;
					break;
				}
					
				if(chessstate[i][c]==value)
				{
					chesscounter++;
				}	
				else
					break;
			}			
			
			if(chesscounter==5)
			{
				ret=true;
				return ret;	
			}
			
			//������
			chesscounter=0;
			ret=false;	
			for(i=c;i>=0;i--)
			{
				if(chesscounter==5)
				{
					ret=true;
					break;
				}
				if(chessstate[r][i]==value)
				{
					chesscounter++;
				}
				else
					break;
			}
			
			//������
			for(i=c+1;i<c+5&&i<=10;i++)
			{
				if(chesscounter==5)
				{
					ret=true;
					break;
				}
				if(chessstate[r][i]==value)
				{
					chesscounter++;
				}
				else
					break;
			}
			
			if(chesscounter==5)
			{
				ret=true;
				return ret;
			}
			
			//����
			chesscounter=0;
			ret=false;	
			for(i=r,j=c;i<=10&&j<=10;i++,j++)
			{
				if(chesscounter==5)
				{
					ret=true;
					break;
				}
				if(chessstate[i][j]==value)
				{
					chesscounter++;
				}
				else
					break;
			}
			
			//����
			for(i=r-1,j=c-1;i>=0&&j>=0;i--,j--)
			{
				if(chesscounter==5)
				{
					ret=true;
					break;
				}
				if(chessstate[i][j]==value)
				{
					chesscounter++;
				}
				else
					break;
			}
			if(chesscounter==5)
			{
				 ret=true;
				 return ret;
			}
			
			
			//����
			chesscounter=0;
			ret=false;	
			for(i=r,j=c;i<=10&&j>=0;i++,j--)
			{
				if(chesscounter==5)
				{
					ret=true;
					break;
				}
				if(chessstate[i][j]==value)
				{
					chesscounter++;
				}
				else
					break;
			}
			//����
			for(i=r-1,j=c+1;i>=0&&j<=10;i--,j++)
			{
				if(chesscounter==5)
				{
					ret=true;
					break;
				}
				if(chessstate[i][j]==value)
				{
					chesscounter++;
					//System.out.println(chesscounter);
				}
				else
					break;
			}
			if(chesscounter==5)
			{
				ret=true;
				return ret;
			}
			return ret;			
		}
	}    
}*/

