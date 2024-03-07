// 10-7
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class KeyCodeEx extends JFrame{
	private JLabel la = new JLabel();
	
	public KeyCodeEx() {
		setTitle("Key Code ���� : F1Ű:�ʷϻ�, % Ű �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.addKeyListener(new MyKeyListener());
		c.add(la);
		
		setSize(300,150);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	// ���� Ŭ������ ������. ����� Ȯ���� .
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
		Container contentPane = (Container)e.getSource();
		la.setText(e.getKeyText(e.getKeyCode()));
		
		// ��Ű ĳ���Ϳ��� ����Ʈ+ 5 �� %���� �νİ��� 
		if(e.getKeyChar() == '%') 
			contentPane.setBackground(Color.YELLOW);
		
		// function Ű�� ���� �����ڵ尪�� ������, virtual key ��� ���� ���� 
		else if(e.getKeyCode() == KeyEvent.VK_F1) 
			contentPane.setBackground(Color.GREEN);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyCodeEx();
		
	}

}
