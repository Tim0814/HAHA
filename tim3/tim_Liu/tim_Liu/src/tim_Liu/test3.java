package tim_Liu;
import java.util.Scanner;
public class test3 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		int best;
		Scanner input = new Scanner(System.in);
		System.out.print("�п�J����P�Ǫ�����: "); 
		int grade [] = new int[5]; 
		for(int i=0; i<5; i++) {
			grade[i] = input.nextInt(); 
		}
		for(int k=0; k<5; k++) {
			if(grade[k]>=90) {
		        System.out.println("�P�� " + k + " �����ƬO " + grade[k] + " �Ť��O " + " A+ ");
		    } 
		    else if(grade[k]>=85 && grade[k]<=89) {
			    System.out.println("�P�� " + k + " �����ƬO " + grade[k] + " �Ť��O " + " A ");
		    }
		    else if(grade[k]>=80 && grade[k]<=84) {
			    System.out.println("�P�� " + k + " �����ƬO " + grade[k] + " �Ť��O " + " A- ");
		    }
		    else if(grade[k]>=75 && grade[k]<=79) {
			    System.out.println("�P�� " + k + " �����ƬO " + grade[k] + " �Ť��O " + " B+ ");
		    }
		    else if(grade[k]>=70 && grade[k]<=74) {
			    System.out.println("�P�� " + k + " �����ƬO " + grade[k] + " �Ť��O " + " B ");
		    }
		    else if(grade[k]>=60 && grade[k]<=69) {
			    System.out.println("�P�� " + k + " �����ƬO " + grade[k] + " �Ť��O " + " C ");
		    }
		    else {
			    System.out.println("�P�� " + k + " �����ƬO " + grade[k] + " �Ť��O " + " D ");
		    }
		}
        
        
        
        
        
        
        
	}

}
