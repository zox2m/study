// 10-9 마우스이벤트, 마우스 모션 이벤트 
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MouseListenerAllEx extends JFrame{
	private JLabel la = new JLabel("No Mouse Event"); 
	
	public MouseListenerAllEx() {
		setTitle("MouseListener와 MouseMotionListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		MyMouseListener listener = new MyMouseListener();
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener); 
		
		c.add(la);
		
		setSize(300,200);
		setVisible(true);
	}

	class MyMouseListener implements MouseListener, 
	MouseMotionListener {
	public void mousePressed(MouseEvent e) {
		//la.setText("mousePressed ("+e.getX()+", "+e.getY ()+")");
	}
	public void mouseReleased(MouseEvent e) {
		//la.setText("MouseReleased("+e.getX()+", "+e.getY()+")"); 
	}
	public void mouseClicked(MouseEvent e) {
		la.setText("MouseClicked("+e.getX()+", "+e.getY()+")");
		
		if(e.getClickCount() == 1) {
			la.setLocation(e.getX(), e.getY());
		}
		else if(e.getClickCount() == 2) {
			int r = (int)(Math.random()*256);
			int g = (int)(Math.random()*256);
			int b = (int)(Math.random()*256);
			
			Component c = (Component)e.getSource(); 
			c.setBackground(new Color(r,b,g)); 
		}

	}
	public void mouseEntered(MouseEvent e) {
		Component c = (Component)e.getSource();
		c.setBackground(Color.CYAN);
	}
	public void mouseExited(MouseEvent e) {
		Component c = (Component)e.getSource();
		c.setBackground(Color.YELLOW);
	}
	public void mouseDragged(MouseEvent e) {
		la.setText("MouseDragged ("+e.getX()+","+e.getY()+")");
	}
	public void mouseMoved(MouseEvent e) {
		la.setText("MouseMoved ("+e.getX()+","+e.getY()+")");
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseListenerAllEx();

	}

}
