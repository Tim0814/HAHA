package tim_Liu;

public class test7 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int i,j;
        int k=0;
        
        for(i=2; i<=100; i++) {
        	for(j=2; j<=i; j++) {
        		if(i%j==0) {
        			break;
        		}
        	}
        	
        	if(j>=i) {
        		k++;
        		System.out.print(i+"\t");
        	}
        	if(k>=10) {
        		System.out.println();
        		k=0;
        	}
        }   
	}
}
