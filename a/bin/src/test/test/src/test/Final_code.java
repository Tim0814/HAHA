package test;

import java.util.Scanner;

public class Final_code {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		int lowest = 1;
		int highest = 100;	
		int enter = 0; //�q����
        int ans = (int)(Math.random()*99+1);
        
		Scanner input = new Scanner(System.in);
		  System.out.println("�ׯűK�X");
		do {
			  System.out.print("�п�J "+ lowest + " �� "+ highest +" ����:");
			  enter = input.nextInt(); //Ū���ϥΪ̿�J
			  if(enter > ans) highest = enter ; //�Y�q���Ʀr��key�j�A�̤j�Ȭ�num
			  else  lowest = enter; //�Y�q���Ʀr��key�p�A�̤p�Ȭ�num
		}
		while(ans!=enter); //���̬ۦP�ɧY���X
	System.out.println("���G����F�K�K");
	}
}
