package tim_Liu;

import java.io.FileWriter;
import java.util.Scanner;

public class test20 {

	public static void main(String[] args) throws Exception {
		// TODO 自動產生的方法 Stub
		String id, name;    
		int score;
        FileWriter writer = new FileWriter("score20.dat");
        Scanner input =  new Scanner(System.in);
         
        for(int i=1; i<=5; i++) {
        	System.out.printf("(請輸入學號 姓名 分數)#%d:", i);  
        	id=input.next();
        	name=input.next();
        	score=input.nextInt();
        	writer.write(id);
        	writer.write(name);
        	writer.write(score);
        }	
	}
}
