package test1;

public class staticAndAuto {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		//static variable and auto variable
        //local variable當你進入此函式時，會配置記憶體給你，而且初始化，但離開時會將配憶體回收
        //static variable當你進入此函式時，會配置記憶體給你，而且初始化，但離開時不會將配憶體回收
        
        for (int x=1; x<=5; x++) {
            staticAndAuto();
        }
	}
	
	static void staticAndAuto()
	{
	    int i = 0;
        int si = 0;
        i++;
        si++;
        System.out.printf(" i = %d, si = %d \n", i, si);
	}
}
