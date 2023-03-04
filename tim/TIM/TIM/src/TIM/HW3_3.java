package TIM;
import java.util.Scanner;
public class HW3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		double b;
		double c;
		double e;
		double d;
		double f;
		
		Scanner num = new Scanner(System.in);
		System.out.print("Pls input a:");
		a=num.nextDouble();
		
		System.out.print("Pls input b:");
		b=num.nextDouble();
		
		System.out.print("Pls input c:");
		c=num.nextDouble();
		
		System.out.print("Pls input d:");
		d=num.nextDouble();
		
		System.out.print("Pls input e:");
		e=num.nextDouble();
		
		System.out.print("Pls input f:");
		f=num.nextDouble();

		double z=(a*d-b*c);
		double x=(e*d-b*f);
		double y=(a*f-e*c);
		
		if (z==0) {
			System.out.println("The equation has no solution");
		}
		else {
			System.out.println("x="+(x/z));
			System.out.println("y="+(y/z));
		}

	}

}
