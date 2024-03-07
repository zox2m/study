import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TenButtonFrame extends JFrame{
	static JButton btn0 = new JButton("0");
	static JButton btn1 = new JButton("1");
	static JButton btn2 = new JButton("2");
	static JButton btn3 = new JButton("3");
	static JButton btn4 = new JButton("4");
	static JButton btn5 = new JButton("5");
	static JButton btn6 = new JButton("6");
	static JButton btn7 = new JButton("7");
	static JButton btn8 = new JButton("8");
	static JButton btn9 = new JButton("9");

	public TenButtonFrame() {
		//1 set title 
		setTitle("Button Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//컨테이너 
		Container c = getContentPane();
		c.setLayout(new GridLayout());
		
		
		// listen
		btn1.addActionListener(new MyListener());
		
		//3 
		c.add(btn0);
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		c.add(btn4);
		c.add(btn5);
		c.add(btn6);
		c.add(btn7);
		c.add(btn8);
		c.add(btn9);
		
		//4 레이아웃 )
		
		// set size 
		setSize(800,400);
		setVisible(true);
	}
	
	
	class MyListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			TenButtonFrame.btn0.setText("HI");
			TenButtonFrame.btn2.setText("HI");
			TenButtonFrame.btn3.setText("HI");
			TenButtonFrame.btn4.setText("HI");
			TenButtonFrame.btn5.setText("HI");
			TenButtonFrame.btn6.setText("HI");
			TenButtonFrame.btn7.setText("HI");
			TenButtonFrame.btn8.setText("HI");
			TenButtonFrame.btn9.setText("HI");

			
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TenButtonFrame();
	}

}
