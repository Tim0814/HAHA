package TIM1;
import java.util.Scanner;
public class HW7_3 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		int EnterNumbers[] = new int[51];
        Scanner input = new Scanner(System.in);
        while(true) {
       	  System.out.print("�п�J1~50��������: ");
      	  int enter = input.nextInt();
      	  if(enter == 0) {
      		  break; 
      		  }
      	  if(enter>50 || enter<1) {
      		  System.out.println("�п�J1~50��������");
      		  continue;
      	      }
      	  EnterNumbers[enter]++; //�p�ƾ��A�C���J�@�Ӿ�ơA��enter���|�[1�N��X�{�F�@��
        }
        System.out.println();
        for(int i=1; i<51; i++) {
      	  if(EnterNumbers[i]==1) {
      		  System.out.println(i + " occurs 1 time");
      	    }
      	  if(EnterNumbers[i]>1) {
      		  System.out.println(i + " occurs " + EnterNumbers[i] + " times");
      	    }
        }
	}
}
