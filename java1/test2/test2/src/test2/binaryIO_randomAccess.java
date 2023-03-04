package test2;

import java.io.*;
import java.util.Scanner;

public class binaryIO_randomAccess {

	public static void main(String[] args) throws IOException {
		// TODO 自動產生的方法 Stub
		Scanner in = new Scanner(System.in);    
		String id, name;    
		double score;
		
		DataOutputStream output = new DataOutputStream(new FileOutputStream("score.dat")); //FileOutputStream為DataOutputStream的父類別
		for (int i=1; i<=5; i++) {    
			System.out.printf("(請輸入學號 姓名 分數)#%d:", i);    
			id = in.next();    
			name = in.next();    
			score = in.nextDouble();    
			output.writeUTF(id);    //一個中文字佔3個bytes
			output.writeUTF(name);    //一個中文字佔3個bytes
			output.writeDouble(score); //一個double佔8個bytes
		}
		System.out.println();
		
		
		DataInputStream input = new DataInputStream(new FileInputStream("score.dat")); //FileInputStream為DataInputStream的父類別
		for (int i=1; i<=5; i++) {    
			System.out.printf("第%d筆:", i);
            id = input.readUTF();            
            name = input.readUTF();            
            score = input.readDouble();    
            System.out.printf("%s, %s, %.2f\n", id, name, score);
        }
		System.out.println();
		
		
		RandomAccessFile inout = new RandomAccessFile("score.dat", "rw");
		long len = inout.length() / 5; //由於有五筆，所以要除以5才會是一筆資料的長度
		System.out.printf("length: %d\n", len);        
		int num;        
		System.out.printf("你要找第幾筆(1~5)？");        
		  num = in.nextInt();
		  
		  inout.seek((num-1)*len); 
		  id = inout.readUTF(); //由於上一個int值已經被讀取，所以檔案指標會自動往前推4個位元組(byte)
		  
		  inout.seek(inout.getFilePointer()); //getFilePointer回傳從檔案開頭(指標)到下一個read或write發生的位置的偏移量(long)，以位元組(byte)為單位表示
		  name = inout.readUTF(); //read()會從上個已經讀取完的int值的位元組(bytes)最尾端開始
		  
		  inout.seek(inout.getFilePointer()); 
		  score = inout.readDouble();
		  
		  System.out.printf("第%d筆的資料如下：", num);
		  System.out.printf("%s, %s, %.2f", id, name, score);
		 }
	}
	


