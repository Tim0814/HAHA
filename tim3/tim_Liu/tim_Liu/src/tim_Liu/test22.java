package tim_Liu;
import java.io.*;
public class test22 {

	public static void main(String[] args) throws IOException{
		// TODO �۰ʲ��ͪ���k Stub
		RandomAccessFile inout = new RandomAccessFile("score21.dat", "rw"); 
		String id, name;    
		double score;
		long len = inout.length() / 5;
		int num = (int)(Math.random()*5+1);
		
		inout.seek(num*len);
		id = inout.readUTF(); 
		
		inout.seek(inout.getFilePointer());
		name = inout.readUTF(); 
		
		inout.seek(inout.getFilePointer());
		score = inout.readDouble(); 
		
		System.out.printf("�o�O��%d���ǥͪ����: %s, %s, %.2f",num,id,name,score);

   }
}
