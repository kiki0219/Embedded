package javabase2;

public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        iApp1 a1=new ClassApp();
        a1.fun();
        a1.fun2();
	}
}

interface iApp1{
	static final int a=90;
	void fun();
	abstract void fun2();
}

class ClassApp implements iApp1{

	@Override
	public void fun() {
		// TODO Auto-generated method stub
		System.out.println("fun");
	}

	@Override
	public void fun2() {
		// TODO Auto-generated method stub
		System.out.println("fun2");
	}
	
}
