package week8;



public class LottoMaker10 {
	public static void main(String[] args) {
		int result1[] = new int[6];
		
		Lotto L = new Lotto(10);
		result1 = L.LottoGen();
		
		LottoPrinter LP = new LottoPrinter();
		LP.LPrinter(result1);
		
		System.out.println("Lotto10 출력결과");
		for(int i=0;i<6;i++)
		{
			System.out.println(result1[i]+" ");
		}
	}

}
