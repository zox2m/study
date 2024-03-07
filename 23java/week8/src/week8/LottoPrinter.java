package week8;


import java.util.Calendar;
import java.io.*;

public class LottoPrinter {
	public void LPrinter(int LNum[]) {
		FileWriter fw = null;
		File f = new File("C:\\Users\\jumin\\OneDrive - �ܱ����б�\\3-2\\JAVA\\Lotto.txt");
		Calendar now = Calendar.getInstance();
		String temp;
		temp = printCalendar("����",now);
		
		try {
			fw = new FileWriter(f);
			fw.write(temp);
			fw.write("\r\n");
			fw.write("�̹� �ζ� ��ȣ�� ������ �����ϴ�.\r\n");
			temp = "";
			for(int a = 0;a<6;a++) {
				temp = temp + " " +LNum[a];
			}
			fw.write(temp);
			fw.close();
		}catch(IOException e) {
			System.out.println("����� ����");
		}
		
		
	}
	
	public static String printCalendar(String msg, Calendar cal) {
		int year =cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1; // 0~11�� ǥ����
		int day = cal.get(Calendar.DAY_OF_MONTH); 
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); 
		int hour= cal.get(Calendar.HOUR); 			// 0~ 11�÷� ǥ����
		int hourOfDay= cal.get(Calendar.HOUR_OF_DAY);// 0~ 23�÷� ǥ����
		int ampm = cal.get(Calendar.AM_PM); // ����0, ���� 1 
		int minute = cal.get(Calendar.MINUTE);
		
		String SResult;
		SResult =msg+year+"/"+month+"/"+day+"/";
		
		switch(dayOfWeek) {
			case Calendar.SUNDAY : System.out.print("�Ͽ���");break;
			case Calendar.MONDAY: System.out.print("������");break;
			case Calendar.TUESDAY : System.out.print("ȭ����");break;
			case Calendar.WEDNESDAY : System.out.print("������");break;
			case Calendar.THURSDAY : System.out.print("�����");break;
			case Calendar.FRIDAY : System.out.print("�ݿ���");break;
			case Calendar.SATURDAY: System.out.print("�����");break;
		}
		SResult = SResult + "(" +hourOfDay + "��)";
		
		if(ampm == Calendar.AM) 
			SResult = SResult +"����";
		else 
			SResult = SResult +"����";
		
		SResult = SResult + hour+"��" + minute+"��";
		
		return SResult; 
	}

}
