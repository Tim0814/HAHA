package tim_Liu;
import java.util.Scanner;
public class test6 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
        Scanner input = new Scanner(System.in);
        System.out.print("�п�J�@���:");
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
    	  System.out.print(num + " �O���");
      }
      else {
    	  System.out.print(num + " ���O���");
      }
	}
}
