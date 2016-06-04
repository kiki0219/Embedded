package javabase2;


public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		interface11 i1=new InterClass();
//		i1.fun2();
//		
//		interface12 i2=new InterClass();
//		i2.fun3();
		
		interface13 i3=new InterClass();
		i3.fun2();
		i3.fun3();
	}
}

/*
 * 类实现接口,可以实现多个节点
 * */
class   InterClass implements interface11,interface12{
	
	public void fun1(){
		System.out.println(data);
	}

	@Override
	public void fun2() {
		// TODO Auto-generated method stub
		System.out.println("fun2");
	}

	@Override
	public void fun() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fun3() {
		// TODO Auto-generated method stub
		
	}
	
}
