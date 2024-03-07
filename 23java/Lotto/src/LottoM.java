import java.util.Random;

public class LottoM {
	public int n;
	public int m;
	
	LottoM(int n, int m)
	{
		this.n = n; 
		this.m = m;
	}
	
	public int[] LottoGen() 
	{   int[] lt = new int[m];
		Random rand = new Random();
	
		for(int i = 0; i<m; i++) {
			lt[i] = rand.nextInt(n)+1;
			for(int j = 0; j<i; j++) {
				if(lt[i] ==lt[j]) 
					i--;	
			}
			
		}
		return lt; 
	}
}
