//13-2
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class TimerRunnable implements Runnable{
	private JLabel timerLabel; 
	public TimerRunnable(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	
	@Override
	public void run() {
		int n=0; 
		while(true) { 
			timerLabel.setText(Integer.toString(n)); 
			n++; // 1초에 한번씩 n을 ++ 해주므로 타이머가 됨 
			
			try {
				Thread.sleep(1000); // 1초 동안 잠을 잔다.
			}
				catch(InterruptedException e) {
			return; // 예외가 발생하면 스레드 종료
			}
		}
	}


}
