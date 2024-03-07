import java.util.Random;

public class LottoV {
	public int n;
	public int m;
	public int seed;
	
	LottoV(int n, int m, int seed)
	{
		this.n = n;
		this.m = m;
		this.seed = seed;
	}
	
	public int[] LottoVer() 
	{
		Random rand = new Random(seed);
		int lt [] = new int [m];
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
