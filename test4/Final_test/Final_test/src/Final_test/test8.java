package Final_test;

import java.util.Scanner;

public class test8 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		System.out.print("�п�J�@�Ӯy���I: ");
		Scanner input=new Scanner(System.in);
		double p1=input.nextDouble();
		double p2=input.nextDouble();
		double d=Math.sqrt(((p1-3)*(p1-3))+((p2-4)*(p2-4)));
		
		if (d<=6) {
        	System.out.println("Point ("+p1+", "+ p2+") is in the circle");
        }
        else {
        	System.out.println("Point ("+p1+", "+ p2+") is not in the circle");
	  }
   }
}
