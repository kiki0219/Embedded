package java_basics1;

class Base{
	public void Fun(){
		System.out.print("base Fun\n");
	}
	
	public static void Fun2(){
		System.out.print("base Fun2\n");
	}
}
class Child extends Base{
	public void Fun(){
		System.out.print("Child Fun\n");
	}
	//隐藏:当基类引用引用派生类对象时,通过基类引用对象调用 基类的方法时
	//派生类静态的方法被隐藏
	public static void Fun2(){
		System.out.print("Child Fun2\n");
	}
}
public class PolymoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b=new Base();
		b.Fun();
		b.Fun2();
		Child c=new Child();
		c.Fun();
		c.Fun2();
		Base b1=new Child();
		b1.Fun();
		b1.Fun2();
	}

}
