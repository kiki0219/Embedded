package javabase1;

public class OuterClass2 {
	private int size=5,y=7;
	public Object makeInner(int localValue){
		final int finallocalVar=localValue;
		class InnerClass{
			int y=4;
			public String toString(){
				return "OuterSize:"+size+"\nfinallocalVar"+" "+"this.y="+this.y;
			}
		}
		return new InnerClass();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj=new OuterClass2().makeInner(2000);
		System.out.println(obj.toString());
	}

}
