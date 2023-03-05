package Final_test;

import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Scanner input =new Scanner(System.in);
		System.out.print("請輸入兩個年份:");
		int year1 = input.nextInt();
		int year2 = input.nextInt();
        leapyear(year1,year2);
	}
	
	public static void leapyear(int yr1, int yr2) {
		int count = 0;
		for(int i=yr1; i<yr2; i++) {
		if ((i%400==0) || (i%4==0 && i%100!=0)) {
			System.out.print(i+" ");
	        count+=1 ;
		}
		
	    if (count==10){
	    	System.out.println();
	        count=0 ;
	    }
	 }
   }
}
