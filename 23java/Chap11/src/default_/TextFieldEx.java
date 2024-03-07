//11-8 Jbutton과 item 
package default_;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class TextFieldEx extends JFrame{
	public TextFieldEx() {
		setTitle("텍스트필드 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		// a 라는 객체로 생성해줌 
		JTextField a = new JTextField("서울시 ...", 20);
		// setFont 적용함 
		a.setFont(new Font("고딕체", Font.ITALIC, 20));
		
		c.setLayout(new FlowLayout());
		c.add(new JLabel("이름 "));
		c.add(new JTextField(20));
		c.add(new JLabel("학과 "));
		c.add(new JTextField("컴퓨터공학과 ", 20));
		c.add(new JLabel("주소 "));
		// 값 수정하느라 위에서 선언해줬고, 아래엔 변수로 넣음 
		c.add(a);
		
		setSize(300,150);
		setVisible(true);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextFieldEx();
	}

}
