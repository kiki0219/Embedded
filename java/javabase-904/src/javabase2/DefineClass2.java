package javabase2;
/*
 * 继承
 * 派生类只能有一个基类
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

/*父类
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
		super(1111,"person11");//super表示基类
		sid=_sid;
	}
	
	public  void  eat(){
		System.out.println("student2 eat");
	}
	public  void  Study(){
		//eat();//派生类方法
		super.eat();//基类的方法
		System.out.println("student study");
	}
}
