package javabase1;

public class OuterClass {
	private int x=100;
	class InnerClass{
		private String y="Hello";
		public void innerMethod(){
			System.out.println("内部 y="+y);
			System.out.println("外部 x="+x);
			outerMethod();
			System.out.println("外部 x="+OuterClass.this.x);
		}
	}
	
	public void outerMethod(){
		x=x+200;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass out=new OuterClass();
		OuterClass.InnerClass inner=out.new InnerClass();
		inner.innerMethod();
		
	}

}
