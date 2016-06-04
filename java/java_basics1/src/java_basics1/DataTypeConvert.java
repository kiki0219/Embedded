package java_basics1;

import java.util.Scanner;

public class DataTypeConvert {
	public static void main(String[] args) {
		double d1=12312.32423432d;
		int num=(int)d1;
		System.out.println(num);
		char ch='A';
		int num2=ch;
		System.out.println(num2);
		char ch2=(char)(num2+12);
		System.out.println(ch2);
		System.out.println((11+3*8)/4%3);
//		int age;
//		Scanner sc=new Scanner(System.in);
//		age=sc.nextInt();
//		String str=age>26?"90ºó":"80ºó";
//		System.out.println(str);
		
		
		System.out.println(40+40);
		System.out.println(40+40+"");
		System.out.println(40+""+40);
		System.out.println(""+40+40);
	}
}
