package Final_test;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		int a,b,c,d;
		Scanner input = new Scanner(System.in);
		System.out.print("�п�J����: ");
		a=input.nextInt();
		System.out.print("�п�J���l: ");
		b=input.nextInt();
		System.out.print("�п�J����: ");
		c=input.nextInt();
		System.out.print("�п�J���l: ");
		d=input.nextInt();

		
		int num1 = a*d + b*c;
		int num2 = a*c;
		int ans = GCD(num1 , num2);
        double Num1 = num1/ans;
        double Num2 = num2/ans;
        System.out.println(b + "/" + a + " �[�W " + d + "/" + c + " = " + Num1 + "/" + Num2);
	} 
	
	public static int GCD(int a,int b) {
		int gcd=1; 
		int k=2; 
		while(k<=a && k<=b) {
			if (a%k==0 && b%k==0) {
				gcd = k;
			}
			k++;
		}
		return gcd;
	}
}
