
import my.pack.Task4;
import org.junit.Assert;
 
import org.junit.Test;

public class Task4Test {
	@Test 
	public void operationFindMin() {   
		int matrix[][]=new int[5][6];
		int realMin;
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<6;j++) {
				matrix[i][j]=i+j;
			}
		}
		
		int exprctedMin=matrix[0][0];
		realMin=Task4.getMin(matrix, 5, 6);
  
	  Assert.assertEquals(exprctedMin, realMin, 0.00000001);  
	  } 
	
	@Test  
	public void operationSwapInMatrix() {   
		int matrix[][]=new int[5][6];
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<6;j++) {
				matrix[i][j]=i+j;
			}
		}
		
		int realMin=matrix[0][0];
		Task4.swapMinMax(matrix, 0, 9, 5, 6);
		//new place for min=0 is [4][5]
	  Assert.assertEquals(matrix[4][5], realMin, 0.00000001);  
	  } 
	
	@Test 
	public void operationFindSum() {   
		int matrix[][]=new int[5][6];
		int exprctedSum[]=new int[]{-15,-10,-6,-3,-1};
		int realSum[];
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<6;j++) {
				matrix[i][j]=i-j;
			}
		}
		realSum=Task4.getSum(matrix, 5, 6);
		Assert.assertArrayEquals(exprctedSum, realSum);
	  } 
	
	@Test 
	public void operationFindMaxInRow() {   
		int matrix[][]=new int[5][6];
		int exprctedMaxInRow[]=new int[]{0,1,2,3,4};
		int realMaxInRow[];
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<6;j++) {
				matrix[i][j]=i-j;
			}
		}
		realMaxInRow=Task4.getMaxInRow(matrix, 5, 6);
		Assert.assertArrayEquals(exprctedMaxInRow, realMaxInRow);
	  } 
}
// Спасибо. Хорошо выполнен таск. Зачет
