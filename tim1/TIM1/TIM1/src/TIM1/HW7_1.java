package TIM1;
import java.util.Scanner;
public class HW7_1 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int best;
		Scanner input = new Scanner(System.in);
		System.out.print("Pls enter the number of students: "); //問有幾位學生
		int num = input.nextInt(); //學生數

		System.out.print("Enter " + num + " scores: "); //每位學生的分數
		int grade [] = new int[num]; //建立一個專門存取分數的陣列
		for(int i=0; i<num; i++) {
			grade[i] = input.nextInt(); //讀取每位學生的分數放進grade陣列
		}
		best = grade[0]; //先令第0項的學生為最高分
		for(int j=1; j<num; j++) {
			if(grade[j]>best) { //如果後面有其他學生比前一項的高
				best = grade[j]; //最高分換人當
	        }
		}
		for(int k=0; k<num; k++) {
		    if(grade[k]>=(best-5)) {
		        System.out.println("Students " + k + " score is " + grade[k] + " and grade is " + " A ");
		    } 
		    else if(grade[k]>=(best-10)) {
			    System.out.println("Students " + k + " score is " + grade[k] + " and grade is " + " B ");
		    }
		    else if(grade[k]>=(best-15)) {
			    System.out.println("Students " + k + " score is " + grade[k] + " and grade is " + " C ");
		    }
		    else if(grade[k]>=(best-20)) {
			    System.out.println("Students " + k + " score is " + grade[k] + " and grade is " + " D ");
		    }
		    else {
			    System.out.println("Students " + k + " score is " + grade[k] + " and grade is " + " F ");
		    }
	    }
	}
}
