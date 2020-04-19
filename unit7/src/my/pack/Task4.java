package my.pack;
import java.util.Scanner;

public class Task4 {
	
	public static void main(String[] args) {
		//get sizes for matrix
		 int n=getSize();
		 int m=getSize();
		 
		 //get matrix
		 int mass[][]=getMatrix(n,m);
		 
		 //get array of max elements in rows
		 int maxElementInRow[]=getMaxInRow(mass, n, m);
		 
		 //get a summ of negative numbers
		 int negativeSumm[]=getSum(mass, n, m);
		 
		 //get min element
		 int min=getMin(mass, n, m);
		 
		 //get max element
		 int max=getMax(maxElementInRow);
		 
		 //swap min and max elements in matrix
		 swapMinMax(mass, min, max, n, m);

	}
	
	public static int[][] getMatrix(int rowNum, int colNum) {
		 int mass[][]=new int[rowNum][colNum];
		 int temp[]=new int[colNum];
		 for(int i=0;i<rowNum;i++) {
			 temp=getRow(colNum);
			 for(int j=0;j<temp.length;j++) {
				 mass[i][j]=temp[j];
			 }
		 }
	     System.out.println("Ќова€ матрица:");
	     printMatrix(mass);
		 return mass;
	}
	
	public static int[] getMaxInRow(int matrix[][],int rowNum, int colNum) {
		int maxInRow[]=new int[colNum];
		 for(int i=0;i<rowNum;i++) {
			 int max=0;
			 for(int j=0;j<colNum;j++) {
				 if(matrix[i][j]>max) {
					 max=matrix[i][j];
				 }
				 if(j==colNum-1) {
					 maxInRow[i]=max;
				 }
			 }
		 }
		 System.out.println("ћаксимальные значени€ в каждой из строк: ");
	     for(int i=0;i<rowNum;i++) {
			 System.out.print(maxInRow[i]+" ");
	     }
		 System.out.println();
		 return maxInRow;
	}
	
	public static int getMax(int maxInRow[]) {
		int max=0;
		 for(int i=0;i<maxInRow.length;i++) {
				 if(maxInRow[i]>max) {
					 max=maxInRow[i];
				 }
			 }
		 return max;
	}
	
	public static int getMin(int matrix[][],int rowNum, int colNum) {
		int min=0;
		 for(int i=0;i<rowNum;i++) {
			 for(int j=0;j<colNum;j++) {
				 if(matrix[i][j]<min) {
					 min=matrix[i][j];
				 }
			 }
		 }
		 return min;
	}
	
	public static int[] getSum(int matrix[][],int rowNum, int colNum) {
		 int negativeSumm[]=new int[rowNum];
		 for(int i=0;i<rowNum;i++) {
			 int sum=0;
			 for(int j=0;j<colNum;j++) {
				 if(matrix[i][j]<0) {
					 sum+=matrix[i][j];
				 }
				 if(j==colNum-1) {
					 negativeSumm[i]=sum;
				 }
			 }
		 }
		 System.out.println("—уммы отрицательных чисел дл€ каждой строки: ");
	     for(int i=0;i<negativeSumm.length;i++) {
			 System.out.print(negativeSumm[i]+" ");
	     }
		 System.out.println();
		 return negativeSumm;
	}
	
	public static Integer getSize() {
		int n=0;
		Scanner sc = new Scanner(System.in); 
        System.out.println("¬ведите натуральное число дл€ задани€ размера матрицы");
		if (sc.hasNext()) { 
			n=sc.nextInt();
			}
		if(n==0) {
			n=getSize();
		}
		return n;
	}
	
	public static int[] getRow(int m) {
		int row[]=new int[m];
		Scanner sc = new Scanner(System.in); 
		for(int i=0;i<m;i++) {
			System.out.println("¬ведите натуральне число дл€ строки матрицы");
			if (sc.hasNext()) { 
				row[i]=sc.nextInt();
				}
		}
		return row;
	}
	
	public static int[][] swapMinMax(int matrix[][],int min, int max,int rowNum, int colNum) {
		 int rowNumMin=0;
		 int colNumMin=0;
		 int rowNumMax=0;
		 int colNumMax=0;
		 for(int i=0;i<rowNum;i++) {
			 for(int j=0;j<colNum;j++) {
				 if(matrix[i][j]==min) {
					 rowNumMin=i;
					 colNumMin=j;
				 }else if(matrix[i][j]==max) {
					 rowNumMax=i;
					 colNumMax=j;
				 }
			 }
		 }
		 matrix[rowNumMin][colNumMin]=max;
		 matrix[rowNumMax][colNumMax]=min;
	     System.out.println("ћатрица после перемещени€ минимального и максимального значений:");
	     printMatrix(matrix);
		 return matrix;
	}
	
	public static void printMatrix(int matrix[][]) {
		 for(int[] i: matrix) {
			 for(int j: i) {
					System.out.print(j+" ");
			 }
				System.out.println();
		 }
	}
}

