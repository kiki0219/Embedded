package javabase2;
/*
 * ������
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

//������
//�������п��Ժ��г�������ʵ���� ���ֶ�
//�����಻��ʵ��������
abstract class  AA{
	private int data;
	//������:����������Ҫ����
	abstract int fun1();
	//����
//	abstract int fun2(){
//		
//	}
	//ʵ����
	int  fun3(){
		return 1;
	}
}

//�ǳ�����
//������̳�����,����ʵ�ֳ�������󷽷�
class BB  extends AA{

	@Override
	int fun1() {
		// TODO Auto-generated method stub
		return 0;
	}
}
