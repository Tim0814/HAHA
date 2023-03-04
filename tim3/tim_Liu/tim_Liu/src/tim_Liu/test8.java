package tim_Liu;

public class test8 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int checkbox[] = new int[50]; 
		for(int i=0; i<50; i++) {
			checkbox[i] = 0;
		}
		int lottoNum[] = new int[6];
		
		int x = 0, num;
		while(x<6) {
			num = (int)(1+Math.random()*49); 
			if(checkbox[num]==0) {
				lottoNum[x] = num;
				checkbox[num] = 1; 
				x++; 
			}
		}
		for(int i=0; i<6; i++) {
			System.out.printf("%3d", lottoNum[i]);
		}
	}

}
