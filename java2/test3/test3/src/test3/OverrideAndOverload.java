package test3;

public class OverrideAndOverload {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		A a = new A(); 
        a.p(10); //如果子類別跟父類別的方法名稱、簽名(資料型態)都一樣，參數會優先選擇子類別(覆寫Override)
        a.p(10.0); //除非子類別方法裡面的簽名(資料型態)不符合才會輪到父類別(多載Overload)
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
        super.p(i);  //super能夠繼承父類別的建構式或方法，這裡的super是指向上面那個名稱為a的物件
    } 
} 

