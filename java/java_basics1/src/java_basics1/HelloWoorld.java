package java_basics1;

import java.util.Scanner;

public class HelloWoorld {
    public static void main(String[] args){
    	System.out.print("hello java\n");
    	System.out.println("hello");
    	System.out.printf("%s %d\n","hello",100);
    	System.out.println("please input your name:");
    	Scanner sc=new Scanner(System.in);
    	System.out.printf("your name is :%s\n",sc.next());
    }
}
