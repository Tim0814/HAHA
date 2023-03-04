package tim_Liu;

import java.util.Scanner;

public class test9 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Scanner input = new Scanner(System.in);
		System.out.print("請輸入六位同學的分數: "); 
		int grade [] = new int[6]; 
		for(int i=0; i<6; i++) {
			grade[i] = input.nextInt(); 
		   }
		GRADE(grade);
		}
	
	public static void GRADE(int array[]) {
		for(int k=0; k<6; k++) {
			if(array[k]>=90) {
		        System.out.println("第" + k + "位同學的分數是 " + array[k] + ", 級分是 " + " A+ ");
		    } 
		    else if(array[k]>=85 && array[k]<=89) {
			    System.out.println("第" + k + "位同學的分數是 " + array[k] + ", 級分是 " + " A ");
		    }
		    else if(array[k]>=80 && array[k]<=84) {
			    System.out.println("第" + k + "位同學的分數是 " + array[k] + ", 級分是 " + " A- ");
		    }
		    else if(array[k]>=75 && array[k]<=79) {
			    System.out.println("第" + k + "位同學的分數是 " + array[k] + ", 級分是 " + " B+ ");
		    }
		    else if(array[k]>=70 && array[k]<=74) {
			    System.out.println("第" + k + "位同學的分數是 " + array[k] + ", 級分是 " + " B ");
		    }
		    else if(array[k]>=60 && array[k]<=69) {
			    System.out.println("第" + k + "位同學的分數是 " + array[k] + ", 級分是 " + " C ");
		    }
		    else {
			    System.out.println("第" + k + "位同學的分數是 " + array[k] + ", 級分是 " + " D ");
		    }
	    }
	}
}
