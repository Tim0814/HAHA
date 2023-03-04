package TIM2;
import java.util.Scanner;
public class HW8_13 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows and columns of the array:");
		int rows =input.nextInt();
		int columns =input.nextInt();
		double[][] array = new double[rows][columns];
		

		for(int i=0; i<rows; i++) {
			System.out.print("Enter the array:");
			for(int j=0; j<columns; j++) {
				array[i][j] = input.nextDouble();
			}
		}
		
		int location[] = locateSmallest(array);
		System.out.print("The location of the smallest element is at(" + location[0]+"," + location[1]+")");

	    }
	
		public static int[] locateSmallest(double[][] a) {
			double smallest = a[0][0]; //預設一個最小值在(0,0)的位置
			int rows = 0;
			int columns = 0;

			for(int i=0; i<a.length; i++) 
				for(int j=0; j<a[i].length; j++) {
					if(a[i][j]<smallest) {
						smallest = a[i][j];
						rows = i;
						columns = j;
					}
				}
			int location[] = {rows,columns};
			    return location; //回傳行跟列
		}
	
}

