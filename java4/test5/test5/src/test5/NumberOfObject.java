package test5;

public class NumberOfObject {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		Circle circle1 = new Circle();    
		System.out.printf("radius of circle1 is %d\n", circle1.getRadius());    
		System.out.printf("area of circle1 is %.2f\n\n", circle1.area());    
		Circle circle2 = new Circle(5);    
		System.out.printf("radius of circle2 is %d\n", circle2.getRadius());    
		System.out.printf("area of circle2 is %.2f\n\n", circle2.area());    
		circle2.setRadius(10);    
		System.out.printf("radius of circle2 is %d\n", circle2.getRadius());    
		System.out.printf("area of circle2 is %.2f\n\n", circle2.area());    
		Circle circle3 = new Circle(15);    
		System.out.printf("radius of circle3 is %d\n", circle3.getRadius());    
		System.out.printf("area of circle3 is %.2f\n\n", circle3.area());    
		System.out.printf("circle objects: %d", Circle.getNumberOfObject());
		}

	        //create a Circle class 
            private static class Circle { //�Ĥ@�Ӧr���j�g
			//data member
			private int radius; //�S���]static�A�N��Ҧ����󳣬O���O�W�ߥΤ@��radius(A���b�|�]��1�AB���b�|�]��2�A�hA���b�|���|�ۤv��令2�AB���b�|�]���|�ۤv�ܦ�1)
			private static int numberOfObject; //static�O���@�Ϊ��N��A�N��Ҧ����󳣬O�@�ΦP�@��numberOfObject(�p�GA��numberOfObject�[1�A�hB���]�|��ۥ[1)
			//member function, methods
			//constructor,�غc��k�A�غc�禡�A�u�n��k���W�ٻP���O�W�κ٬ۦP�A�٤�
			//��A�إߤ@�Ӧ����O������ɡA���|�۰ʰ���A�ӥB���i�H����ƫ��A
			//overloading function, �禡�W�٤@�ˡA���Oñ�W���@��
			Circle() {
			    System.out.printf("executing Circle() constructor...\n");
			    radius = 1;
			    numberOfObject++;
			}
			    
			Circle(int r) {
			    System.out.printf("executing Circle(int r) constructor...\n");
			    radius = r;
			    numberOfObject++;
			}
			
			//setter   
			public void setRadius(int newRadius) {
			    radius = newRadius;
			}
			
			//getter
			public int getRadius() {
			    return radius;
			}
			//getter for numberOfObject
			public static int getNumberOfObject() { //�u��static���禡(��k)�~��I�sstatic����Ʀ���
				return numberOfObject;
			}
			
			public double area() {
			    return radius *radius * Math.PI;
			}
	   }
}
