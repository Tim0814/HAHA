package tim_Liu;

public class test19 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		A a = new A(); 
        a.p("Hi","�A�n"); 
        a.p(10,20);
        a.p(10.0,20.0); 
        a.p(true,false); 

        
    } 
} 

class D {
	public void p(boolean i,boolean j) { 
    	boolean c;
        c=i;
        i=j;
        j=c;
        System.out.print(i+" "); 
        System.out.println(j+" ");
    } 
}

class C extends D { 
    public void p(double i,double j) { 
    	double c;
        c=i;
        i=j;
        j=c;
        System.out.print(i+" "); 
        System.out.println(j+" ");
    } 
} 

class B extends C { 
    public void p(int i,int j) { 
    	
        int k;
        k=i;
        i=j;
        j=k;

        System.out.print(i+" "); 
        System.out.println(j+" ");
    } 
} 

class A extends B { 
    public void p(String i,String j) { 
    	
        String k;
        k=i;
        i=j;
        j=k;

        System.out.print(i+" "); 
        System.out.println(j+" ");
    } 
} 
	
