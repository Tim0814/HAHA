package tim_Liu;
import java.util.Scanner;
public class test11 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub		
		Scanner input=new Scanner(System.in);
		int[] data = new int[10];
		int index,max;
		System.out.println("請輸入10個數:");
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

		System.out.printf("最大值是 %d,其索引是 %d\n",max,index);
	}
}
