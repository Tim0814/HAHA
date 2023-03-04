package test1;

public class Private {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Circle circle1 = new Circle();    
		System.out.printf("radius of circle1 is %d\n", circle1.getRadius());    
		System.out.printf("area of circle1 is %.2f\n\n", circle1.getArea());    
		
		Circle circle2 = new Circle(5);    
		System.out.printf("radius of circle2 is %d\n", circle2.getRadius());    
		System.out.printf("area of circle2 is %.2f\n\n", circle2.getArea());
		
		circle2.setRadius(10); //已更改原半徑5至10
		System.out.printf("radius of circle2 is %d\n", circle2.getRadius());    
		System.out.printf("area of circle2 is %.2f", circle2.getArea());
		}
	}

        //create a Circle class
        class Circle { //第一個字母大寫
        //data member
        private int radius;
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
        
        public int getRadius() { //用public的方法把private的物件導出，不然沒辦法給其他的class存取
        	return radius;
        }
        
      	public void setRadius(int newRadius) { //能夠更改半徑的長度
       		radius = newRadius;    
       	}    
      	 
        public double getArea() {    
            return radius *radius * Math.PI;
        }
	}

