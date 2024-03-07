// 13-1 ������� 1�ʴ��� Ÿ�̸� ����� 
import java.awt.*;
import javax.swing.*;

public class TimerThread extends Thread{
	private JLabel timerLabel;
	public TimerThread(JLabel timerLabel) { 
	this.timerLabel = timerLabel;
	}
	@Override
	public void run() {
		int n=0; 
		while(true) {
			timerLabel.setText(Integer.toString(n)); 
			n++; 
			
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}


}
