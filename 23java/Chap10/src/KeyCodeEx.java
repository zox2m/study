// 10-7
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class KeyCodeEx extends JFrame{
	private JLabel la = new JLabel();
	
	public KeyCodeEx() {
		setTitle("Key Code 예제 : F1키:초록색, % 키 노란색");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.addKeyListener(new MyKeyListener());
		c.add(la);
		
		setSize(300,150);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	// 내부 클래스로 구현함. 어댑터 확장함 .
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
		Container contentPane = (Container)e.getSource();
		la.setText(e.getKeyText(e.getKeyCode()));
		
		// 겟키 캐릭터에선 쉬프트+ 5 가 %임을 인식가능 
		if(e.getKeyChar() == '%') 
			contentPane.setBackground(Color.YELLOW);
		
		// function 키는 원래 유니코드값이 없으나, virtual key 라는 값이 있음 
		else if(e.getKeyCode() == KeyEvent.VK_F1) 
			contentPane.setBackground(Color.GREEN);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyCodeEx();
		
	}

}
