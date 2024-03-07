package week8;


import java.util.Calendar;
import java.io.*;

public class LottoPrinter {
	public void LPrinter(int LNum[]) {
		FileWriter fw = null;
		File f = new File("C:\\Users\\jumin\\OneDrive - 단국대학교\\3-2\\JAVA\\Lotto.txt");
		Calendar now = Calendar.getInstance();
		String temp;
		temp = printCalendar("현재",now);
		
		try {
			fw = new FileWriter(f);
			fw.write(temp);
			fw.write("\r\n");
			fw.write("이번 로또 번호는 다음과 같습니다.\r\n");
			temp = "";
			for(int a = 0;a<6;a++) {
				temp = temp + " " +LNum[a];
			}
			fw.write(temp);
			fw.close();
		}catch(IOException e) {
			System.out.println("입출력 오류");
		}
		
		
	}
	
	public static String printCalendar(String msg, Calendar cal) {
		int year =cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1; // 0~11로 표현됨
		int day = cal.get(Calendar.DAY_OF_MONTH); 
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); 
		int hour= cal.get(Calendar.HOUR); 			// 0~ 11시로 표현됨
		int hourOfDay= cal.get(Calendar.HOUR_OF_DAY);// 0~ 23시로 표현됨
		int ampm = cal.get(Calendar.AM_PM); // 오전0, 오후 1 
		int minute = cal.get(Calendar.MINUTE);
		
		String SResult;
		SResult =msg+year+"/"+month+"/"+day+"/";
		
		switch(dayOfWeek) {
			case Calendar.SUNDAY : System.out.print("일요일");break;
			case Calendar.MONDAY: System.out.print("월요일");break;
			case Calendar.TUESDAY : System.out.print("화요일");break;
			case Calendar.WEDNESDAY : System.out.print("수요일");break;
			case Calendar.THURSDAY : System.out.print("목요일");break;
			case Calendar.FRIDAY : System.out.print("금요일");break;
			case Calendar.SATURDAY: System.out.print("토요일");break;
		}
		SResult = SResult + "(" +hourOfDay + "시)";
		
		if(ampm == Calendar.AM) 
			SResult = SResult +"오전";
		else 
			SResult = SResult +"오후";
		
		SResult = SResult + hour+"시" + minute+"분";
		
		return SResult; 
	}

}
