package TIM2;
import java.util.Scanner;
public class HW8_5 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Scanner input = new Scanner(System.in);
        double matrix1[][] = new double[2][2];
        double matrix2[][] = new double[2][2];

        System.out.print("Enter matrix1: ");
        for(int i=0; i<matrix1.length; i++) 
        	for(int j=0; j<matrix1[i].length; j++) {
        		matrix1[i][j] = input.nextDouble();
        }
		System.out.print("Enter matrix2: ");
        for(int i=0; i<matrix2.length; i++) 
        	for(int j=0; j<matrix2[i].length; j++) {
        		matrix2[i][j] = input.nextDouble();
        }
        
        System.out.print("The matrices are added as follows");
        System.out.println();
        for(int k=0; k<2; k++) {
        	System.out.printf("%.1f ",matrix1[0][k]);
           }
        System.out.print("    ");
        for(int k=0; k<2; k++) {
    		System.out.printf("%.1f ",matrix2[0][k]);
           }
        System.out.print("  ");        
        for(int k=0; k<2; k++) {
    		System.out.printf("%.1f ",addMatrix(matrix1,matrix2)[0][k]);
           }
        System.out.println();
        for(int k=0; k<2; k++) {
    		System.out.printf("%.1f ",matrix1[1][k]);
           }
        System.out.print(" +  ");
        for(int k=0; k<2; k++) {
		    System.out.printf("%.1f ",matrix2[1][k]);
           }
        System.out.print("= ");        
        for(int k=0; k<2; k++) {
    		System.out.printf("%.1f ",addMatrix(matrix1,matrix2)[1][k]);
           }
	    }
	
	public static double[][] addMatrix(double[][] a, double[][] b){
		double[][] c = new double[2][2];
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;
	}
}
