package test3;

public class getinfo {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		new Person().printPerson(); 
        new Student().printPerson(); //�]��Student���O�S��printPerson()��k�A�ҥH�������OPerson��printPerson()
        System.out.println(new Student().getInfo()); 
    } 
} 

class Student extends Person { 
	public String getInfo() { //Student��getInfo()��k���׹��r�Opublic
        return "Student"; 
    } 
} 

class Person { 
	private String getInfo() { //Person��getInfo()��k���׹��r�Oprivate�A�ѩ��Student��getInfo()���@�ˡA�ҥH���|Override
        return "Person"; 
    }

    public void printPerson() { 
    	System.out.println(getInfo()); //��getInfo()��k�̪��r��L�X��(�O�LPerson�A���O�LStudent)
    } 
}
