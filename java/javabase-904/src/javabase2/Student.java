package javabase2;

class DefineStudent {
	private int sid;
	private String name;
	private int age;
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
	@Override
	public String toString() {
		return "DefineStudent [sid=" + sid + ", name=" + name + ", age=" + age + ", getSid()=" + getSid()
				+ ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}	
}
