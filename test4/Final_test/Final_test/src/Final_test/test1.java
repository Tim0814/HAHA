package Final_test;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Scanner input = new Scanner(System.in);
		System.out.print("請輸入六位同學的分數: "); 
		int grade [] = new int[6]; 
		for(int i=0; i<6; i++) {
			grade[i] = input.nextInt(); 
		}
		for(int k=0; k<6; k++) {
			if(grade[k]>=90) {
		        System.out.println("第" + k + "位同學的分數是 " + grade[k] + ", 級分是 " + " A+ ");
		    } 
		    else if(grade[k]>=85 && grade[k]<=89) {
			    System.out.println("第" + k + "位同學的分數是 " + grade[k] + ", 級分是 " + " A ");
		    }
		    else if(grade[k]>=80 && grade[k]<=84) {
			    System.out.println("第" + k + "位同學的分數是 " + grade[k] + ", 級分是 " + " A- ");
		    }
		    else if(grade[k]>=75 && grade[k]<=79) {
			    System.out.println("第" + k + "位同學的分數是 " + grade[k] + ", 級分是 " + " B+ ");
		    }
		    else if(grade[k]>=70 && grade[k]<=74) {
			    System.out.println("第" + k + "位同學的分數是 " + grade[k] + ", 級分是 " + " B ");
		    }
		    else if(grade[k]>=60 && grade[k]<=69) {
			    System.out.println("第" + k + "位同學的分數是 " + grade[k] + ", 級分是 " + " C ");
		    }
		    else {
			    System.out.println("第" + k + "位同學的分數是 " + grade[k] + ", 級分是 " + " D ");
		    }
	    }
	}
}
