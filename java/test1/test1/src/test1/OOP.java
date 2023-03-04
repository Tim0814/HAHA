package test1;

import java.util.Scanner;

public class OOP {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		//oop(object-oriented programming)
				//oopl(object-oriented programming language)
				//C++比較好的OOPL 
				//Java cross platform 

				//OOP 的特性: Encapsulation(封裝)，Inheritance(繼承)，Polymorphism(多型)
				//節省開發時間，維護成本
				//class 類別，object 物件
				//class --- data type, object --- variable
				//內建資料型態，int, float, double
				//衍生資料型態，array, structure, class
				//class contains data member(variable), member function(function, method)

				//three areas: public, private, protected, data member基本上會放在private
				//只有此類別內的member function 才可以直接使用
				//但可以間接使用
				//circle 計算面積，半徑，Math.PI(3.14159)

				int radius;
				double area;
				Scanner input = new Scanner(System.in);
				System.out.printf("Enter the radius: ");
				radius = input.nextInt();
					    
				area = radius * radius * Math.PI;
				System.out.printf("radius: %d, area: %.2f", radius, area);
	}
}
