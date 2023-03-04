package a;
import java.util.ArrayList;
public class arraylist {
	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int[] List = new int[10];
	    for( int i=0;i < 100;i++ ) {
	     if (i == List.length) {
	      int[] newest = new int[List.length*2] ;
	      for(int j = 0 ; j < List.length ; j++) {
	       newest[j] = List[j] ;
	       List = newest ;
	      }
	     }
	     List[i] = i ;//給陣列增加10個Int元素
	     System.out.println(List[i]);
   
	  }
	}
}

