//11-7 Jbutton�� item 
package default_;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class RadioButtonItemEventEx extends JFrame{
	private JRadioButton [] radio = new JRadioButton [3];
	private String [] text = {"���", "��", "ü��"};
	private ImageIcon [] image = {
		new ImageIcon("images/apple.jpg"),
		new ImageIcon("images/pear.jpg"),
		new ImageIcon("images/cherry.jpg")};
	
	private JLabel imageLabel = new JLabel();
	public RadioButtonItemEventEx() {
		setTitle("������ư Item Event ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel radioPanel = new JPanel(); 
		radioPanel.setBackground(Color.GRAY);
		
		ButtonGroup g = new ButtonGroup(); 
		for(int i=0; i<radio.length; i++) {
			radio[i] = new JRadioButton(text[i]);
			g.add(radio[i]);
			radioPanel.add(radio[i]); // �׷쿡�� �ְ� �ǳڿ��� �ִ´� 
			radio[i].addItemListener(new MyItemListener()); // ��ҿ��� �����۸����� 
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
