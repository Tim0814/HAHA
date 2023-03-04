package test;

import java.util.Scanner;

public class AboveTheAverage {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of items: ");
		int n = input.nextInt();
		
		double[] num = new double[n];
		double sum = 0;
		
		System.out.print("Enter the " + n + " numbers: ");
		for(int i=0; i<n; i++) {
            num[i] = input.nextDouble();
            sum += num[i]; 
		}
		
		double aver = sum/n;
		int count = 0;
		for(int i = 0; i<n; i++) {
			if(num[i]>aver) {
				count++;
			}	
		}
		
		System.out.println("Average is " + aver);
		System.out.println("Number of elements above the average is " + count);
	}
}
