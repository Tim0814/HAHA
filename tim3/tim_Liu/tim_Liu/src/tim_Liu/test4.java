package tim_Liu;

import java.util.Scanner;
public class test4 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
        Scanner input = new Scanner(System.in);
        System.out.print("�п�J2�Ӿ��: ");
        int a1 = input.nextInt();
        int a2 = input.nextInt();
        System.out.println("�̤j���]�Ƭ�:"+gcd(a1,a2));
	}
	
	public static int gcd(int a,int b) {
		int gcd=1; //��Ӽƪ��̤p���]�Ƥ@�w�O1
		int k=2; //��2�}�l���W�⤽�]��
		while(k<=a && k<=b) {
			if (a%k==0 && b%k==0) {
				gcd = k;
			}
			k++;
		}
		return gcd;
	}
}
