//10-4 마우스 누르고 떼기  이벤트  
// 예 특. 추상메소드 5갠가 있어서, 하나만 쓰고싶어도 죄다 구현해야함;;
// 여기선 마우스 추상 인터페이스 사용 
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MouseListenerEx2 extends JFrame{
	private JLabel la = new JLabel("Hello"); 
	
	public MouseListenerEx2() {
		setTitle("Mouse 이벤트 예제 ");
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
	
	//10-4 는 인터페이스를 써서 안쓰는 메소드도 모두 구현해야하지만,
	// 여기서는 어댑터를 상속받아 구현 안해도 됨 
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