package test1;


public class Faculty extends Employee{ //Faculty�~�Ӧ�Employee

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		new Faculty(); //�s�XFaculty���L�Ѽƫغc�禡(�U�����@��)
	}
	
	public Faculty() {
	    System.out.println("(4) Performs Faculty's tasks"); //�ѩ�Faculty�O�b�̤U�h���l���O�A�ҥHFaculty�̪��F��|�̫�~�]�X��(�ĥ|��)
	}
}

class Employee extends Person { //Employee�~�Ӧ�Person
	public Employee() {
		this("(2) Invoke Employee's overloaded constructor"); //�ѩ�this(arg-list)���ԭz�n�m��غc�����Ĥ@��A�ҥHthis()���w���r��|���]�X��(�ĤG��)
		System.out.println("(3) Performs Employee's tasks"); //�n���]�����OEmployee�~�|����Faculty(�ĤT��)
		
	}  
	
	public Employee(String s) { //this�O���V�P���O�̦�(�r��)�Ѽƪ�Employee
		System.out.println(s); 
	}
}

class Person { //Person�O�̤W���������O(���]�tObject����)�A�ҥH�|�OPerson�̭����F���print�X��
	public Person() {
		System.out.println("(1) Performs Person's tasks"); //�n���]�����OPerson�~�|����Employee(�Ĥ@��)
	}
}
