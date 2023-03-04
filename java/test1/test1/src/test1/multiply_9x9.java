package test1;

public class multiply_9x9 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		printstar();
		multiply();
		printstar();
	}
	
	public static void printstar() 
	{
		int i;
		for(i=1; i<=64 ; i++)
			System.out.printf("*");
		System.out.printf("\n");
	}
    
	public static void multiply()
	{
		int i , j;
		for(i=1 ; i<=9 ; i++) {
			for(j=1 ; j<=9 ; j++) {
				System.out.printf("%d*%d=%2d ",i,j,i*j);
			}
			System.out.print("\n");
		}
	}
}
