package Final_test;

import java.util.Scanner;
public class test6 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
        double[] data2 = new double[10];
        Scanner input = new Scanner(System.in);
    	System.out.print("�п�J10�Ӿ��: ");
        for(int i=0; i<10; i++) {
        	data2[i] = input.nextDouble();
        }
        
        for(int j=0; j<10; j++) {
        	if(data2[j]%2==0) {
        		System.out.println("��" + j + "���O����, ����ެO=" + j);
        	}
        }
	}
}
