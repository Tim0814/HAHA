package tim_Liu;
import java.io.*;
public class test22 {

	public static void main(String[] args) throws IOException{
		// TODO 自動產生的方法 Stub
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
		
		System.out.printf("這是第%d筆學生的資料: %s, %s, %.2f",num,id,name,score);

   }
}
