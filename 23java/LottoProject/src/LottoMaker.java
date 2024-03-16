import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class LottoMaker extends JFrame{
	//���� ��ư ��
	private JRadioButton [] radio = new JRadioButton[3];
	private String [] text = {"�ζ� 8-6","�ζ� 10-9","�ζ� 11-10"};
	
	
	// text Area 
	private JTextArea ta = new JTextArea(7,20); // ���α���, ���α��� 
	
	//n ������ ���ڸ� m�� �̾ƶ� 
	public static int n;
	public static int m;

	
	public LottoMaker() {
		setTitle("�ζ� ������");
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//���� ��Ƶ� �г�
		JPanel radioPanel = new JPanel();
			
		// ���� ��ư �׷� ��ü 
		ButtonGroup g = new ButtonGroup();
		
		
		// ���� ��ư �߰�
		for(int i=0; i<radio.length;i++) {
			//��ư �̸� �޾��� 
			radio[i] = new JRadioButton(text[i]);
			//��ư �׷쿡 ����
			g.add(radio[i]);
			//���� �гο� ���� 
			radioPanel.add(radio[i]);
			radio[i].addItemListener(new MyItemListener()); // ��ư�� ������ ���� 
			
		}
		radio[0].setSelected(true); // �⺻ ���� 
		
		
		ta.setEditable(false);
		
		//  �׳� ��ư �ΰ� 
		JButton gen = new JButton("����");
		JButton vari = new JButton("����");
		
		gen.addActionListener(new MyActionListener());
		vari.addActionListener(new MyActionListener());
		
		//���� �г� �߰� 
		c.add(radioPanel);
		
		//�ؽ�Ʈ ���� �߰� 
		c.add(new JScrollPane(ta));
		
		c.add(gen);
		c.add(vari);
		
		setSize(270,300);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		
		
		LottoPrinter lp = new LottoPrinter();//LottoPrinter�� ȣ���� ��ü ����
		
		new LottoMaker();
		
		int result[];// �ζ� ��ȣ�� ���� �迭 result�� ����
		
		
		LottoM LM = new LottoM(n, m);//������ LottoM�� ȣ���Ͽ� n�� ũ�� ����
		
		result=LM.LottoGen();//LotGen���� ������ ��ȣ�� result�� ����
		
		lp.LPrinter(result, m);//�ζ� ��ȣ�� LottoPrinter�� ȣ��
		
		

	}
	
	// ���� ��ư ������ 
	class MyItemListener implements ItemListener{
		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			//1��
			if(radio[0].isSelected()) {
				System.out.println("8 6 ");
				n = 8;
				m = 6;
			}
			//2��
			else if(radio[1].isSelected()) {
				System.out.println("10 9");
				n = 10;
				m = 9;
			}
			//3�� 
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
			
			if(b.getText().equals("����")) {
				System.out.println("����");
				
				
				
				
			}
			else if(b.getText().equals("����")) {
				System.out.println("����");
			}
				
			
		}
	}

}