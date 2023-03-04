package TIM2;

public class HW8_4 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int SmallToLarge[][]= new int[8][2]; //設定一個專門放員工號碼和工時的陣列
        int workinghours[][] = {{2,4,3,4,5,8,8},{7,3,4,3,3,4,4},{3,3,4,3,3,2,2}
        ,{9,3,4,7,3,4,1},{3,5,4,3,6,3,8},{3,4,4,6,3,4,4},{3,7,4,8,3,8,4},{6,3,5,9,2,7,9}};
        
        for(int i=0; i<workinghours.length; i++) {
        	int tot = 0;
        	SmallToLarge[i][0] = i;
        	for(int j=0; j<workinghours[i].length; j++) {
        		tot += workinghours[i][j];
        	}
    		SmallToLarge[i][1] = tot;
        }
        for(int i=0; i<SmallToLarge.length; i++) {
        	int min[] = new int[2];
        	for(int j=0; j<SmallToLarge.length; j++) {
        		if(SmallToLarge[i][1]<SmallToLarge[j][1]) {
        		min = SmallToLarge[i];
        		SmallToLarge[i] = SmallToLarge[j];
        		SmallToLarge[j] = min; //交換位置的語法
        		}
        	}
        }
        for(int i=0; i<SmallToLarge.length; i++) {
        		System.out.printf("The Employ %d's total working hours are %2d",SmallToLarge[i][0],SmallToLarge[i][1]);
        		System.out.println();
        	}
        
    }
}



