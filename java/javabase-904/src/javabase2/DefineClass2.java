package javabase2;
/*
 * �̳�
 * ������ֻ����һ������
 * */

public class DefineClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        Student2 s2=new Student2(123);
//        s2.Study();
//        s2.eat();
		
		
//		  Person p1=new  Person(111,"p1");
//		  p1.eat();
		  Person p2=new  Student2(123);
		  //p2.eat();
		  p2.Study();
	}
}

/*����
 * */
class  Person{
	private int id;
	private String name;
	
	 
	public  Person(int _id,String _name){
		id=_id;
		name=_name;
	}
	
	public  void  eat(){
		System.out.println("person eat");
	}
	
public void Study(){
		
	}
	
}

class  Student2  extends Person{
	private int sid;
	
	public Student2(int _sid){		
		super(1111,"person11");//super��ʾ����
		sid=_sid;
	}
	
	public  void  eat(){
		System.out.println("student2 eat");
	}
	public  void  Study(){
		//eat();//�����෽��
		super.eat();//����ķ���
		System.out.println("student study");
	}
}
