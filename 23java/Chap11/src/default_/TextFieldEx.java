//11-8 Jbutton�� item 
package default_;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class TextFieldEx extends JFrame{
	public TextFieldEx() {
		setTitle("�ؽ�Ʈ�ʵ� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		// a ��� ��ü�� �������� 
		JTextField a = new JTextField("����� ...", 20);
		// setFont ������ 
		a.setFont(new Font("���ü", Font.ITALIC, 20));
		
		c.setLayout(new FlowLayout());
		c.add(new JLabel("�̸� "));
		c.add(new JTextField(20));
		c.add(new JLabel("�а� "));
		c.add(new JTextField("��ǻ�Ͱ��а� ", 20));
		c.add(new JLabel("�ּ� "));
		// �� �����ϴ��� ������ ���������, �Ʒ��� ������ ���� 
		c.add(a);
		
		setSize(300,150);
		setVisible(true);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextFieldEx();
	}

}
