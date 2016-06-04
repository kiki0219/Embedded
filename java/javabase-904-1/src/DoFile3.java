import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class DoFile3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoFile3  df=new DoFile3();
		try {
			//df.writeFileByFileOutputStream("helloworld.txt");
			//df.readFileByFileInputStream("helloworld.txt");
			//df.readFileByBufferedInputStream("helloworld.txt");
			df.writeFileByBUfferedOutputStream("helloworld.txt");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void writeFileByFileOutputStream(String filename) throws Exception{
		//FileOutputStream fos=new FileOutputStream("helloworld.txt");
		OutputStream fos=new FileOutputStream("helloworld.txt");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		fos.write(s.getBytes());
		fos.flush();
		fos.close();
	}
	
    public void readFileByFileInputStream(String filename){
    	InputStream  iso=null;
		try {
			iso=new FileInputStream("helloworld.txt");
			byte[] bs=new byte[1024];
			try {
				int ret=iso.read(bs);
				System.out.println(new String(bs,0,ret));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				if(iso!=null){
					iso.close();
				}				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
    
    public void  readFileByBufferedInputStream(String filename) throws IOException{
    	BufferedInputStream bis=new BufferedInputStream(new FileInputStream(filename));
    	byte[] bs=new byte[1024];
    	int ret=bis.read(bs);
    	System.out.println(new String(bs,0,ret));
    	bis.close();
    }
    
    public void  writeFileByBUfferedOutputStream(String filename) throws Exception{
    	BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(filename));
    	String str=new String("sdfsdfdsfdsfdsfsdfsdfsdf123213");
    	bos.write(str.getBytes());
    	bos.close();
    }
}
//作业:
//1.实现图片读取
//2.如何存储/读取一个对象(序列化 实现Serializable)
