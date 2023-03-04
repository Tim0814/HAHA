package test3;

public class InstanceOf {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		 Object object1 = new Circle(1); //�h����
		 Object object2 = new Rectangle(1,1); //�h����
	     displayObject(object1);
	     displayObject(object2);
	     
	     //�άO�o�˼g
	     System.out.println();
	     displayObject(new Circle(1));
	     displayObject(new Rectangle(1,1));
	}
	
    public static void displayObject(Object object) { //�x���{���]�p
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
