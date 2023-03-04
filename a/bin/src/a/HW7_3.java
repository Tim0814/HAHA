package a;
import java.util.Scanner;
public class HW7_3 {
	public static void main(String[] args) {
          int EnterNumbers[] = new int[51];
          Scanner input = new Scanner(System.in);
       	  System.out.print("Enter the intergers between 1~50: ");
          while(true) {
        	  int enter = input.nextInt();
        	  if(enter == 0) {
        		  break; 
        		  }
        	  if(enter>50 || enter<1) {
        		  System.out.println("請輸入1~50之間的數:");
        		  continue;
        	      }
        	  EnterNumbers[enter]++;  
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


