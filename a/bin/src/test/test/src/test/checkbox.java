 package test;

public class checkbox {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int checkbox[] = new int[50]; //產生一個有50個元素的checkbox陣列
		for(int i=0; i<50; i++) {
			checkbox[i] = 0; //然後令每一項都是0
		}
		int lottoNum[] = new int[6]; //用來裝樂透號碼的陣列
		
		int x = 0, num;
		while(x<6) {
			num = (int)(1+Math.random()*49); //num為1~50其中一個數字
			if(checkbox[num]==0) { //如果checkbox的第num項為0(其實50項都是0)
				lottoNum[x] = num; //num的數值便放進樂透陣列裡面(1~50其中一個數)
				checkbox[num] = 1; //然後checkbox的第num項變成1，這樣就不會重複算到(會因為不符合if敘述而跳出)
				x++; //連續做到第5項
			}
		}
		for(int i=0; i<6; i++) {
			System.out.printf("%3d", lottoNum[i]);
		}
	}
}
