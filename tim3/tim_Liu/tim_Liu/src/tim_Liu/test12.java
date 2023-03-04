package tim_Liu;
import java.util.Scanner;
public class test12 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Scanner input =new Scanner(System.in);
		int[][] data2 = new int[3][4];
		System.out.println("請輸入12個數:");
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				data2[i][j]=input.nextInt();
			}
		}
		
		for(int i=0; i<3; i++) {
			int count=0;
			for(int j=0; j<4; j++) {
				count+=data2[i][j];
				
			}
			System.out.println("列總和="+count);
		}
		System.out.println();
		for(int i=0; i<4; i++) {
			int count=0;
			for(int j=0; j<3; j++) {
				count+=data2[j][i];
				
			}
			System.out.println("行總和="+count);
		}
		
		
		
		
		
		
		
	}

}
