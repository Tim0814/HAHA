package TIM2;
import java.util.Scanner;
public class HW8_1 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
        System.out.print("Enter a 3-by-4 matrix row by row:");
        Scanner input = new Scanner(System.in);
        double matrix[][]= new double[3][4];
        double ans;
        
     for(int i=0; i<3; i++) {
          for(int j=0; j<4; j++) {
    		 matrix[i][j]=input.nextDouble();
          }
     }
     
     for(int i=0; i<3; i++) {
    	 ans=sumRow(matrix, i); //�p�G�Q�n���W�}�C�i�J�A�I�s����k�A�����I�s�A�}�C���W�ٴN�n�A�᭱��[]�����S�X��
    	 System.out.printf("Sum of the elements at row %d is %3.2f",i,ans);
    	 System.out.println();
     }
	}

	public static double sumRow(double[][] m, int rowIndex) {
		double tot = 0;
			for(int columnIndex=0; columnIndex<4; columnIndex++) {			
				tot += m[rowIndex][columnIndex];
		}
			return tot;
	}
}
