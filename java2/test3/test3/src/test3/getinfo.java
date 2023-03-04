package test3;

public class getinfo {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		new Person().printPerson(); 
        new Student().printPerson(); //因為Student類別沒有printPerson()方法，所以往父類別Person找printPerson()
        System.out.println(new Student().getInfo()); 
    } 
} 

class Student extends Person { 
	public String getInfo() { //Student的getInfo()方法的修飾字是public
        return "Student"; 
    } 
} 

class Person { 
	private String getInfo() { //Person的getInfo()方法的修飾字是private，由於跟Student的getInfo()不一樣，所以不會Override
        return "Person"; 
    }

    public void printPerson() { 
    	System.out.println(getInfo()); //把getInfo()方法裡的字串印出來(是印Person，不是印Student)
    } 
}
