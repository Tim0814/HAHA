package TIM1;
import java.util.Scanner;
public class HW7_1 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		int best;
		Scanner input = new Scanner(System.in);
		System.out.print("Pls enter the number of students: "); //�ݦ��X��ǥ�
		int num = input.nextInt(); //�ǥͼ�

		System.out.print("Enter " + num + " scores: "); //�C��ǥͪ�����
		int grade [] = new int[num]; //�إߤ@�ӱM���s�����ƪ��}�C
		for(int i=0; i<num; i++) {
			grade[i] = input.nextInt(); //Ū���C��ǥͪ����Ʃ�igrade�}�C
		}
		best = grade[0]; //���O��0�����ǥͬ��̰���
		for(int j=1; j<num; j++) {
			if(grade[j]>best) { //�p�G�᭱����L�ǥͤ�e�@������
				best = grade[j]; //�̰������H��
	        }
		}
		for(int k=0; k<num; k++) {
		    if(grade[k]>=(best-5)) {
		        System.out.println("Students " + k + " score is " + grade[k] + " and grade is " + " A ");
		    } 
		    else if(grade[k]>=(best-10)) {
			    System.out.println("Students " + k + " score is " + grade[k] + " and grade is " + " B ");
		    }
		    else if(grade[k]>=(best-15)) {
			    System.out.println("Students " + k + " score is " + grade[k] + " and grade is " + " C ");
		    }
		    else if(grade[k]>=(best-20)) {
			    System.out.println("Students " + k + " score is " + grade[k] + " and grade is " + " D ");
		    }
		    else {
			    System.out.println("Students " + k + " score is " + grade[k] + " and grade is " + " F ");
		    }
	    }
	}
}
