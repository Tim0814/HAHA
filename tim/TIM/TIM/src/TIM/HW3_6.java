package TIM;
import java.util.Scanner;
public class HW3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pounds;
		double feets;
		double inches;
		double meters;
		double kilograms;
		double BMI;

		Scanner num = new Scanner(System.in);
		System.out.print("Pls enter weight in pounds:");
		pounds=num.nextDouble();
		
		System.out.print("Pls enter feets:");
		feets=num.nextDouble();
		
		System.out.print("Pls enter inches:");
		inches=num.nextDouble();
		
		kilograms=(pounds/2.2046226218);
		meters=(feets/3.2808416667)+(inches/39.3701);
		BMI=kilograms/(meters*meters);
		
		if (BMI<18.5) {
			System.out.println("your BMI is "+BMI);
			System.out.println("�魫�L��");
		}
		else if(BMI>=18.5&&BMI<24){
			System.out.println("your BMI is "+BMI);
			System.out.println("�魫�A��");
		}
		else if(24<=BMI&&BMI<27){
			System.out.println("your BMI is "+BMI);
			System.out.println("�魫�L��");
		}
		else if(27<=BMI&&BMI<30){
			System.out.println("your BMI is "+BMI);
			System.out.println("���תέD");
		}
		else if(30<=BMI&&BMI<35){
			System.out.println("your BMI is "+BMI);
			System.out.println("���תέD");
		}
		else {
			System.out.println("your BMI is "+BMI);
			System.out.println("���תέD");
		}
		
	}

}
