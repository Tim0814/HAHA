package Final_test;
import java.util.Scanner;
public class test3 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
        int count = 0; //�p�ƾ�
        Scanner input = new Scanner(System.in);
        System.out.println("�o�O�@�x�M���p���ƪ�����");
        System.out.println("�п�J�d��: ");
        int Enternum = input.nextInt(); //���n���q���Ʀr�d��
        
        for(int i=2; i<Enternum; i++) { //�d��2�}�l�@����ϥΪ̿�J���Ʀr����(�M�ᩳ�U���禡IsPrime�B�@(Enternum-2)��)
        	if(IsPrime(i)) { //�Ψ禡IsPrime�p��O���O���
        		count++; //�p�G�O�N�|�^��true�A�åB�p�ƾ��[�@
        		System.out.print(i+"\t");
        	}
        	if(count>=15) {
        		System.out.print("\n");
        		count = 0;
        	}
        }
        
   }
	
private static boolean IsPrime(int i) { //���q��@�ӼƦr�O���O��ƪ��禡
	for(int j=2; j<i; j++) { //j�q2�}�l��@�����J��i����
		if(i % j==0) { //�p�G�b�o�������Ʀr��㰣i
			return false; //���򥦴N���O��ơA�j�鵲��
		}
	}
	return true; //�Ϥ��N�O��ơA�j�鵲��
	}
} //�~��p��U�@�ӼƦr