// 13-3 
import java.awt.*;
import javax.swing.*;

public class FlickeringLabelEx extends JFrame{

	public FlickeringLabelEx() {
		setTitle("FlickeringLabelEx ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// �����̴� ���̺� ����
		FlickeringLabel fLabel = new FlickeringLabel("����",500);
		
		// �������� �ʴ� ���̺� ����
		JLabel label = new JLabel("�ȱ���");
		
		// �����̴� ���̺� ����
		FlickeringLabel fLabel2 = new FlickeringLabel("���⵵ ����",300);
		c.add(fLabel);
		c.add(label);
		c.add(fLabel2);
		
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new FlickeringLabelEx();
	}

}
