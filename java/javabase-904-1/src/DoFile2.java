import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DoFile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoFile2  df=new DoFile2();
		try {
			//df.writeFile("helloworld.txt");
			df.readFile("helloworld.txt");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	public  void  writeFile(String filename) throws IOException{
		File f=new File(filename);
		if(f.exists()){
		    FileWriter fw=new FileWriter(f);
		    fw.write("写入第一行\n");
		    fw.write("写入第二行\n");
		    fw.write("写入第三行\n");
		    fw.write("写入第四行");
		    fw.flush();//必须刷新流
		}
	}
	
	public void readFile(String filename) throws IOException{
		File  f=new File(filename);
		if(f.exists()){
			FileReader fr=new FileReader(f);
//			int ret=fr.read();
//			while(ret!=-1){
//				System.out.print((char)ret);
//				ret=fr.read();
//			}	
			char[]  buffer=new char[1024];
			int ret=fr.read(buffer);
			//StringBuffer sb=new StringBuffer();
			while(ret!=-1){
				//sb.append(buffer);
				System.out.println(new String(buffer,0,ret));
				ret=fr.read(buffer);
			}
			
		}
	}

}
