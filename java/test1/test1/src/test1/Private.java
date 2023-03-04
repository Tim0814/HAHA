package test1;

public class Private {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		Circle circle1 = new Circle();    
		System.out.printf("radius of circle1 is %d\n", circle1.getRadius());    
		System.out.printf("area of circle1 is %.2f\n\n", circle1.getArea());    
		
		Circle circle2 = new Circle(5);    
		System.out.printf("radius of circle2 is %d\n", circle2.getRadius());    
		System.out.printf("area of circle2 is %.2f\n\n", circle2.getArea());
		
		circle2.setRadius(10); //�w����b�|5��10
		System.out.printf("radius of circle2 is %d\n", circle2.getRadius());    
		System.out.printf("area of circle2 is %.2f", circle2.getArea());
		}
	}

        //create a Circle class
        class Circle { //�Ĥ@�Ӧr���j�g
        //data member
        private int radius;
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
        
        public int getRadius() { //��public����k��private������ɥX�A���M�S��k����L��class�s��
        	return radius;
        }
        
      	public void setRadius(int newRadius) { //������b�|������
       		radius = newRadius;    
       	}    
      	 
        public double getArea() {    
            return radius *radius * Math.PI;
        }
	}

