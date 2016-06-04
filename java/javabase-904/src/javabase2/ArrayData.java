package javabase2;
/*数组定义:
 * 数据类型[]   数组名;
 * 
 * 
 * */
public class ArrayData {
	public static void main(String[] arg){
//		String str;
//		int data;
//		System.out.println(str);//访问一个未初始化引用变量
		
//		int data;
//		System.out.println(data);
//		int[] a1={1,2,3,4,5};
//		for(int i=0;i<a1.length;i++){
//			System.out.println(a1[i]);
//		}
		
//		int[] a2=new int[5];
//		int[] a3=new int[]{1,2,3,4,5};
//		
//		ArrayData ad=new ArrayData();
//		ad.fun(a3);
		
		//定义一个二维数组
		
		int[][] a4={{1,2,3},{4,5,6},{7,8,9}};
		int[][] a5=new int[3][3];
		
		int[][] a6;
		a6=new int[3][];
		int i;
		for(i=0;i<3;i++){
			a6[i]=new int[3];
		}
		
		ArrayData ad=new ArrayData();
		ad.fun2(a6);
	}
	
	void  fun(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
	
	void fun2(int[][] a){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
}
