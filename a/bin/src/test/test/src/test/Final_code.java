package test;

import java.util.Scanner;

public class Final_code {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int lowest = 1;
		int highest = 100;	
		int enter = 0; //猜的數
        int ans = (int)(Math.random()*99+1);
        
		Scanner input = new Scanner(System.in);
		  System.out.println("終級密碼");
		do {
			  System.out.print("請輸入 "+ lowest + " 到 "+ highest +" 的數:");
			  enter = input.nextInt(); //讀取使用者輸入
			  if(enter > ans) highest = enter ; //若猜的數字比key大，最大值為num
			  else  lowest = enter; //若猜的數字比key小，最小值為num
		}
		while(ans!=enter); //當兩者相同時即跳出
	System.out.println("賓果答對了嘿嘿");
	}
}
