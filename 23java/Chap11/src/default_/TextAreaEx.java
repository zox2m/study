//11-9  JTextArea
package default_;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TextAreaEx extends JFrame{
	private JTextField tf = new JTextField(20); // 입력창
	private JTextArea ta = new JTextArea(7, 20); // 그냥 적히는거 
	
	public TextAreaEx() {
		setTitle("텍스트영역 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("입력 후 <Enter> 키를 입력하세요")); // 그냥 레이블 
		c.add(tf); // 텍스트 필드 입력창 
		c.add(new JScrollPane(ta)); // 텍스트 에리아. 그냥 적힌거 
		
		// 액션 리스너가 익명클래스로 구현되어있음
		// 그러나 내부클래스, 외부클래스로 구현하는방법도 알아야하고, 변환할 줄도 알아야함 
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JTextField t = (JTextField)e.getSource();
				//ta.append(t.getText() + "\n");
				ta.append(tf.getText() + "\n"); // area 엔 append 가능. field 는 getText 가능 
				tf.setText(""); // 비운다 setText 
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
