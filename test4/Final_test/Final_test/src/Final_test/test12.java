package Final_test;

public class test12 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Rectangle rec1 = new Rectangle();
		Circle cir1 = new Circle();
        DisplayArea(rec1);
        DisplayArea(cir1);
	}
    public static void DisplayArea(point obj) { 
	     System.out.printf("%.2f", obj.area());
    }
    public static void DisplayPerimeter(point obj) { 
	     System.out.printf("%.2f", obj.perimeter());
    }
    
	class Circle extends point { 
	    private int radius;
	    public Circle() {
	        radius = 2;
	    }

	    public Circle(int radius) {    
	        this.radius = radius;
	    }

	    public int getRadius() { 
		    return radius;
	    }

		public void setRadius(int newRadius) {
			radius = newRadius;    
		}    
		 
	    public double area() {    
	        return radius * radius * Math.PI;
	    }
	    
	    public double perimeter() {    
	        return radius * 2 * Math.PI;
	    }
    }
}