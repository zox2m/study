//12-7 이미지가 화면에 꽉차게  그리기 . 윈도우창 움직이면 찌그러짐 
// 매번 새로이 다시 그려서 구현하는거임! 
import javax.swing.*;
import java.awt.*;

public class GraphicsDrawImageEx2 extends JFrame{
	private MyPanel panel = new MyPanel();
	
	public GraphicsDrawImageEx2() {
		setTitle("패널의 크기에 맞추어 이미지 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(200, 300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("images/image0.jpg");
		private Image img = icon.getImage(); // 이미지 객체
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GraphicsDrawImageEx2();

	}

}
