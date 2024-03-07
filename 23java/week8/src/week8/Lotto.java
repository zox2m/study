package week8;

import java.util.Random;

public class Lotto {
	
	public int count;
	Lotto(int numCount)
	{
		count = numCount;
	}
	
	public int[] LottoGen() {
		int lotto[] = new int[6];
		Random rand = new Random();
		
		for(int i=0; i<lotto.length;i++) {
			lotto[i] = rand.nextInt(count)+1;
			
			for(int j=0;j<i;j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		return lotto;
		
	}

}
