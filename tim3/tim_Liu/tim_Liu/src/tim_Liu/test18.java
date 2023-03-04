package tim_Liu;

public class test18 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub

	}

}

class Circle extends point { 

    private int radius;

    public Circle() {
        radius = 1;
    }

    public Circle(int r) {    
        radius = r;
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