package test1;

public class staticAndAuto {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		//static variable and auto variable
        //local variable��A�i�J���禡�ɡA�|�t�m�O���鵹�A�A�ӥB��l�ơA�����}�ɷ|�N�t����^��
        //static variable��A�i�J���禡�ɡA�|�t�m�O���鵹�A�A�ӥB��l�ơA�����}�ɤ��|�N�t����^��
        
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
