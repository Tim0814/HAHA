package test3;

public class OverrideAndOverload {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		A a = new A(); 
        a.p(10); //�p�G�l���O������O����k�W�١Bñ�W(��ƫ��A)���@�ˡA�ѼƷ|�u����ܤl���O(�мgOverride)
        a.p(10.0); //���D�l���O��k�̭���ñ�W(��ƫ��A)���ŦX�~�|��������O(�h��Overload)
    } 
} 

class B { 
    public void p(double i) { 
        System.out.println(2 * i); 
    } 
} 

class A extends B { 
    public void p(double i) { 
        System.out.println(i); 
        super.p(i);  //super����~�Ӥ����O���غc���Τ�k�A�o�̪�super�O���V�W�����ӦW�٬�a������
    } 
} 

