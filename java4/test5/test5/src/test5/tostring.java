package test5;

public class tostring {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		m(new GraduateStudent()); //(1)�g�k
        m(new Student()); 
        m(new Person()); 
        m(new Object()); //Object���w�]�@��toString()��k�A�|�^�Ǫ��󪺦W�١B@�Ÿ��A�٦�����b�O���骺��}(�H16�i����)[ex:java.lang.Object@49e4cb85]
        
    	Object d = new Object(); //(2)�g�k
    	Object c = new Person();
    	Object b = new Student();
    	Object a = new GraduateStudent();
    	m(a);
    	m(b);
    	m(c);
    	m(d);
    } 
	
    public static void m(Object x) { //�h���Ϊk:�A���̭����Ѽƭn�]�̷��Y�B�̤W�h��[�����O](�o�̪�����30�檺Object)�Aprint�X�Ӫ�����d��O�HObject�V�U������(�~��)���l���O
        System.out.println(x.toString()); //�N���h�����\��O�t�d��X���󪺦r��
    } 
} 

class GraduateStudent extends Student { //GraduateStudent�~�Ӧ�Student
//�p�G�l���O�̭��S��toString()��k�A�|�w�]�@��super()[���ê�]�A�ë��V������O�A�ݤ����O���S��toString()����k�A�����ܴN�M�Τ����O��toString()��k�A�S�����ܷ|�A���W����
} 

class Student extends Person { 
	@Override 
    public String toString() { //toString�|�^�Ǧ����󪺦r��
		return "Student"; 
    } 
} 

class Person extends Object { //Student�~�Ӧ�Object�AObject�O�{�������w�]��(�u�O���ɳQ���ð_��)�A�L�קA���h�֭Ӥ����O�A�̪쪺���Y���Ojava.lang.Object�����O(�l��������??�Ҧ��y�ж׻E�b�@�_)
	@Override 
    public String toString() { //�ѩ����OPerson�W���٦����ä@��Object���O�A�ҥH�n�g�@�Ӥ@�˦W�r��toString()��k�bPerson���O�A�л\Object��toString()��k
		return "Person"; 
    } 
}

