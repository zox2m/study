//12-2 
import javax.swing.*;
import java.awt.*;

public class GraphicsDrawStringEx extends JFrame{

	private MyPanel panel = new MyPanel();
	public GraphicsDrawStringEx() {
		setTitle("drawString 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(250,200);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.drawString("너무 배고파...", 30,30);
			g.setColor(Color.BLUE); // 만약 색깔을 바꾸라고 한다면. 이거!!
			g.drawString("벌써 6시 반이야!!", 60, 60);
		}
	}
	public static void main(String [] args) {
		new GraphicsDrawStringEx();
	}


}
