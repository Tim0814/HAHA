package test3;

public class InstanceOf {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		 Object object1 = new Circle(1); //多型性
		 Object object2 = new Rectangle(1,1); //多型性
	     displayObject(object1);
	     displayObject(object2);
	     
	     //或是這樣寫
	     System.out.println();
	     displayObject(new Circle(1));
	     displayObject(new Rectangle(1,1));
	}
	
    public static void displayObject(Object object) { //泛型程式設計
    	if(object instanceof Circle) {
    		System.out.printf("The circle area is %.2f",((Circle)object).getArea());
    		System.out.println();
    		System.out.println("The circle radius is " + ((Circle)object).getRadius());
    	}
    	
    	else if(object instanceof Rectangle) {
    		System.out.println("The rectangle area is " + ((Rectangle)object).getArea());
    		System.out.println("The rectangle length is " + ((Rectangle)object).getLength());
    		System.out.println("The rectangle width is " + ((Rectangle)object).getWidth());
    	}
    	
    }
}
