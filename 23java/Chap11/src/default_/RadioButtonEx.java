// 11-6 라디오버튼 
package default_;
import javax.swing.*;
import java.awt.*;

public class RadioButtonEx extends JFrame{
	public RadioButtonEx() {
		setTitle("라디오버튼 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg" );
		
		ImageIcon selectedCherryIcon = new ImageIcon("images/selectedCherry.jpg"); 
		ButtonGroup g = new ButtonGroup();
		JRadioButton apple = new JRadioButton("사과");
		JRadioButton pear = new JRadioButton("배", true);
		JRadioButton cherry = new JRadioButton("체리", cherryIcon);
		
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectedCherryIcon);
		
		g.add(apple);
		g.add(pear);
		g.add(cherry);
		// 만약 그룹에 추가하지 않으면, 라디오 그룹 중 1개로 선택 ~ 에서 제외되어 별개로 선택된다.
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		setSize(250,150);
		setVisible(true);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RadioButtonEx();
	}

}
