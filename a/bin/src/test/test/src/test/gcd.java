package test;
import java.util.Scanner;
public class gcd {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int a,b,c,d;
		Scanner input = new Scanner(System.in);
		System.out.print("Pls enter a: ");
		a=input.nextInt();
		System.out.print("Pls enter b: ");
		b=input.nextInt();
		System.out.print("Pls enter c: ");
		c=input.nextInt();
		System.out.print("Pls enter d: ");
		d=input.nextInt();
		
		int nume = a*d + b*c;
		int deno = a*c;
		int ans = gcd(nume , deno);
        nume = nume/ans;
        deno = deno/ans;
        System.out.println(b + "/" + a + "+" + d + "/" + c + "=" + nume + "/" + deno);
	} 
	
	public static int gcd(int a,int b) {
		int gcd=1; //兩個數的最小公因數一定是1
		int k=2; //由2開始往上算公因數
		while(k<=a && k<=b) {
			if (a%k==0 && b%k==0) {
				gcd = k;
			}
			k++;
		}
		return gcd;
	}
}
