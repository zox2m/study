//12-2 
import javax.swing.*;
import java.awt.*;

public class GraphicsDrawStringEx extends JFrame{

	private MyPanel panel = new MyPanel();
	public GraphicsDrawStringEx() {
		setTitle("drawString ��� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(250,200);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.drawString("�ʹ� �����...", 30,30);
			g.setColor(Color.BLUE); // ���� ������ �ٲٶ�� �Ѵٸ�. �̰�!!
			g.drawString("���� 6�� ���̾�!!", 60, 60);
		}
	}
	public static void main(String [] args) {
		new GraphicsDrawStringEx();
	}


}
