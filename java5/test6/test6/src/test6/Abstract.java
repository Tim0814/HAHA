package test6;

public class Abstract {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
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
		 System.out.printf("bottom left point is (%d, %d)\n", rec.getX(), rec.getY());    
		 System.out.printf("color is %s\n", rec.getColor());    
		 System.out.printf("length and width are %d, %d\n", rec.getLength(), rec.getWidth());    
		 System.out.printf("area is %.2f\n", rec.getArea());  
		 System.out.printf("perimeter is %.2f\n", rec.getPerimeter()); 
		 rec.setLength(12);    
		 rec.setWidth(8);    
		 rec.setXandY(10, 10);    
		 rec.setColor("blue");    
		 System.out.printf("\nAfter change something:\n");    
		 System.out.printf("bottom left point is (%d, %d)\n", rec.getX(), rec.getY());    
		 System.out.printf("color is %s\n", rec.getColor());    
		 System.out.printf("length and width are %d, %d\n", rec.getLength(), rec.getWidth());    
         System.out.printf("area is %.2f\n", rec.getArea());    
       
         triangle tri = new triangle();
		 System.out.printf("bottom left point is (%d, %d)\n", tri.getX(), tri.getY()); 
		 System.out.printf("bottom and high are %.2f, %.2f\n", tri.getBottom(), tri.getHigh());   
		 System.out.printf("and color is %s\n", tri.getColor());    
		 System.out.printf("area of tri is %.2f\n", tri.getArea());   
		 System.out.printf("perimeter of triangle is %.2f\n", tri.getPerimeter()); 
		 tri.setBottom(3);
		 tri.setHigh(4);
		 tri.setXandY(2,2);
		 System.out.printf("\nAfter change something:\n");  
		 System.out.printf("bottom left point is (%d, %d)\n", tri.getX(), tri.getY()); 
		 System.out.printf("bottom and high are %.2f, %.2f\n", tri.getBottom(), tri.getHigh());  
		 System.out.printf("area of tri is %.2f\n", tri.getArea()); 
		 System.out.printf("perimeter of triangle is %.2f\n", tri.getPerimeter()); 
		 tri.setBottom(10);
		 tri.setHigh(10);
		 tri.setXandY(4,5);
		 System.out.printf("\nAfter change something:\n");  
		 System.out.printf("bottom left point is (%d, %d)\n", tri.getX(), tri.getY()); 
		 System.out.printf("bottom and high are %.2f, %.2f\n", tri.getBottom(), tri.getHigh());  
		 System.out.printf("area of tri is %.2f\n", tri.getArea()); 
		 System.out.printf("perimeter of triangle is %.2f\n\n", tri.getPerimeter()); 	
		 
		 Shape geoObject1 = new Circle(5);
		 Shape geoObject2 = new Rectangle(5,3);
		 System.out.println("The two objects have the same area?" + equalArea(geoObject1,geoObject2));
		 
		 displayArea(geoObject1);
		 displayArea(geoObject2);
		 displayPerimeter(geoObject1);
		 displayPerimeter(geoObject2);
      }
   
   public static boolean equalArea(Shape obj1,Shape obj2) {
		 return obj1.getArea() == obj2.getArea(); //裡面的方法必須是父類別跟子類別都有的方法
   }
   
   public static void displayArea(Shape obj) {
	   System.out.println();
	   System.out.printf("The area is %.2f" , obj.getArea()); //裡面的方法必須是父類別跟子類別都有的方法
   }
   
   public static void displayPerimeter(Shape obj) {
	   System.out.println();
	   System.out.printf("The perimeter is %.2f" , obj.getPerimeter()); //裡面的方法必須是父類別跟子類別都有的方法
   }
 }

  //polymorphism多形
  //executing time才執行
  //base class, parent class, super class
    abstract class Shape {  //被定義為抽象的類別無法使用new運算子來建構，這工作由子類別來擔任
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
		 
		 abstract double getArea(); //由於幾何圖形都會有面積跟周長，但Shape本身用不到，所以預設一個空的抽象方法，方便子類別做覆寫使用
	     abstract double getPerimeter(); //沒有設的話依然能叫出子類別的面積跟周長，只是就沒辦法用多型的方式叫出來，只能直接從子類別叫出來
		 //預設abstract的好處是:當你的父類別因為多型的關係，一定要設一個父類別本身用不到的方法的時候，用abstract可以節省時間，就不用再預設什麼參數跟回傳值了
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
      	 return 2*(length+width);
    }  
}
  
  class triangle extends Shape {
	 private double bottom, high;
	 public triangle() {
		 bottom = 1;
		 high = 1;
	 }
	 
	 public triangle(double bottom,double high) {
		 this.bottom = bottom;
		 this.high = high;
	 }
	 
	   
    public void setBottom(double newbottom) {        
	     bottom = newbottom;    
    }    
  
    public void setHigh(double newhigh) {        
	     high = newhigh;    
    }   
  
	 public double getBottom() {        
 		 return bottom;    
 	 }    
 	 
 	 public double getHigh() {        
 		 return high;     
 	 }    
 	 
 	 public double getArea() {
 		 return (bottom * high)/2;
 	 }
 	 
    public double getPerimeter() {
      	 return bottom + high + Math.sqrt(Math.pow(bottom,2)+Math.pow(high,2));
    }   
}
