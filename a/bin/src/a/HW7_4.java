package a;
import java.util.Scanner;
public class HW7_4 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Scanner input = new Scanner(System.in);
        double grades[] = new double[100];
 	    double count = 0;
  	    double tot = 0;
        double enter = 0;
            for(int i=0; i<=99; i++) {            
            	System.out.print("Pls enter grades:");
          	    enter = input.nextDouble();
                if(enter<0) {break;}
          	    grades[i] = enter;
            	tot += enter;
                count++;
            }
        
            double aver = tot/count;
            double LowerThanAverage = 0;
            double HigherThanAverage = 0;
        	for(int j=0; j<=99; j++) {
        		if(grades[j]<aver && grades[j]!=0) {LowerThanAverage++;}
        		else if(grades[j]>=aver && grades[j]!=0) {HigherThanAverage++;}
        	}
            	System.out.println("有" + LowerThanAverage + "筆成績低於平均");
            	System.out.println("有" + HigherThanAverage + "筆成績高於平均");
        }     
    }
	

