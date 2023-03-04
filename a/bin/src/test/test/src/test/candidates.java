package test;

import java.util.Scanner;

public class candidates {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int option;
		int i,p=0,n=0,j=0,others=0;
		Scanner input = new Scanner(System.in);
		
		for (i=1;i<=10;i++) 
		{
			System.out.println("\n\n2022 Taipei mayoral candidates");
			System.out.println("1:Peter");
			System.out.println("2:Nancy");
			System.out.println("3:John");
			System.out.println("PLs choice:");
			option=input.nextInt();
			
			switch(option) {
			case 1: p++;
			break;
			case 2: n++;
			break;
			case 3: j++;
			break;
			default: others++;
			}
		}
		
		System.out.printf("Peter: %d, Nancy: %d, John: %d\n",p,n,j);
		System.out.printf("and others: %d\n",others);
	}
}
