package Final_test;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		Scanner input = new Scanner(System.in);
		System.out.print("�п�J����P�Ǫ�����: "); 
		int grade [] = new int[6]; 
		for(int i=0; i<6; i++) {
			grade[i] = input.nextInt(); 
		}
		for(int k=0; k<6; k++) {
			if(grade[k]>=90) {
		        System.out.println("��" + k + "��P�Ǫ����ƬO " + grade[k] + ", �Ť��O " + " A+ ");
		    } 
		    else if(grade[k]>=85 && grade[k]<=89) {
			    System.out.println("��" + k + "��P�Ǫ����ƬO " + grade[k] + ", �Ť��O " + " A ");
		    }
		    else if(grade[k]>=80 && grade[k]<=84) {
			    System.out.println("��" + k + "��P�Ǫ����ƬO " + grade[k] + ", �Ť��O " + " A- ");
		    }
		    else if(grade[k]>=75 && grade[k]<=79) {
			    System.out.println("��" + k + "��P�Ǫ����ƬO " + grade[k] + ", �Ť��O " + " B+ ");
		    }
		    else if(grade[k]>=70 && grade[k]<=74) {
			    System.out.println("��" + k + "��P�Ǫ����ƬO " + grade[k] + ", �Ť��O " + " B ");
		    }
		    else if(grade[k]>=60 && grade[k]<=69) {
			    System.out.println("��" + k + "��P�Ǫ����ƬO " + grade[k] + ", �Ť��O " + " C ");
		    }
		    else {
			    System.out.println("��" + k + "��P�Ǫ����ƬO " + grade[k] + ", �Ť��O " + " D ");
		    }
	    }
	}
}
