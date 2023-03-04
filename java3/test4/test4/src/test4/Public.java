package test4;

public class Public {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Circle circle1 = new Circle();    
		System.out.printf("radius of circle1 is %d\n", circle1.radius);    
		System.out.printf("area of circle1 is %.2f\n\n", circle1.area());  
		
		Circle circle2 = new Circle(5);    
		System.out.printf("radius of circle2 is %d\n", circle2.radius);    
		System.out.printf("area of circle2 is %.2f", circle2.area());
		}
	}

        //create a Circle class
        class Circle { //第一個字母大寫
        //data member
        int radius;
        //member function, methods
        //constructor,建構方法，建構函式，只要方法的名稱與類別名或稱相同，稱之
        //當你建立一個此類別的物件時，它會自動執行，而且不可以有資料型態
        //overloading function, 函式名稱一樣，但是簽名不一樣
        
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

