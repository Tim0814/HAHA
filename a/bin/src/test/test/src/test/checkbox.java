 package test;

public class checkbox {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		int checkbox[] = new int[50]; //���ͤ@�Ӧ�50�Ӥ�����checkbox�}�C
		for(int i=0; i<50; i++) {
			checkbox[i] = 0; //�M��O�C�@�����O0
		}
		int lottoNum[] = new int[6]; //�ΨӸ˼ֳz���X���}�C
		
		int x = 0, num;
		while(x<6) {
			num = (int)(1+Math.random()*49); //num��1~50�䤤�@�ӼƦr
			if(checkbox[num]==0) { //�p�Gcheckbox����num����0(���50�����O0)
				lottoNum[x] = num; //num���ƭȫK��i�ֳz�}�C�̭�(1~50�䤤�@�Ӽ�)
				checkbox[num] = 1; //�M��checkbox����num���ܦ�1�A�o�˴N���|���ƺ��(�|�]�����ŦXif�ԭz�Ӹ��X)
				x++; //�s�򰵨��5��
			}
		}
		for(int i=0; i<6; i++) {
			System.out.printf("%3d", lottoNum[i]);
		}
	}
}
