package test5;

public class NumberOfObject {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
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
            private static class Circle { //第一個字母大寫
			//data member
			private int radius; //沒有設static，代表所有物件都是分別獨立用一個radius(A的半徑設為1，B的半徑設為2，則A的半徑不會自己更改成2，B的半徑也不會自己變成1)
			private static int numberOfObject; //static是指共用的意思，代表所有物件都是共用同一個numberOfObject(如果A的numberOfObject加1，則B的也會跟著加1)
			//member function, methods
			//constructor,建構方法，建構函式，只要方法的名稱與類別名或稱相同，稱之
			//當你建立一個此類別的物件時，它會自動執行，而且不可以有資料型態
			//overloading function, 函式名稱一樣，但是簽名不一樣
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
			public static int getNumberOfObject() { //只有static的函式(方法)才能呼叫static的資料成員
				return numberOfObject;
			}
			
			public double area() {
			    return radius *radius * Math.PI;
			}
	   }
}
