// 11-1. ��ưŬ��. �̹���. üũ�ڽ� �̷��͵� �Ұ��� .
// ���� ������Ʈ ~ 9������ �Ẽ����  

package default_;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class JComponentEx extends JFrame{
	public JComponentEx() {
		super("JComponent�� ���� �޼ҵ� ����");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton b1 = new JButton("Magenta/Yellow Button");
		JButton b2 = new JButton(" Disabled Button ");
		JButton b3 = new JButton("getX(), getY()");
		
		b1.setBackground(Color.YELLOW); // ���� ����
		b1.setForeground(Color.MAGENTA); // ���ڻ� ����
		b1.setFont(new Font("Arial", Font.ITALIC, 20)); // Arial, 20�ȼ� ��Ʈ ����
		
		b2.setEnabled(false); // ��ư ��Ȱ��ȭ
		
		//����° ��ư���� ���� ������ �־�� 
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				JComponentEx frame = (JComponentEx)b.getTopLevelAncestor();
				frame.setTitle(b.getX() + "," + b.getY()); // Ÿ��Ʋ�� ��ư ��ǥ ���
			}
		});
		
		c.add(b1); c.add(b2); c.add(b3); // ����Ʈ�ҿ� ��ư ����
		
		setSize(260,200);
		setVisible(true);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JComponentEx();
	}

}
