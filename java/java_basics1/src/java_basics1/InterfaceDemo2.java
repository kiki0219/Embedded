package java_basics1;
interface Person{
	int a=20;
	public void fun1();
	public void fun2();
}

interface Inter1{
	public void fun3();
}

interface Inter2 extends Person{
	public void fun4();
}
class Worker implements Inter1,Inter2{

	@Override
	public void fun1() {
		// TODO Auto-generated method stub
		System.out.println("person fun1");
	}

	@Override
	public void fun2() {
		// TODO Auto-generated method stub
		System.out.println("person fun2");
	}

	@Override
	public void fun4() {
		// TODO Auto-generated method stub
		System.out.println("inter2 fun4");
	}

	@Override
	public void fun3() {
		// TODO Auto-generated method stub
		System.out.println("inter1 fun3");
	}	
}
public class InterfaceDemo2  implements Person,Inter1{

	@Override
	public void fun3() {
		// TODO Auto-generated method stub
		System.out.println("Inter1 fun3");
	}

	@Override
	public void fun1() {
		// TODO Auto-generated method stub
		System.out.println("Person fun1");
	}

	@Override
	public void fun2() {
		// TODO Auto-generated method stub
		System.out.println("Person fun2");
	}	
	
	public static void main(String[] args){
		InterfaceDemo2 demo2=new InterfaceDemo2();
		demo2.fun1();
		demo2.fun2();
		demo2.fun3();
		
		Worker  wk=new Worker();
		wk.fun1();
		wk.fun2();
		wk.fun3();
		wk.fun4();
	}
}
