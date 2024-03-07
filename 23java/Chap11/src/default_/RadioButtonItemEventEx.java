//11-7 Jbutton과 item 
package default_;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class RadioButtonItemEventEx extends JFrame{
	private JRadioButton [] radio = new JRadioButton [3];
	private String [] text = {"사과", "배", "체리"};
	private ImageIcon [] image = {
		new ImageIcon("images/apple.jpg"),
		new ImageIcon("images/pear.jpg"),
		new ImageIcon("images/cherry.jpg")};
	
	private JLabel imageLabel = new JLabel();
	public RadioButtonItemEventEx() {
		setTitle("라디오버튼 Item Event 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel radioPanel = new JPanel(); 
		radioPanel.setBackground(Color.GRAY);
		
		ButtonGroup g = new ButtonGroup(); 
		for(int i=0; i<radio.length; i++) {
			radio[i] = new JRadioButton(text[i]);
			g.add(radio[i]);
			radioPanel.add(radio[i]); // 그룹에도 넣고 판넬에도 넣는다 
			radio[i].addItemListener(new MyItemListener()); // 요소에는 아이템리스너 
		}
		
		radio[2].setSelected(true); 
		
		c.add(radioPanel, BorderLayout.NORTH); 
		c.add(imageLabel, BorderLayout.CENTER);
		
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER); 
		
		setSize(250,200);
		setVisible(true);
	}
	class MyItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.DESELECTED)
			return; 
		if(radio[0].isSelected())
			imageLabel.setIcon(image[0]);
		else if(radio[1].isSelected())
			imageLabel.setIcon(image[1]);
		else
			imageLabel.setIcon(image[2]);
		}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RadioButtonItemEventEx();
	}

}
