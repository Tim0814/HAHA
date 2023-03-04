 package tim_Liu;

import java.util.Scanner;

public class test14 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		System.out.print("Enter a point with two coordinates: ");
		Scanner input=new Scanner(System.in);
		double p1=input.nextDouble();
		double p2=input.nextDouble();
		circle(p1,p2);
	}
	
	public static void circle (double p1,double p2) {
	double d=Math.sqrt(((p1-1)*(p1-1))+((p2-1)*(p2-1)));
	
	if (d<=6) {
    	System.out.println("Point ("+p1+", "+ p2+") is in the circle");
        }
	
    else {
    	System.out.println("Point ("+p1+", "+ p2+") is not in the circle");
        }
	}
}
