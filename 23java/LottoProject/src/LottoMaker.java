import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class LottoMaker extends JFrame{
	//라디오 버튼 들
	private JRadioButton [] radio = new JRadioButton[3];
	private String [] text = {"로또 8-6","로또 10-9","로또 11-10"};
	
	
	// text Area 
	private JTextArea ta = new JTextArea(7,20); // 가로길이, 세로길이 
	
	//n 범위의 숫자를 m개 뽑아라 
	public static int n;
	public static int m;

	
	public LottoMaker() {
		setTitle("로또 생성기");
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//라디오 모아둘 패널
		JPanel radioPanel = new JPanel();
			
		// 라디오 버튼 그룹 객체 
		ButtonGroup g = new ButtonGroup();
		
		
		// 라디오 버튼 추가
		for(int i=0; i<radio.length;i++) {
			//버튼 이름 달아줌 
			radio[i] = new JRadioButton(text[i]);
			//버튼 그룹에 부착
			g.add(radio[i]);
			//라디오 패널에 부착 
			radioPanel.add(radio[i]);
			radio[i].addItemListener(new MyItemListener()); // 버튼에 리스너 부착 
			
		}
		radio[0].setSelected(true); // 기본 선택 
		
		
		ta.setEditable(false);
		
		//  그냥 버튼 두개 
		JButton gen = new JButton("생성");
		JButton vari = new JButton("검증");
		
		gen.addActionListener(new MyActionListener());
		vari.addActionListener(new MyActionListener());
		
		//라디오 패널 추가 
		c.add(radioPanel);
		
		//텍스트 영역 추가 
		c.add(new JScrollPane(ta));
		
		c.add(gen);
		c.add(vari);
		
		setSize(270,300);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		
		
		LottoPrinter lp = new LottoPrinter();//LottoPrinter를 호출할 객체 선언
		
		new LottoMaker();
		
		int result[];// 로또 번호를 정수 배열 result에 저장
		
		
		LottoM LM = new LottoM(n, m);//생성자 LottoM을 호출하여 n의 크기 지정
		
		result=LM.LottoGen();//LotGen으로 생성된 번호를 result에 저장
		
		lp.LPrinter(result, m);//로또 번호를 LottoPrinter로 호출
		
		

	}
	
	// 라디오 버튼 리스너 
	class MyItemListener implements ItemListener{
		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			//1번
			if(radio[0].isSelected()) {
				System.out.println("8 6 ");
				n = 8;
				m = 6;
			}
			//2번
			else if(radio[1].isSelected()) {
				System.out.println("10 9");
				n = 10;
				m = 9;
			}
			//3번 
			else if(radio[2].isSelected()){
				System.out.println("11 10");
				n = 11;
				m = 10;
			}
			
		}
	}
	
	class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			
			if(b.getText().equals("생성")) {
				System.out.println("생성");
				
				
				
				
			}
			else if(b.getText().equals("검증")) {
				System.out.println("검증");
			}
				
			
		}
	}

}
