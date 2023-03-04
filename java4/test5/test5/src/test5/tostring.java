package test5;

public class tostring {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		m(new GraduateStudent()); //(1)寫法
        m(new Student()); 
        m(new Person()); 
        m(new Object()); //Object有預設一個toString()方法，會回傳物件的名稱、@符號，還有物件在記憶體的位址(以16進位表示)[ex:java.lang.Object@49e4cb85]
        
    	Object d = new Object(); //(2)寫法
    	Object c = new Person();
    	Object b = new Student();
    	Object a = new GraduateStudent();
    	m(a);
    	m(b);
    	m(c);
    	m(d);
    } 
	
    public static void m(Object x) { //多型用法:括號裡面的參數要設最源頭、最上層的[父類別](這裡的為第30行的Object)，print出來的物件範圍是以Object向下做延伸(繼承)的子類別
        System.out.println(x.toString()); //代表此多型的功能是負責輸出物件的字串
    } 
} 

class GraduateStudent extends Student { //GraduateStudent繼承自Student
//如果子類別裡面沒有toString()方法，會預設一個super()[隱藏的]，並指向其父類別，看父類別有沒有toString()的方法，有的話就套用父類別的toString()方法，沒有的話會再往上面找
} 

class Student extends Person { 
	@Override 
    public String toString() { //toString會回傳此物件的字串
		return "Student"; 
    } 
} 

class Person extends Object { //Student繼承自Object，Object是程式本身預設的(只是平時被隱藏起來)，無論你有多少個父類別，最初的源頭都是java.lang.Object父類別(始祖的概念??所有座標匯聚在一起)
	@Override 
    public String toString() { //由於類別Person上方還有隱藏一個Object類別，所以要寫一個一樣名字的toString()方法在Person類別，覆蓋Object的toString()方法
		return "Person"; 
    } 
}

