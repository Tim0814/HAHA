package tim_Liu;
import java.util.Scanner;
public class test6 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
        Scanner input = new Scanner(System.in);
        System.out.print("請輸入一整數:");
        int num = input.nextInt();
        boolean prime = true;
        int divisor = 2;
        
        while(divisor <= num/2 && prime) {
        	if(num % divisor == 0) {
        		prime = false;
        	}
        	divisor+=1;
        }
        
      if(prime) {
    	  System.out.print(num + " 是質數");
      }
      else {
    	  System.out.print(num + " 不是質數");
      }
	}
}
