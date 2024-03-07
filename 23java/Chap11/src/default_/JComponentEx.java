// 11-1. 버튼클릭. 이미지. 체크박스 이런것들 할거임 .
// 스윙 컴포넌트 ~ 9개정도 써볼거임  

package default_;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class JComponentEx extends JFrame{
	public JComponentEx() {
		super("JComponent의 공통 메소드 예제");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton b1 = new JButton("Magenta/Yellow Button");
		JButton b2 = new JButton(" Disabled Button ");
		JButton b3 = new JButton("getX(), getY()");
		
		b1.setBackground(Color.YELLOW); // 배경색 설정
		b1.setForeground(Color.MAGENTA); // 글자색 설정
		b1.setFont(new Font("Arial", Font.ITALIC, 20)); // Arial, 20픽셀 폰트 설정
		
		b2.setEnabled(false); // 버튼 비활성화
		
		//세번째 버튼에만 지금 동작을 넣어둠 
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				JComponentEx frame = (JComponentEx)b.getTopLevelAncestor();
				frame.setTitle(b.getX() + "," + b.getY()); // 타이틀에 버튼 좌표 출력
			}
		});
		
		c.add(b1); c.add(b2); c.add(b3); // 컨텐트팬에 버튼 부착
		
		setSize(260,200);
		setVisible(true);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JComponentEx();
	}

}
