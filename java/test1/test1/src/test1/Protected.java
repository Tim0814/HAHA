package test1;

public class Protected {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		C2 objC2 = new C2();  
        objC2.m(); //由於class C2沒有m()方法所以向上找C1的m()方法
        objC2.print(); 
    } 
} 
 
class C1 { 
    public int x; //public使同一個package裡的所有類別都可以使用
    protected int y; //protected能使繼承自父類別C1的子類別可以使用(繼承專用修飾詞)
    int z; //沒有打的話就是預設package，只有跟C1在同一個介面裡的可以使用
    private int u; //private只有C1類別本身可以使用，隱密性最高

    protected void m() { 
        System.out.println("Hello, Java\n"); 
    } 
} 

class C2 extends C1 { 
    public C2() { 
        x = 1; 
        y = 2;  
        z = 3; 
        //由於u是設定成private，所以不同的class無法存取
    } 

    protected void print() { 
        System.out.printf("x=%d, y=%d, z=%d\n", x, y, z); 
    } 
}
