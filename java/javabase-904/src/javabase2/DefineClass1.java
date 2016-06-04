package javabase2;

public class DefineClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student s1=new Student();
        //s1.DisplayInfo();
        //s1.DisplayInfo();
       // System.out.println(s1.toString());
        
        s1.setSid(1234);
        s1.setName("student34");
        s1.setAge(20);
	}

}

/*
 * 类定义
 * a.字段:field
 * b.函数:function
 * c.属性:实现对字段左get/set操作的函数
 * */
class Student{
	/*
	 * 字段定义*/
	private int sid;
	private String  name;
	private int age;
	
	/*属性定义
	 * */
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
	
	/*定义函数
	 * */
	public Student(){	
		this(123,"student1",20);
		//调用另一种形式构造函数,必须用this替代函数名,必须为第一句话	
		System.out.println("run");
	}
	
	
//    @Override
//	public String toString() {
//		return "Student [sid=" + sid + ", name=" + name + ", age=" + age + ", getSid()=" + getSid() + ", getName()="
//				+ getName() + ", getAge()=" + getAge() + "]";
//	}
	
	public String toString(){
		String str=String.format("sid=%d\tname=%s\tage=%d\n",sid,name,age);
		//return "sid="+sid+"name="+name+"age="+age;
		return str;
	}
    
    
	public Student(int  _sid,String _name,int _age){
		this.sid=_sid;
		this.name=_name;
		this.age=_age;
	}
    //不存在析构函数
    
    public void DisplayInfo(){
    	System.out.println("sid="+sid+"\tname="+name+"\tage="+age);
    }
}