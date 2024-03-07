//10-4 마우스 누르고 떼기  이벤트  
// 예 특. 추상메소드 5갠가 있어서, 하나만 쓰고싶어도 죄다 구현해야함;;
// 여기선 마우스 추상 인터페이스 사용 
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MouseListenerEx extends JFrame{
	private JLabel la = new JLabel("Hello"); 
	
	public MouseListenerEx() {
		setTitle("Mouse 이벤트 예제 ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.addMouseListener(new MyMouseListener());
		
		c.setLayout(null);
		la.setSize(50,20);
		la.setLocation(30, 30);
		c.add(la);
		
		setSize(250,250);
		setVisible(true);
		
	}
	
	class MyMouseListener implements MouseListener{
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x,y);
		}
		
		public void mouseReleased(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseListenerEx();
	}

}
