package a;
import java.util.ArrayList;
public class arraylist {
	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		int[] List = new int[10];
	    for( int i=0;i < 100;i++ ) {
	     if (i == List.length) {
	      int[] newest = new int[List.length*2] ;
	      for(int j = 0 ; j < List.length ; j++) {
	       newest[j] = List[j] ;
	       List = newest ;
	      }
	     }
	     List[i] = i ;//���}�C�W�[10��Int����
	     System.out.println(List[i]);
   
	  }
	}
}

