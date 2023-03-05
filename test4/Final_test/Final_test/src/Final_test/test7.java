package Final_test;

import java.util.Scanner;

public class test7 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Scanner input =new Scanner(System.in);
		int[][] data2 = new int[4][3];
		System.out.println("請輸入12個數:");
		for(int i=0; i<4; i++) {
			for(int j=0; j<3; j++) {
				data2[i][j]=input.nextInt();
			}
		}
		
		for(int i=0; i<4; i++) {
			int count=0;
			for(int j=0; j<3; j++) {
				count+=data2[i][j];
				
			}
			System.out.println("第" + i + "列的總和="+count);
		}
		System.out.println();
		for(int i=0; i<3; i++) {
			int count=0;
			for(int j=0; j<4; j++) {
				count+=data2[j][i];
				
			}
			System.out.println("第" + i + "行的總和="+count);
		}
	}

}
