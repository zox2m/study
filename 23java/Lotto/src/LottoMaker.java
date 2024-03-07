public class LottoMaker{	
	
	
	public static void main(String[] args) {
		LottoPrinter lp = new LottoPrinter();//LottoPrinter를 호출할 객체 선언

		int result[];// 로또 번호를 정수 배열 result에 저장
				
		LottoM LM = new LottoM(10, 8);//생성자 LottoM을 호출하여 n의 크기 지정
		result=LM.LottoGen();//LotGen으로 생성된 번호를 result에 저장
		lp.LPrinter(result, 8);//로또 번호를 LottoPrinter로 호출
	}

}
