package java_basics1;

class  AageExcetion extends Exception
{
	public  AageExcetion()
	{
		super("年龄有问题");
	}
}
class  Student2
{
	String name;
	int age;
	void setName(String n)
	{
		name=n;
	}
	
	void setAge(int a) throws AageExcetion
	{
		if(a<0 || a>100)
		{
			throw (new AageExcetion());
			//不能单独使用,确定有异常抛出,但未抛出
		}
		else
		   age=a;
	}
}
public class ExceptionDemo{
	public static void main(String[] args){
		 try
			{
				  Student2 s=new Student2();
				  int age=200;
				  s.setAge(age);
			}
			catch (AageExcetion ex)
			{
				//System.out.println(ex.toString());
				//System.out.println(ex.getMessage());
			}
	}	
}
