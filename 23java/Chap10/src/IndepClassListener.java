// 10-1 ����Ŭ���� 
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class IndepClassListener extends JFrame{
	public IndepClassListener() {
		setTitle("Action �̺�Ʈ ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener()); // Action ������ �ޱ�
		c.add(btn);
		
		setSize(350, 150);
		setVisible(true); 
	}

	public static void main(String [] args) {
		new IndepClassListener();
	}
}

//���ο�, �ƿ� �ٸ� Ŭ���� ����
// ���ϸ�� �޶� ��������?? 
class MyActionListener implements ActionListener { 
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Action"))
			b.setText("�׼�");
		else
			b.setText("Action");
	}
}
