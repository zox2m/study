//10-3 내부클래스 - 익명클래스 
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class AnonymousClassListener extends JFrame{
	
	public AnonymousClassListener() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		c.add(btn);
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action"))
					b.setText("액션");
				else
					b.setText("Action");
				setTitle(b.getText());
			}
		}); //익명 클래스는 () 안에 작성되므로 소괄호 잊지 않기! 
		
		setSize(350, 150);
		setVisible(true);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AnonymousClassListener();
	}

}
