package javabase2;
/*
 * 抽象类
 * */
public class AbstractClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //AA  a1=new AA();
		//BB  a1=new BB(); 
		AA a1=new BB();
        a1.fun3();
	}

}

//抽象类
//抽象类中可以含有抽象函数和实函数 和字段
//抽象类不能实例化对象
abstract class  AA{
	private int data;
	//抽象函数:抽象函数不需要定义
	abstract int fun1();
	//错误
//	abstract int fun2(){
//		
//	}
	//实函数
	int  fun3(){
		return 1;
	}
}

//非抽象类
//子类进程抽象类,必须实现抽象类抽象方法
class BB  extends AA{

	@Override
	int fun1() {
		// TODO Auto-generated method stub
		return 0;
	}
}
