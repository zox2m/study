import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ClickPracticeFrame extends JFrame{
	
	private JLabel la = new JLabel("c");
	
	public ClickPracticeFrame() {
		
		setTitle("클릭 연습");
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout()); // 내맘대로 
		
		la.setLocation(50,50);
		la.setSize(100,20);
		c.add(la);
		
		JButton btn50 = new JButton("50");
		JButton btn100 = new JButton("100");
		JButton btn150 = new JButton("150");
		JButton btn200 = new JButton("200");
		
		//btn50.setLocation(50,50);
		
		//listen
		btn50.addActionListener(new MyListener50());
		btn100.addActionListener(new MyListener100());
		btn150.addActionListener(new MyListener150());
		btn200.addActionListener(new MyListener200());
		
		c.add(btn50);
		c.add(btn100);
		c.add(btn150);
		c.add(btn200);
		
		// set size 
		setSize(800,400);
		setVisible(true);
		
	}
	
	class MyListener50 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			la.setLocation(50,50);
			
		}
	}
	
	class MyListener100 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			la.setLocation(100,100);
			
		}
	}
	
	class MyListener150 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			la.setLocation(150,150);
			
		}
	}
	
	class MyListener200 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			la.setLocation(200,200);
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ClickPracticeFrame();
		
	}

}
