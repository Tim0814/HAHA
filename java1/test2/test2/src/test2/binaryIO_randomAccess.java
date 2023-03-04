package test2;

import java.io.*;
import java.util.Scanner;

public class binaryIO_randomAccess {

	public static void main(String[] args) throws IOException {
		// TODO �۰ʲ��ͪ���k Stub
		Scanner in = new Scanner(System.in);    
		String id, name;    
		double score;
		
		DataOutputStream output = new DataOutputStream(new FileOutputStream("score.dat")); //FileOutputStream��DataOutputStream�������O
		for (int i=1; i<=5; i++) {    
			System.out.printf("(�п�J�Ǹ� �m�W ����)#%d:", i);    
			id = in.next();    
			name = in.next();    
			score = in.nextDouble();    
			output.writeUTF(id);    //�@�Ӥ���r��3��bytes
			output.writeUTF(name);    //�@�Ӥ���r��3��bytes
			output.writeDouble(score); //�@��double��8��bytes
		}
		System.out.println();
		
		
		DataInputStream input = new DataInputStream(new FileInputStream("score.dat")); //FileInputStream��DataInputStream�������O
		for (int i=1; i<=5; i++) {    
			System.out.printf("��%d��:", i);
            id = input.readUTF();            
            name = input.readUTF();            
            score = input.readDouble();    
            System.out.printf("%s, %s, %.2f\n", id, name, score);
        }
		System.out.println();
		
		
		RandomAccessFile inout = new RandomAccessFile("score.dat", "rw");
		long len = inout.length() / 5; //�ѩ󦳤����A�ҥH�n���H5�~�|�O�@����ƪ�����
		System.out.printf("length: %d\n", len);        
		int num;        
		System.out.printf("�A�n��ĴX��(1~5)�H");        
		  num = in.nextInt();
		  
		  inout.seek((num-1)*len); 
		  id = inout.readUTF(); //�ѩ�W�@��int�Ȥw�g�QŪ���A�ҥH�ɮ׫��з|�۰ʩ��e��4�Ӧ줸��(byte)
		  
		  inout.seek(inout.getFilePointer()); //getFilePointer�^�Ǳq�ɮ׶}�Y(����)��U�@��read��write�o�ͪ���m�������q(long)�A�H�줸��(byte)�������
		  name = inout.readUTF(); //read()�|�q�W�Ӥw�gŪ������int�Ȫ��줸��(bytes)�̧��ݶ}�l
		  
		  inout.seek(inout.getFilePointer()); 
		  score = inout.readDouble();
		  
		  System.out.printf("��%d������Ʀp�U�G", num);
		  System.out.printf("%s, %s, %.2f", id, name, score);
		 }
	}
	


