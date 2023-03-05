package Final_test;

public class test10 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
        Rectangle rec1 = new Rectangle();
		rec1.setXpoint(-1);
		System.out.print("左上角座標等於:" + "(" + rec1.getXpoint() + ", " + rec1.getYpoint() + ")");

		Rectangle rec2 = new Rectangle(10,5);
		rec2.setXpoint(-10);
		System.out.print("左上角座標等於:" + "(" + rec2.getXpoint() + ", " + rec2.getYpoint() + ")");
	}
}
	class Rectangle extends point {    
	  	 private int length, width;    
	  	 protected Rectangle() {        
	  		 length = 1;        
	  		 width = 1;    
	  	 }    
	  	 
	  	 protected Rectangle(int length, int width) {        
	  		 this.length = length;        
	  		 this.width = width;    
	  	 }    
   
	   	 protected int getLength() {        
	  		 return length;    
	  	 }    
	  	 
	   	protected int getWidth() {        
	  		 return width;     
	  	 }    
	  	 
	  	 //setter    
	  	 protected void setLength(int newLength) {        
	  		 length = newLength;    
	  	 }    
	  	 
	  	 protected void setWidth(int newWidth) {        
	  		 width = newWidth;    
	  	 }    
	  	 
	  	 public double area() {        
	  		 return length * width;    
	  	 } 
	  	 
		 public double perimeter() {
		     return (length+width)*2;      
		 }
	}
