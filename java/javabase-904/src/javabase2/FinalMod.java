package javabase2;

public class FinalMod {
/*fianl 
 * 修饰变量 
 * 修饰类
 * */
	final int num=34;//定义只读全部变量,必须初始化
	final static  int data=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		
		A a1=new B();
		a1.fun();
		//基类static函数不能被重写(可以继承)
	}
	
	public  void fun(){
		final int a;//只读局部变量
		a=20;//第一次赋值(相当于初始化)	
	}

}
//只读类(该类不能被继承)
//final class A{
//	
//}

class  A{
	public static  void fun(){
		System.out.println("A fun");
	}
}

class B extends A{
	public  static void fun(){
		System.out.println("B fun");
	}
}
