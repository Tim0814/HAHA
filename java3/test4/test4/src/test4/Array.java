package test4;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		int[] numberArray = {70,80,31,37,10,1,48,60,33,80};
        int i;
		Arrays.sort(numberArray);//�Ƨǰ}�C
		System.out.print("�}�C�����Ѥp�ƨ�j  ");
		for(i=0; i<numberArray.length; i++) //�L�X�}�C
  	       System.out.print(numberArray[i] + " ");
	}

}
