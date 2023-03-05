package Final_test;
import java.util.Scanner;
public class test3 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
        int count = 0; //計數器
        Scanner input = new Scanner(System.in);
        System.out.println("這是一台專門計算質數的機器");
        System.out.println("請輸入範圍: ");
        int Enternum = input.nextInt(); //欲要測量的數字範圍
        
        for(int i=2; i<Enternum; i++) { //範圍2開始一直到使用者輸入的數字為止(然後底下的函式IsPrime運作(Enternum-2)次)
        	if(IsPrime(i)) { //用函式IsPrime計算是不是質數
        		count++; //如果是就會回傳true，並且計數器加一
        		System.out.print(i+"\t");
        	}
        	if(count>=15) {
        		System.out.print("\n");
        		count = 0;
        	}
        }
        
   }
	
private static boolean IsPrime(int i) { //測量單一個數字是不是質數的函式
	for(int j=2; j<i; j++) { //j從2開始算一直到輸入值i為止
		if(i % j==0) { //如果在這之間有數字能整除i
			return false; //那麼它就不是質數，迴圈結束
		}
	}
	return true; //反之就是質數，迴圈結束
	}
} //繼續計算下一個數字