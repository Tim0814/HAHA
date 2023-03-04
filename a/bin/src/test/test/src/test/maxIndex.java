package test;

public class maxIndex {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int[] num = new int[10];
		int index,max;
		for(int i=0; i<10; i++) {
			num[i] =(int)(1+Math.random()*1000);
		}
		max = num[0];
		index = 0;
		
		for(int j=1; j<num.length; j++) {
			if(num[j]>max) {
				max = num[j];
				index = j;
			}
		}
		for(int k=0; k<num.length; k++) {
			System.out.println();
			
			if((k+1)%10==0) {
				System.out.printf("%4d \n", num[k]);
			}
			
			else {
				System.out.printf("%4d \n", num[k]);
			}
		}
		
		System.out.printf("maximum value is %d,and at index of %d\n",max,index);
	}
}
