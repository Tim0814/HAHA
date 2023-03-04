package TIM1;
import java.util.Scanner;
public class HW7_3 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int EnterNumbers[] = new int[51];
        Scanner input = new Scanner(System.in);
        while(true) {
       	  System.out.print("請輸入1~50之間的數: ");
      	  int enter = input.nextInt();
      	  if(enter == 0) {
      		  break; 
      		  }
      	  if(enter>50 || enter<1) {
      		  System.out.println("請輸入1~50之間的數");
      		  continue;
      	      }
      	  EnterNumbers[enter]++; //計數器，每當輸入一個整數，第enter項會加1代表出現了一次
        }
        System.out.println();
        for(int i=1; i<51; i++) {
      	  if(EnterNumbers[i]==1) {
      		  System.out.println(i + " occurs 1 time");
      	    }
      	  if(EnterNumbers[i]>1) {
      		  System.out.println(i + " occurs " + EnterNumbers[i] + " times");
      	    }
        }
	}
}
