//12-5 도형 색깔 채우기 
import javax.swing.*;
import java.awt.*;

public class GraphicsFillEx extends JFrame{
	private MyPanel panel = new MyPanel();
	public GraphicsFillEx() {
	setTitle("fillXXX 사용 예제");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setContentPane(panel);
	setSize(100, 350);
	setVisible(true);
	}
	
	//기본 도형들 
//	class MyPanel extends JPanel {
//		public void paintComponent(Graphics g) {
//			super.paintComponent(g);
//			g.setColor(Color.RED);
//			g.fillRect(10,10,50,50);
//			g.setColor(Color.BLUE);
//			g.fillOval(10,70,50,50);
//			g.setColor(Color.GREEN);
//			g.fillRoundRect(10,130,50,50,20,20);
//			g.setColor(Color.MAGENTA);
//			g.fillArc(10,190,50,50,0,270); 
//			g.setColor(Color.ORANGE);
//			int [] x ={30,10,30,60};
//			int [] y ={250,275,300,275};
//			g.fillPolygon(x, y, 4); 
//		}
//	}
	
	//교수님 미션: 파란 테두리에 빨간 내부 사각형을 만들어보세요 
	class MyPanel extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLUE);
		g.fillRect(10,10,50,50);
		
		g.setColor(Color.RED); // 빨간색 선택
		g.drawRect(10, 10, 50, 50); // 선그리기
	}
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GraphicsFillEx();
	}

}
