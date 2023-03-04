package test4;

public class Public {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		Circle circle1 = new Circle();    
		System.out.printf("radius of circle1 is %d\n", circle1.radius);    
		System.out.printf("area of circle1 is %.2f\n\n", circle1.area());  
		
		Circle circle2 = new Circle(5);    
		System.out.printf("radius of circle2 is %d\n", circle2.radius);    
		System.out.printf("area of circle2 is %.2f", circle2.area());
		}
	}

        //create a Circle class
        class Circle { //�Ĥ@�Ӧr���j�g
        //data member
        int radius;
        //member function, methods
        //constructor,�غc��k�A�غc�禡�A�u�n��k���W�ٻP���O�W�κ٬ۦP�A�٤�
        //��A�إߤ@�Ӧ����O������ɡA���|�۰ʰ���A�ӥB���i�H����ƫ��A
        //overloading function, �禡�W�٤@�ˡA���Oñ�W���@��
        
        public Circle() {
	        System.out.printf("executing Circle() constructor...\n");    
	        radius = 1;
	    }
        
        public Circle(int r) {    
            System.out.printf("executing Circle(int r) constructor...\n");    
            radius = r;
        }
        
        public double area() {    
            return radius *radius * Math.PI;
        }
    }

