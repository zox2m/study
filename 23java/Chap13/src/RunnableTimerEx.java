//13-2
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class RunnableTimerEx extends JFrame{

	public RunnableTimerEx() {
			setTitle("Runnable�� ������ Ÿ�̸� ������ ����");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container c = getContentPane();
			c.setLayout(new FlowLayout());
			
			JLabel timerLabel = new JLabel();
			timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
			c.add(timerLabel);
			
			TimerRunnable runnable = new TimerRunnable(timerLabel);
			Thread th = new Thread(runnable);
			
			setSize(250,150);
			setVisible(true);
			th.start();
		}
		public static void main(String[] args) {
			new RunnableTimerEx();
		}

}
