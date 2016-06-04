package java_basics1;

public interface InterfaceDemo1 {
	public final int a=1;
	public void fun1();
	public void fun2();
}
class Student implements InterfaceDemo1{

	@Override
	public void fun1() {
		// TODO Auto-generated method stub
		System.out.print(a);
	}

	@Override
	public void fun2() {
		// TODO Auto-generated method stub
		System.out.print("fun2");
	}
	
}
