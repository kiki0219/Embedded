package java_basics1;
class Person1{
	int age;

	public Person1(int age) {
		this.age = age;
	}	
}

public class ClassForName {
	public static void main(String[] args){
		Person1 p=new Person1(20);
		Class p2=p.getClass();
		System.out.println(p2);
		Integer a=new Integer(20);
		Class p3=a.getClass();
		System.out.println(p3);
		try
		{
			Class cla=Class.forName("java.lang.String");
			while(cla!=null){
				System.out.println(cla);
				cla=cla.getSuperclass();
			}
		}
		catch(Exception ex){
			System.out.println(ex.toString());
			ex.printStackTrace();
		}
		
	}
}
