package javabase1;

public class OuterClass3 {
	private int size=5;
	public Object makeInner(int localVar){
		final int finalLocalVar=localVar;
		return new Object(){
			public String toString(){
				return "OutSize="+size+"\nfinalLocalVar="+finalLocalVar;
			}
		};
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj=new OuterClass3().makeInner(345);
		System.out.println(obj.toString());
	}

}
