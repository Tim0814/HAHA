package tim_Liu;

import java.util.Scanner;
public class test4 {

	public static void main(String[] args) {
		// TODO 笆玻ネよ猭 Stub
        Scanner input = new Scanner(System.in);
        System.out.print("叫块2俱计: ");
        int a1 = input.nextInt();
        int a2 = input.nextInt();
        System.out.println("程そ计:"+gcd(a1,a2));
	}
	
	public static int gcd(int a,int b) {
		int gcd=1; //ㄢ计程そ计﹚琌1
		int k=2; //パ2秨﹍┕衡そ计
		while(k<=a && k<=b) {
			if (a%k==0 && b%k==0) {
				gcd = k;
			}
			k++;
		}
		return gcd;
	}
}
