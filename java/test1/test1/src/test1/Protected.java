package test1;

public class Protected {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		C2 objC2 = new C2();  
        objC2.m(); //�ѩ�class C2�S��m()��k�ҥH�V�W��C1��m()��k
        objC2.print(); 
    } 
} 
 
class C1 { 
    public int x; //public�ϦP�@��package�̪��Ҧ����O���i�H�ϥ�
    protected int y; //protected����~�Ӧۤ����OC1���l���O�i�H�ϥ�(�~�ӱM�έ׹���)
    int z; //�S�������ܴN�O�w�]package�A�u����C1�b�P�@�Ӥ����̪��i�H�ϥ�
    private int u; //private�u��C1���O�����i�H�ϥΡA���K�ʳ̰�

    protected void m() { 
        System.out.println("Hello, Java\n"); 
    } 
} 

class C2 extends C1 { 
    public C2() { 
        x = 1; 
        y = 2;  
        z = 3; 
        //�ѩ�u�O�]�w��private�A�ҥH���P��class�L�k�s��
    } 

    protected void print() { 
        System.out.printf("x=%d, y=%d, z=%d\n", x, y, z); 
    } 
}
