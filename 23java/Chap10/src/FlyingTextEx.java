// 10-8 화살표로 레이블이 움직임! 
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class FlyingTextEx extends JFrame{
	private final int FLYING_UNIT = 10;
	private JLabel la = new JLabel("HELLO");
	
	
	public FlyingTextEx() {
		setTitle("상,하,좌,우 키를 이용하여 텍스트 움직이기");
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
				
				//마우스 클릭 이벤트가 발생하면 포커스를 메인프레임으로. 
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
