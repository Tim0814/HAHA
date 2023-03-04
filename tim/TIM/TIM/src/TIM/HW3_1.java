package TIM;
import java.util.Scanner;
public class HW3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double root1;
		double root2;
		double a;
		double b;
		double c;
		
		System.out.print("Pls input a b c:");
		Scanner num = new Scanner(System.in);
		a=num.nextDouble();
		b=num.nextDouble();
		c=num.nextDouble();
		
		double ans=b*b-4*a*c;
		root1=(-b+Math.sqrt(ans))/2*a;
		root2=(-b-Math.sqrt(ans))/2*a;
		
		if (ans>0){
			System.out.println("此方程式有兩解");
			System.out.println("root1="+root1);
			System.out.println("root2="+root2);
		}
		else if (ans==0) {
			System.out.println("此方程式有一解");
			System.out.println("root1=root2="+root1);
		}
		else {
			System.out.println("此方程式無解");
		}

	}

}
