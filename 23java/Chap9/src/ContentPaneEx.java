// 9-2 
import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame{
	// 생성자. 클래스 이름과 동일한 이름의 메소드가 된다. 
	public ContentPaneEx() {
		setTitle("ContentPane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(300, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ContentPaneEx();

	}
}