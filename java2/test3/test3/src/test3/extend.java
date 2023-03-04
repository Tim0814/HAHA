package test3;

public class extend {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		Circle circle1 = new Circle();    
		 System.out.printf("center of circle is (%d, %d) ", circle1.getX(), circle1.getY());    
		 System.out.printf("and color is %s\n", circle1.getColor());    
		 System.out.printf("radius of circle1 is %d\n", circle1.getRadius());    
		 System.out.printf("area of circle1 is %.2f\n\n", circle1.getArea());  
		 
		 Circle circle2 = new Circle(5);    
		 circle2.setXandY(8, 8);    
		 circle2.setColor("yellow");    
		 System.out.printf("center of circle is (%d, %d) ", circle2.getX(), circle2.getY());    
		 System.out.printf("and color is %s\n", circle2.getColor());    
		 System.out.printf("radius of circle2 is %d\n", circle2.getRadius());    
		 System.out.printf("area of circle2 is %.2f\n\n", circle2.getArea());   
		 circle2.setRadius(10);
		 System.out.printf("radius of circle2 is %d\n", circle2.getRadius());    
		 System.out.printf("area of circle2 is %.2f\n\n", circle2.getArea());    
		 
		 Rectangle rec = new Rectangle();    
		 System.out.printf("Rectangle object:\n");    
		 System.out.printf("top left point is (%d, %d)\n", rec.getX(), rec.getY());    
		 System.out.printf("color is %s\n", rec.getColor());    
		 System.out.printf("length and width are %d, %d\n", rec.getLength(), rec.getWidth());    
		 System.out.printf("area is %.2f\n", rec.getArea());  
		 
		 //change length and width    
		 rec.setLength(12);    
		 rec.setWidth(8);    
		 rec.setXandY(10, 10);    
		 rec.setColor("blue");    
		 System.out.printf("\nAfter change something:\n");    
		 System.out.printf("top left point is (%d, %d)\n", rec.getX(), rec.getY());    
		 System.out.printf("color is %s\n", rec.getColor());    
		 System.out.printf("length and width are %d, %d\n", rec.getLength(), rec.getWidth());    
         System.out.printf("area is %.2f\n", rec.getArea());    
        
         //�B�z�h��    
         System.out.printf("\npolymorphism:\n");    
         System.out.printf("\ncircle2 area is ");    
         displayArea(circle2);   
         System.out.printf("\ncircle2 perimeter is ");    
         displayPerimeter(circle2); 
         System.out.println();
         System.out.print("\nrec area is ");    
         displayArea(rec);
         System.out.printf("\nrec perimeter is ");    
         displayPerimeter(rec); 
        }
	
	public static void displayArea(Shape obj) {    
	    System.out.printf("%.2f", obj.getArea()); //�o�̭�����k�����O�����O��l���O��������k
	}
	
	public static void displayPerimeter(Shape obj) {    
	    System.out.printf("%.2f", obj.getPerimeter()); //�o�̭�����k�����O�����O��l���O��������k
	}
	
}

    //polymorphism�h��
    //executing time�~����
    //base class, parent class, super class
    class Shape {    
   	 private int x, y;    
   	 private String color;    
   	 //constructor
   	 
		 protected Shape() {        
			 x = 0;        
			 y = 0;         
			 color = "green";    
		 }    
		 
		 protected Shape(int newX, int newY, String newColor) {        
			 x = newX;        
			 y = newY;        
			 color = newColor;    
	     }    
		 
		 //getter method defition    
		 protected int getX() {        
			 return x;    
		 }    
		 
		 protected int getY() {        
			 return y;    
		 }    
		 
		 protected String getColor() {        
			 return color;    
		 }    
		 
		 //setter method definition    
		 protected void setXandY(int newX, int newY) {        
			 x = newX;        
			 y = newY;    
		 }    
		 
		 protected void setColor(String newColor) {        
			 color = newColor;    
		 }   
		 
		 protected double getArea() {
		        return 0;      
		 }
		 
		 protected double getPerimeter() {
		        return 0;      
		 }
		 //�n���b�����O�]�mgetArea()��getPerimeter()�A���M�S��k�ϥ�displayArea()��displayPerimeter()�A�]�������d��OShape�̪��Ҧ���ƫ��A���k
	   }
    //derived class, children class, subclass
    class Circle extends Shape {    
   	 private int radius;    
   	 public Circle() {        
   		 radius = 1;        
   		 System.out.printf("Executing Circle() constructor\n");    
   	 }    
   	 
   	 public Circle(int r) {     
   		 radius = r;
         System.out.printf("Executing Circle(int r) constructor\n");     
     }    
   	 
   	 public int getRadius() {        
   		 return radius;    
   	 }    
   	 
   	 public void setRadius(int newRadius) {        
   		 radius = newRadius;    
   	 }    
   	 
   	 public double getArea() {    
   		 return radius * radius * Math.PI;    
   	 }
   	 
     public double getPerimeter() {
       	 return 2 * radius * Math.PI;
     }
    }
    
    //derived class
    class Rectangle extends Shape {    
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
   	 
   	 public double getArea() {        
   		 return length * width;    
   	 } 
   	 
	 public double getPerimeter() {
	        return 0;      
	 }
	}

