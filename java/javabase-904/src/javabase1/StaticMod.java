package javabase1;

public class StaticMod {
/*��̬����
 *  static void main:main�����ǵ�һ��ִ����ں���,����һ��public��,��û��ʵ�����۵Ķ���
 *  ֻ�ܽ���������Ϊ��Ĳ���,ֱ��ͨ����������
 *  
 *  ���Ա��������:
 *  a.private:ֻ���ڱ����з���
 *  b.public:�����Է���
 *  c.protected:���м̳й�ϵ�����ͬһ������
 *  d.default:��ͬһ������
 * */
	//����ֶ�
	int  data=20;
	static int data2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //System.out.println(data);//���ܷ�����ķǾ�̬�ֶ�
         //System.out.println(data2);
		int num1;
		//static int num2;//�Ƿ�����,�����в��ܶ��徲̬����
		//fun();//����
		StaticMod sm=new StaticMod();
		sm.fun();
		fun2();
	}
	
	
	public void  fun(){
		//static int num3;
		//fun2();
		System.out.println("StaticMod fun");
	}
	public static void  fun2(){
		
	}
}
