package TIM1;
import java.util.Scanner;
public class HW7_5 {
	
	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int even = 0;
		int odd = 0;
    	System.out.print("Enter numbers:");
		Scanner input = new Scanner(System.in);
        for(int i=0; i<15; i++) {
        	int num = input.nextInt();
        	if(num%2==0) {
        		even++;
        	}
        	else if(num%2!=0) {
        		odd++;
        	}
        }
        System.out.println("The number of odd numbers:" + odd);
        System.out.println("The number of even numbers:" + even);
	}
}