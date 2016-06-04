package javabase2;

/*接口(interface)
 * 接口特点:
 * 1.接口中的成员不能是private修饰
 * 2.接口定义字段是只读不能被赋值,定义时必须初始化,默认的是stati final
 * 3.接口中不能实现函数,可以声明抽象 或实函数
 * 4.接口不能实例化
 * 5.接口的方法在被是现实必须是public
 * 6.一个类可以实现多个接口
 * 7.接口可以继承接口
 * */
interface interface11 extends interface13{
	public int  data=20;	
	void  fun();
	abstract void fun2();
	void fun3();
//	void fun3(){
//		
//	}
}
