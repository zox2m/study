//10-2 ���� Ŭ���� 
// 10-2�� 3 �� ����Ŭ������. �̶��� Ÿ��Ʋ���� ������ �ٲܼ�����
// ��� ������ �����ϱ� ����! 

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class InnerClassListener extends JFrame{
	// ������ 
	public InnerClassListener() {
		setTitle("Action �̺�Ʈ ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		
		setSize(350, 150);
		setVisible(true);
		}
	
	//���� Ŭ������ Action �̺�Ʈ 
	private class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action"))
				b.setText("�׼�");
			else
				b.setText("Action");
			
			// �� ������ Ŭ������ ����� JFrame ��� �� ����
			InnerClassListener.this.setTitle(b.getText());
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InnerClassListener();
	}

}
