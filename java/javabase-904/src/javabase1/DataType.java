package javabase1;

/*
 * 数据类型:
 * a.基础类型:byte(1byte) char(2byte) short(2byte)
 *   int(4byte)  long(4byte) float(4byte) double(8byte) boolean
 * b.引用类型:class  abstract class   interface   enum
 * 引用类型就相当于c指针,与c++引用不一样
 * */
public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		byte  b1=123;
//		//byte  b2=345;//错误溢出
//		byte  b2=(byte)345;//强制类型转换
//		//01011001   
//		System.out.println(b2);
//		
//		char  c1='a';
//		char  c2='中';
//		int   d1=c1;
//		int   d2=c2;
//		System.out.println("d1="+d1+"d2="+d2);
//		char c3=(char)(d2+3);
//		System.out.println(c3);
//		
//		float f1=(float) 34.567;
//		float f2=34.567f;
//		double d3=56.789;
//		double d4=56.789d;
//		
//		
//		boolean ff1=false;
//		boolean ff2=true;
//		System.out.println(ff1);
//		
//		//引用类型:
//		Character ch1='a';
//		System.out.println(ch1);
//		Character ch2=new Character('b');
//		System.err.println(ch2);
//		
//		Integer it1=new Integer(200);
//		int  it2=200;
//		System.out.println(it1);
//		
//		//装箱  拆箱
//		int it3=it1;//拆箱
//		int it4=it1.intValue();//拆箱
//	    Integer it5=new Integer(it2);//装箱
//	    
//	    String str1="hello";
//	    String str2=new String("hello");
//	    String str3="hello";
//	    String str4=new String("hello");
//	    System.out.println(str1==str2);//比较地址
//	    System.out.println(str1==str3);
//	    System.out.println(str2==str4);	
//	    System.out.println(str1.equals(str2));//比较引用变量引用空间的值是否相等
	    
//		String str1="hello";
//		String  str5="hel"+"lo";//优化合并
//	    System.out.println(str1==str5);//true
//	    String  str7="lo";
//	    String  str6="hel"+str7;
//	    System.out.println(str1==str6);//false
//	    
//	    String  str8=new String("lo");
//	    String  str9="hel"+str8;
//	    System.out.println(str1==str9);//false
//		
//		System.out.println(40+40+"");//80
//		System.out.println(40+""+40);//4040
//		System.out.println(""+40+40);//4040
		
		
		
		StaticMod sm=new StaticMod();
		sm.fun();
		System.out.println(sm.data);
	}
	
	//作业:String与Stringbuffer区别?
}
