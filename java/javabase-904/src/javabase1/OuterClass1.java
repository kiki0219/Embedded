package javabase1;

public class OuterClass1 {
	private static int x=20;
	private String str="world";
	public static class InnerClass{
		private String y="Hello";
		public void innerMethod(){
			System.out.println("�ⲿ�� x="+x);
			System.out.println("�ڲ��� y="+y);
			//System.out.println("�ⲿ�� str="+str);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass1 out=new OuterClass1();
		InnerClass  inner=new InnerClass();
		inner.innerMethod();
	}
}
