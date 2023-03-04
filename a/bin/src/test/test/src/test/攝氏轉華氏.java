package test;
import java.util.Scanner;
public class 攝氏轉華氏 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		double f;
		double c;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter f degree: ");
		f = s.nextDouble();
		c = (f-32)*5/9.;
		System.out.println(f);
		System.out.println(c);

	}

}
