package javabase1;

public class StaticMod {
/*静态修饰
 *  static void main:main函数是第一个执行入口函数,属于一个public类,并没有实例化累的对象
 *  只能将主函数成为类的部分,直接通过类名调用
 *  
 *  类成员访问修饰:
 *  a.private:只能在本类中访问
 *  b.public:都可以访问
 *  c.protected:就有继承关系类或在同一个包中
 *  d.default:在同一个包中
 * */
	//类的字段
	int  data=20;
	static int data2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //System.out.println(data);//不能访问类的非静态字段
         //System.out.println(data2);
		int num1;
		//static int num2;//非法定义,函数中不能定义静态变量
		//fun();//错误
		StaticMod sm=new StaticMod();
		sm.fun();
		fun2();
	}
	
	
	public void  fun(){
		//static int num3;
		//fun2();
		System.out.println("StaticMod fun");
	}
	public static void  fun2(){
		
	}
}
