import javax.swing.*;
import java.awt.*;

public class LottoMaker extends JFrame{	
	public LottoMaker() {
		setTitle("�ζǻ�����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.BLUE);
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JButton("Ȯ��"));
		
		setSize(600,600);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		LottoMaker lottoMaker = new LottoMaker();
		LottoV lottoV = new LottoV(46,6,11); // n ������ ���� M �� �̱� 
		lottoV.LottoVer();
		//lottoV.LottoVer(); // ���� �� ��� 
		for(int i =0;i<6;i++) {
			System.out.println(lottoV.);
		}
		
		LottoPrinter lp = new LottoPrinter();//LottoPrinter�� ȣ���� ��ü ����

		int result[];// �ζ� ��ȣ�� ���� �迭 result�� ����
				
		LottoM LM = new LottoM(10, 8);//������ LottoM�� ȣ���Ͽ� n�� ũ�� ����
		result=LM.LottoGen();//LotGen���� ������ ��ȣ�� result�� ����
		lp.LPrinter(result, 8);//�ζ� ��ȣ�� LottoPrinter�� ȣ��
	}

}
