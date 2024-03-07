//10-2 내부 클래스 
// 10-2나 3 은 내부클래스임. 이때만 타이틀바의 내용을 바꿀수있음
// 멤버 접근이 가능하기 때문! 

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class InnerClassListener extends JFrame{
	// 리스너 
	public InnerClassListener() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		
		setSize(350, 150);
		setVisible(true);
		}
	
	//내부 클래스로 Action 이벤트 
	private class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action"))
				b.setText("액션");
			else
				b.setText("Action");
			
			// 위 리스너 클래스의 멤버나 JFrame 멤머 출 가능
			InnerClassListener.this.setTitle(b.getText());
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InnerClassListener();
	}

}
