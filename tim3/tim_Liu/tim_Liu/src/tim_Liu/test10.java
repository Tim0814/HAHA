package tim_Liu;
import java.util.Scanner;
public class test10 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		Scanner input = new Scanner(System.in);
        int year1,year2;
		System.out.print("�п�J��Ӧ~��:");
        year1 = input.nextInt();
        year2 = input.nextInt();
    
        leapyear(year1,year2);
    
	} 
    public static void leapyear(int yr1,int yr2) {
    	int count=0;
		for(int i=yr1; i<yr2; i++) {
		if ((i%400==0) || (i%4==0 && i%100!=0)) {
			System.out.print(i+" ");
	        count+=1 ;
		}
		
	    if (count==10){
	    	System.out.println();
	        count=0 ;
	    }
    }
    }
}
