package test;
import java.util.Scanner;
public class lotto {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int[] lotto = new int[6];
		for(int i=0; i<10; i++) {
			for(int j=0; j<lotto.length; j++) {
				lotto[j] = (int)(1+Math.random()*49);
			}
			System.out.println();
		    for(int j=0; j<lotto.length; j++) {
			    System.out.printf("%2d ", lotto[j]);
			}
		}
	}
}
