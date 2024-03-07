import javax.swing.*;
import java.awt.*;

public class LottoMaker extends JFrame{	
	public LottoMaker() {
		setTitle("로또생성기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.BLUE);
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JButton("확인"));
		
		setSize(600,600);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		LottoMaker lottoMaker = new LottoMaker();
		LottoV lottoV = new LottoV(46,6,11); // n 까지의 수를 M 개 뽑기 
		lottoV.LottoVer();
		//lottoV.LottoVer(); // 옳은 답 출력 
		for(int i =0;i<6;i++) {
			System.out.println(lottoV.);
		}
		
		LottoPrinter lp = new LottoPrinter();//LottoPrinter를 호출할 객체 선언

		int result[];// 로또 번호를 정수 배열 result에 저장
				
		LottoM LM = new LottoM(10, 8);//생성자 LottoM을 호출하여 n의 크기 지정
		result=LM.LottoGen();//LotGen으로 생성된 번호를 result에 저장
		lp.LPrinter(result, 8);//로또 번호를 LottoPrinter로 호출
	}

}
