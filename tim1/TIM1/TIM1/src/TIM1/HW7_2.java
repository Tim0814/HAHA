package TIM1;
import java.util.Scanner;
public class HW7_2 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Scanner input = new Scanner(System.in);
		double lst[] = new double[15];
		System.out.print("Pls input 15 numbers: ");
		for(int i=0; i<15; i++) {
			double num = input.nextDouble();
			lst[i] = num;
		}
		for(int j=0; j<15; j++) {
			for(int k=j+1; k<15; k++) {
					double m;
					m = lst[j];
					lst[j] = lst[k];
					lst[k] = m;
			}
		}
		for(int n=0; n<15; n++) {
			System.out.print(lst[n] + " ");
		}
	}
}
