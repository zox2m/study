//6-11
import java.util.Calendar;

public class CalendarEx {
	public static void printCalendar(String msg, Calendar cal) {
		//get()은 0~30 사이의 정수 리턴
		int year =cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1; // 0~11로 표현됨
		int day = cal.get(Calendar.DAY_OF_MONTH); 
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); 
		int hour= cal.get(Calendar.HOUR); 			// 0~ 11시로 표현됨
		int hourOfDay= cal.get(Calendar.HOUR_OF_DAY);// 0~ 23시로 표현됨
		int ampm = cal.get(Calendar.AM_PM); // 오전0, 오후 1 
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int millisecond = cal.get(Calendar.MILLISECOND); // 1/1000초 
		
		System.out.print(msg+year+"/"+month+"/"+day+"/");
		switch(dayOfWeek) {
		case Calendar.SUNDAY : System.out.print("일요일");break;
		case Calendar.MONDAY: System.out.print("월요일");break;
		case Calendar.TUESDAY : System.out.print("화요일");break;
		case Calendar.WEDNESDAY : System.out.print("수요일");break;
		case Calendar.THURSDAY : System.out.print("목요일");break;
		case Calendar.FRIDAY : System.out.print("금요일");break;
		case Calendar.SATURDAY: System.out.print("토요일");break;
		}
		
		System.out.print("("+hourOfDay+"시)");
		if(ampm == Calendar.AM) System.out.print("오전");
		else System.out.print("오후");
		System.out.println(hour+"시"+minute+"분"+second+"초"+millisecond+"밀리초");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar now = Calendar.getInstance(); 
		// 객체 생성에는 new Calendar 방식과 Calendar.getInstance() 방식이 있다.
		// new는 매번 새로운 객체를 생성하고, getInstance() 메소드는 하나 만들어 매번 가져다 쓰는 것.
		printCalendar("현재",now);
		
		Calendar firstDate = Calendar.getInstance();
		
		firstDate.clear();
		// 2022 12월 18일
		firstDate.set(2022,11,18); // MONTH 는 기본적으로 +1로 해두었으므로, 11로 입력 
		firstDate.set(Calendar.HOUR_OF_DAY, 20); // 저녁 20시
		firstDate.set(Calendar.MINUTE, 30);
		printCalendar("처음 데이트 한 날은",firstDate);
	}

}
