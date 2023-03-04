package test2;

public class polymorphism {

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
         System.out.printf("circle2 area is ");    
         displayArea(circle2);    
         System.out.printf("\nrec area is ");    
         displayArea(rec);
         
         System.out.println("\n");
         Cylinder Cy1 = new Cylinder();
         System.out.printf("area of cylinder1 is %.2f",Cy1.getArea());
         Cy1.setHigh(10);
         System.out.print("\ncylinder area is ");
         displayArea(Cy1);
	}
	
	     public static void displayArea(Shape obj) { //�h���Ϊk:�A���̭����Ѽƭn�]�̷��Y�B�̤W�h��[�����O](�o�̪�����70�檺Shape)�Aprint�X�Ӫ�����d��O�HShape�V�U������(�~��)���l���O
		     System.out.printf("%.2f", obj.getArea()); //�N���h�����\��O�t�d��X���󪺭��n
	     }
	     
	     public static void displayPerimeter(Shape obj) {    
		     System.out.printf("%.2f", obj.getPerimeter()); //�N���h�����\��O�t�d��X���󪺩P��
	     }
	     //�h���������N�O�����O���ܼƯ�ѦҨ�l���O����
   }
    //polymorphism�h��
    //executing time�~����
    //base class, parent class, super class
    class Shape  {    
   	 private int x, y;    
   	 private String color;    
   	 //constructor
	 public Shape() {        
		 x = 0;        
		 y = 0;         
		 color = "green";    
	 }    
		 
	 public Shape(int newX, int newY, String newColor) {        
		 x = newX;        
		 y = newY;        
		 color = newColor;    
	 }    
		 
	 //getter method defition    
	 public int getX() {        
		 return x;    
	 }    
		 
	 public int getY() {        
		 return y;    
	 }    
		 
	 public String getColor() {        
		 return color;    
	 }    
		 
	 //setter method definition    
	 public void setXandY(int newX, int newY) {        
		 x = newX;        
		 y = newY;    
	 }    
		 
	 public void setColor(String newColor) {        
		 color = newColor;    
	 }   
		 
	 public double getArea() {
		 return 0;      
	 }
		 
	 public double getPerimeter() {
		 return 0;      
	 }
	}
    
    //derived class, children class, subclass
    class Circle extends Shape {    
   	 private int radius = 1;    
   	 public Circle() {               
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
   		return 2 * (length + width);
   	 }
    }
    
    class Cylinder extends Circle {
	 Circle c1 = new Circle();
	 private int high;
	
     public Cylinder() {
    	high = 2;
     }
    
     public Cylinder(int h) {
    	high = h;
     }
    
     public void setHigh(int newHigh) {
    	high = newHigh;
     }
    
     public int getHigh() {
    	return high;
     }
    
     public double getArea() {
    	return c1.getRadius() * c1.getRadius() * Math.PI * high; 
     } //�]���bcircle���O��radius�O���i����(private)�A�ҥH�n��circle���O��getRadius()��k�ɥX��
   }


