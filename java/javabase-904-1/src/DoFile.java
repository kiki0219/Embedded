import java.io.File;
import java.io.IOException;

public class DoFile {
/*
 * java IO������:
 * 
 * File  �ļ���
 * FileWriter/FileReadter   �ַ��ļ���д��
 * InputStream:������(�ֽ�  �ļ�  ���� �ַ�������) FileInputStream �ļ����������ļ�
 * OutputStreatm:�����(�ֽ�  �ļ�  ���� �ַ������) FileOutputStream �ļ������ д�ļ�
 * BufferedInputStream:���뻺���������ѡ����(�����±�ֵ)����
 * BufferedOutputStream:����������
 * ObjectInputStream:����������
 * ObjectOutputStream���������
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
//			} finally {  //����ִ��,������û�����쳣,��󶼱���ִ��finally�����
//				//һ��ʹ�����ͷ�ռ����Դ	/				
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
	//�����п��ܻ��׳�IOException,SecurityException
//	public void  createMyFile(File f) throws IOException,SecurityException{
//		f.createNewFile();
//	}
	//Ŀ¼����:����Ŀ¼  ��ȡĿ¼(ͳ��Ŀ¼����Ŀ¼��  ͳ��Ŀ¼���ļ��� ,ͳ��Ŀ¼���ļ���С 
	//ͳ��Ŀ¼����Ŀ¼��С)
		
		
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
