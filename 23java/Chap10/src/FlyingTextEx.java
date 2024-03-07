// 10-8 ȭ��ǥ�� ���̺��� ������! 
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class FlyingTextEx extends JFrame{
	private final int FLYING_UNIT = 10;
	private JLabel la = new JLabel("HELLO");
	
	
	public FlyingTextEx() {
		setTitle("��,��,��,�� Ű�� �̿��Ͽ� �ؽ�Ʈ �����̱�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		c.addKeyListener(new MyKeyListener());
		
		la.setLocation(50,50);
		la.setSize(100,20);
		c.add(la);
		
		setSize(300,300);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
		
		c.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Component com = (Component)e.getSource();
				
				//���콺 Ŭ�� �̺�Ʈ�� �߻��ϸ� ��Ŀ���� ��������������. 
				com.setFocusable(true);
				com.requestFocus();
			}
		});
	}
	
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			
			switch(keyCode) {
				case KeyEvent.VK_UP: 
					la.setLocation(la.getX(), la.getY()-FLYING_UNIT);
					break;
				case KeyEvent.VK_DOWN: 
					la.setLocation(la.getX(), la.getY()+FLYING_UNIT); 
					break;
				case KeyEvent.VK_LEFT: 
					la.setLocation(la.getX()-FLYING_UNIT, la.getY()); 
					break;
				case KeyEvent.VK_RIGHT: 
					la.setLocation(la.getX()+FLYING_UNIT, la.getY()); 
					break;
			}
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlyingTextEx();
	}

}
