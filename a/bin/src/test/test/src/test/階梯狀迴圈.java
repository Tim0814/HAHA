package test;

public class 階梯狀迴圈 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
        for(int i=1; i<10; i++) {
        	for(int j=i; j<10; j++) {
        		System.out.printf("%2d",j);
        	}
            System.out.println();
        }
        System.out.println();
        
        for(int i=1; i<10; i++) {
        	for(int j=1; j<=i; j++) {
        		System.out.printf("%2d",j);
        	}
        	System.out.println();
        }
	}
	

}
