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
	//����:�����������������������ʱ,ͨ���������ö������ ����ķ���ʱ
	//�����ྲ̬�ķ���������
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
