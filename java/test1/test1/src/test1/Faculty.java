package test1;


public class Faculty extends Employee{ //Faculty繼承自Employee

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		new Faculty(); //叫出Faculty的無參數建構函式(下面那一個)
	}
	
	public Faculty() {
	    System.out.println("(4) Performs Faculty's tasks"); //由於Faculty是在最下層的子類別，所以Faculty裡的東西會最後才跑出來(第四位)
	}
}

class Employee extends Person { //Employee繼承自Person
	public Employee() {
		this("(2) Invoke Employee's overloaded constructor"); //由於this(arg-list)的敘述要置於建構式的第一行，所以this()指定的字串會先跑出來(第二位)
		System.out.println("(3) Performs Employee's tasks"); //要先跑父類別Employee才會輪到Faculty(第三位)
		
	}  
	
	public Employee(String s) { //this是指向同類別裡有(字串)參數的Employee
		System.out.println(s); 
	}
}

class Person { //Person是最上面的父類別(不包含Object的話)，所以會是Person裡面的東西先print出來
	public Person() {
		System.out.println("(1) Performs Person's tasks"); //要先跑父類別Person才會輪到Employee(第一位)
	}
}
