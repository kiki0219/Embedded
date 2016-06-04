import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class DoFile4 {
/*将对象写入文件
 * ObjectIputStream
 * ObjectOutputStream
 * 要求对象必须序列化
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		DoFile4 df4=new DoFile4();
		try {
			//df4.saveObjectToFile();
			df4.readObjectFromFile();
		} catch (Exception e) {
			// TODO: handle exception
		    e.printStackTrace();
		}	

	}
	
	
	public void saveObjectToFile() throws IOException {
		OutputStream  out=new FileOutputStream("student.dat");
		ObjectOutputStream oos=new ObjectOutputStream(out);
		Student[] s1=new Student[4];
		for(int i=0;i<s1.length;i++){
			Student s=new Student();
			s.setSid("0000"+i);
			s.setSname("student"+i);
			s.setAge(20+i);
			s1[i]=s;
			oos.writeObject(s1[i]);
  	}
//		Student[] s1=new Student[]{new Student("00001","student1",20),
//				                   new Student("00002","student2",23),
//				                   new Student("00003","student3",22),
//				                   new Student("00004","student4",21)};
//		for(int i=0;i<s1.length;i++){
//			oos.writeObject(s1[i]);
//		}
//		ArrayList<Student> la=new ArrayList<>();
//		for(int i=0;i<4;i++){			
//			Student s=new Student();
//			s.setSid("0000"+i);
//			s.setSname("student"+i);
//			s.setAge(20+i);
//			la.add(s);			
//  	    }
//		oos.writeObject(la);		
		oos.close();
		
	}
	
	public void readObjectFromFile() throws IOException, ClassNotFoundException,EOFException{
		InputStream ins=new FileInputStream("student.dat");
		ObjectInputStream ois=new ObjectInputStream(ins);
	    Student s1=(Student)ois.readObject();
	    while(s1!=null){
	    	 s1.PrintStudentInfo();
	    	 s1=(Student)ois.readObject();
	    }
		//泛型集合
//		ArrayList<Student> la=(ArrayList<Student>)(ois.readObject());
//		for (Student s : la) {
//			s.PrintStudentInfo();
//		}
//	    ois.close();
	}
}

//Student类对象写入文件,必须要对学生类序列化
class  Student  implements  Serializable{
	private static final long serialVersionUID=2L;
	private String  sid;
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private String  sname;
	private int     age;
	
    public Student(){
    	
    }
	public Student(String sid, String sname, int age) {
		this.sid = sid;
		this.sname = sname;
		this.age = age;
	}
	
	
	public  void  PrintStudentInfo(){
		System.out.println("sid="+sid+"sname="+sname+"age="+age);
	}	
}
