package tim_Liu;

import java.util.Scanner;

public class test9 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		Scanner input = new Scanner(System.in);
		System.out.print("�п�J����P�Ǫ�����: "); 
		int grade [] = new int[6]; 
		for(int i=0; i<6; i++) {
			grade[i] = input.nextInt(); 
		   }
		GRADE(grade);
		}
	
	public static void GRADE(int array[]) {
		for(int k=0; k<6; k++) {
			if(array[k]>=90) {
		        System.out.println("��" + k + "��P�Ǫ����ƬO " + array[k] + ", �Ť��O " + " A+ ");
		    } 
		    else if(array[k]>=85 && array[k]<=89) {
			    System.out.println("��" + k + "��P�Ǫ����ƬO " + array[k] + ", �Ť��O " + " A ");
		    }
		    else if(array[k]>=80 && array[k]<=84) {
			    System.out.println("��" + k + "��P�Ǫ����ƬO " + array[k] + ", �Ť��O " + " A- ");
		    }
		    else if(array[k]>=75 && array[k]<=79) {
			    System.out.println("��" + k + "��P�Ǫ����ƬO " + array[k] + ", �Ť��O " + " B+ ");
		    }
		    else if(array[k]>=70 && array[k]<=74) {
			    System.out.println("��" + k + "��P�Ǫ����ƬO " + array[k] + ", �Ť��O " + " B ");
		    }
		    else if(array[k]>=60 && array[k]<=69) {
			    System.out.println("��" + k + "��P�Ǫ����ƬO " + array[k] + ", �Ť��O " + " C ");
		    }
		    else {
			    System.out.println("��" + k + "��P�Ǫ����ƬO " + array[k] + ", �Ť��O " + " D ");
		    }
	    }
	}
}
