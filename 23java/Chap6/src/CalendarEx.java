//6-11
import java.util.Calendar;

public class CalendarEx {
	public static void printCalendar(String msg, Calendar cal) {
		//get()�� 0~30 ������ ���� ����
		int year =cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1; // 0~11�� ǥ����
		int day = cal.get(Calendar.DAY_OF_MONTH); 
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); 
		int hour= cal.get(Calendar.HOUR); 			// 0~ 11�÷� ǥ����
		int hourOfDay= cal.get(Calendar.HOUR_OF_DAY);// 0~ 23�÷� ǥ����
		int ampm = cal.get(Calendar.AM_PM); // ����0, ���� 1 
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int millisecond = cal.get(Calendar.MILLISECOND); // 1/1000�� 
		
		System.out.print(msg+year+"/"+month+"/"+day+"/");
		switch(dayOfWeek) {
		case Calendar.SUNDAY : System.out.print("�Ͽ���");break;
		case Calendar.MONDAY: System.out.print("������");break;
		case Calendar.TUESDAY : System.out.print("ȭ����");break;
		case Calendar.WEDNESDAY : System.out.print("������");break;
		case Calendar.THURSDAY : System.out.print("�����");break;
		case Calendar.FRIDAY : System.out.print("�ݿ���");break;
		case Calendar.SATURDAY: System.out.print("�����");break;
		}
		
		System.out.print("("+hourOfDay+"��)");
		if(ampm == Calendar.AM) System.out.print("����");
		else System.out.print("����");
		System.out.println(hour+"��"+minute+"��"+second+"��"+millisecond+"�и���");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar now = Calendar.getInstance(); 
		// ��ü �������� new Calendar ��İ� Calendar.getInstance() ����� �ִ�.
		// new�� �Ź� ���ο� ��ü�� �����ϰ�, getInstance() �޼ҵ�� �ϳ� ����� �Ź� ������ ���� ��.
		printCalendar("����",now);
		
		Calendar firstDate = Calendar.getInstance();
		
		firstDate.clear();
		// 2022 12�� 18��
		firstDate.set(2022,11,18); // MONTH �� �⺻������ +1�� �صξ����Ƿ�, 11�� �Է� 
		firstDate.set(Calendar.HOUR_OF_DAY, 20); // ���� 20��
		firstDate.set(Calendar.MINUTE, 30);
		printCalendar("ó�� ����Ʈ �� ����",firstDate);
	}

}
