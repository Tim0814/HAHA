package tim_Liu;


public class test16 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub

	}

}
class Rectangle extends point {    
  	 private int length, width;    
  	 public Rectangle() {        
  		 length = 1;        
  		 width = 1;    
  	 }    
  	 
  	 public Rectangle(int len, int wid) {        
  		 length = len;        
  		 width = wid;    
  	 }    
  	 
  	 //getter    
  	 public int getLength() {        
  		 return length;    
  	 }    
  	 
  	 public int getWidth() {        
  		 return width;     
  	 }    
  	 
  	 //setter    
  	 public void setLength(int newLength) {        
  		 length = newLength;    
  	 }    
  	 
  	 public void setWidth(int newWidth) {        
  		 width = newWidth;    
  	 }    
  	 
  	 public double area() {        
  		 return length * width;    
  	 } 
  	 
	 public double perimeter() {
	        return 0;      
	 }
}