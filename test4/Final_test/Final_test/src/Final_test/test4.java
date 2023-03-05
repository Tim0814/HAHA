package Final_test;

public class test4 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int checkbox[] = new int[38]; 
		for(int i=0; i<38; i++) {
			checkbox[i] = 0;
		}
		int lottoNum[] = new int[7];
		
		int x = 0, tempt;
		while(x<6) {
			tempt = (int)(1+Math.random()*37); 
			if(checkbox[tempt]==0) {
				lottoNum[x] = tempt;
				checkbox[tempt] = 1; 
				x++; 
			}
		}
		lottoNum[6] = (int)(1+Math.random()*7);
		for(int i=0; i<7; i++) {
			System.out.printf("%3d", lottoNum[i]);
		}
	}

}
