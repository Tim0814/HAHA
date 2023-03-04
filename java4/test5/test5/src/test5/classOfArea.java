package test5;

import java.util.Scanner;

public class classOfArea {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int radius;    
		double area;    
		Scanner input = new Scanner(System.in);
	    System.out.printf("Enter the radius: ");    
	    radius = input.nextInt();
	    System.out.printf("radius: %d, area: %.2f", radius, area(radius));
	}
	    
	public static double area(int r)
	{    double area;    
	area = r * r * Math.PI;    
	return area;
	}

}
