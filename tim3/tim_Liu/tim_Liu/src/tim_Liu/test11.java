package tim_Liu;
import java.util.Scanner;
public class test11 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub		
		Scanner input=new Scanner(System.in);
		int[] data = new int[10];
		int index,max;
		System.out.println("�п�J10�Ӽ�:");
		for(int i=0; i<10; i++) {
			data[i]=input.nextInt();
		}
		max = data[0];
		index = 0;
		
		for(int j=1; j<data.length; j++) {
			if(data[j]>max) {
				max = data[j];
				index = j;
			}
		}

		System.out.printf("�̤j�ȬO %d,����ެO %d\n",max,index);
	}
}
