package fivechess;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FiveChess extends JFrame{
	
	private int  cellwidth=50;
	private int cellheight=50;
	private int startX=50;
	private int startY=50;
	private int rownum=10;
	private int colnum=10;
	
	private int posx=0;
	private int posy=0;
	
	private int[][] chess;
	
	private int counter=0;
	private Graphics  ga=null;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new FiveChess();
	}
	
	public FiveChess(){
		chess=new int[rownum-1][colnum-1];
		initchess();
		setSize(600,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);	
		this.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent me) {
				// TODO Auto-generated method stub
				if(me.getButton()==MouseEvent.BUTTON1){
					int cx=me.getX();
					int cy=me.getY();
					int crow=(cx-startX)/cellwidth;
					int ccol=(cy-startY)/cellheight;
					if((cx-startX)%cellwidth>=cellwidth/2){
						crow=crow+1;
					}
					if((cy-startY)%cellheight>=cellheight/2){
						ccol=ccol+1;
					}	
					int px=crow*cellwidth+startX;
					int py=ccol*cellheight+startY;	
					posx=px;
					posy=py;					
					repaint();					
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
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		//if(ga==null)
		//	ga=g;
		drawlines(g);
		redrawchess(g);	
		drawchess(g);
	}
	
	public void initchess(){
		counter=0;
		int i,j;
		for(i=0;i<rownum-1;i++){
			for(j=0;j<colnum-1;j++){
				chess[i][j]=-1;
			}
		}
	}
	
	/*画10X10的棋盘
	 * */
	public  void  drawlines(Graphics g){
		//画水平线
		int i;
		g.setColor(Color.black);
		for(i=0;i<=rownum;i++){
			g.drawLine(startX, startY+i*cellheight, startX+rownum*cellwidth, startY+i*cellheight);
		}	
		for(i=0;i<=colnum;i++){
			g.drawLine(startX+i*cellwidth, startY, startX+i*cellwidth, startY+colnum*cellheight);
		}
	}
	
	
	/*画棋子
	 * */
	public  void  drawchess(Graphics g){
		if(posx>=100 && posy>=100  && posx<=500 && posy<=500){
			int col=(posx-startX)/cellwidth-1;
			int row=(posy-startY)/cellheight-1;
			if(chess[row][col]==-1){
				System.out.println(counter);
				if(counter%2==0){
					g.setColor(Color.white);
					chess[row][col]=0;
					g.fillOval(posx-25, posy-25, 50, 50);
					if(iswin(row,col)){
						JOptionPane.showMessageDialog(null, "白棋赢","提示",JOptionPane.INFORMATION_MESSAGE);
						initchess();
						counter=-1;
						update(g);
						return;
					}			
				}
				if(counter%2==1){			
					g.setColor(Color.black);
					chess[row][col]=1;
					g.fillOval(posx-25, posy-25, 50, 50);
					if(iswin(row,col)){
						JOptionPane.showMessageDialog(null, "黑棋赢","提示",JOptionPane.INFORMATION_MESSAGE);
						initchess();
						counter=-1;
						update(g);
					}								
				}	
				counter++;	
			}				
		}			
	}	
	/*
	 * 重画棋子
	 * */
	public void redrawchess(Graphics g){
		int i,j;
		int px,py;
		for(i=0;i<rownum-1;i++){
			for(j=0;j<colnum-1;j++){
				if(chess[i][j]==0){
					px=(j+1)*cellwidth+startX;
					py=(i+1)*cellheight+startY;
					g.setColor(Color.white);
					g.fillOval(px-25, py-25, 50, 50);
				}
				if(chess[i][j]==1)
				{
					px=(j+1)*cellwidth+startX;
					py=(i+1)*cellheight+startY;
					g.setColor(Color.black);
					g.fillOval(px-25, py-25, 50, 50);	
				}
			}
		}
	}
	
	public boolean  iswin(int row,int col){
		boolean ret=false;
		int cnt=0;
		int i;
		//垂直
		for(i=row;i>=0;i--){
			if(chess[i][col]!=chess[row][col]){
				break;
			}
			else
			{
				cnt++;
			}
			if(cnt==5){
				ret=true;
				return ret;
			}
		}	
		for(i=row+1;i<rownum-1;i++){
			if(chess[i][col]!=chess[row][col]){
				break;
			}
			else{
				cnt++;
			}
			if(cnt==5){
				ret=true;
				return ret;
			}
		}	
		
		//水平
		cnt=0;
		for(i=col;i>=0;i--){
			if(chess[row][i]!=chess[row][col]){
				break;
			}
			else
			{
				cnt++;
			}
			if(cnt==5){
				ret=true;
				return ret;
			}
		}
		for(i=col+1;i<colnum-1;i++){
			if(chess[row][i]!=chess[row][col]){
				break;
			}
			else{
				cnt++;
			}
			if(cnt==5){
				ret=true;
				return ret;
			}
		}
		
		//左对角线
		cnt=0;
		int j;
		for(i=row,j=col;i>=0&&j>=0 ;i--,j--){
			if(chess[i][j]!=chess[row][col]){
				break;
			}
			else{
				cnt++;
			}
			if(cnt==5){
				ret=true;
				return ret;
			}
		}
		
		for(i=row+1,j=col+1;i<rownum-1&&j<colnum-1;i++,j++){
			if(chess[i][j]!=chess[row][col]){
				break;
			}
			else{
				cnt++;
			}
			if(cnt==5){
				ret=true;
				return ret;
			}
		}
		
		cnt=0;
		for(i=row,j=col;i<rownum-1&&j>=0;i++,j--){
			if(chess[i][j]!=chess[row][col]){
				break;
			}
			else{
				cnt++;
			}
			if(cnt==5){
				ret=true;
				return ret;
			}
		}
		for(i=row-1,j=col+1;i>=0&&j<colnum-1;i--,j++){
			if(chess[i][j]!=chess[row][col]){
				break;
			}
			else{
				cnt++;
			}
			if(cnt==5){
				ret=true;
				return ret;
			}
		}
		return ret;			
	}
}
