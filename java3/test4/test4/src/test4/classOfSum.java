package test4;

import java.util.Scanner;

public class classOfSum {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int s,t,ans;
		Scanner input = new Scanner(System.in);
		System.out.print("Pls input s: ");
		s=input.nextInt();
		System.out.print("Pls input t: ");
		t=input.nextInt();
		
		if (t<s) { //如果T大於S的話會用到這個
			int k;
			k=t;
			t=s;
			s=k;
		}
		
		ans=sum(s,t);
		System.out.printf("Sum of %d to %d is %d.",s,t,ans);
	}
	
	public static int sum(int start, int end) {
		int i , tot=0;
		for(i=start; i<=end; i++) {
			tot+=i;
		}
		return tot;
	}
}
