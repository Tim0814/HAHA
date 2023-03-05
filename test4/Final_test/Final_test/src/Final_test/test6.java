package Final_test;

import java.util.Scanner;
public class test6 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
        double[] data2 = new double[10];
        Scanner input = new Scanner(System.in);
    	System.out.print("請輸入10個整數: ");
        for(int i=0; i<10; i++) {
        	data2[i] = input.nextDouble();
        }
        
        for(int j=0; j<10; j++) {
        	if(data2[j]%2==0) {
        		System.out.println("第" + j + "項是偶數, 其索引是=" + j);
        	}
        }
	}
}
