package tim_Liu;

import java.io.*;
import java.util.Scanner;

public class test21 {

	public static void main(String[] args) throws IOException {
		// TODO �۰ʲ��ͪ���k Stub
		Scanner in = new Scanner(System.in);    
		String id, name;    
		double score;
		
		DataOutputStream output = new DataOutputStream(new FileOutputStream("score21.dat"));
		for (int i=1; i<=5; i++) {    
			System.out.printf("(�п�J�Ǹ� �m�W ����)#%d:", i);    
			id = in.next();    
			name = in.next();    
			score = in.nextInt();    
			output.writeUTF(id);    
			output.writeUTF(name);    
			output.writeDouble(score); 
		}		
	}
}
