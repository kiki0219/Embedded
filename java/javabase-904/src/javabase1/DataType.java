package javabase1;

/*
 * ��������:
 * a.��������:byte(1byte) char(2byte) short(2byte)
 *   int(4byte)  long(4byte) float(4byte) double(8byte) boolean
 * b.��������:class  abstract class   interface   enum
 * �������;��൱��cָ��,��c++���ò�һ��
 * */
public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		byte  b1=123;
//		//byte  b2=345;//�������
//		byte  b2=(byte)345;//ǿ������ת��
//		//01011001   
//		System.out.println(b2);
//		
//		char  c1='a';
//		char  c2='��';
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
//		//��������:
//		Character ch1='a';
//		System.out.println(ch1);
//		Character ch2=new Character('b');
//		System.err.println(ch2);
//		
//		Integer it1=new Integer(200);
//		int  it2=200;
//		System.out.println(it1);
//		
//		//װ��  ����
//		int it3=it1;//����
//		int it4=it1.intValue();//����
//	    Integer it5=new Integer(it2);//װ��
//	    
//	    String str1="hello";
//	    String str2=new String("hello");
//	    String str3="hello";
//	    String str4=new String("hello");
//	    System.out.println(str1==str2);//�Ƚϵ�ַ
//	    System.out.println(str1==str3);
//	    System.out.println(str2==str4);	
//	    System.out.println(str1.equals(str2));//�Ƚ����ñ������ÿռ��ֵ�Ƿ����
	    
//		String str1="hello";
//		String  str5="hel"+"lo";//�Ż��ϲ�
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
	
	//��ҵ:String��Stringbuffer����?
}
