package java_basics1;

public class ArrayDEMO1 {
   public static void main(String[] args) {
	   int[][] array1;
	   int[] array2=new int[5];
	   int[] array3=new int[]{1,2,3,4,5};
	   int[] array4={1,2,3,4,5};
//	   for (int i : array4) {
//		System.out.println(i);
	   int[][] array5=new int[2][3];
	   array1=new int[2][];
	   int i;
	   for(i=0;i<array1.length;i++){
		   array1[i]=new int[3];
	   }
	   for(i=0;i<2;i++){
		   for(int j=0;j<3;j++){
			   array1[i][j]=i+j;
		   }
	   }
	   
	   for(i=0;i<2;i++){
		   for(int j=0;j<3;j++){
			   System.out.println(array1[i][j]);
		   }
	   }
	}
}
