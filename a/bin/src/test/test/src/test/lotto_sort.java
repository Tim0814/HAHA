package test;

public class lotto_sort {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		int lotto[] = new int[6];
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = 1 + (int)(Math.random()*49); //���H������6�ӼƦr
		}
		//6�ӼƥѤp��j�Ƨ�
		for(int i=0; i<lotto.length; i++) { //�q��0���}�l��
			int min = lotto[i]; //�O��i�����̤p��
			int index = i; //����
			for(int j=i+1; j<lotto.length; j++) { //����i+1�����i������A�@�����̫�@��
				if(lotto[j]<min) { //�p�G�䤤���̤p��
					min = lotto[j]; //�̤p�ȴ��H��
					index = j; //�M��|�Q��b��i��
				} 
			}
			if(min!=lotto[i]) { //�p�G�̤p�ȸ�@�}�l�]�����@��
			    lotto[index] = lotto[i]; //�洫��m���y�k
			    lotto[i] = min; //��e�@���洫��m
			}
		    //�M����^for���䱵�U�h���i+1���i+2��
		}
		for(int data:lotto) {
		    System.out.printf("%3d", data);
		    }
		}
	}

