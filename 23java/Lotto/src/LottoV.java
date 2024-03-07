import java.util.Random;

//로또 번호 검증자! 베리피케이션~ 의 V 
// 매개변수의 seed는 날리고, 필드의 seed 만 남겨두는게 낫긴 함. 

// 로또V는 그 달!의 번로르 뽑아줌. 시간 씨드를 넣어서.. 
// 11월이면 seed로 11을 넣어보는 것!  
public class LottoV {
	public int n;
	public int m;
	public int seed;
	
	LottoV(int n,int m, int seed)
	{
		this.n = n;
		this.m = m;
		this.seed = seed;
	}
	
	public int[] LottoVer()
	{
		Random rand = new Random(seed);
		
		int[] lt = new int[m];
		
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
