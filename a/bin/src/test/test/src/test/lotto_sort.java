package test;

public class lotto_sort {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int lotto[] = new int[6];
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = 1 + (int)(Math.random()*49); //先隨機產生6個數字
		}
		//6個數由小到大排序
		for(int i=0; i<lotto.length; i++) { //從第0項開始比
			int min = lotto[i]; //令第i項為最小數
			int index = i; //項數
			for(int j=i+1; j<lotto.length; j++) { //拿第i+1項跟第i項比較，一路比到最後一項
				if(lotto[j]<min) { //如果其中有最小的
					min = lotto[j]; //最小值換人當
					index = j; //然後會被放在第i項
				} 
			}
			if(min!=lotto[i]) { //如果最小值跟一開始設的不一樣
			    lotto[index] = lotto[i]; //交換位置的語法
			    lotto[i] = min; //跟前一項交換位置
			}
		    //然後跳回for那邊接下去比第i+1跟第i+2項
		}
		for(int data:lotto) {
		    System.out.printf("%3d", data);
		    }
		}
	}

