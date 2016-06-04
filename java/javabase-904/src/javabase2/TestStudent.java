package javabase2;

class TestStudent {
    public void  getStudent(DefineStudent s){
    	System.out.println(s.getSid());
    	System.out.println(s.getName());
    	System.out.println(s.getAge());
    }
    
    public DefineStudent setStudent(){
    	DefineStudent s1=new DefineStudent();
    	s1.setSid(678);
    	s1.setName("student678");
    	s1.setAge(23);
    	return s1;
    } 
}
