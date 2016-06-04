package java_basics1;
abstract class AbstractBase{
	public abstract void Fun();
	public static void Fun2(){
		System.out.println("base fun2\n");
	}
}

abstract class Base2 extends AbstractBase{
	
}

class Child2 extends AbstractBase{
	
	public static void Fun2(){
		System.out.println("Child2 fun2");
	}

	@Override
	public void Fun() {
		// TODO Auto-generated method stub
		System.out.println("Child2 Fun");
	}
}

public class PolymoDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2 c2=new Child2();
		c2.Fun();
		c2.Fun2();
		
		AbstractBase b=new Child2();
		b.Fun();
		b.Fun2();
	}
}
