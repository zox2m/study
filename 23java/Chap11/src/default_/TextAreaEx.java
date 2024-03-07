//11-9  JTextArea
package default_;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TextAreaEx extends JFrame{
	private JTextField tf = new JTextField(20); // �Է�â
	private JTextArea ta = new JTextArea(7, 20); // �׳� �����°� 
	
	public TextAreaEx() {
		setTitle("�ؽ�Ʈ���� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("�Է� �� <Enter> Ű�� �Է��ϼ���")); // �׳� ���̺� 
		c.add(tf); // �ؽ�Ʈ �ʵ� �Է�â 
		c.add(new JScrollPane(ta)); // �ؽ�Ʈ ������. �׳� ������ 
		
		// �׼� �����ʰ� �͸�Ŭ������ �����Ǿ�����
		// �׷��� ����Ŭ����, �ܺ�Ŭ������ �����ϴ¹���� �˾ƾ��ϰ�, ��ȯ�� �ٵ� �˾ƾ��� 
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JTextField t = (JTextField)e.getSource();
				//ta.append(t.getText() + "\n");
				ta.append(tf.getText() + "\n"); // area �� append ����. field �� getText ���� 
				tf.setText(""); // ���� setText 
				}
			
		});
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextAreaEx();
	}

}
