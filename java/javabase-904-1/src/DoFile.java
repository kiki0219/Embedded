import java.io.File;
import java.io.IOException;

public class DoFile {
/*
 * java IO操作类:
 * 
 * File  文件类
 * FileWriter/FileReadter   字符文件读写类
 * InputStream:输入流(字节  文件  对象 字符输入流) FileInputStream 文件输入流读文件
 * OutputStreatm:输出流(字节  文件  对象 字符输出流) FileOutputStream 文件输出流 写文件
 * BufferedInputStream:输入缓存操作可以选择性(数组下标值)操作
 * BufferedOutputStream:输出缓存操作
 * ObjectInputStream:对象输入流
 * ObjectOutputStream对象输出流
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//File f1=new File("helloworld.txt");
//		if(!f1.exists()){
//			try {
//				f1.createNewFile();
//			} catch (IOException e) {
//				// TODO: handle exception
//				e.printStackTrace();
//			} catch (SecurityException e)	{
//				e.printStackTrace();
//			} finally {  //最终执行,不管有没发生异常,最后都必须执行finally中语句
//				//一般使用来释放占用资源	/				
//			}		
//		}
//		else{
//			//System.out.println(f1.getAbsolutePath());
//			try {
//				System.out.println(f1.getCanonicalPath());
//			} catch (Exception e) {
//				// TODO: handle exception
//				e.printStackTrace();
//			}
//			
//		}
		
//		DoFile  fd=new DoFile();
//		try {
//			fd.createMyFile(f1);
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}	

	//}
	
	//public void  createMyFile(File f) throws IOException,SecurityException
	//函数中可能会抛出IOException,SecurityException
//	public void  createMyFile(File f) throws IOException,SecurityException{
//		f.createNewFile();
//	}
	//目录操作:创建目录  读取目录(统计目录中子目录数  统计目录中文件数 ,统计目录中文件大小 
	//统计目录的子目录大小)
		
		
		//File  f2=new File("d:/abcd");
		//f2.mkdir();	
		//String[] str1=f2.list();
//		for(int i=0;i<str1.length;i++){
//			System.out.println(str1[i]);
//		}
//		for(String s:str1){
//			System.out.println(s);
//		}
		
//		File[] fs=f2.listFiles();
//		int filecnt=0;
//		int dircnt=0;
//		for(File f :fs){
//			if(f.isFile()){
//				filecnt++;
//			}
//			if(f.isDirectory()){
//				dircnt++;
//			}
//		}
//		System.out.println(filecnt+"\t"+dircnt);
		
		File  f2=new File("d:/abcd");
		DoFile  df=new DoFile();
		//df.printDirContent(f2);
		System.out.println(df.getFileSizeByDir(f2));
	
	}
	
	public  void  printDirContent(File f){
		File[] fs=f.listFiles();
		for(File f1:fs){
			if(f1.isFile()){
				System.out.println(f1.getName());
			}
			if(f1.isDirectory()){
				System.out.println(f1.getName());
				printDirContent(f1);
			}
		}
	}	
	
	public  long getFileSizeByDir(File f){
	    long size=0L;
		File[] fs=f.listFiles();
		for(File f1:fs){
			if(f1.isFile()){
				size=size+f1.length();
			}
			if(f1.isDirectory()){
				size=size+getFileSizeByDir(f1);
				System.out.println(getFileSizeByDir(f1));				
			}
		}
		return size;
	}
}
