package javabase2;

public class FinalMod {
/*fianl 
 * ���α��� 
 * ������
 * */
	final int num=34;//����ֻ��ȫ������,�����ʼ��
	final static  int data=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		
		A a1=new B();
		a1.fun();
		//����static�������ܱ���д(���Լ̳�)
	}
	
	public  void fun(){
		final int a;//ֻ���ֲ�����
		a=20;//��һ�θ�ֵ(�൱�ڳ�ʼ��)	
	}

}
//ֻ����(���಻�ܱ��̳�)
//final class A{
//	
//}

class  A{
	public static  void fun(){
		System.out.println("A fun");
	}
}

class B extends A{
	public  static void fun(){
		System.out.println("B fun");
	}
}
