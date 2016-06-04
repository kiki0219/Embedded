package javabase1;

public class OuterClass1 {
	private static int x=20;
	private String str="world";
	public static class InnerClass{
		private String y="Hello";
		public void innerMethod(){
			System.out.println("外部类 x="+x);
			System.out.println("内部类 y="+y);
			//System.out.println("外部类 str="+str);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass1 out=new OuterClass1();
		InnerClass  inner=new InnerClass();
		inner.innerMethod();
	}
}
