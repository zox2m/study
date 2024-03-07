//10-4 ���콺 ������ ����  �̺�Ʈ  
// �� Ư. �߻�޼ҵ� 5���� �־, �ϳ��� ����; �˴� �����ؾ���;;
// ���⼱ ���콺 �߻� �������̽� ��� 
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MouseListenerEx2 extends JFrame{
	private JLabel la = new JLabel("Hello"); 
	
	public MouseListenerEx2() {
		setTitle("Mouse �̺�Ʈ ���� ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.addMouseListener(new MyMouseAdapter());
		
		c.setLayout(null);
		la.setSize(50,20);
		la.setLocation(30, 30);
		c.add(la);
		
		setSize(250,250);
		setVisible(true);
		
	}
	
	//10-4 �� �������̽��� �Ἥ �Ⱦ��� �޼ҵ嵵 ��� �����ؾ�������,
	// ���⼭�� ����͸� ��ӹ޾� ���� ���ص� �� 
	class MyMouseAdapter extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x,y);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseListenerEx();
	}

}