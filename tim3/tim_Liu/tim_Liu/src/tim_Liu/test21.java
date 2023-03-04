package tim_Liu;

import java.io.*;
import java.util.Scanner;

public class test21 {

	public static void main(String[] args) throws IOException {
		// TODO 自動產生的方法 Stub
		Scanner in = new Scanner(System.in);    
		String id, name;    
		double score;
		
		DataOutputStream output = new DataOutputStream(new FileOutputStream("score21.dat"));
		for (int i=1; i<=5; i++) {    
			System.out.printf("(請輸入學號 姓名 分數)#%d:", i);    
			id = in.next();    
			name = in.next();    
			score = in.nextInt();    
			output.writeUTF(id);    
			output.writeUTF(name);    
			output.writeDouble(score); 
		}		
	}
}
