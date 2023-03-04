package test4;

import java.util.ArrayList; 
import java.util.Arrays; 

public class arraylist {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Integer [] array = {3, 5, 95, 4, 13, 6}; 
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array)); //<>裡面要填資料的型態(不能縮寫像是int、str等等)，aslist語法可以將陣列裡的元素加進陣列列表
        System.out.println(list); 
	}
}
