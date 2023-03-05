package Final_test;

public class test11 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub

	}

}
abstract class point {    
 	 private int x, y;    
		 protected point() {        
			 x = 0;        
			 y = 0;           
		 }    
		 
		 protected point(int x, int y) {        
			 this.x = x;        
			 this.y = y;        
	     }    

		 protected int getXpoint() {        
			 return x;         
		 }    
		 protected int getYpoint() {        
			 return y;  
		 }    
		 
		 protected void setXpoint(int newX) {        
			 x = newX;         
		 }    
		 protected void setYpoint(int newY) {        
			 y = newY;         
		 }  
		 abstract double area(); 
		 abstract double perimeter();
}