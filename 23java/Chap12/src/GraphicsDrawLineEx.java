//12-4 ������ �׸��� (draw )
import javax.swing.*;
import java.awt.*;

public class GraphicsDrawLineEx extends JFrame{
	private MyPanel panel = new MyPanel();
	public GraphicsDrawLineEx() {
		setTitle("drawLine ��� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(200, 170);
		setVisible(true);
	}
	// �� �׸���
//	class MyPanel extends JPanel {
//		public void paintComponent(Graphics g) {
//			super.paintComponent(g);
//			g.setColor(Color.RED); // ������ ����
//			g.drawLine(20, 20, 100, 100); // ���׸���
//		}
//	}
	
	//�� �׸��� 
//	class MyPanel extends JPanel {
//		public void paintComponent(Graphics g) {
//			super.paintComponent(g);
//			g.setColor(Color.RED);
//			g.drawOval(20,20,80,80);
//		}
//	}
	
	//���׸� ��
//	class MyPanel extends JPanel {
//		public void paintComponent(Graphics g) {
//		super.paintComponent(g);
//		g.setColor(Color.RED);
//		g.drawArc(20,100,80,80,90,270);
//		}
//		}
	
	//��ٰ���
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			int []x = {80,40,80,120};
			int []y = {40,120,200,120}; 
			g.drawPolygon(x, y, 4);
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GraphicsDrawLineEx();
	}

}
