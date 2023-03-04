package test;
import java.util.Scanner;
public class gcd {

	public static void main(String[] args) {
		// TODO 笆玻ネよ猭 Stub
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
